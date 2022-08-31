package com.mycompany.proyecto1.prograav;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleManagement {
    
    //Limpiar la Consola.
    public static void clearConsole() throws AWTException {
        //Crear tipo Robot para operar el teclado
        Robot robot = new Robot();
        //Presionar el comando CTRL+L que limpia la consola
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_L);
        //Soltar el comando CTRL+L
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_L);     
    }
    
    //Pausar Texto
    public static void pauseConsole() throws IOException {
        //Declara un BufferedReader para detener la consola.
        BufferedReader pause = new BufferedReader(new InputStreamReader(System.in));
        //Emite un mensaje.
        System.out.println("Pulse Enter para Continuar...");
        pause.readLine();
    }
}