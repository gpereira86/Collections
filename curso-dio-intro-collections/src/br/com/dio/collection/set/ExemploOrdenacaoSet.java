package br.com.dio.collection.set;

/* Dadas as seguintes informações sobre minhas séries favoritas, crie
        um conjunto e ordene esse conjunto exibindo:
        (nome - genero - tempo de episódio)

        Série 1 = nome: got, genero: fantasia, tempoEpisodio: 60
        Série 2 = nome: dark, genero: drama, tempoEpisodio: 60
        Série 3 = nome: that '70s show, genero: comédia, tempoEpisodio: 25
         */

import java.util.*;

public class ExemploOrdenacaoSet {

    public static void main(String[] args) {

        System.out.println("---\tOrdem aleatótia\t---");
        Set<Serie> minhhasSeries = new HashSet<>(){{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("that '70s show", "comedia", 25));
        }};

        for (Serie serie : minhhasSeries) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

        // ------------------------------------
        System.out.println("---\tOrdem inserção\t---");
        Set<Serie> minhhasSeries1 = new LinkedHashSet<>(){{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("that '70s show", "comedia", 25));
        }};

        for (Serie serie : minhhasSeries1) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

        // ------------------------------------
        System.out.println("---\tOrdem natural (TempoEpisodio)\t---");
        Set<Serie> minhhasSeries2 = new TreeSet<>(minhhasSeries1);
        for (Serie serie : minhhasSeries2) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

        // ------------------------------------
        System.out.println("---\tOrdem Nome/Gênero/TempoEpisodio\t---");
        Set<Serie> minhhasSeries3 = new TreeSet<>(new ComparatoNomegeneroTempoEpisodio());
        minhhasSeries3.addAll(minhhasSeries);

        for (Serie serie : minhhasSeries3) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }


// Para você:
        /*
        System.out.println("---\tOrdem Gênero\t---");

        System.out.println("---\tOrdem Tempo Episódio\t---");
         */

    }

}

class Serie implements Comparable<Serie>{
    private String nome;
    private String genero;
    private Integer tempoEpisodio;

    public Serie(String nome, String genero, Integer tempoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getTempoEpisodio() {
        return tempoEpisodio;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", tempoEpisodio=" + tempoEpisodio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return Objects.equals(nome, serie.nome) && Objects.equals(genero, serie.genero) && Objects.equals(tempoEpisodio, serie.tempoEpisodio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempoEpisodio);
    }

    @Override
    public int compareTo(Serie serie) {
        int tempoEpisodio =  Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());
        if (tempoEpisodio != 0) {
            return tempoEpisodio;
        }
        return this.getGenero().compareTo(serie.getGenero());
    }
}

class ComparatoNomegeneroTempoEpisodio implements Comparator<Serie> {

    @Override
    public int compare(Serie s1, Serie s2) {
        int nome = s1.getNome().compareTo(s2.getNome());
        if (nome != 0) return nome;

        int genero = s1.getGenero().compareTo(s2.getGenero());
        if (genero != 0) return genero;

        return Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());

    }
}
