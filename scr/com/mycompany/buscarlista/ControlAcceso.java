package com.mycompany.buscarlista;

import java.util.List;
import java.util.ArrayList;

public class ControlAcceso {
    private List<Integer> codigos = new ArrayList<>();

    public List<Integer> getListaCodigos() {
        return codigos;
    }

    public void vaciarCodigos() {
        codigos.clear();
        System.out.println("Todos los códigos han sido eliminados.");
    }

    public void codigosIniciales() {
        codigos.add(1234);
        codigos.add(5678);
        codigos.add(9999);
    }

    public void mostrarCodigos() {
        if (codigos.isEmpty()) {
            System.out.println("No hay códigos registrados.");
        } else {
            System.out.println("Códigos actuales registrados:");
            for (int codigo : codigos) {
                System.out.println(codigo);
            }
        }
    }

    public void agregarCodigo(int codigo) {
        if (codigos.contains(codigo)) {
            System.out.println("El código " + codigo + " ya existe.");
        } else {
            codigos.add(codigo);
            System.out.println("Código " + codigo + " agregado con éxito.");
        }
    }

    public void buscarCodigo(int codigo) {
        if (codigos.contains(codigo)) {
            System.out.println("Acceso permitido. El código " + codigo + " está registrado.");
        } else {
            System.out.println("Acceso denegado. El código " + codigo + " no está registrado.");
        }
    }

    public void eliminarCodigo(int codigo) {
        if (codigos.contains(codigo)) {
            codigos.remove(Integer.valueOf(codigo));
            System.out.println("Código " + codigo + " eliminado.");
        } else {
            System.out.println("El código " + codigo + " no fue encontrado.");
        }
    }
}