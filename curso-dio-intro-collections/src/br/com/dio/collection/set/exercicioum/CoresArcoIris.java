package br.com.dio.collection.set.exercicioum;

import java.util.*;

public class CoresArcoIris {
    public static void main(String[] args) {

        Set<String> arcoIris = new HashSet<>(Arrays.asList(
                "Vermelho",
                "Laranja",
                "Amarelo",
                "Verde",
                "Azul",
                "Anil",
                "Violeta"
        ));

        System.out.println("Exiba todas as cores uma abaixo da outra: ");
        for(String cores : arcoIris) System.out.println(cores);

        System.out.println("------------------");
        System.out.println("A quantidade de cores: " + arcoIris.size());

        System.out.println("------------------");
        System.out.println("Exiba as cores em ordem alfabétrica");
        Set<String> arcoIris2 = new TreeSet<>(arcoIris);
        System.out.println(arcoIris2);

        System.out.println("------------------");
        System.out.println("Exiba as cores em ordem inversa da que foi informada: ");
        Set<String> arcoIris3 = new LinkedHashSet<>(arcoIris);
        System.out.println(arcoIris);

        List<String> lista = new ArrayList<>(arcoIris3);

        Collections.reverse(lista);
        Set<String> arcoIris3Reversed = new LinkedHashSet<>(lista);

        System.out.println("Reverso: " + arcoIris3Reversed);

        System.out.println("------------------");
        System.out.println("Exiba todas as cores que começam com a letra V: ");
        Set<String> arcoIris4 = new HashSet<>(arcoIris);

        for (String cor : arcoIris4) {
            String primeiraLetra = cor.substring(0, 1);
            if (primeiraLetra.equals("V")) System.out.println(cor);
        }

        System.out.println("------------------");
        System.out.println("Remova todas as cores que não começam com a letra V: ");
        Iterator<String> iterator = arcoIris4.iterator();

        while (iterator.hasNext()) {
            String cor = iterator.next();
            String primeiraLetra = cor.substring(0, 1);

            if (!primeiraLetra.equals("V")) {
                iterator.remove();
            }
        }
        System.out.println("Lista atualizada: " + arcoIris4);

        System.out.println("------------------");
        System.out.println("Limpe o conjunto: ");
        arcoIris4.clear();
        System.out.println(arcoIris4);

        System.out.println("------------------");
        System.out.println("Limpe o conjunto: " + arcoIris4.isEmpty());



    }
}
