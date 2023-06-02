package modelo;

public class Vendedor {
    private final String nombre;
    private final String id;

    public Vendedor(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void generarFactura(Factura factura1) {
        factura1.imprimirFactura();
    }

    public void entregarBicicleta(Local local1, Bicicleta bicicleta1, Cliente cliente1) {
        local1.entregarBicicleta(bicicleta1);
        cliente1.recibirBicicleta(bicicleta1);
    }

    public String getId() {
        return id;
    }
}
