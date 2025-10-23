package parcialjava;

public class Vehiculos {
    private String patente;
    private String marca;
    private int capacidad;

    // Cons
    public Vehiculo(String patente, String marca, int capacidad) {
        this.patente = patente;
        this.marca = marca;
        this.capacidad = capacidad;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    // mostrarDatos
    public String mostrarDatos() {
        return "Vehículo " + patente + " – " + marca + " – Capacidad: " + capacidad;
    }
}
