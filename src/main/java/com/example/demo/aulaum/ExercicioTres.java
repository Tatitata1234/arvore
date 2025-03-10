package com.example.demo.aulaum;

import com.example.demo.entidade.Arvore;

public class ExercicioTres {
    public static void main(String[] args) {
        //20 10 5 8 12 3 14 23 28 30 100 e 99
        Arvore<Integer> arvore = new Arvore<>();
        arvore.inserir(2);
        arvore.inserir(10);
        arvore.inserir(5);
        arvore.inserir(8);
        arvore.inserir(12);
        arvore.inserir(3);
        arvore.inserir(14);
        arvore.inserir(23);
        arvore.inserir(28);
        arvore.inserir(30);
        arvore.inserir(100);
        arvore.inserir(99);

        arvore.inorder();
    }
}
