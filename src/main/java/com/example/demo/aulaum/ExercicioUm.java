package com.example.demo.aulaum;

import com.example.demo.entidade.Arvore;

public class ExercicioUm {

    //     g
    //    / \
    //   d   m
    //  /   / \
    // a    l  o
    //  \       \
    //   c       p
    //  /         \
    // b           q
    public static void main(String[] args) {
        //g, d, a, c, m, o, b, d, a, l, p, q
        Arvore<Character> arvore = new Arvore<>();
        arvore.inserir('g');
        arvore.inserir('d');
        arvore.inserir('a');
        arvore.inserir('c');
        arvore.inserir('m');
        arvore.inserir('o');
        arvore.inserir('b');
        arvore.inserir('d');
        arvore.inserir('a');
        arvore.inserir('l');
        arvore.inserir('p');
        arvore.inserir('q');

        arvore.inorder();
    }
}