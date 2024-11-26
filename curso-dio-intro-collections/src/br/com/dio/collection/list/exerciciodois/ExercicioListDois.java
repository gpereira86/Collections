package br.com.dio.collection.list.exerciciodois;

import java.sql.SQLOutput;
import java.util.*;

public class ExercicioListDois {

    public static void main(String[] args) {

        List<String> investigacao =  new ArrayList<>(Arrays.asList(
                ">> Telefonou para a vítima?",
                ">> Esteve no local do crime?",
                ">> Mora perto da vítima?",
                ">> Devia a vítima?",
                ">> Já trabalhou com a vítima?"
                ));
        List<String> investigacaoRespostas = new ArrayList<>();
        Scanner resposta = new Scanner(System.in);

        for (String pergunta : investigacao) {
            System.out.println(pergunta);
            System.out.print("Digite S para sim ou N para não: ");

            String resp =resposta.nextLine().toUpperCase();
            while (!resp.equals("N") && !resp.equals("S")) {
                System.out.println("Resposta inválida tente novamente.\nDigite S para sim ou N para não: ");
                resp = resposta.nextLine().toUpperCase();
            }
            investigacaoRespostas.add(resp);
            System.out.println("----------------------");
        }

        int S = 5;
        for (String respMap : investigacaoRespostas) {
            if (respMap.equals("N")) {
                S--;
            }
        }

        if (S == 5) {
            System.out.println("Assasina");
        } else if (S < 5 && S >= 3) {
            System.out.println("Cúmplice");
        } else if (S == 2) {
            System.out.println("Suspeita");
        } else {
            System.out.println("Inocente");
        }



    }

}
