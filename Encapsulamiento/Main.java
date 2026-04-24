package Encapsulamiento;

public class Main {
	public static void main(String[] args) {
	    Producto celular = new Producto("Smartphone", 500.0);
	    
	    celular.setPrecio(-100.0); 
	    
	    System.out.println("Producto: " + celular.getNombre());
	    System.out.println("Precio final: $" + celular.getPrecio());
	}

}
