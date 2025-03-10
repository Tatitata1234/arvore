package com.example.demo;

public class ExercicioQuatro {
    public static void main(String[] args) {
        Arvore<Integer> arvore = new Arvore<>();
        arvore.inserir(4);
        arvore.inserir(2);
        arvore.inserir(6);
        arvore.inserir(1);
        arvore.inserir(3);
        arvore.inserir(8);
        arvore.inserir(7);

        arvore.postorder();
    }
}
