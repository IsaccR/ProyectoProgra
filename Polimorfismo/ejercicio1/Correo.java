package Polimorfismo.ejercicio1;

public class Correo extends Notificacion {
    @Override
    public void enviar() {
        System.out.println("Enviando Correo: hola");
    }
}
