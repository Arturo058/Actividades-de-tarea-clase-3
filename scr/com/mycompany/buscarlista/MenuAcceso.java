package com.mycompany.buscarlista;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuAcceso {
    public void ejecutar() {
        System.out.println("Bienvenido al sistema de control de acceso por códigos.");

        Scanner entrada = new Scanner(System.in);
        int opcion;
        ControlAcceso acceso = new ControlAcceso();
        acceso.codigosIniciales();

        do {
            System.out.println("\nMENÚ DE OPCIONES");
            System.out.println("1. Ver códigos registrados");
            System.out.println("2. Agregar nuevo código");
            System.out.println("3. Buscar código");
            System.out.println("4. Eliminar código");
            System.out.println("5. Vaciar todos los códigos");
            System.out.println("6. Salir del sistema");
            System.out.print("Seleccione una opción: ");

            try {
                opcion = entrada.nextInt();
                switch (opcion) {
                    case 1:
                        acceso.mostrarCodigos();
                        break;
                    case 2:
                        System.out.print("Ingrese el nuevo código: ");
                        int nuevo = entrada.nextInt();
                        acceso.agregarCodigo(nuevo);
                        break;
                    case 3:
                        System.out.print("Ingrese el código a buscar: ");
                        int buscar = entrada.nextInt();
                        acceso.buscarCodigo(buscar);
                        break;
                    case 4:
                        System.out.print("Ingrese el código a eliminar: ");
                        int eliminar = entrada.nextInt();
                        acceso.eliminarCodigo(eliminar);
                        break;
                    case 5:
                        acceso.vaciarCodigos();
                        break;
                    case 6:
                        System.out.println("Cerrando el sistema...");
                        break;
                    default:
                        System.out.println("Opción no válida.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes ingresar un número válido.");
                entrada.next();
                opcion = 0;
            }
        } while (opcion != 6);
    }
}