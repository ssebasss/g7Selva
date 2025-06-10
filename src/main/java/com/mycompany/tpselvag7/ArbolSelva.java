package com.mycompany.tpselvag7;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */

public class ArbolSelva {
    public String[] arbol;

    public ArbolSelva() {
       arbol = new String[31];

        arbol[0] = "Te despertas en la selva. Buscar comida (A) o explorar (B)?";
        arbol[1] = "Decidis buscar comida. Seguir un rio (A) o buscar frutos (B)?";
        arbol[2] = "Exploras la zona. Ves una cueva (A) o escuchas ruidos extranos (B)?";
        arbol[3] = "Seguis el rio. Te parece potable. Beber (A) o seguir corriente (B)?";
        arbol[4] = "Encontras frutos de colores. Comer (A) o ignorarlos (B)?";
        arbol[5] = "Te acercas a la cueva. Entrar (A) o rodearla (B)?";
        arbol[6] = "Te acercas al ruido. Es un animal. Subir a un arbol (A) o correr (B)?";
        arbol[7] = "FIN: El agua estaba contaminada. No sobreviviste.";
        arbol[8] = "FIN: Descubriste una cascada con peces. Sobreviviste.";
        arbol[9] = "FIN: Frutos venenosos. No sobreviviste.";
        arbol[10] = "FIN: Evitaste ser envenenado";
        arbol[11] = "FIN: Dentro de la cueva habia un refugio abandonado. Descansas.";
        arbol[12] = "FIN: Al rodearla caiste por una pendiente. No sobreviviste.";
        arbol[13] = "El animal te persigue. Esconderse (A) o enfrentarlo (B)?";
        arbol[14] = "Llegas a un claro. Hay senales de ayuda. Gritar (A) o hacer fuego (B)?";
        arbol[27] = "FIN: Te escondiste bien y el animal se fue. Sobreviviste.";
        arbol[28] = "FIN: Lo enfrentaste pero saliste herido. No sobreviviste.";
        arbol[29] = "FIN: Nadie oyo tus gritos. La noche fue peligrosa. No sobreviviste.";
        arbol[30] = "FIN: Un helicoptero vio tu fuego. Fuiste rescatado.";
    }

    public void inOrdenSimulado(int index) {
        if (index < arbol.length && arbol[index] != null) {
            inOrdenSimulado(2 * index + 1);
            System.out.println("arr[" + index + "]: " + arbol[index]);
            inOrdenSimulado(2 * index + 2);
        }
    }
}

