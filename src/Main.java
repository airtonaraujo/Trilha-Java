import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Main {
    public static void main(String[] args) {

        //Exercício de Java Orientado a Objetos do curso "Java aplicando orientação a objetos"

                Filme favorito = new Filme();

                favorito.setNome("Dungeons & Dragons: Honra Entre Rebeldes");
                favorito.setAnoDeLancamento(2023);
                favorito.setDuracaoEmMinutos(134);
                favorito.setIncluidoNoPlano(true);

                favorito.exibeFichaTecnica();
                favorito.avalia(9);
                favorito.avalia(7.4);
                favorito.avalia(6.4);

                System.out.println("Média de avaliações do filme: " +favorito.exibirMedia());

                Serie serie = new Serie();
                serie.setNome("The Legend of Vox Machina");
                serie.setAnoDeLancamento(2022);
                serie.setTemporadas(2);
                serie.setEpisodiosPorTemporada(12);
                serie.setMinutosPorEpisodio(22);
                serie.exibeFichaTecnica();
                System.out.println("Duração para maratonar " + serie.getNome() + " :" + serie.getDuracaoEmMinutos());
    }
}
