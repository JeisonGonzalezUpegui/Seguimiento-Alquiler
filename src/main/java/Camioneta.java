public class Camioneta extends Vehiculo {
    private double capacidad;

    public Camioneta(String placa, String marca, String modelo, int anioFabricacion, double tarifaBase, Estado4 estado, double capacidad) {
        super(placa, marca, modelo, anioFabricacion, tarifaBase, estado);
        this.capacidad = capacidad;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public double calcularAlquiler(int dias) {
        return (getTarifaBase() + 50000) * dias;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("----Datos de la camioneta----");
        super.mostrarDatos();
        System.out.println("Capacidad: " + capacidad);
    }
}