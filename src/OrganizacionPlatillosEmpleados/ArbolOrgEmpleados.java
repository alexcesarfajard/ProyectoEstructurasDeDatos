package OrganizacionPlatillosEmpleados;

public class ArbolOrgEmpleados {

    private NodoOrgEmpleados raiz;

    public void insertar(int id, String nombre, int puesto) { //primer paso para insertar en el arbol
        if (raiz == null) { //si no hay elementos en el arbol, se crea la raiz 
            raiz = new NodoOrgEmpleados(id, nombre, puesto);
        } else {
            insertarRecursivo(raiz, id, nombre, puesto);
        }
    }

    private void insertarRecursivo(NodoOrgEmpleados n, int id, String nombre, int puesto) {
        if (id < n.getId()) { // esta validacion es para saber si debemos insertar a la izquierda
            if (n.getHijoizq() == null) { // validamos si el hijo izquierdo tiene algo, si no hay, lo creamos
                n.setHijoizq(new NodoOrgEmpleados(id, nombre, puesto)); //se crea el hijo izquierdo
            } else {
                insertarRecursivo(n.getHijoizq(), id, nombre, puesto);
            }
        } else { //entonces vamos a insertar al lado derecho
            if (n.getHijoder() == null) { //validamos si el hijo derecho tiene algo, si no hay, lo creamos
                n.setHijoder(new NodoOrgEmpleados(id, nombre, puesto)); //se crea el hijo derecho
            } else { // si el hijo derecho tiene algo, llamamos recursivamente hasta encontrar que no haya nada 
                insertarRecursivo(n.getHijoder(), id, nombre, puesto);
            }
        }
    }

    public void inorden() { //imprimir el arbol en inorden
        System.out.println("Empleados registrados\nNomenclatura tipo platillos: 1- Cocinero, 2- Mesero, 3- Recepcionista\n");
        if (raiz != null) {
            inordenRecursivo(raiz);
        } else {
            System.out.println("No hay nada en la raiz, el arbol está vacío");
        }
    }

    private void inordenRecursivo(NodoOrgEmpleados n) { //metodo recursivo para mostrar arbol inorden
        if (n != null) {
            inordenRecursivo(n.getHijoizq());
            System.out.print("ID: " + n.getId() + ", Nombre: " + n.getNombre() + ", Puesto: " + n.getPuesto() + "\n");
            inordenRecursivo(n.getHijoder());
        }
    }

    public void buscarporpuesto(int x) {
        System.out.println("}Empleados registrados\nNomenclatura tipo platillos: 1- Desayuno, 2- Almuerzo, 3- Cena\n"
                + "Puestos a buscar del tipo: " + x + "\n");
        if (raiz != null) {
            buscarporpuestorecursivo(raiz, x);
        } else {
            System.out.println("No hay nada en la raiz, el arbol está vacío");
        }
    }

    private void buscarporpuestorecursivo(NodoOrgEmpleados n, int x) { //metodo recursivo para mostrar arbol inorden
        if (n != null) {
            if (n.getPuesto()== x) {
                System.out.print("ID: " + n.getId() + ", Nombre: " + n.getNombre() + ", Tipo: " + n.getPuesto()+ "\n");
            }
            buscarporpuestorecursivo(n.getHijoizq(), x);
            buscarporpuestorecursivo(n.getHijoder(), x);
        }
    }
}
