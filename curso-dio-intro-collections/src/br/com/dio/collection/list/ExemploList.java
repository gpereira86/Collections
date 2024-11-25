package br.com.dio.collection.list;

import java.util.*;

public class ExemploList {

    public static void main(String[] args) {
        //Dada uma lista com 7 nota de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:


        // ::: DIFERENTES FORMAS DE DECLARAR :::

        //  List notas = new ArrayList(); //antes do java 5
        //  List<Double> notas = new ArrayList<>(); //Generics(JDK 5) - Diamont Operator (JDK 7)
        //  ArrayList<Double> notas = new ArrayList();
        //  List<Double> notas = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        /*  List<Double> notas = Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6); -> Desta forma não se pode adicionar ou remover itens.
            notas.add(10d)
            System.out.println(notas);
         */
        /*  List<Double> notas = List.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);  -> Desta forma torna a lista imutável, não se pode adicionar ou remover itens.
            notas.add(1d);
            notas.remove(5d);
            System.out.println(notas);
         */

        // ------------------------------------
        System.out.println("Crie uma lista e adicione as sete notas: ");
        List<Double> notas = new ArrayList<>(); //Generics(JDK 5) - Diamont Operator (JDK 7)

        notas.add(7d);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5d);
        notas.add(7d);
        notas.add(0d);
        notas.add(3.6);

        System.out.println(notas.toString());

        // ------------------------------------
        System.out.println("Exiba a posição da nota 5.0: "+ notas.indexOf(5d));

        // ------------------------------------
        System.out.println("Adicione a lista a nota 8.0 na posição 4: ");
        notas.add(4, 8d);
        System.out.println(notas.toString());

        // ------------------------------------
        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5d), 6d);
        System.out.println(notas.toString());

        // ------------------------------------
        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5d));

        // ------------------------------------
        System.out.println("Exiba todas as notas na ordem que foram informadas: ");
        for (Double nota : notas) System.out.println(nota); // for em linha quando só tem uma linha para executar

        // ------------------------------------
        System.out.println("Exiba a terceira nota adicionada: "+ notas.get(2));
        System.out.println(notas.toString());

        // ------------------------------------
        System.out.println("Exiba a menor nota: " + Collections.min(notas));

        // ------------------------------------
        System.out.println("Exiba a maior nota: " + Collections.max(notas));

        // ------------------------------------
        System.out.println("Exiba a soma dos valores: ");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Soma dos valores: " + soma);

        // ------------------------------------
        System.out.println("Exiba a médoa das notas: " + (soma / notas.size()));


        // ------------------------------------
        System.out.println("Remova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas.toString());

        // ------------------------------------
        System.out.println("Remova as nota menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();

        while (iterator1.hasNext()){
            Double next = iterator1.next();
            if (next < 7) iterator1.remove();
        }
        System.out.println(notas.toString());

        // ------------------------------------
        System.out.println("Apague toda a lista: ");
        notas.clear();
        System.out.println(notas.toString());

        // ------------------------------------
        System.out.println("Confira se a lista está vazia: " + notas.isEmpty());



        // Para você: Resolva esses exercícios utilizando os métodos da implementação LinkedList:
        System.out.println("Crie uma lista chamada notas2 " + "e coloque todos os elementos na list ArrayList nessa nova lista: ");

        LinkedList<Double> notas2 = new LinkedList<>();

        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d);
        notas2.add(0d);
        notas2.add(3.6);

        System.out.println(notas2.toString());

        System.out.println("Mostre a primeira nota da nova lista sem removê-lo: " + notas2.getFirst());
        System.out.println(notas2.toString());

        System.out.println("Mostre a primeira nota da nova lista sem removendo-o: " + notas2.removeFirst());
        System.out.println(notas2.toString());


    }

}
