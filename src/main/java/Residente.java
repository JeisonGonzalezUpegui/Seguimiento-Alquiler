public class Residente extends Cliente {
    private String direccionResidencia;

    public Residente(String nombre, String correoElectronico, String documentoIdentidad, String direccionResidencia) {
        super(nombre, correoElectronico, documentoIdentidad);
        this.direccionResidencia = direccionResidencia;
    }

    public String getDireccionResidencia() {
        return direccionResidencia;
    }

    public void setDireccionResidencia(String direccionResidencia) {
        this.direccionResidencia = direccionResidencia;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("----Datos del residente----");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Correo: " + getCorreoElectronico());
        System.out.println("Documento: " + getDocumentoIdentidad());
        System.out.println("Dirección de residencia: " + direccionResidencia);
    }
}