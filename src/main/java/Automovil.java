public class Automovil extends Vehiculo {
    private int numeroPuertas;

    public Automovil(String placa, String marca, String modelo, int anioFabricacion, double tarifaBase, Estado4 estado, int numeroPuertas) {
        super(placa, marca, modelo, anioFabricacion, tarifaBase, estado);
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public double calcularAlquiler(int dias) {
        return (getTarifaBase() + 20000) * dias;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("----Datos del automóvil----");
        super.mostrarDatos();
        System.out.println("Número de puertas: " + numeroPuertas);
    }
}