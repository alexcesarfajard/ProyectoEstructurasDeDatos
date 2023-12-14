package Ordenes;

public class NodoOrdenes {
    
    //atributos
    private String dato;
    private NodoOrdenes atras;
    
    //constructores
    public NodoOrdenes(String dato){
        this.dato = dato;
    }
    
    public NodoOrdenes(){
    }

    //getters y setters
    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public NodoOrdenes getAtras() {
        return atras;
    }

    public void setAtras(NodoOrdenes atras) {
        this.atras = atras;
    }

    // to string
    @Override
    public String toString() {
        return dato;
    }
    
} // fin clase nodo ordenes
