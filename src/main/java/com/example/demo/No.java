package com.example.demo;

public class No<T extends Comparable<T>> {
    private T chave;
    private No<T> esquerda;
    private No<T> direita;

    public No() {
        this.esquerda = null;
        this.direita = null;
    }

    public No(T chave) {
        this(chave, null, null);
    }

    public No(T chave, No<T> esquerda, No<T> direita) {
        this.chave = chave;
        this.esquerda = esquerda;
        this.direita = direita;
    }

    public T getChave() {
        return chave;
    }

    public void setChave(T chave) {
        this.chave = chave;
    }

    public No<T> getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(No<T> esquerda) {
        this.esquerda = esquerda;
    }

    public No<T> getDireita() {
        return direita;
    }

    public void setDireita(No<T> direita) {
        this.direita = direita;
    }
}
