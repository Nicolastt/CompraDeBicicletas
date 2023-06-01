package modelo;

import modelo.Bicicleta;
import modelo.Cliente;

public class Factura {
    private final Bicicleta bicicleta;
    private final Cliente cliente;
    private final Vendedor vendedor;

    public Factura(Bicicleta bicicleta, Cliente cliente, Vendedor vendedor) {
        this.bicicleta = bicicleta;
        this.cliente = cliente;
        this.vendedor = vendedor;
    }

    public void imprimirFactura() {
        System.out.println("<---------------------- FACTURA ----------------------->");
        System.out.println("---------------------------- * -------------------------");
        System.out.println("Venta: modelo.Bicicleta N° " + bicicleta.getIdentificador() + "\n\tMarca: " + bicicleta.getMarca() + "\n\tModelo: " + bicicleta.getModelo()+ "\n\tColor: " + bicicleta.getColor());
        System.out.println("modelo.Cliente: " + cliente.getNombre());
        System.out.println("\tDirección: " + cliente.getDireccion());
        System.out.println("\tTeléfono: " + cliente.getTelefono());
        System.out.println("modelo.Vendedor: " + vendedor.getNombre() + " \n\tID: " + vendedor.getId());
        System.out.println("---------------------------- * -------------------------");
        System.out.println("Monto Total: $" + bicicleta.getPrecio());
        System.out.println("<------------------------------------------------------>");
    }
}