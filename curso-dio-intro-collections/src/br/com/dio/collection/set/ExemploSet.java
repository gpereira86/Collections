package br.com.dio.collection.set;


import com.sun.source.tree.WhileLoopTree;

import java.sql.SQLOutput;
import java.util.*;

public class ExemploSet {
    public static void main(String[] args) {
        //Dada uma lista com 7 nota de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:

        //  Set notas = new HashSet(); //antes do java 5
        //  Set<Double> notas = new HashSet<>(); //Generics(JDK 5) - Diamont Operator (JDKK 7)
        //  HashSet<Double> notas = new HashSet<>();
        //  Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        /*  Set<Double> notas = Set.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
            notas.add(1d);
            notas.remove(5d);
            System.out.println(notas);
         */


        System.out.println("Crie um conjunto e adicione as notas: ");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));

        System.out.println(notas);

        // ------------------------------------
        // System.out.println("Exiba a posição da nota 5.0: "); // -> NO HASHSET NÃO É POSSÍVEL, NÃO EXISTE MÉTODO INDEXOF

        // ------------------------------------
        //  System.out.println("Adicione na lista a nota 8.0 na posição 4: "); // -> NÃO É POSSÍVEL, NO SET NÃO EXISTE ÍNDICE

        // ------------------------------------
        // System.out.println("Substitua a nota 5.0 pela nota 6.0: "); // -> NÃO É POSSÍVEL, NO SET NÃO GET OU SET

        // ------------------------------------
        System.out.println("Confira se a nota 5.0 está no conjunto: " + notas.contains(5.0));

        // ------------------------------------
        // System.out.println("Exiba a terceira nota adicionada: "); // -> NÃO É POSSÍVEL, NO SET NÃO EXISTE ÍNDICE

        // ------------------------------------
        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        // ------------------------------------
        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        // ------------------------------------
        System.out.println("Exiba a soma dos valores: ");
        Iterator<Double> iterator = notas.iterator();

        Double soma = 0.0;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("A soma dos valores: " + soma);

        // ------------------------------------
        System.out.println("Exiba a média das notas: " + (soma/notas.size()));

        // ------------------------------------
        System.out.println("Remova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas);

        // ------------------------------------
//        System.out.println("Remova a nota da posição 0: "); // -> NÃO É POSSÍVEL, NO SET NÃO EXISTE ÍNDICE

        // ------------------------------------
        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()) {
            Double next = iterator1.next();
            if (next < 7) {
                iterator1.remove();
            }
        }
        System.out.println(notas);

        // ------------------------------------
        System.out.println("Exiba todas as notas na ordem em que foram informadas: ");
        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d);
        notas2.add(0d);
        notas2.add(3.6);
        System.out.println(notas2);

        // ------------------------------------
        System.out.println("Exiba todas as notas na ordem crescente: ");
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);

        // ------------------------------------
        System.out.println("Apague todo o conjunto: ");
        notas.clear();

        // ------------------------------------
        System.out.println("Confira se o conjunto está vazio: " + notas.isEmpty());
        System.out.println("Confira se o conjunto está vazio: " + notas2.isEmpty());
        System.out.println("Confira se o conjunto está vazio: " + notas3.isEmpty());

    }
}

