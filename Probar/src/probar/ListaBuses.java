/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package probar;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class ListaBuses {
    private ArrayList <Bus> buses;
    
    public ListaBuses(){
         buses = new ArrayList();
    }
    
    public int get_size(){
        return buses.size();
    }
    
    public Bus get_getter(int i){
        return buses.get(i);
    }
    
    public ArrayList get_arrayList(){
        return buses;
    }
    
    public void addBus(Bus b){
        buses.add(b);
    }
    
    public Bus get_i(int i){
        return buses.get(i);
    }
        
    public void remove(Bus b){
        buses.remove(b);
    }

    
    /*Importar en Arraylist los buses de la ciudad dada*/
    public void importar(String nombre) throws FileNotFoundException{
        File archivo = null;
        FileReader fr = null;
        BufferedReader lector = null;
        
        /*------------------------*/
        /*Manejo de excepcion*/
        try{
            archivo = new File("Valparaiso.txt");
            fr = new FileReader(archivo);
            lector = new BufferedReader(fr);
            String line;
            int i = 0;
            while((line = lector.readLine())!=null){
                String []aux = line.split(";");
                Bus b = new Bus(aux[0],aux[1],aux[2],Integer.parseInt(aux[3]),Integer.parseInt(aux[4]));
                buses.add(b);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
                if(fr != null){
                    lector.close();
                }
            }catch(Exception e2){
                e2.printStackTrace();
            }
        }
    }
}
