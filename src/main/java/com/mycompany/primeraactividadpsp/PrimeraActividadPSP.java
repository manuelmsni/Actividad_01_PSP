/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.primeraactividadpsp;

/**
 *
 * @author manuelmsni
 */
public class PrimeraActividadPSP {

    public static void main(String[] args) {
        System.out.println("\nEj1:");
        Ej1.cuenta("iniciales.txt", "mm");
        
        System.out.println("\nEj2:");
        Ej2.copia("ej2Entrada.txt", "ej2Salida.txt");
        
        System.out.println("\nEj3:");
        Ej3.copiaBarataDeLs("");
        
        System.out.println("\nEj4:");
        Ej4.escribeUTF8("ej4_UTF8.txt");
        Ej4.leeElFicheroX3("ej4_UTF8.txt");
        Ej4.escribeWindows1252("ej4_windows1252.txt");
        Ej4.leeElFicheroX3("ej4_windows1252.txt");
        
        System.out.println("\nEj5:");
        Ej5.detectorUTF8("ej4_UTF8.txt");
        Ej5.detectorUTF8("ej4_windows1252.txt");
        
        System.out.println("\nEj6:");
        // Ej6.serializa("contactos.bin");
        Ej6.deserializa("contactos.bin");
        
        System.out.println("\nEj7:");
        Ej7.compruebaConfiguracion("miConfiguracion.txt", "miConfiguracion_actualizado.txt");
    }
}
