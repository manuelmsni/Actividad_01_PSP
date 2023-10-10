/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primeraactividadpsp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author manuelmsni
 */
public class Ej7 {
    
    public static void compruebaConfiguracion(String pathEntrada, String pathSalida) {
        
        String parametroAModificar = "iniciales";
        String nuevoValor = "MM";

        int lineasConfiguracion = 0;
        int lineasEnBlanco = 0;
        int lineasOtros = 0;
        int lineasLeidas = 0;
        int lineasEscritas = 0;

        try{
            BufferedReader br = new BufferedReader(new FileReader(pathEntrada));
            BufferedWriter bw = new BufferedWriter(new FileWriter(pathSalida));
            String linea;
            while ((linea = br.readLine()) != null) {
                lineasLeidas++;

                if (linea.matches(".*:.*")) {
                    String[] partes = linea.split(":");
                    if (partes.length == 2) {
                        String parametro = partes[0];
                        String valor = partes[1];

                        if (parametro.equals(parametroAModificar)) {
                            valor = nuevoValor;
                            lineasEscritas++;
                        }

                        linea = parametro + ":" + valor;
                        lineasConfiguracion++;
                    }
                } else if (linea.trim().isEmpty()) {
                    lineasEnBlanco++;
                } else {
                    lineasOtros++;
                }

                bw.write(linea);
                bw.newLine();
            }
            System.out.println("Número de líneas de configuración encontradas: " + lineasConfiguracion);
            System.out.println("Número de líneas en blanco: " + lineasEnBlanco);
            System.out.println("Número de líneas de otro tipo: " + lineasOtros);
            System.out.println("Número de líneas leídas: " + lineasLeidas);
            System.out.println("Número de líneas escritas: " + lineasEscritas);
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }

        
    }
    
}
