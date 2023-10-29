/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Platillos;

/**
 *
 * @author Usuario
 */
public class NodoPlatillos {

    private Platillos dato;
    private NodoPlatillos next;

    public NodoPlatillos(Platillos dato) {
        this.dato = dato;
    }

    public String toString() {
        return "Nodo {" + " Dato = " + dato + "}";
    }

    public Platillos getDato() {
        return dato;
    }

    public void setDato(Platillos dato) {
        this.dato = dato;
    }

    public NodoPlatillos getNext() {
        return next;
    }

    public void setNext(NodoPlatillos next) {
        this.next = next;
    }
}
