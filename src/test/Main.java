package test;

import modelo.*;

public class Main {
    public static void main(String[] args) {
        Local local1 = new Local();
        Freno freno1 = new Freno("Frenos de cadena");
        Cambio cambio1 = new Cambio("Electrónico", 4);
        Llanta llanta1 = new Llanta("Westwood", "Magnesio");

        Bicicleta bicicleta1 = new Bicicleta("MarcaX", "ModeloX", "rojo", 1500, freno1, llanta1, cambio1);
        Bicicleta bicicleta2 = new Bicicleta("MarcaY", "ModeloY", "azul", 1500, freno1, llanta1, cambio1);
        Bicicleta bicicleta3 = new Bicicleta("MarcaZ", "ModeloZ", "verde", 1500, freno1, llanta1, cambio1);

        Cliente cliente1 = new Cliente("Cliente1", 300, "Quito", "123");
        Cliente cliente2 = new Cliente("Cliente2", 5000, "Cuenca", "456");
        Vendedor vendedor1 = new Vendedor("Vendedor1", "0101");

        local1.addVendedor(vendedor1);

        local1.addBicicleta(bicicleta1);
        local1.addBicicleta(bicicleta2);
        //local1.addBicicleta(bicicleta3);

        local1.mostrarInventario();

        System.out.println(cliente1);
        cliente1.solicitarBicicleta(local1, bicicleta3, vendedor1);
        System.out.println(cliente1);
        cliente1.solicitarBicicleta(local1, bicicleta1, vendedor1);
        System.out.println(cliente2);
        cliente2.solicitarBicicleta(local1, bicicleta2, vendedor1);
        System.out.println(cliente2);
        cliente2.solicitarBicicleta(local1, bicicleta1, vendedor1);
        System.out.println(cliente2);

        local1.mostrarInventario();

        // Aquí se muestra que transferimos la bicicleta.
        cliente2.mostrarInventarioPertenencias();
    }
}