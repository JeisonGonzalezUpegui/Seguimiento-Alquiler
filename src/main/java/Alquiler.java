import java.time.LocalDate;
public class Alquiler {
    //-codigo:String
    //-fecha:LocalDate
    //-cliente: Cliente
    //-vehiculo: Vehiculo
    //-cantidadDias: Int
    private String codigo;
    private LocalDate fecha;
    private Cliente cliente;
    private Vehiculo vehiculo;
    private int cantidadDias;

    public Alquiler(String codigo, LocalDate fecha, Cliente cliente, Vehiculo vehiculo, int cantidadDias) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.cantidadDias = cantidadDias;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public int getCantidadDias() {
        return cantidadDias;
    }

    public void setCantidadDias(int cantidadDias) {
        this.cantidadDias = cantidadDias;
    }

    @Override
    public String toString() {
        return "Alquiler{" +
                "codigo='" + codigo + '\'' +
                ", fecha=" + fecha +
                ", cliente=" + cliente +
                ", vehiculo=" + vehiculo +
                ", cantidadDias=" + cantidadDias +
                '}';
    }
}
