/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ventana;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

/**
 *
 * @author thoma
 */
public class ListUser {
    private HashMap <String,Administrator> mapaAdmi;
    private HashMap <Integer,Client> mapaClient;

    public ListUser() {
        this.mapaAdmi = new HashMap();
        this.mapaClient = new HashMap();
    }
    
    public Administrator getAdmi(String n){
        return this.mapaAdmi.get(n);
    }
    
    public Client getClient(int i){
        return this.mapaClient.get(i);
    }
    
    public void addAdmi(String n, Administrator aux){
        mapaAdmi.put(n, aux);
    }
    
    public void addClient(int rut,Client aux){
        mapaClient.put(rut, aux);
    }
    
    
    public void importar() throws FileNotFoundException, IOException{
        String lib = "InformacionAdministrador.txt;InformacionCliente.txt";
        String []aux = lib.split(";");
        
        BufferedReader lector = new BufferedReader(new FileReader(aux[0]));
        String line = null;
        /*Importar lo que esta en el archivo Libro1.txt*/
        while((line = lector.readLine()) != null){
            String[] arr = line.split(";");
            Administrator admi = new Administrator(arr[0],arr[1],Integer.parseInt(arr[2]),arr[3]);
            addAdmi(arr[0], admi);
        }
        lector.close();
        
        BufferedReader lector1 = new BufferedReader(new FileReader(aux[1]));
        String line1 = null;
        /*Importar lo que esta en el archivo Libro1.txt*/
        while((line1 = lector1.readLine()) != null){
            String[] arr = line1.split(";");
            Administrator client = new Administrator(arr[0],arr[1],Integer.parseInt(arr[2]),arr[3]);
            addAdmi(arr[3], client);
        }
        lector.close();
    }
    
    public void removeData(){
        mapaAdmi.clear();
        mapaClient.clear();
    }
    
}
