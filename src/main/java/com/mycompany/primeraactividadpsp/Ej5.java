/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primeraactividadpsp;

import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author manuelmsni
 */
public class Ej5 {
    public static void detectorUTF8(String path) {

        try{
            FileInputStream fis = new FileInputStream(path);
            int valorDelByte;
            boolean esUTF8 = false;
            boolean noEsUTF8 = false;

            while ((valorDelByte = fis.read()) != -1) {
                if ((valorDelByte & 0x80) == 0) {
                    // Caracter de 7 bits (0xxxxxxx)
                } else if ((valorDelByte & 0xE0) == 0xC0) {
                    // Inicio de secuencia de 2 bytes (110xxxxx)
                    int byte2 = fis.read();
                    if ((byte2 & 0xC0) == 0x80) {
                        esUTF8 = true;
                    } else {
                        noEsUTF8 = true;
                    }
                } else if ((valorDelByte & 0xF0) == 0xE0) {
                    // Inicio de secuencia de 3 bytes (1110xxxx)
                    int byte2 = fis.read();
                    int byte3 = fis.read();
                    if ((byte2 & 0xC0) == 0x80 && (byte3 & 0xC0) == 0x80) {
                        esUTF8 = true;
                    } else {
                        noEsUTF8 = true;
                    }
                } else if ((valorDelByte & 0x80) == 0x80) {
                    // Caracter de 8 bits (1xxxxxxx)
                    noEsUTF8 = true;
                }
            }

            if (noEsUTF8) {
                System.out.println("No es UTF-8");
            } else if (esUTF8) {
                System.out.println("Es UTF-8");
            } else {
                System.out.println("Es ANSI");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
