/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tpselvag7;

/**
 *
 * @author Admin
 */

import java.util.Scanner;

public class TpSelvaG7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArbolSelva juego = new ArbolSelva();
        int opcion = -1;

        while (opcion != 0) {
            System.out.println("\n----- MENU PRINCIPAL -----");
            System.out.println("1. Jugar");
            System.out.println("2. Insertar o eliminar nodo");
            System.out.println("3. Mostrar arbol (inOrden)");
            System.out.println("0. Salir");
            System.out.print("Elegir una opcion: ");

            opcion = Integer.parseInt(entrada.nextLine().trim());

            switch (opcion) {
                case 1:
                    int i = 0;
                    while (i < juego.arbol.length && juego.arbol[i] != null) {
                        System.out.println("\n" + juego.arbol[i]);
                        if (juego.arbol[i].toUpperCase().startsWith("FIN")) break;

                        String respuesta = "";
                        while (!respuesta.equalsIgnoreCase("A") && !respuesta.equalsIgnoreCase("B")) {
                            System.out.print("Elegir A o B: ");
                            respuesta = entrada.nextLine();
                        }

                        i = (respuesta.equalsIgnoreCase("A")) ? 2 * i + 1 : 2 * i + 2;
                    }

                    if (i >= juego.arbol.length || juego.arbol[i] == null) {
                        System.out.println("\nNo hay mas caminos. Fin del juego.");
                    }
                    break;

                case 2:
                    System.out.print("Indice a modificar (0 a 30): ");
                    int indice = Integer.parseInt(entrada.nextLine());

                    if (indice >= 0 && indice < juego.arbol.length) {
                        System.out.print("Texto a insertar (o escribir ELIMINAR): ");
                        String texto = entrada.nextLine();

                        if (texto.equalsIgnoreCase("ELIMINAR")) {
                            juego.arbol[indice] = null;
                            System.out.println("Nodo eliminado.");
                        } else {
                            juego.arbol[indice] = texto;
                            System.out.println("Nodo actualizado.");
                        }
                    } else {
                        System.out.println("Indice fuera de rango.");
                    }
                    break;

                case 3:
                    System.out.println("\n-- Estado del arbol (inOrden simulado) --");
                    juego.inOrdenSimulado(0);
                    break;

                case 0:
                    System.out.println("Gracias por jugar. Hasta la proxima!");
                    break;

                default:
                    System.out.println("Opcion invalida.");
            }
        }

        entrada.close();
    }
}
