package com.example.demo;

public class ExercicioDez {
    public static void main(String[] args) {
        //20, 12, 17, 36, 24, 30, 22, 8, 10, 15, 6, 51, 18, 54, 45
        Arvore<Integer> arvore = new Arvore<>();
        arvore.inserir(20);
        arvore.inserir(12);
        arvore.inserir(17);
        arvore.inserir(36);
        arvore.inserir(24);
        arvore.inserir(30);
        arvore.inserir(22);
        arvore.inserir(8);
        arvore.inserir(10);
        arvore.inserir(15);
        arvore.inserir(6);
        arvore.inserir(51);
        arvore.inserir(18);
        arvore.inserir(54);
        arvore.inserir(45);

        arvore.preorder();
        System.out.println();
        arvore.inorder();
        System.out.println();
        arvore.postorder();
        System.out.println();
        arvore.extensao();
    }
}
