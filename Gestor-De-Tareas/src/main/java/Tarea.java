public class Tarea {

    private final int id;
    private String descripcion;
    private boolean completada;

    public Tarea(int id, String descripcion, boolean completada) {
        this.id = id;
        this.descripcion = descripcion;
        this.completada = completada;
    }

    // Getters / Setters
    public boolean isCompletada() { return completada; }
    public int getId() { return id; }
    public String getDescripcion() { return descripcion; }
    public void setCompletada(boolean completada) { this.completada = completada; }

    @Override
    public String toString() {
        String estado = completada ? "[X]" : "[ ]";
        return String.format("%d - %s | %s",id, estado, descripcion);
    }
}
