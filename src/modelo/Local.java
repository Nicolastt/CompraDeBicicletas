package modelo;

import java.util.ArrayList;

public class Local {
    private final ArrayList<Vendedor> plantillaVendedores;
    private final ArrayList<Bicicleta> inventarioBicicletas;

    public Local() {
        this.plantillaVendedores = new ArrayList<>();
        this.inventarioBicicletas = new ArrayList<>();
    }

    public void addVendedor(Vendedor vendedor) {
        this.plantillaVendedores.add(vendedor);
    }

    public void addBicicleta(Bicicleta bicicleta) {
        this.inventarioBicicletas.add(bicicleta);
    }

    public void entregarBicicleta(Bicicleta bicicleta) {
        this.inventarioBicicletas.remove(bicicleta);
    }


    public void mostrarInventario() {
        if (inventarioBicicletas.isEmpty()) {
            System.out.println("-------------------------------------------");
            System.out.println("| No tenemos bicicletas por el momento :c |");
            System.out.println("-------------------------------------------");
        }

        System.out.println("-------------- INVENTARIO BICICLETAS LOCAL -------------");
        System.out.printf("Hay %d bicicleta(s) en el local.%n",inventarioBicicletas.size());
        for (Bicicleta bic : inventarioBicicletas) {
            System.out.println(bic);
        }
    }

    public boolean verificarDisponibilidadBicicleta(Bicicleta bicicleta) {
        for (Bicicleta bici : inventarioBicicletas) {
            if (bici.equals(bicicleta)) {
                return true;
            }
        }
        return false;
    }
}