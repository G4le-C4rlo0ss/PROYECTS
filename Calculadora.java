import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("---------------------------");
            System.out.println("Elija la opción que desee:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Calcular Factorial");
            System.out.println("6. Calcular Promedio");
            System.out.println("7. Salir");
            System.out.println("---------------------------");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    realizarSuma();
                    break;
                case 2:
                    realizarResta();
                    break;
                case 3:
                    realizarMultiplicacion();
                    break;
                case 4:
                    realizarDivision();
                    break;
                case 5:
                    calcularFactorial();
                    break;
                case 6:
                    calcularPromedio();
                    break;
                case 7:
                    System.out.println("Gracias por utilizar la calculadora. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
                    break;
            }
        } while (opcion != 7);
    }

    public static void realizarSuma() {
        Scanner scanner = new Scanner(System.in);
        double resultado = 0;

        System.out.println("Suma de números");
        System.out.println("Ingrese los números que desea sumar (Presione 'q' para terminar):");

        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("q")) {
                break;
            }
            try {
                double num = Double.parseDouble(input);
                resultado += num;
            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida. Intente nuevamente.");
            }
        }

        System.out.println("El resultado de la suma es: " + resultado);
    }

    public static void realizarResta() {
        Scanner scanner = new Scanner(System.in);
        double resultado = 0;

        System.out.println("Resta de números");
        System.out.println("Ingrese el primer número:");
        try {
            resultado = scanner.nextDouble();
            scanner.nextLine(); 
        } catch (NumberFormatException e) {
            System.out.println("Entrada no válida. Intente nuevamente.");
            return;
        }

        System.out.println("Ingrese los números que desea restar (Presione 'q' para terminar):");

        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("q")) {
                break;
            }
            try {
                double num = Double.parseDouble(input);
                resultado -= num;
            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida. Intente nuevamente.");
            }
        }

        System.out.println("El resultado de la resta es: " + resultado);
    }

    public static void realizarMultiplicacion() {
        Scanner scanner = new Scanner(System.in);
        double resultado = 1;

        System.out.println("Multiplicación de números");
        System.out.println("Ingrese los números que desea multiplicar (Presione 'q' para terminar):");

        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("q")) {
                break;
            }
            try {
                double num = Double.parseDouble(input);
                resultado *= num;
            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida. Intente nuevamente.");
            }
        }

        System.out.println("El resultado de la multiplicación es: " + resultado);
    }

    public static void realizarDivision() {
        Scanner scanner = new Scanner(System.in);
        double resultado = 0;

        System.out.println("División de números");
        System.out.println("Ingrese el primer número:");
        try {
            resultado = scanner.nextDouble();
            scanner.nextLine();
        } catch (NumberFormatException e) {
            System.out.println("Entrada no válida. Intente nuevamente.");
            return;
        }

        System.out.println("Ingrese los números por los cuales desea dividir (Presione 'q' para terminar):");

        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("q")) {
                break;
            }
            try {
                double num = Double.parseDouble(input);
                if (num == 0) {
                    System.out.println("No se puede dividir entre cero. Intente nuevamente.");
                    continue;
                }
                resultado /= num;
            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida. Intente nuevamente.");
            }
        }

        System.out.println("El resultado de la división es: " + resultado);
    }

    public static void calcularFactorial() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Calcular Factorial\nIngrese un número entero no negativo: ");
        int num = scanner.nextInt();

        if (num >= 0) {
            double factorial = 1;
            for (int i = 2; i <= num; i++) {
                factorial *= i;
            }
            System.out.println("El factorial de " + num + " es: " + factorial);
        } else {
            System.out.println("El número ingresado no es válido para calcular su factorial.");
        }
    }

    public static void calcularPromedio() {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        double suma = 0;

        System.out.println("Cálculo de Promedio");
        System.out.println("Ingrese los números para obtener el promedio (Presione 'q' para terminar):");

        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("q")) {
                break;
            }
            try {
                double num = Double.parseDouble(input);
                contador++;
                suma += num;
            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida. Intente nuevamente.");
            }
        }

        if (contador > 0) {
            double promedio = suma / contador;
            System.out.println("El promedio es: " + promedio);
        } else {
            System.out.println("No se han ingresado números para calcular el promedio.");
        }
    }
}
