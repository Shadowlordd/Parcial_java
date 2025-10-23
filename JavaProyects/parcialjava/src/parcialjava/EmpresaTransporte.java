package parcialjava;

public class EmpresaTransporte {
    private String nombre;
    private Vehiculos[] flota;
    private int cantidadVehiculos;

    public EmpresaTransporte(String nombre, int capacidadMaxima) {
        this.nombre = nombre;
        this.flota = new Vehiculos[capacidadMaxima];
        this.cantidadVehiculos = 0;
    }

    public void agregarVehiculo(Vehiculos v) {
        if (cantidadVehiculos < flota.length) {
            flota[cantidadVehiculos++] = v;
        } else {
            System.out.println("No hay espacio para más vehículos.");
        }
    }

    public void mostrarFlota() {
        System.out.println("Flota de " + nombre + ":");
        for (int i = 0; i < cantidadVehiculos; i++) {
            System.out.println(flota[i].mostrarDatos());
        }
    }

    public int calcularCapacidadTotal() {
        int total = 0;
        for (int i = 0; i < cantidadVehiculos; i++) {
            total += flota[i].getCapacidad();
        }
        return total;
    }

    // Ordenar por capacidad de mayor a menor
    public void ordenarPorCapacidad() {
        for (int i = 0; i < cantidadVehiculos - 1; i++) {
            for (int j = 0; j < cantidadVehiculos - 1 - i; j++) {
                if (flota[j].getCapacidad() < flota[j + 1].getCapacidad()) {
                    Vehiculo aux = flota[j];
                    flota[j] = flota[j + 1];
                    flota[j + 1] = aux;
                }
            }
        }
    }

    // Buscar por tipo (Auto o Camion)
    public void buscarPorTipo(String tipo) {
        System.out.println("\nBúsqueda por tipo: " + tipo);
        boolean encontrado = false;
        for (int i = 0; i < cantidadVehiculos; i++) {
            if (flota[i].getClass().getSimpleName().equalsIgnoreCase(tipo)) {
                System.out.println(flota[i].mostrarDatos());
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron vehículos del tipo " + tipo);
        }
    }

    public Vehiculo[] getFlota() {
        return flota;
    }
}

