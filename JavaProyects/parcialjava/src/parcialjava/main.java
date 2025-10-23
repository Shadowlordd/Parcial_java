package parcialjava;

public class main {
    public static void main(String[] args) {
        // --- Polimorfismo con Vehiculo y subclases ---
        Vehiculos v1 = new Auto("ABC123", "Toyota", 5);
        Vehiculos v2 = new Camion("XYZ789", "Volvo", 12.5);

        System.out.println(v1.mostrarDatos()); 
        System.out.println(v2.mostrarDatos()); 

        // --- EmpresaTransport ---
        EmpresaTransporte empresa = new EmpresaTransporte("TransLog", 5);

        // carga de vehiculs
        empresa.agregarVehiculo(v1);
        empresa.agregarVehiculo(v2);
        empresa.agregarVehiculo(new Camion("LMN456", "Scania", 8));
        empresa.agregarVehiculo(new Auto("DEF456", "Ford", 4));

        System.out.println("\n=== Flota original ===");
        empresa.mostrarFlota();

        // -- Ordena por capacidad ----
        empresa.ordenarPorCapacidad();
        System.out.println("\n=== Flota ordenada por capacidad (descendente) ===");
        empresa.mostrarFlota();

        // - por tipo ---
        empresa.buscarPorTipo("Auto");
        empresa.buscarPorTipo("Camion");

        // --- Calcular  total ---
        int capacidadTotal = empresa.calcularCapacidadTotal();
        System.out.println("\nCapacidad total de la flota: " + capacidadTotal);
    }
}
