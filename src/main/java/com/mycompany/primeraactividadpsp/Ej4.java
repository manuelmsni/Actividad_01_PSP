/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primeraactividadpsp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

/**
 *
 * @author manuelmsni
 */
public class Ej4 {
    
    public static void escribeUTF8(String path) {
        try {
            Writer w = new OutputStreamWriter(new FileOutputStream(path), "UTF-8");
            String texto = "Lápiz 1€";
            System.out.println("Escribiendo el texto: '" + texto + "'.");
            w.write(texto);
            w.close();
            File f = new File(path);
            System.out.println("El archivo ocupa " + f.length() + " Bytes a pesar de tener " + texto.length() + " carácteres, debido a que los caracteres especiales, como 'á' y '€', requieren más de un byte para ser representados en UTF-8.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void escribeWindows1252(String path) {
        try {
            Writer w = new OutputStreamWriter(new FileOutputStream(path), "windows-1252");
            String texto = "Lápiz 1€";
            w.write(texto);
            w.close();
            File f = new File(path);
            System.out.println("El archivo ocupa " + f.length() + " Bytes y tiene " + texto.length() + " carácteres.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    
    public static void leeElFicheroX3(String path) {
        try {
            // Usando InputStream para leer el archivo
            InputStream is = new FileInputStream(path);
            int c;
            while ((c = is.read()) != -1) {
                System.out.print((char) c);
            }
            is.close();
            System.out.println();

            // Usando Reader con codificación UTF-8 para leer el archivo
            Reader r = new InputStreamReader(new FileInputStream(path), "UTF-8");
            int charRead;
            while ((charRead = r.read()) != -1) {
                System.out.print((char) charRead);
            }
            r.close();
            System.out.println();

            // Usando Reader con codificación windows-1252 para leer el archivo
            Reader r2 = new InputStreamReader(new FileInputStream(path), "windows-1252");
            int charRead2;
            while ((charRead2 = r2.read()) != -1) {
                System.out.print((char) charRead2);
            }
            r2.close();
            System.out.println("");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
