package com.mycompany.primeraactividadpsp;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author manuelmsni
 */
public class Ej2 {
    
    public static void copia(String pathEntrada, String pathSalida) {
        
        try {
            FileInputStream entrada = new FileInputStream(pathEntrada);
            FileOutputStream salida = new FileOutputStream(pathSalida);

            byte[] buffer = new byte[1024]; // Tamaño del búfer (puedes ajustarlo)

            int bytesLeidos;
            while ((bytesLeidos = entrada.read(buffer)) != -1) {
                salida.write(buffer, 0, bytesLeidos);
            }

            entrada.close();
            salida.close();

            System.out.println("Copiado el archivo " + pathEntrada + " en el archivo " + pathSalida + ".");
        } catch (IOException e) {
            System.err.println("Error al copiar el archivo: " + e.getMessage());
        }
    }
    
}
