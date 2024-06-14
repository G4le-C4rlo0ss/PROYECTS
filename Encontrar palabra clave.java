import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] palabrasClave = {"atentado", "bomba", "asalto"};
        String texto;

        do {
            System.out.print("Ingrese un texto: ");
            texto = scanner.nextLine();

            if (verificarPalabras(texto, palabrasClave)) {
                System.out.println("-- ¡ALERTA! --");
                break;
            } else {
                System.out.println("-- No hay de qué preocuparse --");
            }
        } while (true);
    }

    public static boolean verificarPalabras(String texto, String[] palabrasClave) {
        for (String palabra : palabrasClave) {
            if (texto.toLowerCase().contains(palabra.toLowerCase())) {
                System.out.println("Palabra encontrada: " + palabra);
                return true;
            }
        }
        return false;
    }
}
