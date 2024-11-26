package br.com.dio.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ExercicioList {

    public static void main(String[] args) {
        List<Temperaturas> mediasTemperaturas = new ArrayList<>(){{
            add(new Temperaturas(28.9, "Janeiro"));
            add(new Temperaturas(28.1, "Fevereiro"));
            add(new Temperaturas(23.0, "Março"));
            add(new Temperaturas(31.5, "Abril"));
            add(new Temperaturas(35.8, "Maio"));
            add(new Temperaturas(25.9, "Junho"));
        }};

        Double soma = 0d;
        for (Temperaturas temp : mediasTemperaturas) {
            soma += temp.getTemperaturaMediaMes();
        }
        Double temperaturaMediaSemestre = (soma/ mediasTemperaturas.size());

        System.out.println("---\tTEMPERATURA MÉDIA SEMESTRAL: " + String.format("%.2f",temperaturaMediaSemestre)+"ª celsius\t ---");
        System.out.println("---\tMESES COM TEMPERATURAS ACIMA DA MÉDIA SEMESTRAL\t ---");

        for (Temperaturas temp : mediasTemperaturas) {
            if (temp.getTemperaturaMediaMes() > temperaturaMediaSemestre) {
                System.out.println(temp.getMesTemperatura() + " com: " + String.format("%.2f",temp.getTemperaturaMediaMes()) + "ª celsius");
            }
        }
    }

}

class Temperaturas{

    private Double temperaturaMediaMes;
    private String mesTemperatura;

    public Temperaturas(Double temperaturaMediaMes, String mesTemperatura) {
        this.mesTemperatura = mesTemperatura;
        this.temperaturaMediaMes = temperaturaMediaMes;
    }

    public Double getTemperaturaMediaMes() {
        return temperaturaMediaMes;
    }

    public String getMesTemperatura() {
        return mesTemperatura;
    }

    @Override
    public String toString() {
        return "{" +
                "Temperatura Media/Mes=" + temperaturaMediaMes +
                ", Mes='" + mesTemperatura + '\'' +
                '}';
    }

}
