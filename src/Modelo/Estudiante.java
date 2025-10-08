package modelo;

/**
 * Clase que representa a un Estudiante.
 * Contiene atributos básicos y métodos para mostrar su información.
 */
public class Estudiante {
    // Atributos de la clase
    private String nombre;
    private int edad;
    private double promedio;

    /**
     * Constructor para inicializar un objeto Estudiante.
     * @param nombre Nombre del estudiante
     * @param edad Edad del estudiante
     * @param promedio Promedio del estudiante
     */
    public Estudiante(String nombre, int edad, double promedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;
    }

    // Métodos getter y setter
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double nuevoPromedio) {
        this.promedio = nuevoPromedio;
    }

    /**
     * Muestra la información del estudiante en consola.
     */
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Promedio: " + promedio);
        System.out.println("---------------------------");
    }
}

