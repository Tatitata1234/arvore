package com.example.demo;

import java.util.ArrayDeque;
import java.util.Objects;
import java.util.Queue;

public class Arvore<T extends Comparable<T>> {
    private No<T> raiz = null;

    public No<T> procura(T el) {
        return procura(this.raiz, el);
    }

    private No<T> procura(No<T> no, T el) {
        if (no == null) {
            return null;
        }

        if (Objects.equals(el, no.getChave())) {
            return no;
        } else if (el.compareTo(no.getChave()) < 0) {
            return procura(no.getEsquerda(), el);
        } else {
            return procura(no.getDireita(), el);
        }
    }

    private No<T> procuraFeio(No<T> no, T el) {
        while (no != null) {
            if (Objects.equals(el, no.getChave())) {
                return no;
            } else if (el.compareTo(no.getChave()) < 0) {
                no = no.getEsquerda();
            } else {
                no = no.getDireita();
            }
        }
        return null;
    }

    public boolean inserir(T el) {
        No<T> no = raiz;
        No<T> anterior = null;

        if (procura(el) != null)
            return false;

        while (no != null) {
            anterior = no;
            if (el.compareTo(no.getChave()) < 0) {
                no = no.getEsquerda();
            } else {
                no = no.getDireita();
            }
        }

        if (raiz == null) {
            raiz = new No<>(el);
        } else {
            assert anterior != null;
            if (anterior.getChave().compareTo(el) < 0) {
                anterior.setDireita(new No<>(el));
            } else {
                anterior.setEsquerda(new No<>(el));
            }
        }

        return true;
    }

    public void preorder() {
        preorder(raiz);
    }

    private void preorder(No<T> no) {
        if (no != null) {
            System.out.print(no.getChave() + " ");
            preorder(no.getEsquerda());
            preorder(no.getDireita());
        }
    }

    public void inorder() {
        inorder(raiz);
    }

    private void inorder(No<T> no) {
        if (no != null) {
            inorder(no.getEsquerda());
            System.out.print(no.getChave() + " ");
            inorder(no.getDireita());
        }
    }

    public void postorder() {
        postorder(raiz);
    }

    private void postorder(No<T> no) {
        if (no != null) {
            postorder(no.getEsquerda());
            postorder(no.getDireita());
            System.out.print(no.getChave() + " ");
        }
    }

    public void deletarPorFusao(T el) {
        No<T> tmp;
        No<T> no;
        No<T> pai = null;

        no = procura(el);

        if (no != null && Objects.equals(no.getChave(), el)) {
            if (no != raiz)
                pai = procuraPai(el);

            if (no.getDireita() == null) {
                deletarQuandoNaoTemFilho(no == raiz, no.getEsquerda(), pai, no);
            } else if (no.getEsquerda() == null) {
                deletarQuandoNaoTemFilho(no == raiz, no.getDireita(), pai, no);
            } else {
                tmp = no.getEsquerda();
                while (tmp.getDireita() != null) {
                    tmp = tmp.getDireita();
                }
                tmp.setDireita(no.getDireita());

                deletarQuandoNaoTemFilho(raiz == no, no.getEsquerda(), pai, no);
            }
        } else if (raiz != null) {
            System.out.println("el " + el + " não está na árvore");
        } else {
            System.out.println("Árvora está vazia");
        }
    }

    private void deletarQuandoNaoTemFilho(boolean isRaiz, No<T> filho, No<T> pai, No<T> no) {
        if (isRaiz) {
            raiz = filho;
        } else if (pai.getEsquerda() == no) {
            pai.setEsquerda(filho);
        } else {
            pai.setDireita(filho);
        }
    }

    public void deletarPorCopia(T el) {
        No<T> no;
        No<T> pai = null;

        no = procura(el);

        if (no != null && Objects.equals(no.getChave(), el)) {
            if (no != raiz)
                pai = procuraPai(el);

            if (no.getDireita() == null) {
                deletarQuandoNaoTemFilho(no == raiz, no.getEsquerda(), pai, no);
            } else if (no.getEsquerda() == null) {
                deletarQuandoNaoTemFilho(no == raiz, no.getDireita(), pai, no);
            } else {
                No<T> tmp = no.getEsquerda();
                while (tmp.getDireita() != null) {
                    tmp = tmp.getDireita();
                }
                deletarPorCopia(tmp.getChave());
                no.setChave(tmp.getChave());
            }
        } else if (raiz != null) {
            System.out.println("el " + el + " não está na árvore");
        } else {
            System.out.println("Árvora está vazia");
        }
    }

    private No<T> procuraPai(T el) {
        No<T> no = raiz;
        No<T> anterior = null;

        while (no != null && !Objects.equals(no.getChave(), el)) {
            anterior = no;
            if (no.getChave().compareTo(el) < 0)
                no = no.getDireita();
            else
                no = no.getEsquerda();
        }

        if (no != null && Objects.equals(no.getChave(), el)) {
            return anterior;
        }
        return null;
    }

    public void extensao() {
        Queue<No<T>> fila = new ArrayDeque<>();

        fila.add(this.raiz);

        while (!fila.isEmpty()) {
            No<T> atual = fila.poll();
            System.out.print(atual.getChave() + " ");
            if (atual.getEsquerda() != null)
                fila.add(atual.getEsquerda());
            if (atual.getDireita() != null)
                fila.add(atual.getDireita());
        }
    }

    public void clear() {
        this.raiz = null;
    }

    public boolean isEmpty() {
        return this.raiz == null;
    }

    public No<T> getRaiz() {
        return this.raiz;
    }
}
