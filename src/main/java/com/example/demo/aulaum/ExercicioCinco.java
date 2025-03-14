package com.example.demo.aulaum;

import com.example.demo.aulaum.entidade.Arvore;

public class ExercicioCinco {
    public static void main(String[] args) {
        Arvore<Integer> arvore = new Arvore<>();
        arvore.inserir(20);
        arvore.inserir(12);
        arvore.inserir(36);
        arvore.inserir(8);
        arvore.inserir(17);
        arvore.inserir(24);
        arvore.inserir(51);
        arvore.inserir(6);
        arvore.inserir(10);
        arvore.inserir(15);
        arvore.inserir(18);
        arvore.inserir(22);
        arvore.inserir(30);
        arvore.inserir(45);
        arvore.inserir(54);

        arvore.inorder();
        System.out.println(arvore.getBuilderInOrder());
        arvore.cleanBuilderInOrder();

        arvore.deletarPorFusao(12);
        arvore.inorder();
        System.out.println(arvore.getBuilderInOrder());
        arvore.cleanBuilderInOrder();

        arvore.deletarPorCopia(36);
        arvore.inorder();
        System.out.println(arvore.getBuilderInOrder());
        arvore.cleanBuilderInOrder();

        arvore.deletarPorCopia(8);
        arvore.inorder();
        System.out.println(arvore.getBuilderInOrder());
        arvore.cleanBuilderInOrder();

        arvore.deletarPorCopia(6);
        arvore.inorder();
        System.out.println(arvore.getBuilderInOrder());
        arvore.cleanBuilderInOrder();

    }
}
