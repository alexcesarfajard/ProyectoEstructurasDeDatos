package Principal;

import OrganizacionPlatillosEmpleados.*;
import OrganizacionPlatillosEmpleados.*;
import Empleados.*;
import Platillos.*;
import Ordenes.*;
import ManejoOrdenes.*;

public class ProyectoEstructurasDeDatos {

    public static void main(String[] args) {

        ListaPlatillos listplatillos = new ListaPlatillos();
        PilaEmpleados pilaEmpleado = new PilaEmpleados();
        ColaOrdenes colaordenes = new ColaOrdenes();
        Ordenes listaDoble = new Ordenes();
        ArbolOrgPlatillos orgplatillos = new ArbolOrgPlatillos();
        ArbolOrgEmpleados orgempleados = new ArbolOrgEmpleados();

        
        listplatillos.insertaPlatillo(new Platillos(0, "Arroz con pollo", 3000, 4000));
        listplatillos.insertaPlatillo(new Platillos(1, "La carnita roja", 4000, 6000));

        System.out.println(listplatillos.mostrarPlatillos());

        pilaEmpleado.aplilarEmpleado(new Empleados(0, "Pablo Ortiz", "Cocinero"));
        pilaEmpleado.aplilarEmpleado(new Empleados(1, "Luis Calderon", "Cajero"));

        System.out.println(pilaEmpleado.mostrarEmpleados());

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

        //Se agraega la lista circular
        listaDoble.inserta(new ListaOrdenes(0, "Pablo Ortiz", "Arroz con Pollo", (4000 * 0.1) + 4000));
        listaDoble.inserta(new ListaOrdenes(1, "Luis Calderon", "Carne Roja", (6000 * 0.1) + 6000));
        //Se muestra lista Circular
        System.out.println(listaDoble.toString());
        
         
        //Organizacion de platillos 
        orgplatillos.insertar(10, "Hamburguesa", 2);
        orgplatillos.insertar(9, "Pinto", 1);
        orgplatillos.insertar(11, "Fideos", 3);
        orgplatillos.insertar(8, "Perro Caliente", 2);
        orgplatillos.insertar(12, "Huevos rancheros", 1);
        orgplatillos.insertar(13, "Pollo asado", 3);
        orgplatillos.insertar(7, "Casado pollo", 2);
        orgplatillos.insertar(15, "Pinto", 1);
        orgplatillos.insertar(16, "Fideos", 3);
        orgplatillos.insertar(6, "Casado pescado", 2);
        orgplatillos.insertar(5, "Huevos enteros", 1);
        orgplatillos.insertar(14, "Carne asado", 3);

        orgplatillos.inorden();
        orgplatillos.buscarportipoplatillo(2);
       
       
        //Organizacion de empleados 
        orgempleados.insertar(10, "Javier", 2);
        orgempleados.insertar(9, "Jose", 1);
        orgempleados.insertar(11, "Raquel", 3);
        orgempleados.insertar(8, "Maria", 2);
        orgempleados.insertar(12, "Ernesto", 1);
        orgempleados.insertar(13, "Cesar", 3);
        orgempleados.insertar(7, "Josiel", 2);
        orgempleados.insertar(15, "Fabian", 1);
        orgempleados.insertar(16, "Joselyn", 3);
        orgempleados.insertar(6, "Johana", 2);
        orgempleados.insertar(5, "Daniel", 3);
        
        orgempleados.inorden();
        
        orgempleados.buscarporpuesto(3);

    }

}
