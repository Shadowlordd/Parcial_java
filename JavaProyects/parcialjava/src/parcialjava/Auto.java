package parcialjava;

public class Auto extends Vehiculo {
    private int cantidadPasajeros;

    // Constructor
    public Auto(String patente, String marca, int cantidadPasajeros) {
        super(patente, marca, cantidadPasajeros); // usamos capacidad como pasajeros
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public void setCantidadPasajeros(int cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }

    @Override
    public String mostrarDatos() {
        return "Auto " + getMarca() + " – Pasajeros: " + cantidadPasajeros;
    }
}
