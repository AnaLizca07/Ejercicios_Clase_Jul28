package constructor;

public class Deck {
    private int numeroDeCartas;
    private int promedioDeElixir;
    private String calidadDeCarta;
    private int nivelCarta;

    public Deck(int numeroDeCartas, int promedioDeElixir, String calidadDeCarta, int nivelCarta) {
        this.numeroDeCartas = numeroDeCartas;
        this.promedioDeElixir = promedioDeElixir;
        this.calidadDeCarta = calidadDeCarta;
        this.nivelCarta = nivelCarta;
    }

    public int getNumeroDeCartas() {
        return numeroDeCartas;
    }

    public void setNumeroDeCartas(int numeroDeCartas) {
        this.numeroDeCartas = numeroDeCartas;
    }

    public int getPromedioDeElixir() {
        return promedioDeElixir;
    }

    public void setPromedioDeElixir(int promedioDeElixir) {
        this.promedioDeElixir = promedioDeElixir;
    }

    public String getCalidadDeCarta() {
        return calidadDeCarta;
    }

    public void setCalidadDeCarta(String calidadDeCarta) {
        this.calidadDeCarta = calidadDeCarta;
    }

    public int getNivelCarta() {
        return nivelCarta;
    }

    public void setNivelCarta(int nivelCarta) {
        this.nivelCarta = nivelCarta;
    }
}
