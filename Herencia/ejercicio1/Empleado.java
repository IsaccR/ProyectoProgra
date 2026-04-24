package Herencia.ejercicio1;

public class Empleado {
    protected String nombre; 

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public void trabajar() {
        System.out.println(nombre + " está cumpliendo con su jornada.");
    }
}
