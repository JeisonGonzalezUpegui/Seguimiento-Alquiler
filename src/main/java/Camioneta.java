public class Camioneta {
    private double capacidad;

    public Camioneta(double capacidad) {
        this.capacidad = capacidad;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Camioneta{" +
                "capacidad=" + capacidad +
                '}';
    }
}
