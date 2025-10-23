package parcialjava;

public class Camion extends Vehiculo {
    private double capacidadCarga;

    public Camion(String patente, String marca, double capacidadCarga) {
        // se guardan ds
        super(patente, marca, (int) capacidadCarga);
        this.capacidadCarga = capacidadCarga;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public String mostrarDatos() {
        return "Camión " + getMarca() + " – Carga: " + capacidadCarga + " toneladas";
    }
}

