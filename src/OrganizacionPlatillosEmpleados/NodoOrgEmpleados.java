package OrganizacionPlatillosEmpleados;

public class NodoOrgEmpleados {

    //atributos
    private int id; //referencia del arbol
    private String nombre; // nombre empleado
    private int puesto; // puesto empleado, 1 es cocinero, 2 es mesero, 3 recepcionista
    private NodoOrgEmpleados hijoizq; //referencia a una rama
    private NodoOrgEmpleados hijoder;// referencia a otra rama

    //constructor
    public NodoOrgEmpleados(int id, String nombre, int puesto) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
    }

    //getter y setter
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

    public int getPuesto() {
        return puesto;
    }

    public void setPuesto(int puesto) {
        this.puesto = puesto;
    }

    public NodoOrgEmpleados getHijoizq() {
        return hijoizq;
    }

    public void setHijoizq(NodoOrgEmpleados hijoizq) {
        this.hijoizq = hijoizq;
    }

    public NodoOrgEmpleados getHijoder() {
        return hijoder;
    }

    public void setHijoder(NodoOrgEmpleados hijoder) {
        this.hijoder = hijoder;
    }

} // fin clase nodo org empleados
