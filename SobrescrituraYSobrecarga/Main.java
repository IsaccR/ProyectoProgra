package SobrescrituraYSobrecarga;

public class Main {
    public static void main(String[] args) {
        
        
        System.out.println(" Ejemplo de Sobrecarga ");
        Mantenimiento pc = new Mantenimiento();
        
        pc.realizarServicio("Limpieza de software");
        pc.realizarServicio("Cambio de SSD", 450.00);
        pc.realizarServicio("Reparación", "Memoria RAM", 2);

        System.out.println("\n Ejemplo de Sobrescritura ");
        
        
        Vehiculo v = new Vehiculo();
        v.realizarRevision();
        
        
        Moto miPulsar = new Moto();
        miPulsar.realizarRevision(); 
    }
}
