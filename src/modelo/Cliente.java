package modelo;

import java.util.ArrayList;

public class Cliente {
    private final String nombre;
    private final String direccion;
    private final String telefono;
    private double saldo;
    private boolean haCompradoBicicleta;
    private final ArrayList<Bicicleta> inventarioPertenecias;

    public Cliente(String nombre, double saldo, String direccion, String telefono) {
        this.nombre = nombre;
        this.saldo = saldo;
        this.direccion = direccion;
        this.telefono = telefono;
        this.inventarioPertenecias = new ArrayList<>();
    }


    public void solicitarBicicleta(Local local, Bicicleta bicicleta, Vendedor vendedor) {
        if (haCompradoBicicleta) {
            System.out.println("Cliente recurrente! No puede comprar otra bici!");
            return;
        }

        if (!bicicletaEstaDisponible(local, bicicleta)) {
            System.out.println("La bicicleta " + bicicleta.getIdentificador() + " no está disponible en el local.");
            return;
        }

        if (!haySaldoSuficiente(bicicleta)) {
            System.out.println("ERROR: ¡No tiene saldo suficiente!");
            haCompradoBicicleta = false;
            return;
        }

        this.comprarBicicleta(bicicleta);
        Factura factura = new Factura(bicicleta, this, vendedor);
        vendedor.generarFactura(factura);
        vendedor.entregarBicicleta(local, bicicleta, this);

    }

    private static boolean bicicletaEstaDisponible(Local local, Bicicleta bicicleta) {
        return local.verificarDisponibilidadBicicleta(bicicleta);
    }

    private void comprarBicicleta(Bicicleta bicicleta) {

        this.saldo -= bicicleta.getPrecio();
        System.out.printf("NOTIFICACIÓN: Se ha retirado $%.2f del saldo de %s%n", bicicleta.getPrecio(), this.nombre);
        System.out.println("--------------------------------------------------------");
        haCompradoBicicleta = true;
    }

    private boolean haySaldoSuficiente(Bicicleta bicicleta) {
        return this.saldo >= bicicleta.getPrecio();
    }

    public String getNombre() {
        return nombre;
    }

    public void recibirBicicleta(Bicicleta bicicleta) {
        this.inventarioPertenecias.add(bicicleta);
    }

    @Override
    public String toString() {
        return "--------------------------------------------------------" + "\n" +
                "                     FICHA CLIENTE                     " + "\n" +
                "--------------------------------------------------------" + "\n" +
                "Nombre: " + this.nombre + "\n" +
                "Saldo: " + this.saldo + "\n" +
                "Dirección: " + this.direccion + "\n" +
                "Teléfono: " + this.telefono + "\n" +
                "HaCompradoBicicleta?: " + this.haCompradoBicicleta + "\n" +
                "--------------------------------------------------------";
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void mostrarInventarioPertenencias() {
        if (inventarioPertenecias.isEmpty()) {
            System.out.println("-------------------------------------------");
            System.out.println("| No tenemos bicicletas por el momento :c |");
            System.out.println("-------------------------------------------");
        }

        System.out.println("---------------- PERTENENCIAS DEL CLIENTE --------------");
        System.out.printf("%s tiene %d bicicleta(s).%n",this.nombre, inventarioPertenecias.size());
        for (Bicicleta bic : inventarioPertenecias) {
            System.out.println(bic);
        }
    }
}
