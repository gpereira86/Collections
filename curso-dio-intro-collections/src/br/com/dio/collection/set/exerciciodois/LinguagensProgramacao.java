package br.com.dio.collection.set.exerciciodois;

import java.util.*;

public class LinguagensProgramacao {
    public static void main(String[] args) {

        Set<LinguagemFavorita> linguagens = new LinkedHashSet<>(){{
           add(new LinguagemFavorita("Python", 2022, "PyCharm"));
           add(new LinguagemFavorita("Java", 1995, "Intelij"));
           add(new LinguagemFavorita("Java", 1995, "Navegadores"));
        }};

        System.out.println("------------------");
        System.out.println("Exibir por Ordem de inserção: ");
        System.out.println(linguagens);

        System.out.println("------------------");
        System.out.println("Exibir em Ordem natural: ");
        Set<LinguagemFavorita> linguagens2 = new TreeSet<>(linguagens);
        System.out.println(linguagens2);


        System.out.println("------------------");
        System.out.println("Exibir em Ordem por IDE: ");
        Set<LinguagemFavorita> linguagens3 = new TreeSet<>(new ComparatorIde());
        linguagens3.addAll(linguagens);

        System.out.println(linguagens3);

        System.out.println("------------------");
        System.out.println("Exibir em Ordem por Ano de criação e nome: ");
        Set<LinguagemFavorita> linguagens4 = new TreeSet<>(new ComparatorAnoCriacaoNome());
        linguagens4.addAll(linguagens);

        System.out.println(linguagens3);

        System.out.println("------------------");
        System.out.println("Exibir em Ordem por Nome, Ano de criação e IDE: ");
        Set<LinguagemFavorita> linguagens5 = new TreeSet<>(new ComparatorNomeAnoCriacaoIde());
        linguagens5.addAll(linguagens);

        System.out.println(linguagens5);



    }
}

class LinguagemFavorita implements Comparable<LinguagemFavorita> {
    private String nome;
    private int anoDeCriacao;
    private String ide;

    public LinguagemFavorita(String nome, int anoDeCriacao, String ide) {
        this.nome = nome;
        this.anoDeCriacao = anoDeCriacao;
        this.ide = ide;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeCriacao() {
        return anoDeCriacao;
    }

    public String getIde() {
        return ide;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", anoDeCriacao=" + anoDeCriacao +
                ", ide='" + ide + '\'' +
                '}' + ">>>" ;
    }

    @Override
    public int compareTo(LinguagemFavorita linguagemFavorita) {
        return this.nome.compareTo(linguagemFavorita.getNome());
    }
}

class ComparatorIde implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        return l1.getIde().compareToIgnoreCase(l2.getIde());
    }
}

class ComparatorAnoCriacaoNome implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        int nome = l1.getNome().compareTo(l2.getNome());
        if (nome != 0) return nome;

        return Integer.compare(l1.getAnoDeCriacao(), l2.getAnoDeCriacao());
    }
}

class ComparatorNomeAnoCriacaoIde implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {

        int nome = l1.getNome().compareTo(l2.getNome());
        if (nome != 0) return nome;

        int anoCriacao = Integer.compare(l1.getAnoDeCriacao(), l2.getAnoDeCriacao());
        if (anoCriacao != 0) return anoCriacao;

        return l1.getIde().compareToIgnoreCase(l2.getIde());

    }
}
