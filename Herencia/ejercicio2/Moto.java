package Herencia.ejercicio2;

public class Moto extends Vehiculo {
    private int cilindraje;

    public Moto(String marca, int cilindraje) {
        super(marca); 
        this.cilindraje = cilindraje;
    }

    @Override
    public void encender() {
        System.out.println("La moto " + marca + " de " + cilindraje + "cc ruge y enciende.");
    }

    public void hacerCaballito() {
        System.out.println("La moto está haciendo un caballito.");
    }
}
