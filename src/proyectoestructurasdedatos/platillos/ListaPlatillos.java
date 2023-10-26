package proyectoestructurasdedatos.platillos;

public class ListaPlatillos {

    NodoPlatillos cabeza;
    NodoPlatillos ultimo;

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

    public String toString() {
        String resp = "Lista circular\n\n";

        NodoPlatillos aux = cabeza;

        if (aux != null) {
            resp += aux.toString() + "\n";
            aux = aux.getNext();

            while (aux != cabeza) {
                resp += aux.toString() + "\n";
                aux = aux.getNext();
            }
        } else {
            resp += "La lista está vacía";
        }
        
        return resp;
    }

}
