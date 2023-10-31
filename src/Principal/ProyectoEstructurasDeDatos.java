package Principal;

import Empleados.Empleados;
import Empleados.PilaEmpleados;

import Platillos.Platillos;
import Platillos.ListaPlatillos;

import Ordenes.*;

public class ProyectoEstructurasDeDatos {

    public static void main(String[] args) {
        
        
        ListaPlatillos listplatillos = new ListaPlatillos();
        
        listplatillos.insertaPlatillo(new Platillos(0, "Arroz con pollo", 3000, 4000));
        listplatillos.insertaPlatillo(new Platillos(1, "La carnita roja", 4000, 6000));
        
        System.out.println(listplatillos.toString());
        

        PilaEmpleados pilaEmpleado = new PilaEmpleados();
        pilaEmpleado.aplilarEmpleado(new Empleados(0, "Pablo Ortiz", "Cocinero"));
        pilaEmpleado.aplilarEmpleado(new Empleados(1, "Luis Calderon", "Cajero"));
        
        System.out.println(pilaEmpleado.mostrarEmpleados());
        
        ColaOrdenes colaordenes = new ColaOrdenes();
        
        //Se agregan personas a la cola
        colaordenes.encola(new NodoOrdenes("Alex Cesar"));
        colaordenes.encola(new NodoOrdenes("Juan Carlos"));
        colaordenes.encola(new NodoOrdenes("Andres Jose"));
        
        // se muestra a los clientes en la cola 
        System.out.println("\nClientes en cola:\n" + colaordenes.toString());
        
        //se atiende a la siguiente persona en la cola
        System.out.println("\nSe antiende al siguiente cliente: " + colaordenes.atiende());
        
        // se muestra a las personas que quedan en la cola
        System.out.println("\nClientes en cola:\n" + colaordenes.toString());
        
        
    }
    
}
