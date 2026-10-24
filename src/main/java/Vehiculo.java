public abstract class Vehiculo {
    private String placa;
    private String marca;
    private String modelo;
    private int añoFabricacion;
    private double tarifaBase;
    private Estado4 estado;

    public Vehiculo(String placa, String marca, String modelo, int anioFabricacion, double tarifaBase, Estado4 estado) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.añoFabricacion = anioFabricacion;
        this.tarifaBase = tarifaBase;
        this.estado = estado;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnioFabricacion() {
        return añoFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.añoFabricacion = anioFabricacion;
    }

    public double getTarifaBase() {
        return tarifaBase;
    }

    public void setTarifaBase(double tarifaBase) {
        this.tarifaBase = tarifaBase;
    }

    public Estado4 getEstado() {
        return estado;
    }

    public void setEstado(Estado4 estado) {
        this.estado = estado;
    }

    public abstract double calcularAlquiler(int dias);

    public void mostrarDatos() {
        System.out.println("Placa: " + placa);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año de fabricación: " + añoFabricacion);
        System.out.println("Tarifa base: " + tarifaBase);
        System.out.println("Estado: " + estado);
    }
}