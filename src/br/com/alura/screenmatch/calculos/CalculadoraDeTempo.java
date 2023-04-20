package br.com.alura.screenmatch.calculos;
import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal = 0;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void incluirTitulo(Titulo titulo) {
        tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
