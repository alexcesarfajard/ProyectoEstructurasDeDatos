package Empleados;

public class Empleados {
    
    private int id;
    private String nombre;
    private String puesto;

    public Empleados() {
    }

    public Empleados(int id, String nombre, String puesto) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    @Override
    public String toString() {
        return "Empleados { " + "ID = " + id + ", Nombre = " + nombre + ", Puesto = " + puesto + " } ";
    }

} // fin de la clase empleados
