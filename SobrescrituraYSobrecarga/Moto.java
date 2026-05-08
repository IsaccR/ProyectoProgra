package SobrescrituraYSobrecarga;

public class Moto extends Vehiculo {
    @Override
    public void realizarRevision() {
        
        System.out.println("Revisando cadena, presión de llantas y nivel de aceite de la moto.");
    }
}