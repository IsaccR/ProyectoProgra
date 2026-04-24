package Herencia;

import Herencia.ejercicio1.*;
import Herencia.ejercicio2.Vehiculo;
import Herencia.ejercicio2.Moto;

public class Main {
    public static void main(String[] args) {
        Desarrollador dev = new Desarrollador("Alex", "Java");

        dev.trabajar(); 
        
        dev.programar();
        
        //Ejercicio 2
        
        Vehiculo v1 = new Vehiculo("Toyota");
        v1.encender(); 

        System.out.println("--------------------");

        Moto miMoto = new Moto("Pulsar", 135);
        miMoto.encender(); 
        miMoto.hacerCaballito(); 
}
}
