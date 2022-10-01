/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package probar;

import java.io.FileNotFoundException;

public class Ciudad {
    //Variables de instancia
    
    private String nombre; //ciudad de partida
    private ListaBuses buses;
    
    //----Constructor----  
    /*Crea una ciudad con un nombre e inicializa el ArrayList*/
    public Ciudad(String n){
        nombre = n;
        buses = new ListaBuses();
    }
       
    //----Metodos----
    
    //----Setter----
    /*Modifica el nombre de la ciudad*/
    public void set_nombre(String n){
        this.nombre = n;
    }
    
    //----Getter----
    /*Obtiene el nombre de la ciudad*/
    public String get_nombre(){
        return this.nombre;
    }
    
    public int getSizeArrayList(){
        return this.buses.get_size();
    }
    
    public Bus get_bus(int i){
        return buses.get_i(i);
    }
       
    /*Obtiene un bus de la ciudad a partir de un nombre*/
    public Bus obtenerBus(String var){
        int i;
        for(i = 0;i < buses.get_size();i++){
            Bus datos = buses.get_getter(i);
            if(datos.get_nombre().equals(var)){
                return buses.get_getter(i);
            }
        }
        return null;
    }
    
    /*obtiene un nuevo elemento a partir de un nombre y una fecha*/
    public Bus obtenerBus(String nombre, String fecha){
        int i;
        for(i = 0;i < buses.get_size();i++){
            Bus datos = buses.get_getter(i);
            if(datos.get_nombre().equals(nombre) && datos.get_fecha().equals(fecha)){
                return buses.get_getter(i);
            }
        }
        return null;
    }
    
    //Eliminar Bus
    public void eliminarBus(String name){
        boolean valor = false;
        for(int i = 0;i < buses.get_size();i++){
            Bus b = buses.get_getter(i);
            if(b.get_nombre().equals(name)){
                buses.remove(b);
                valor = true;
            }
        }
        if (valor == false)
            System.out.println("Bus no encontrado");
    }
    
    /*Agrega un nuevo elemento a la ArrayList*/
    public void agregarBus(Bus p){
        buses.addBus(p);
    }
    
    public void agregarBus(Bus p,int valor_actual){
        buses.addBus(p);
    }
    
    public void importar() throws FileNotFoundException{
        buses.importar(this.nombre);
    }
}
