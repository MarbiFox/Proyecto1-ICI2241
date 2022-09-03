
package com.mycompany.proyecto1.prograav;
import java.util.ArrayList;

public class Ciudad {
    //Variables de instancia
    
    private String nombre; //ciudad de partida
    private int cantidad_buses;
    private ArrayList<Bus> buses;
    
    //----Constructor----  
    /*Crea una ciudad con un nombre e inicializa el ArrayList*/
    public Ciudad(String n){
        this.nombre = n;
        this.buses = new ArrayList();
        this.cantidad_buses = 0;
    }
       
    //----Metodos----
    
    //----Setter----
    /*Modifica el nombre de la ciudad*/
    public void set_nombre(String n){
        this.nombre = n;
    }
    
    public void set_cantidad_de_buses(int c){
        this.cantidad_buses = c;
    }
    
    //----Getter----
    /*Obtiene el nombre de la ciudad*/
    public String get_nombre(){
        return this.nombre;
    }
    
    public int getSizeArrayList(){
        return this.cantidad_buses;
    }
    
    public ArrayList getArrayList(){
        ArrayList k = this.buses;
        return k;
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
    
    /*obtiene un nuevo elemento a partir de un nombre y una fecha*/
    public Bus obtenerBus(String nombre, String fecha){
        int i;
        for(i = 0;i < this.buses.size();i++){
            Bus datos = this.buses.get(i);
            if(datos.get_nombre().equals(nombre) && datos.get_fecha().equals(fecha)){
                return this.buses.get(i);
            }
        }
        return null;
    }
    
    /*Agrega un nuevo elemento a la ArrayList*/
    public void agregarBus(Bus p){
        this.buses.add(p);
        this.cantidad_buses++;
    }
    
    public void agregarBus(Bus p,int valor_actual){
        this.buses.add(p);
        this.cantidad_buses += valor_actual;
    }
    
}