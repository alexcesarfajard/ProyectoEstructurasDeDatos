package Platillos;

public class Platillos {
    
    private int idplatillo;
    private String nombre;
    private int gastoIngredientes;
    private int precio;
    
    //constructores
    public Platillos() {
    }

    public Platillos(int idplatillo, String nombre, int gastoIngredientes, int precio) {
        this.idplatillo = idplatillo;
        this.nombre = nombre;
        this.gastoIngredientes = gastoIngredientes;
        this.precio = precio;
    }

    //getter y setter
    public int getIdplatillo() {
        return idplatillo;
    }

    public void setIdplatillo(int idplatillo) {
        this.idplatillo = idplatillo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getGastoIngredientes() {
        return gastoIngredientes;
    }

    public void setGastoIngredientes(int gastoIngredientes) {
        this.gastoIngredientes = gastoIngredientes;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    //to string
    @Override
    public String toString() {
        return "Platillo { " + "ID = " + idplatillo + ", nombre = " + nombre + 
                ", Gasto ingredientes = " + gastoIngredientes + ", Precio = " + precio + " } ";
    }

} // fin clase platillos
