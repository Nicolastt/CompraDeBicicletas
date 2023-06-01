package modelo;

public class Llanta {
    private final String tipo;
    private final String material;

    public Llanta(String tipo, String material) {
        this.tipo = tipo;
        this.material = material;
    }

    @Override
    public String toString() {
        return "\n\tTipo: " + this.tipo + ", material: " + this.material;
    }
}
