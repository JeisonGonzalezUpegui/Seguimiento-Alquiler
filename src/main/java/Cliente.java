public class Cliente {
    private String nombre;
    private String correoElectronico;
    private String documentoIdentidad;

    public Cliente(String nombre, String correoElectronico, String documentoIdentidad) {
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
        this.documentoIdentidad = documentoIdentidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    public void setDocumentoIdentidad(String documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
    }

    public void mostrarDatos() {
        System.out.println("----Datos del cliente----");
        System.out.println("Nombre: " + nombre);
        System.out.println("Correo: " + correoElectronico);
        System.out.println("Documento: " + documentoIdentidad);
    }
}