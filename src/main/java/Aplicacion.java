import java.time.LocalDate;

public class Aplicacion {
    static void main() {

        Empresa empresa = new Empresa("RentaYa", "Bogotá");
        System.out.println("Empresa");
        empresa.mostrarDatos();

        System.out.println();

        Cliente c1 = new Turista("Ana Gómez", "ana@correo.com", "1234567890", "VISA-001");
        Cliente c2 = new Residente("Luis Pérez", "luis@correo.com", "9876543210", "Calle 10 # 5-20");
        empresa.agregarCliente(c1);
        empresa.agregarCliente(c2);

        Vehiculo v1 = new Automovil("ABC123", "Mazda", "3", 2022, 100000, Estado4.BUENO, 4);
        Vehiculo v2 = new Motocicleta("XYZ98A", "Yamaha", "FZ", 2021, 50000, Estado4.BUENO, 150);
        Vehiculo v3 = new Camioneta("DEF456", "Toyota", "Hilux", 2020, 150000, Estado4.MALO, 1.5);
        empresa.agregarVehiculo(v1);
        empresa.agregarVehiculo(v2);
        empresa.agregarVehiculo(v3);

        empresa.agregarAlquiler(new Alquiler("A001", LocalDate.of(2026, 10, 23), c1, v1, 3));
        empresa.agregarAlquiler(new Alquiler("A002", LocalDate.of(2026, 10, 23), c2, v2, 5));
        empresa.agregarAlquiler(new Alquiler("A003", LocalDate.of(2026, 10, 23), c1, v3, 2));

        System.out.println("Alquileres");
        empresa.mostrarAlquileres();

        System.out.println("Buscar vehículo por placa");
        empresa.imprimirVehiculo("XYZ98A");

        System.out.println();

        empresa.imprimirVehiculo("ZZZ000");
    }
}