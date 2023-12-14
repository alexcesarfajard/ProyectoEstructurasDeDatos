package Balances;

import Platillos.*;

public class GrafoBalance {

    private NodoGrafos[] nodos;
    private int[][] matrizAdyacencia;

    public NodoGrafos[] getNodos() {
        return nodos;
    }

    public GrafoBalance(int cantidadNodos) {
        nodos = new NodoGrafos[cantidadNodos];

        matrizAdyacencia = new int[cantidadNodos][cantidadNodos];

        for (int i = 0; i < cantidadNodos; i++) {
            nodos[i] = new NodoGrafos(i);
        }
    }

    public void agregarArista(int nodoOrigen, int nodoDestino) {
        matrizAdyacencia[nodoOrigen][nodoDestino] = 1;
        matrizAdyacencia[nodoDestino][nodoOrigen] = 1;
    }

    public void convertirNodo(int indiceNodo, Platillos platillo) {
        nodos[indiceNodo].setPlatillo(platillo);
    }

    public void agregarNodos(ListaPlatillos listaPlatillos) {
        NodoPlatillos cabeza = listaPlatillos.getCabeza();
        NodoPlatillos aux = cabeza;

        for (int i = 0; i < nodos.length; i++) {
            convertirNodo(aux.getDato().getIdplatillo(), aux.getDato());
            aux = aux.getNext();
        }
    }

    public int calcularBalance() {
        int balance = 0;

        for (int i = 0; i < matrizAdyacencia.length; i++) {
            for (int j = i + 1; j < matrizAdyacencia[i].length; j++) {
                if (matrizAdyacencia[i][j] == 1) {
                    Platillos platilloOrigen = nodos[i].getPlatillo();
                    Platillos platilloDestino = nodos[j].getPlatillo();

                    int gastoOrigen = platilloOrigen.getGastoIngredientes();
                    int precioDestino = platilloDestino.getPrecio();

                    balance += (precioDestino - gastoOrigen);
                }
            }
        }

        return balance;
    }

    public void imprimirMatrizAdyacencia() {
        for (int i = 0; i < matrizAdyacencia.length; i++) {
            for (int j = 0; j < matrizAdyacencia.length; j++) {
                System.out.print(matrizAdyacencia[i][j] + " ");
            }
            System.out.println();
        }
    }

    public String toString() {
        String respuesta = "Balance de ganancias, es de un total de: " + calcularBalance();
        return respuesta;
    }
    
} // fin de la clase Grafo Balance
