package principal;

import modelo.Estudiante;
import servicio.GestorEstudiantes;

/**
 * Clase principal que ejecuta el programa.
 * Aquí se instancian los objetos y se prueban los métodos.
 */
public class Main {
    public static void main(String[] args) {

        // Crear instancia del gestor
        GestorEstudiantes gestor = new GestorEstudiantes();

        // Crear estudiantes (usando el constructor)
        Estudiante e1 = new Estudiante("Adrián", 21, 9.2);
        Estudiante e2 = new Estudiante("María", 20, 8.5);
        Estudiante e3 = new Estudiante("Luis", 22, 9.8);

        // Agregar estudiantes al gestor
        gestor.agregarEstudiante(e1);
        gestor.agregarEstudiante(e2);
        gestor.agregarEstudiante(e3);

        // Mostrar lista completa
        gestor.mostrarEstudiantes();

        // Buscar estudiante
        Estudiante buscado = gestor.buscarPorNombre("María");
        if (buscado != null) {
            System.out.println("✅ Estudiante encontrado: " + buscado.getNombre());
        } else {
            System.out.println("❌ Estudiante no encontrado");
        }
    }
}

