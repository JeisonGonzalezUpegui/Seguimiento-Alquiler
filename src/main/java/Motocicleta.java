public class Motocicleta {
    private double cilindraje;

    public Motocicleta(double cilindraje) {
        this.cilindraje = cilindraje;
    }

    public double getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(double cilindraje) {
        this.cilindraje = cilindraje;
    }

    @Override
    public String toString() {
        return "Motocicleta{" +
                "cilindraje=" + cilindraje +
                '}';
    }
}
