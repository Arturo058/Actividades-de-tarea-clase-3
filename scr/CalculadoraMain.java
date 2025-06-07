package scr;

import java.util.Scanner;

public class CalculadoraMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OperacionesMatematicas op = new OperacionesMatematicas();
        int opcion;

        do {
            mostrarMenu();
            opcion = scanner.nextInt();

            if (opcion >= 1 && opcion <= 4) {
                System.out.print("Ingresa el primer número: ");
                double num1 = scanner.nextDouble();

                System.out.print("Ingresa el segundo número: ");
                double num2 = scanner.nextDouble();

                double resultado = 0;

                switch (opcion) {
                    case 1:
                        resultado = op.sumar(num1, num2);
                        break;
                    case 2:
                        resultado = op.restar(num1, num2);
                        break;
                    case 3:
                        resultado = op.multiplicar(num1, num2);
                        break;
                    case 4:
                        resultado = op.dividir(num1, num2);
                        break;
                }

                System.out.println("Resultado: " + resultado + "\n");

            } else if (opcion == 5) {
                System.out.println("Saliendo del programa...");
            } else {
                System.out.println("Opción inválida. Intenta nuevamente.\n");
            }

        } while (opcion != 5);

        scanner.close();
    }

    public static void mostrarMenu() {
        System.out.println("=== MENÚ DE OPERACIONES MATEMÁTICAS ===");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        System.out.print("Selecciona una opción: ");
    }
}
