public class Automovil {
    private int numeroPuertas;

    public Automovil(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "numeroPuertas=" + numeroPuertas +
                '}';
    }
}
