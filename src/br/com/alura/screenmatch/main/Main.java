package br.com.alura.screenmatch.main;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroDeRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Exercício de Java Orientado a Objetos do curso "Java aplicando orientação a objetos"

                Filme favorito = new Filme("Dungeons & Dragons: Honra Entre Rebeldes", 2023);
                favorito.setDuracaoEmMinutos(134);
                favorito.setIncluidoNoPlano(true);

                favorito.exibeFichaTecnica();
                favorito.avalia(9);
                favorito.avalia(7.4);
                favorito.avalia(6.4);

                System.out.println("Média de avaliações do filme: " +favorito.exibirMedia());

                Serie serie = new Serie("The Legend of Vox Machina", 2022);
                serie.setTemporadas(2);
                serie.setEpisodiosPorTemporada(12);
                serie.setMinutosPorEpisodio(22);
                serie.exibeFichaTecnica();
                System.out.println("Duração para maratonar " + serie.getNome() + ": " + serie.getDuracaoEmMinutos());

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.incluirTitulo(favorito);
        calculadora.incluirTitulo(serie);
        System.out.println(calculadora.getTempoTotal());

        FiltroDeRecomendacao filtro = new FiltroDeRecomendacao();
        filtro.filtra(favorito);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(serie);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        var hungerGames = new Filme("The Hunger Games", 2012);
        hungerGames.setDuracaoEmMinutos(142);
        hungerGames.avalia(9);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(hungerGames);
        listaDeFilmes.add(favorito);
        System.out.println("Tamanho da lista: " +listaDeFilmes.size());
        System.out.println("Primeiro filme: " +listaDeFilmes.get(0));
        System.out.println(listaDeFilmes);

    }
}
