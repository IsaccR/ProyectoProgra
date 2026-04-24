package Polimorfismo;

import Polimorfismo.ejercicio1.*; 

public class Main {
    public static void main(String[] args) {
        
        Notificacion[] misMensajes = new Notificacion[3];
        
        misMensajes[0] = new WhatsApp();
        misMensajes[1] = new Correo();
        misMensajes[2] = new Notificacion(); 

        for (Notificacion n : misMensajes) {
            n.enviar();
        }
    }
}