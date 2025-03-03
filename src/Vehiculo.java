public class Vehiculo {
    private String codigo; // Código único del vehículo
    private String marca; // Marca del vehículo
    private String tipo; // Tipo de vehículo (Auto, Camioneta, Motocicleta)
    private int modelo; // Año del modelo
    private double kilometraje; // Kilometraje del vehículo

    // Constructor de la clase Vehiculo
    public Vehiculo(String codigo, String marca, String tipo, int modelo, double kilometraje) { //parametros del constructor para cuando se crea un vehículo tenga los atributos necesarios
        this.codigo = codigo; // se asigna el valor del parametro codigo al atributo codigo
        this.marca = marca;
        this.tipo = tipo;
        this.modelo = modelo;
        this.kilometraje = kilometraje;
    }

    // Métodos getter para obtener los valores de los atributos
    public String getCodigo() { //metodo para obtener el código del vehículo
        return codigo; //devuelve el atributo código del vehículo
    }

    public String getMarca() {
        return marca;
    }

    public String getTipo() {
        return tipo;
    }

    public int getModelo() {
        return modelo; //devuelve el atributo modelo del vehículo
    }

    public double getKilometraje() {
        return kilometraje;
    }

    // Método toString para representar la información del vehículo en texto
    @Override
    public String toString() {
        return "[Codigo: " + codigo + ", Marca: " + marca + ", Tipo: " + tipo + ", Modelo: " + modelo + ", Kilometraje: " + kilometraje + "]"; //devuelve la información del vehículo
    }
}
// Clases derivadas de Vehiculo o herencias de la clase vehiculo que son Auto, Camioneta y Motocicleta
class Auto extends Vehiculo {
    // Constructor de la clase Auto
    public Auto(String codigo, String marca, int modelo, double kilometraje) {
        super(codigo, marca, "auto", modelo, kilometraje); // Llama al constructor de Vehiculo
    }
}

class Camioneta extends Vehiculo {
    // Constructor de la clase Camioneta
    public Camioneta(String codigo, String marca, int modelo, double kilometraje) {
        super(codigo, marca, "Camioneta", modelo, kilometraje);
    }
}

class Motocicleta extends Vehiculo {
    // Constructor de la clase Motocicleta
    public Motocicleta(String codigo, String marca, int modelo, double kilometraje) {
        super(codigo, marca, "Motocicleta", modelo, kilometraje);
    }
}
