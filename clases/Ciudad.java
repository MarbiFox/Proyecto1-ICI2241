
package com.mycompany.proyecto1.prograav;
import java.util.ArrayList;

public class Ciudad {
    //Variables de instancia
    //ciudad partida
    private String nombre;
    private ArrayList<Bus> buses;
    
    //----Constructores----  
    
    /*Crea una ciudad con un nombre e inicializa el ArrayList*/
    public Ciudad(String n){
        this.nombre = n;
        this.buses = new ArrayList();
    }
    
    /*Crea una ciudad con "none" como nombre e inicializa el ArrayList*/
    public Ciudad(){
        this.nombre = "none";
        this.buses = new ArrayList();
    }
    
    //----Metodos----
    
    /*Modifica el nombre de la ciudad*/
    public void set_nombre(String n){
        this.nombre = n;
    }
    
    /*Obtiene el nombre de la ciudad*/
    public String get_nombre(){
        return this.nombre;
    }
    
    /*Agrega un nuevo elemento a la ArrayList*/
    public void agregar(Bus p){
        this.buses.add(p);
    }
      
    /*Obtiene un bus de la ciudad a partir de un nombre*/
    
    public Bus obtenerBus(String var){
        int i;
        for(i = 0;i < this.buses.size();i++){
            Bus datos = this.buses.get(i);
            if(datos.get_nombre().equals(var)){
                return this.buses.get(i);
            }
        }
        return null;
    }
    
}
