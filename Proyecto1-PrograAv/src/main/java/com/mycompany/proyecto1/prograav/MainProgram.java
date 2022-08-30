package com.mycompany.proyecto1.prograav;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Hashtable;

/**
 *
 * @author benja
 */
public class MainProgram {
    
    //Lectura
    public static BufferedReader createLector () throws IOException {
        BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
        return input;
    }
    
    public static void main (String [] args) throws IOException {
        menu();
    }
    
    //Menú
    public static void menu () throws IOException {
        //Bienvenida
        System.out.println("----------------------------------");
        System.out.println("----- Bienvenido al Programa -----");
        System.out.println("----------------------------------\n");
        
        //Menú
        System.out.println("==================================");
        System.out.println("|-----------   MENU   -----------|");
        System.out.println("|--------------------------------|");
        System.out.println("|---- 1. Agregar ----------------|");
        System.out.println("|---- 2. Listar -----------------|");
        System.out.println("|---- 3. Buscar -----------------|");
        System.out.println("|---- 4. Eliminar ---------------|");
        System.out.println("|---- 5. Salir ------------------|");
        System.out.println("|--------------------------------|");
        System.out.println("==================================");    
        
        //Ingrese la Opción
        System.out.println("Ingrese la Opción que desee:");
        BufferedReader lector = createLector();
        int option = 0;
        
        while (option != 5) {
            //Ingreso de Opción
            option = Integer.parseInt(lector.readLine());
            
            switch (option) {
            case 1:
                agregar();
                break;
            case 2:
                listar();
                break;
            case 3:
                //buscar();
                break;
            case 4:
                //eliminar();
                break;
            case 5:
                System.out.println("Gracias por usar el programa!");
                break;
            default:
                System.out.println("Opción no Válida");
            }
            
            //Mensaje
            System.out.println("Ingrese la Opción que desee:");
        }
    }
}
