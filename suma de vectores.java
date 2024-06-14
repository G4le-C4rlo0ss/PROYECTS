import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] vector1 = generarVector(10);
        int[] vector2 = generarVector(10);
        System.out.println("--------------------------------------------------------");
        System.out.print("Vector 1: ");
        mostrarVector(vector1);
        System.out.print("Vector 2: ");
        mostrarVector(vector2);

        int[] vectorSuma = sumarVectores(vector1, vector2);
        int sumaTotal = sumarElementos(vectorSuma);

        System.out.print("Suma del vector: ");
        mostrarVector(vectorSuma);
        System.out.println("--------------------------------------------------------");
    }

    public static int[] generarVector(int longitud) {
        int[] vector = new int[longitud];
        Random random = new Random();

        for (int i = 0; i < longitud; i++) {
            vector[i] = random.nextInt(21);
        }

        return vector;
    }

    public static void mostrarVector(int[] vector) {
        System.out.print("[");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i]);
            if (i < vector.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static int[] sumarVectores(int[] vector1, int[] vector2) {
        int[] vectorSuma = new int[vector1.length];

        for (int i = 0; i < vector1.length; i++) {
            vectorSuma[i] = vector1[i] + vector2[i];
        }

        return vectorSuma;
    }

    public static int sumarElementos(int[] vector) {
        int suma = 0;

        for (int num : vector) {
            suma += num;
        }

        return suma;
    }
}
