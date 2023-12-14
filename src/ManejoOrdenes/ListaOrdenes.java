package ManejoOrdenes;

public class ListaOrdenes {

    private int idOrdenes;
    private String nombreCliente;
    private String platillo;
    private double monto;

    public ListaOrdenes(int idOrdenes, String nombreCliente, String platillo, double monto) {
        this.idOrdenes = idOrdenes;
        this.nombreCliente = nombreCliente;
        this.platillo = platillo;
        this.monto = monto;
    }
    
     public ListaOrdenes() {
        
    }

    public int getIdOrdenes() {
        return idOrdenes;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public String getPlatillo() {
        return platillo;
    }

    public double getMonto() {
        return monto;
    }

    public void setIdOrdenes(int idOrdenes) {
        this.idOrdenes = idOrdenes;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public void setPlatillo(String platillo) {
        this.platillo = platillo;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    @Override
    public String toString() {
        return "ListaOrdenes { " + "idOrdenes = " + idOrdenes + ", nombreCliente = " + nombreCliente + ", platillo = " + platillo + ", monto = " + monto + '}';
    }

} // fin de la clase lista ordenes
