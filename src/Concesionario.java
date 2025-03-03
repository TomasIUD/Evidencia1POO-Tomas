import java.util.List;
import java.util.ArrayList;

public class Concesionario { // se crea la clase Concesionario
    private List<Vehiculo> vehiculo = new ArrayList<>(); // Lista de vehículos disponibles // se crea una lista de vehículos
    private List<Venta> ventas = new ArrayList<>(); // Lista de ventas realizadas // se crea una lista de ventas

    // Método para agregar un vehículo al inventario
    public void agregarVehiculo(Vehiculo vehiculo) { // se crea el metodo agregarVehiculo
        this.vehiculo.add(vehiculo); //this.vehiculo se encarga de añadir el vehículo a la lista
    }

    // Método para realizar una venta de un vehículo
    public void realizarVenta(String codigoVehiculo, double monto, String apellido, String nombre, String documento) { //uso del metodo realizarVenta
        Vehiculo vehiculoVendido = null; //Declara la variable vehiculoVendido como nula ya que despues se le asignara un valor si se encuentra el vehículo
        for (Vehiculo v : vehiculo) { //Ciclo for que recorre la lista de vehículos
            if (v.getCodigo().equals(codigoVehiculo)) { // busca el vehículo con el código especificado
                vehiculoVendido = v; // Asigna el vehículo a la variable vehiculoVendido
                break; // Si se encuentra el vehículo, se sale del ciclo
            }
        }
        // Si se encuentra el vehículo, se registra la venta
        if (vehiculoVendido != null) { //Si el vehículo es encontrado en la lista procede a realizar la venta
            ventas.add(new Venta(monto, vehiculoVendido, apellido, nombre, documento));
            vehiculo.remove(vehiculoVendido);
            System.out.println("Venta realizada: " + nombre + " " + apellido + " ha comprado " + vehiculoVendido.getMarca());
        } else { //si no se encuentra el vehículo en la lista, se muestra un mensaje de error
            System.out.println("Error: Vehículo con código " + codigoVehiculo + " no encontrado.");
        }
    }

    // Método para mostrar el inventario actual
    public void mostrarInventario() {
        System.out.println("Inventario actual:");
        for (Vehiculo v : vehiculo) { //Ciclo for que recorre la lista de vehículos
            System.out.println(v); //Imprime la información de cada vehículo
        }
    }

    // Método para mostrar el historial de ventas
    public void mostrarVentas() {
        System.out.println("Ventas realizadas:");
        for (Venta v : ventas) {
            System.out.println(v);
        }
    }
}
