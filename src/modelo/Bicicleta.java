package modelo;

public class Bicicleta {
    private static int numeroDeBicicletas = 0;
    private final int identificador;
    private final String marca;
    private final String modelo;
    private final String color;
    private final double precio;
    private final Freno freno;
    private final Llanta llanta;
    private final Cambio cambios;

    public Bicicleta(String marca, String modelo, String color, double precio, Freno freno, Llanta llanta, Cambio cambios) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.precio = precio;
        this.freno = freno;
        this.llanta = llanta;
        this.cambios = cambios;
        this.identificador = ++numeroDeBicicletas;
        System.out.printf("Se han creado %d bicicleta(s). %n", numeroDeBicicletas);
    }

    @Override
    public String toString() {
        return "--------------------------------------------------------" + "\n" +
        "Bicicleta N° " + identificador + "\n" +
                "--------------------------------------------------------" + "\n" +
                "Marca: " + this.marca + "\n" +
                "Modelo: " + this.modelo + "\n" +
                "Color: " + this.color + "\n" +
                "Precio: " + this.precio + "\n" +
                "Freno: " + freno.toString() + "\n"+
                "Llanta: " + llanta.toString()+ "\n" +
                "Cambios: " + cambios.toString();
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public int getIdentificador() {
        return identificador;
    }

    public String getColor() {
        return color;
    }
}
