/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ordenes;

/**
 *
 * @author Usuario
 */
public class ColaOrdenes {

    private NodoOrdenes frente;
    private NodoOrdenes ultimo;

    public void encola(NodoOrdenes cola) {
        if (frente == null) {
            frente = cola;
            ultimo = cola;
        } else {
            ultimo.setAtras(cola);
            ultimo = cola;
        }
    }

    public NodoOrdenes atiende() {
        NodoOrdenes aux = frente;

        if (frente != null) {
            frente = frente.getAtras();
            aux.setAtras(null);
        }

        return aux;

    }

    public String toString() {
        String s = "";

        NodoOrdenes aux = frente;

        while (aux != null) {
            s += aux + "\n";
            aux = aux.getAtras();
        }
        return s;
    }
}
