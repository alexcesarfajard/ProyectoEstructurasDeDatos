package OrganizacionPlatillosEmpleados;

public class ArbolOrgPlatillos {

    private NodoOrgPlatillos raiz;

    public void insertar(int id, String nombre, int tipoComida) { //primer paso para insertar en el arbol
        if (raiz == null) { //si no hay elementos en el arbol, se crea la raiz 
            raiz = new NodoOrgPlatillos(id, nombre, tipoComida);
        } else {
            insertarRecursivo(raiz, id, nombre, tipoComida);
        }
    }

    private void insertarRecursivo(NodoOrgPlatillos n, int id, String nombre, int tipoComida) {
        if (id < n.getId()) { // esta validacion es para saber si debemos insertar a la izquierda
            if (n.getHijoizq() == null) { // validamos si el hijo izquierdo tiene algo, si no hay, lo creamos
                n.setHijoizq(new NodoOrgPlatillos(id, nombre, tipoComida)); //se crea el hijo izquierdo
            } else {
                insertarRecursivo(n.getHijoizq(), id, nombre, tipoComida);
            }
        } else { //entonces vamos a insertar al lado derecho
            if (n.getHijoder() == null) { //validamos si el hijo derecho tiene algo, si no hay, lo creamos
                n.setHijoder(new NodoOrgPlatillos(id, nombre, tipoComida)); //se crea el hijo derecho
            } else { // si el hijo derecho tiene algo, llamamos recursivamente hasta encontrar que no haya nada 
                insertarRecursivo(n.getHijoder(), id, nombre, tipoComida);
            }
        }
    }

    public void inorden() { //imprimir el arbol en inorden
        System.out.println("Platillos registrados\nNomenclatura tipo platillos: 1- Desayuno, 2- Almuerzo, 3- Cena\n");
        if (raiz != null) {
            inordenRecursivo(raiz);
        } else {
            System.out.println("No hay nada en la raiz, el arbol está vacío");
        }
    }

    private void inordenRecursivo(NodoOrgPlatillos n) { //metodo recursivo para mostrar arbol inorden
        if (n != null) {
            inordenRecursivo(n.getHijoizq());
            System.out.print("ID: " + n.getId() + ", Nombre: " + n.getNombre() + ", Tipo: " + n.getTipoComida() + "\n");
            inordenRecursivo(n.getHijoder());
        }
    }

    public void buscarportipoplatillo(int x) {
        System.out.println("Platillos registrados\nNomenclatura tipo platillos: 1- Desayuno, 2- Almuerzo, 3- Cena\n"
                + "Platillos a buscar del tipo: " + x + "\n");
        if (raiz != null) {
            buscarportipoplatillorecursivo(raiz, x);
        } else {
            System.out.println("No hay nada en la raiz, el arbol está vacío");
        }
    }

    private void buscarportipoplatillorecursivo(NodoOrgPlatillos n, int x) { //metodo recursivo para mostrar arbol inorden
        if (n != null) {
            if (n.getTipoComida() == x) {
                System.out.print("ID: " + n.getId() + ", Nombre: " + n.getNombre() + ", Tipo: " + n.getTipoComida() + "\n");
            }
            buscarportipoplatillorecursivo(n.getHijoizq(), x);
            buscarportipoplatillorecursivo(n.getHijoder(), x);
        }
    }

} // fin clase arbol org platillos
