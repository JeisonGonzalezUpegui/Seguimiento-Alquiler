import java.util.ArrayList;
import java.util.List;
public class Vehiculo {
    private String placa;
    private String marca;
    private String modelo;
    private String añoFabricacion;
    private double tarifaBase;
    private List<Vehiculo> vehiculos = new ArrayList<>();

    public Vehiculo(String placa, String marca, String modelo, String añoFabricacion, double tarifaBase) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.añoFabricacion = añoFabricacion;
        this.tarifaBase = tarifaBase;
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

    public String getAñoFabricacion() {
        return añoFabricacion;
    }

    public void setAñoFabricacion(String añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }

    public double getTarifaBase() {
        return tarifaBase;
    }

    public void setTarifaBase(double tarifaBase) {
        this.tarifaBase = tarifaBase;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "placa='" + placa + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", añoFabricacion='" + añoFabricacion + '\'' +
                ", tarifaBase=" + tarifaBase +
                '}';
    }
    public void imprimirVehiculos() {
        for (Vehiculo v : vehiculos) {
            System.out.println(v.toString());
        }
    }
    }

