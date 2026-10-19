/**
 * Representa una tarea individual con un identificador único, una descripción
 * y un estado de finalización.
 */
public class Tarea {

    private final int id;
    private String descripcion;
    private boolean completada;

    /**
     * Crea una nueva instancia de {@code Tarea}.
     *
     * @param id identificador único de la tarea
     * @param descripcion detalles o texto explicativo de la tarea
     */
    public Tarea(int id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
        this.completada = false;
    }

    // Getters / Setters
    public int getId() { return id; }
    public String getDescripcion() { return descripcion; }
    public boolean isCompletada() { return completada; }
    public void setCompletada(boolean completada) { this.completada = completada; }

    /**
     * Devuelve una representación en formato de cadena de la tarea, incluyendo
     * su identificador, estado visual y descripción.
     *
     * @return una cadena con el formato {@code "id - [*] | descripcion"}
     *         dependiendo de su estado <code>true/false</code>
     */
    @Override
    public String toString() {
        String estado = completada ? "[X]" : "[ ]";
        return String.format("%d - %s | %s",id, estado, descripcion);
    }
}
