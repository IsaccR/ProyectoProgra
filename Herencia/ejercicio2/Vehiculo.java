package Herencia.ejercicio2;

public class Vehiculo {
    protected String marca;

    public Vehiculo(String marca) {
        this.marca = marca;
    }

    public void encender() {
        System.out.println("\nEl vehículo " + marca + " está encendido.");
    }
}