package OrganizacionPlatillosEmpleados;

public class NodoOrgPlatillos {

    //atributos
    private int id; //referencia del arbol
    private String nombre; // nombre platillo
    private int tipoComida; // tipo comida, 1 es desayuno, 2 es almuerzo y 3 es cena
    private NodoOrgPlatillos hijoizq; //referencia a una rama
    private NodoOrgPlatillos hijoder;// referencia a otra rama

    //constructores
    public NodoOrgPlatillos(int id, String nombre, int tipoComida) {
        this.id = id;
        this.nombre = nombre;
        this.tipoComida = tipoComida;
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

    public int getTipoComida() {
        return tipoComida;
    }

    public void setTipoComida(int tipoComida) {
        this.tipoComida = tipoComida;
    }

    public NodoOrgPlatillos getHijoizq() {
        return hijoizq;
    }

    public void setHijoizq(NodoOrgPlatillos hijoizq) {
        this.hijoizq = hijoizq;
    }

    public NodoOrgPlatillos getHijoder() {
        return hijoder;
    }

    public void setHijoder(NodoOrgPlatillos hijoder) {
        this.hijoder = hijoder;
    }

} // fin de la clase nodo org platillos
