/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primeraactividadpsp;

import java.io.File;
import java.text.SimpleDateFormat;

/**
 *
 * @author manuelmsni
 */
public class Ej3 {
        public static void copiaBarataDeLs(String path) {

        if(path.isBlank()) path = ".";
        File dir = new File(path);

        if (dir.exists() && dir.isDirectory()) {
            File[] archivos = dir.listFiles();
            SimpleDateFormat dateFormat = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy");

            for (File archivo : archivos) {
                String nombre = archivo.getName();
                long tamaño = archivo.length();
                String fechaModificacion = dateFormat.format(archivo.lastModified());

                if (archivo.isDirectory()) {
                    System.out.println(nombre + " <DIR>");
                } else {
                    System.out.println(nombre + " " + tamaño + " " + fechaModificacion);
                }
            }

            // Mostrar espacio libre en disco
            long espacioLibre = dir.getFreeSpace();
            System.out.println(espacioLibre + " bytes libres");
        } else {
            System.out.println("El directorio no existe.");
        }
    }
}
