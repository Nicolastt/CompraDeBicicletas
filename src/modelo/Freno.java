package modelo;

public class Freno {
    private final String tipo;

    public Freno(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "\n\tTipo: " + this.tipo;
    }
}
