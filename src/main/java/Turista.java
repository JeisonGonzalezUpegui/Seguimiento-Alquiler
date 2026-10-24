public class Turista extends Cliente {
    private String visa;

    public Turista(String nombre, String correoElectronico, String documentoIdentidad, String visa) {
        super(nombre, correoElectronico, documentoIdentidad);
        this.visa = visa;
    }

    public String getVisa() {
        return visa;
    }

    public void setVisa(String visa) {
        this.visa = visa;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("----Datos del turista----");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Correo: " + getCorreoElectronico());
        System.out.println("Documento: " + getDocumentoIdentidad());
        System.out.println("Visa: " + visa);
    }
}