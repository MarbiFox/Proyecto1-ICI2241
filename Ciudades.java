/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1.prograav;
import java.util.ArrayList;
/**
 *
 * @author thoma
 */
public class Ciudades {
    
    private String nombre;
    private ArrayList<Buses> buses;
    
    /*Crea una ciudad con un nombre e inicializa el ArrayList*/
    public Ciudades(String n){
        this.nombre = n;
        this.buses = new ArrayList();
    }
    /*Crea una ciudad con "none" como nombre e inicializa el ArrayList*/
    public Ciudades(){
        this.nombre = "none";
        this.buses = new ArrayList();
    }
    /*Modifica el nombre de la ciudad*/
    public void set_nombre(String n){
        this.nombre = n
    }
    /*Obtiene el nombre de la ciudad*/
    public String get_nombre(){
        return this.nombre;
    }
    /*Agrega un nuevo elemento a la ArrayList*/
    public void agregar(Buses p){
        this.buses.add(p);
    }
    /*Obtiene un bus de la ciudad a partir de un nombre*/
    public Buses obtenerBus(String var){
        int i;
        for(i = 0;i < this.buses.size();i++){
            Buses datos = this.buses.getClass(i);
            if(datos.nombreBus.equal(var)){
                return this.buses.get(i);
            }
        }
        return null;
    }

}
