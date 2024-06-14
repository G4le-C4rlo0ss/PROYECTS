import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String nombre;
        String cedula;
        String direccion;
        String bcd;
        String[] nombres = new String[500];
        String[] cedulas = new String[500];
        String[] direcciones = new String[500];
        int i = 0;
        System.out.println("-        bienvenido      -");
        System.out.println("-----------------------------");
        System.out.println("que opcion desea elegir?");
        System.out.println("-  1. ingrese nuevos datos  -");
        System.out.println("-  2. Buscar por cedula     -");
        System.out.println("-  3. Buscar por nombre     -");
        System.out.println("-  0. salir del programa    -");
        System.out.println("-----------------------------");
        int option = input.nextInt();

        while (option != 0) {
            switch (option) {
                case 1:
                    System.out.print("Ingrese su nombre: ");
                    nombre = input.next();
                    System.out.print("Ingrese su cedula: ");
                    cedula = input.next();
                    input.nextLine(); 
                    System.out.print("Ingrese su direccion: ");
                    direccion = input.nextLine();

                    direcciones[i] = direccion;
                    cedulas[i] = cedula;
                    nombres[i] = nombre;

                    i++;
                    break;
                case 2:
                    System.out.print("¿Qué número de cedula desea buscar? ");
                    bcd = input.next();

                    boolean personaEncontradaCedula = false;

                    for (int index = 0; index < i; index++) {
                        if (cedulas[index].equals(bcd)) {
                            System.out.println("Nombre: " + nombres[index]);
                            System.out.println("Cedula: " + cedulas[index]);
                            System.out.println("Direccion: " + direcciones[index]);
                            personaEncontradaCedula = true;
                            break;
                        }
                    }

                    if (!personaEncontradaCedula) {
                        System.out.println("lo siento, la persona no ha sido registrada");
                    }
                    break;
                case 3:
                    boolean personaEncontradaNombre = false;

                    for (int index = 0; index < i; index++) {
                        if (nombres[index].contains("murder")) {
                            System.out.println("Nombre: " + nombres[index]);
                            System.out.println("Cedula: " + cedulas[index]);
                            System.out.println("Direccion: " + direcciones[index]);
                            personaEncontradaNombre = true;
                        }
                    }

                    if (!personaEncontradaNombre) {
                        System.out.println("No se encontraron personas con el nombre 'murder'.");
                    }
                    break;
                default:
                    System.out.println("-- Opcion incorrecta --");
                    break;
            }

            System.out.println("-        bienvenido      -");
            System.out.println("-----------------------------");
            System.out.println("que opcion desea elegir?");
            System.out.println("-  1. ingrese nuevos datos  -");
            System.out.println("-  2. Buscar por cedula     -");
            System.out.println("-  3. Buscar por nombre     -");
            System.out.println("-  0. salir del programa    -");
            System.out.println("-----------------------------");
            option = input.nextInt();
        }

        System.out.println("Muchas gracias por utilizar el programa");
    }
}
