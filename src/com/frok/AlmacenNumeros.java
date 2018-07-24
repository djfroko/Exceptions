package com.frok;

import java.util.ArrayList;
import java.util.Scanner;

public class AlmacenNumeros {

    ArrayList<Integer> almacen = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);
    private int selector = 0;
    private int numero = 0;
    private int recuperado = 0;

    public void iniciarApp() {

        do {
            menu();
            selector = sc.nextInt();
            comprobarOpcion(selector);
        } while (selector != 3);

    }

    private void menu() {

        System.out.println("Selecciona opcion");
        System.out.println("=================");
        System.out.println("1: Guardar numero");
        System.out.println("2: Recuperar numero");
        System.out.println("3: SALIR");
        System.out.println("=================");
        System.out.println();
    }

    private void comprobarOpcion(int opcion) {

        switch (opcion) {
            case 1:
                guardarNumeros();
                break;
            case 2:
                recuperarNumeros();
                break;
            case 3:
                salir();
                break;
            default:
                System.out.println("La opcion elegida no es valida");
        }
    }

        private void guardarNumeros () {

            System.out.println("Introduce el numero que quieras guardar ");
            numero = sc.nextInt();
            almacen.add(numero);
        }

        private void recuperarNumeros () {

            System.out.println("Introduce la posicion que quieras recuperar ");
            numero = sc.nextInt();
            recuperado = almacen.get(numero);
            System.out.println(recuperado);
        }

        private void salir () {
            System.out.println("hasta luego Lucas");
        }
    }
