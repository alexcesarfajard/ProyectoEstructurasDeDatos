/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ManejoOrdenes;
/**
 *
 * @author harly
 */
public class NodoListaDobleOrdenes {
    
    private ListaOrdenes dato;
    private NodoListaDobleOrdenes anterior;
    private NodoListaDobleOrdenes siguiente;

    public NodoListaDobleOrdenes(ListaOrdenes dato) {
        this.dato = dato;
    }

    public ListaOrdenes getDato() {
        return dato;
    }

    public NodoListaDobleOrdenes getAnterior() {
        return anterior;
    }

    public NodoListaDobleOrdenes getSiguiente() {
        return siguiente;
    }

    public void setDato(ListaOrdenes dato) {
        this.dato = dato;
    }

    public void setAnterior(NodoListaDobleOrdenes anterior) {
        this.anterior = anterior;
    }

    public void setSiguiente(NodoListaDobleOrdenes siguiente) {
        this.siguiente = siguiente;
    }

  
    public String toString() {
        return dato.toString();
    }
    
    
}
