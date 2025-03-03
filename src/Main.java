public class Main {
    public static void main(String[] args) {
        // Crear un concesionario
        Concesionario concesionario = new Concesionario(); // Instancia de la clase Concesionario, concesionario es el objeto que manejara los vehículos y las ventas

        // Agregar vehículos al inventario
        concesionario.agregarVehiculo(new Vehiculo("001", "Toyota", "Auto", 2020, 0));
        concesionario.agregarVehiculo(new Vehiculo("002", "Chevrolet", "Camioneta", 2018, 50000));
        concesionario.agregarVehiculo(new Vehiculo("003", "Suzuki", "Motocicleta", 2019, 10000));
        concesionario.agregarVehiculo(new Vehiculo("004", "BMW", "Motocicleta", 2024, 0));
        // Mostrar el inventario
        concesionario.mostrarInventario(); // metodo que muestra los vehículos disponibles en el inventario

        // Realizar una venta
        concesionario.realizarVenta("002", 25000, "Pérez", "Juan", "12345678"); // Realiza la venta de un vehiculo

        // Mostrar el inventario y las ventas
        concesionario.mostrarInventario(); // Nuevamente el metodo de mostrar el inventario
        concesionario.mostrarVentas(); // Muestra las ventas realizadas
    }
}
