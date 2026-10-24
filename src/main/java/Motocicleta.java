public class Motocicleta extends Vehiculo {
    private double cilindraje;

    public Motocicleta(String placa, String marca, String modelo, int anioFabricacion, double tarifaBase, Estado4 estado, double cilindraje) {
        super(placa, marca, modelo, anioFabricacion, tarifaBase, estado);
        this.cilindraje = cilindraje;
    }

    public double getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(double cilindraje) {
        this.cilindraje = cilindraje;
    }

    @Override
    public double calcularAlquiler(int dias) {
        return (getTarifaBase() * dias) * 0.90;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("----Datos de la motocicleta----");
        super.mostrarDatos();
        System.out.println("Cilindraje: " + cilindraje);
    }
}