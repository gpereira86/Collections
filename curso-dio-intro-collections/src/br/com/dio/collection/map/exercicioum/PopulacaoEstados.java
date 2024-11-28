package br.com.dio.collection.map.exercicioum;

/*
Dada população estimada de alguns estados do NE Brasileiro,faça:
Estado = PE - Poulação = 9.616.621
Estado = AL - Poulação = 3.351.543
Estado = CE - Poulação = 9.187.103
Estado = RN - Poulação = 3.534.265

 */

import java.util.*;

public class PopulacaoEstados {

    public static void main(String[] args) {

        System.out.println("Crie um dicionário e relacione as estados e suas populações: ");
        Map<String, Integer> populacaoEstados = new HashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println(populacaoEstados);

        System.out.println("---------------------");
        System.out.println("Substitua a população do estado do RN por 3.534.165: ");
        populacaoEstados.put("RN", 3534165);
        System.out.println(populacaoEstados);

        System.out.println("---------------------");
        System.out.println("Confira se o estado do PB está no dicionário, caso não, adicione: PB - 4.039.277");
        if (!populacaoEstados.containsKey("PB")) populacaoEstados.put("PB", 4039277);
        System.out.println(populacaoEstados);

        System.out.println("---------------------");
        System.out.println("Exiba a população do PE: " + populacaoEstados.get("PE"));

        System.out.println("---------------------");
        System.out.println("Exiba todos os estados e suas populações na ordem que foi informado;");
        Map<String, Integer> populacaoEstados2 = new LinkedHashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println(populacaoEstados2);

        System.out.println("---------------------");
        System.out.println("Exiba os estados e suas populações em ordem alfabética;");
        Map<String, Integer> populacaoEstados3 = new TreeMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println(populacaoEstados3);

        System.out.println("---------------------");
        System.out.println("Exiba o estado com o menor população e sua quantidade: ");

        Integer menorPopulacao =  Collections.min(populacaoEstados3.values());
        String estadoMenorPopulacao = "";

        for (Map.Entry<String, Integer> entry : populacaoEstados3.entrySet()) {
            if(entry.getValue().equals(menorPopulacao)) {
                estadoMenorPopulacao = entry.getKey();
                System.out.println("Estado com menor população: " + estadoMenorPopulacao + " - " + menorPopulacao);
            }
        }

        System.out.println("---------------------");
        System.out.println("Exiba o estado com a maior população e sua quantidade;");

        Integer maiorPopulacao =  Collections.max(populacaoEstados3.values());
        String estadoMaiorPopulacao = "";

        for (Map.Entry<String, Integer> entry : populacaoEstados3.entrySet()) {
            if(entry.getValue().equals(maiorPopulacao)) {
                estadoMaiorPopulacao = entry.getKey();
                System.out.println("Estado com menor população: " + estadoMaiorPopulacao + " - " + maiorPopulacao);
            }
        }

        System.out.println("---------------------");
        System.out.println("Exiba a soma da população desses estados;");

        Iterator<Integer> iterator = populacaoEstados3.values().iterator();
        Integer soma = 0;

        while(iterator.hasNext()) {
            soma += iterator.next();
        }
        System.out.println("A soma da população dos estados é: "+ soma);

        System.out.println("---------------------");
        System.out.println("Exiba a média da população deste dicionário de estados: " + (soma/populacaoEstados3.size()));

        System.out.println("---------------------");
        System.out.println("Remova os estados com a população menor que 4.000.000;");
        Iterator<Integer> iterator1 = populacaoEstados3.values().iterator();

        System.out.println(populacaoEstados3);
        while(iterator1.hasNext()) {
            if(iterator1.next() < 4000000) {
                iterator1.remove();
            }
        }
        System.out.println(populacaoEstados3);

        System.out.println("---------------------");
        System.out.println("Apague o dicionário de estados;");
        populacaoEstados3.clear();
        System.out.println(populacaoEstados3);

        System.out.println("---------------------");
        System.out.println("Confira se o dicionário está vazio: " + populacaoEstados3.isEmpty());

    }

}
