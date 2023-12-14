package Balances;

import Platillos.*;

public class NodoGrafos {

    //atributos
    private int valor;
    private Platillos platillo;

    //constructores
    public NodoGrafos(int valor) {
        this.valor = valor;
    }

    //getters y setters 
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Platillos getPlatillo() {
        return platillo;
    }

    public void setPlatillo(Platillos platillo) {
        this.platillo = platillo;
    }  
}
