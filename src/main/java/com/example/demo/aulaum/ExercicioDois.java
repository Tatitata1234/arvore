package com.example.demo.aulaum;

import com.example.demo.entidade.Arvore;

public class ExercicioDois {
    public static void main(String[] args) {
        //K G G B L O C P A U D
        Arvore<Character> arvore = new Arvore<>();
        arvore.inserir('K');
        arvore.inserir('G');
        arvore.inserir('G');
        arvore.inserir('B');
        arvore.inserir('L');
        arvore.inserir('O');
        arvore.inserir('C');
        arvore.inserir('P');
        arvore.inserir('A');
        arvore.inserir('U');
        arvore.inserir('D');

        arvore.preorder();
        System.out.println();
        arvore.inorder();
        System.out.println();
        arvore.postorder();
    }
}
