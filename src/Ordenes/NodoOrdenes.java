/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ordenes;

/**
 *
 * @author Usuario
 */
public class NodoOrdenes {
    
    private String dato;
    private NodoOrdenes atras;
    
    public NodoOrdenes(String dato){
        this.dato = dato;
    }
    
    public NodoOrdenes(){
    }

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

    @Override
    public String toString() {
        return dato;
    }
    
}
