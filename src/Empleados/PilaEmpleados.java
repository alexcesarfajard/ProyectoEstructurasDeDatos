/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empleados;

/**
 *
 * @author Usuario
 */
public class PilaEmpleados {

    private NodoEmpleados primero;

    public PilaEmpleados() {
        primero = null;
    }

    public NodoEmpleados getPrimero() {
        return primero;
    }

    public void setPrimero(NodoEmpleados primero) {
        this.primero = primero;
    }

    public boolean esVacia() {
        if (primero == null) {
            return true;
        } else {
            return false;
        }
    }

    public void aplilarEmpleado(Empleados emp) {
        NodoEmpleados nodo = new NodoEmpleados(emp);
        if (esVacia()) {
            primero = nodo;
        } else {
            nodo.setSiguiente(primero);
            primero = nodo;
        }
    }

    public String mostrarEmpleados() {
        String respuesta = "Pila:\n\n";

        if (!esVacia()) {
            NodoEmpleados temp = primero;
            while (temp != null) {
                respuesta += temp.getDato() + "\n";
                temp = temp.getSiguiente();
            }
        } else {
            respuesta = "La pila esta vacia";
        }
        return respuesta;
    }



}