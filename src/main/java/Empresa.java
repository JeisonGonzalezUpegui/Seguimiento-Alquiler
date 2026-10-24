import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nombre;
    private String ciudad;
    private List<Cliente> clientes = new ArrayList<>();
    private List<Vehiculo> vehiculos = new ArrayList<>();
    private List<Alquiler> alquileres = new ArrayList<>();

    public Empresa(String nombre, String ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void agregarCliente(Cliente c) {
        clientes.add(c);
    }

    public void agregarVehiculo(Vehiculo v) {
        vehiculos.add(v);
    }

    public void agregarAlquiler(Alquiler a) {
        alquileres.add(a);
    }

    public Vehiculo imprimirVehiculo(String placaBuscar) {
        for (Vehiculo v : vehiculos) {
            if (v.getPlaca().equals(placaBuscar)) {
                v.mostrarDatos();
                return v;
            }
        }
        System.out.println("No se encontró un vehículo con la placa " + placaBuscar);
        return null;
    }

    public void mostrarAlquileres() {
        for (Alquiler a : alquileres) {
            a.mostrarDatos();
            System.out.println();
        }
    }

    public void mostrarDatos() {
        System.out.println("----Datos de la empresa----");
        System.out.println("Nombre: " + nombre);
        System.out.println("Ciudad: " + ciudad);
    }
}