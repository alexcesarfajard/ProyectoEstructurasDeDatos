package Platillos;

public class ListaPlatillos {

    private NodoPlatillos cabeza;
    private NodoPlatillos ultimo;

    public NodoPlatillos getCabeza() {
        return cabeza;
    }

    public int getNumeroPlatillos() {
        int contador = 0;
        NodoPlatillos temp = cabeza;

        do {
            contador++;
            temp = temp.getNext();
        } while (temp != cabeza);

        return contador;
    }

    public void insertaPlatillo(Platillos p) {

        if (cabeza == null) {
            cabeza = new NodoPlatillos(p);
            ultimo = cabeza;
            ultimo.setNext(cabeza);
        } else {
            if (p.getIdplatillo() < cabeza.getDato().getIdplatillo()) {
                NodoPlatillos aux = new NodoPlatillos(p);
                aux.setNext(cabeza);
                cabeza = aux;
                ultimo.setNext(cabeza);
            } else {
                if (ultimo.getDato().getIdplatillo() < p.getIdplatillo()) {
                    NodoPlatillos aux = new NodoPlatillos(p);
                    ultimo.setNext(aux);
                    ultimo = aux;
                    ultimo.setNext(cabeza);
                } else {
                    NodoPlatillos aux = cabeza;
                    while (aux.getNext().getDato().getIdplatillo() < p.getIdplatillo()) {
                        aux = aux.getNext();
                    }
                    NodoPlatillos temporal = new NodoPlatillos(p);
                    temporal.setNext(aux.getNext());
                    aux.setNext(temporal);
                }
            }
        }
    }

    //Impresion sin Recursiva
//    public String toString() {
//        String resp = "Lista circular\n\n";
//
//        NodoPlatillos aux = cabeza;
//
//        if (aux != null) {
//            resp += aux.toString() + "\n";
//            aux = aux.getNext();
//
//            while (aux != cabeza) {
//                resp += aux.toString() + "\n";
//                aux = aux.getNext();
//            }
//        } else {
//            resp += "La lista está vacía";
//        }
//        
//        return resp;
//    }
    
    //Impresion con Recursiva
    public String mostrarPlatillos() {
        return "Lista circular\n\n" + mostrarPlatillosRecursiva(cabeza, "");
    }

    private String mostrarPlatillosRecursiva(NodoPlatillos temp, String respuesta) {
        if (temp == null) {
            return "La lista está vacía";
        }
        respuesta += temp.toString() + "\n";
        if (temp.getNext() != cabeza) {
            return mostrarPlatillosRecursiva(temp.getNext(), respuesta);
        }

        return respuesta;
    }
    
} // fin clase lista platillos
