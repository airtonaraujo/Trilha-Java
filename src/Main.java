public class Main {
    public static void main(String[] args) {

        //Exercício de Java Orientado a Objetos do curso "Java aplicando orientação a objetos"

                Filme favorito = new Filme();

                favorito.nome = "Dungeons & Dragons: Honra Entre Rebeldes";
                favorito.anoDeLancamento = 2023;
                favorito.duracaoEmMinutos = 134;
                favorito.incluidoNoPlano = true;

                favorito.exibeFichaTecnica();
                favorito.avalia(9);
                favorito.avalia(7.4);
                favorito.avalia(6.4);

                System.out.println("Média de avaliações do filme: " +favorito.exibirMedia());
    }
}
