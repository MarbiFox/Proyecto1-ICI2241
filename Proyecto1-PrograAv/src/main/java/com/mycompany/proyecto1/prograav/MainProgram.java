package com.mycompany.proyecto1.prograav;

import java.awt.AWTException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Team_Andrómeda_Sur
 */

public class MainProgram {
    
    //Función para Lectura de Datos
    public static BufferedReader createLector () throws IOException {
        BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
        return input;
    }
    
    //Función main para activar inicialmente el programa
    public static void main (String [] args) throws IOException, AWTException {
        menu();
        selectOption();
    }
    
    //Función que muestra gráficamente el menú
    public static void menu () {
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
    }
    
    //Función para elegir una opción por teclado e iniciar su método propio.
    public static void selectOption () throws IOException, AWTException {
        //Mensaje y crear un lector
        System.out.println("Ingrese la Opción que desee:");
        BufferedReader lector = createLector();
        int option = 0;
        
        while (option != 5) {
            //Ingresar una opción
            option = Integer.parseInt(lector.readLine());
            
            //Switch para iniciar un método
            switch (option) {
            case 1:
                //agregar();
                break;
            case 2:
                //listar();
                break;
            case 3:
                //buscar();
                break;
            case 4:
                //eliminar();
                break;
            case 5:
                //Salir
                System.out.println("Gracias por usar el programa!");
                //Pausar la Consola
                ConsoleManagement.pauseConsole();
                break;
            default:
                //Ingreso de número no encontrado en la lista
                System.out.println("Opción no Válida");
                //Pausar la consola
                ConsoleManagement.pauseConsole();
            }
            
            //Limpiar Pantalla (Consola)
            ConsoleManagement.clearConsole();
            
            //Mensaje
            if (option != 5) {
                menu();
                System.out.println("Ingrese la Opción que desee:");
            }
        }
    }
}

