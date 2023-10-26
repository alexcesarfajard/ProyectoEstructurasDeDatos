package proyectoestructurasdedatos;

public class NodoEmpleados {

    private Empleados dato;
    private NodoEmpleados siguiente;

    public NodoEmpleados(Empleados dato) {
        this.dato = dato;
    }

    public String toString() {
        return "Nodo { " + " Dato = " + dato + "}";
    }

    public Empleados getDato() {
        return dato;
    }

    public void setDato(Empleados dato) {
        this.dato = dato;
    }

    public NodoEmpleados getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoEmpleados siguiente) {
        this.siguiente = siguiente;
    }
    
    

}
