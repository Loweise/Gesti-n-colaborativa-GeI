import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class GestorTareas {

    private List<Tarea> listaTareas;
    private int id;

    public GestorTareas() {
        this.listaTareas = new ArrayList<>();
        this.id = 1;
    }

    public void registrarTarea(String descripcion) throws IllegalArgumentException {
        if (descripcion == null || descripcion.trim().isEmpty()) {
            throw new IllegalArgumentException("La descripción no puede estar vacía.");
        }
        Tarea nuevaTarea = new Tarea(id++, descripcion);
        listaTareas.add(nuevaTarea);
    }

    public List<Tarea> obtenerTareas() {
        return listaTareas;
    }

    public void completarTarea(int id) throws NoSuchElementException {
        listaTareas.stream()
                .filter(Tarea -> Tarea.getId() == id)
                .findFirst()
                .orElseThrow(() -> new NoSuchElementException("No se encontro la tarea en el id " + id))
                .setCompletada(true);
    }
}