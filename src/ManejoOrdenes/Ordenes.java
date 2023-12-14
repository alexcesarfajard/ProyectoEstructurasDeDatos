package ManejoOrdenes;

public class Ordenes {

    private NodoListaDobleOrdenes cabeza;
    private NodoListaDobleOrdenes ultimo;

    public void inserta(ListaOrdenes p) {

        if (cabeza == null) {
            cabeza = new NodoListaDobleOrdenes(p);
            ultimo = cabeza;
            ultimo.setSiguiente(cabeza);
            cabeza.setAnterior(ultimo);
        } else {
            if (cabeza.getDato().getIdOrdenes() > p.getIdOrdenes()) {
                NodoListaDobleOrdenes aux = new NodoListaDobleOrdenes(p);
                aux.setSiguiente(cabeza);
                cabeza.setAnterior(aux);
                cabeza = aux;
                cabeza.setAnterior(ultimo);
                ultimo.setSiguiente(cabeza);
            } else {
                if (p.getIdOrdenes() > ultimo.getDato().getIdOrdenes()) {
                    ultimo.setSiguiente(new NodoListaDobleOrdenes(p));
                    ultimo = ultimo.getSiguiente();
                    ultimo.setSiguiente(cabeza);
                    cabeza.setAnterior(ultimo);

                } else {
                    NodoListaDobleOrdenes aux = cabeza;

                    while (aux.getSiguiente().getDato().getIdOrdenes() < p.getIdOrdenes()) {
                        aux = aux.getSiguiente();
                    }

                    NodoListaDobleOrdenes temp = new NodoListaDobleOrdenes(p);

                    temp.setSiguiente(aux.getSiguiente());
                    temp.setAnterior(aux);
                    aux.setSiguiente(temp);
                    temp.getSiguiente().setAnterior(temp);
                }
            }
        }

    }

    public String toString() {
        String respuesta = "Lista doble circular: \n";

        if (cabeza != null) {
            NodoListaDobleOrdenes aux = cabeza;

            respuesta += aux.toString() + "\n";
            aux = aux.getSiguiente();

            while (aux != cabeza) {
                respuesta += aux.toString() + "\n";
                aux = aux.getSiguiente();
            }
        } else {
            respuesta += "Vacia";
        }
        return respuesta;
    }

} // fin clase ordenes
