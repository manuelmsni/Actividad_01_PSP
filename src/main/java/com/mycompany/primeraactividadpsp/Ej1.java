/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primeraactividadpsp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author manuelmsni
 */
public class Ej1 {
    
    // ruta al archivo: iniciales.txt
    // mis iniciales son mm
    
    public static void cuenta(String path, String iniciales) {

        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            String linea = br.readLine();
            int contador = 0;

            while (linea != null) {
                contador += contarIniciales(linea, iniciales);
                linea = br.readLine();
            }

            br.close();

            System.out.println("Número de veces que aparecen las iniciales '" + iniciales + "': " + contador);
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    public static int contarIniciales(String linea, String iniciales) {
        int contador = 0;
        for (int i = 0; i < linea.length() - 1; i++) {
            if (linea.substring(i, i + 2).equalsIgnoreCase(iniciales)) {
                contador++;
            }
        }
        return contador;
    }
}
