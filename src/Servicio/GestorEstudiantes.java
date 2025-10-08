package servicio;

import java.util.ArrayList;
import modelo.Estudiante;

/**
 * Clase que gestiona una lista de estudiantes.
 * Permite agregar, listar y buscar estudiantes.
 */
public class GestorEstudiantes {

    // Lista para almacenar los objetos Estudiante
    private ArrayList<Estudiante> listaEstudiantes;

    /**
     * Constructor: inicializa la lista de estudiantes vacía.
     */
    public GestorEstudiantes() {
        listaEstudiantes = new ArrayList<>();
    }

    /**
     * Agrega un nuevo estudiante a la lista.
     */
    public void agregarEstudiante(Estudiante e) {
        listaEstudiantes.add(e);
        System.out.println("Estudiante agregado exitosamente: " + e.getNombre());
    }

    /**
     * Muestra todos los estudiantes registrados.
     */
    public void mostrarEstudiantes() {
        System.out.println("\n📋 Lista de Estudiantes:");
        for (Estudiante e : listaEstudiantes) {
            e.mostrarInfo();
        }
    }

    /**
     * Busca un estudiante por nombre.
     */
    public Estudiante buscarPorNombre(String nombre) {
        for (Estudiante e : listaEstudiantes) {
            if (e.getNombre().equalsIgnoreCase(nombre)) {
                return e;
            }
        }
        return null;
    }
}

