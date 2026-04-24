package Encapsulamiento;

public class Producto {
    
    private String nombre;
    private double precio;
 
    public Producto(String nombre, double precioInicial) {
        this.nombre = nombre;
        setPrecio(precioInicial); 
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double nuevoPrecio) {
        if (nuevoPrecio >= 0) {
            this.precio = nuevoPrecio;
        } else {
            System.out.println("Error: El precio no puede ser negativo. Se mantendrá el valor anterior.");
        }
    }
}