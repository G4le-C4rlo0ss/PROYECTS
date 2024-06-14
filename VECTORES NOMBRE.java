import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Persona> listaNombresDirecciones = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcion = 0;
        while (opcion != 4) {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    agregarPersona(scanner);
                    break;
                case 2:
                    buscarCalle110();
                    break;
                case 3:
                    mostrarListaPersonas();
                    break;
                case 4:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
            System.out.println();
        }
    }

    private static void mostrarMenu() {
        System.out.println("---- Menú ----");
        System.out.println("1. Agregar persona");
        System.out.println("2. Buscar calle 110");
        System.out.println("3. Mostrar lista de personas");
        System.out.println("4. Salir");
        System.out.print("Ingrese una opción: ");
    }

    private static void agregarPersona(Scanner scanner) {
        System.out.print("Ingrese el nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese la dirección: ");
        String direccion = scanner.nextLine();

        listaNombresDirecciones.add(new Persona(nombre, direccion));

        System.out.println("Persona agregada exitosamente.");
    }

    private static void buscarCalle110() {
        boolean encontrada = false;

        for (Persona persona : listaNombresDirecciones) {
            if (persona.getDireccion().contains("Calle 110")) {
                encontrada = true;
                System.out.println("Calle 110 encontrada:");
                System.out.println("Nombre: " + persona.getNombre());
                System.out.println("Dirección: " + persona.getDireccion());
                break;
            }
        }

        if (!encontrada) {
            System.out.println("Calle 110 no encontrada.");
        }
    }

    private static void mostrarListaPersonas() {
        if (listaNombresDirecciones.isEmpty()) {
            System.out.println("La lista de personas está vacía.");
        } else {
            System.out.println("Lista de personas:");
            for (Persona persona : listaNombresDirecciones) {
                System.out.println("Nombre: " + persona.getNombre());
                System.out.println("Dirección: " + persona.getDireccion());
                System.out.println();
            }
        }
    }
}

class Persona {
    private String nombre;
    private String direccion;

    public Persona(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }
}
