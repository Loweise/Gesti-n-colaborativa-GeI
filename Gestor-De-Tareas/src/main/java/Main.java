import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestorTareas gestor = new GestorTareas();
        boolean salir = false;

        System.out.println("=== GESTOR DE TAREAS ===");

        while (!salir) {
            System.out.println("\n1. Registrar nueva tarea");
            System.out.println("2. Listar tareas");
            System.out.println("3. Marcar tarea como completada");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");

            try {
                int opcion = scanner.nextInt();
                scanner.nextLine();

                switch (opcion) {
                    case 1:
                        System.out.print("Descripción de la tarea: ");
                        String desc = scanner.nextLine();
                        gestor.registrarTarea(desc);
                        System.out.println("¡Tarea registrada con éxito!");
                        break;
                    case 2:
                        List<Tarea> tareas = gestor.obtenerTareas();
                        if (tareas.isEmpty()) {
                            System.out.println("La lista de tareas está vacía.");
                        } else {
                            System.out.println("\n--- TAREAS ---");
                            for (Tarea t : tareas) {
                                System.out.println(t.toString());
                            }
                        }
                        break;
                    case 3:
                        System.out.print("Ingresa el ID de la tarea a completar: ");
                        int id = scanner.nextInt();
                        gestor.completarTarea(id);
                        System.out.println("¡Tarea " + id + " marcada como completada!");
                        break;
                    case 4:
                        salir = true;
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción no válida. Intenta de nuevo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Debes ingresar un número válido.");
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        scanner.close();
    }
}