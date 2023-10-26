package proyectoestructurasdedatos;

import proyectoestructurasdedatos.platillos.Platillos;
import proyectoestructurasdedatos.platillos.ListaPlatillos;

public class ProyectoEstructurasDeDatos {

    public static void main(String[] args) {
        
        
        ListaPlatillos listplatillos = new ListaPlatillos();
        
        listplatillos.insertaPlatillo(new Platillos(0, "Arroz con pollo", 3000, 4000));
        listplatillos.insertaPlatillo(new Platillos(1, "La carnita roja", 4000, 6000));
        
        System.out.println(listplatillos.toString());
        
        
        
        
    }
    
}
