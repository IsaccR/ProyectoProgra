package Herencia.ejercicio1;

public class Desarrollador extends Empleado {
 private String lenguajePrincipal;

 public Desarrollador(String nombre, String lenguaje) {
     super(nombre); 
     this.lenguajePrincipal = lenguaje;
 }

 public void programar() {
     System.out.println(nombre + " está escribiendo código en " + lenguajePrincipal);
 }
}
