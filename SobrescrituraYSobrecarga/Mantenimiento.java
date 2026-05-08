package SobrescrituraYSobrecarga;

public class Mantenimiento {
    
    
    public void realizarServicio(String tipo) {
        System.out.println("Realizando mantenimiento de tipo: " + tipo);
    }

    
    public void realizarServicio(String tipo, double costo) {
        System.out.println("Servicio: " + tipo + " | Costo total: Q" + costo);
    }

    
    public void realizarServicio(String tipo, String pieza, int cantidad) {
        System.out.println("Instalando " + cantidad + " " + pieza + "(s) para el servicio de " + tipo);
    }
}
