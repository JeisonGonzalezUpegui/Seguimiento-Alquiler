public class Residente {
    private String direccionResidencia;

    public Residente(String direccionResidencia) {
        this.direccionResidencia = direccionResidencia;
    }

    public String getDireccionResidencia() {
        return direccionResidencia;
    }

    public void setDireccionResidencia(String direccionResidencia) {
        this.direccionResidencia = direccionResidencia;
    }

    @Override
    public String toString() {
        return "Residente{" +
                "direccionResidencia='" + direccionResidencia + '\'' +
                '}';
    }
}
