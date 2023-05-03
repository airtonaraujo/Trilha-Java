package br.com.alura.screenmatch.main;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainLists {
    public static void main(String[] args) {
        Filme favorito1 = new Filme("Dungeons & Dragons: Honra Entre Rebeldes", 2023);
        favorito1.avalia(9);
        Serie serie = new Serie("The Legend of Vox Machina", 2022);
        serie.avalia(10);
        Filme favorito2 = new Filme("The Hunger Games", 2012);
        favorito2.avalia(8);


        List<Titulo> lista = new ArrayList<>();
        lista.add(favorito2);
        lista.add(favorito1);
        lista.add(serie);

        for (Titulo item: lista) {
            System.out.println(item.getNome() + " nota: " + item.exibirMedia());
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Tom Cruise");
        buscaPorArtista.add("Nicolas Cage");

        System.out.println(buscaPorArtista);
        Collections.sort(buscaPorArtista);
        System.out.println(buscaPorArtista);

        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println(lista);
    }
}
