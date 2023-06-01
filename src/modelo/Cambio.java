package modelo;

public class Cambio {
    private final String tipo;
    private final int numeroDeMarchasMax;

    public Cambio(String tipo, int numeroDeMarchasMax) {
        this.tipo = tipo;
        this.numeroDeMarchasMax = numeroDeMarchasMax;
    }

    @Override
    public String toString() {
        return "\n\tTipo: " + this.tipo + ", número máximo de marchas: " + this.numeroDeMarchasMax;
    }
}
