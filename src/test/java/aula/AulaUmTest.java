package aula;

import com.example.demo.aulaum.entidade.Arvore;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AulaUmTest {


    @Test
    void execicioUm() {
        //     g
        //    / \
        //   d   m
        //  /   / \
        // a    l  o
        //  \       \
        //   c       p
        //  /         \
        // b           q
        String esperado = "a b c d g l m o p q";

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

        String resultado = arvore.getBuilderInOrder();

        Assertions.assertEquals(esperado, resultado);
    }

    @Test
    void execicioDois() {
        //K G G B L O C P A U D

        String esperadoInOrder = "A B C D G K L O P U";
        String esperadoPostOrder = "A D C B G U P O L K";
        String esperadoPreOrder = "K G B A C D L O P U";

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
        arvore.postorder();

        String resultadoInOrder = arvore.getBuilderInOrder();
        String resultadoPostOrder = arvore.getBuilderPostOrder();
        String resultadoPreOrder = arvore.getBuilderPreOrder();

        Assertions.assertEquals(esperadoInOrder, resultadoInOrder);
        Assertions.assertEquals(esperadoPostOrder, resultadoPostOrder);
        Assertions.assertEquals(esperadoPreOrder, resultadoPreOrder);

    }

    @Test
    void exercicioTres() {
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

        String esperado = "2 3 5 8 10 12 14 23 28 30 99 100";
        String resultado = arvore.getBuilderInOrder();

        Assertions.assertEquals(esperado, resultado);
    }

    @Test
    void exercicioQuatro() {
        Arvore<Integer> arvore = new Arvore<>();
        arvore.inserir(4);
        arvore.inserir(2);
        arvore.inserir(6);
        arvore.inserir(1);
        arvore.inserir(3);
        arvore.inserir(8);
        arvore.inserir(7);

        arvore.postorder();

        String esperado = "1 3 2 7 8 6 4";
        String resultado = arvore.getBuilderPostOrder();

        Assertions.assertEquals(esperado, resultado);

    }

    @Test
    void exercicioCinco() {
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

        String esperado = "6 8 10 12 15 17 18 20 22 24 30 36 45 51 54";
        String resultado = arvore.getBuilderInOrder();
        Assertions.assertEquals(esperado, resultado);
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
