package com.mycompany.proyecto1.prograav;
import java.util.ArrayList;

public class Bus {
    //Variables de instancia
    private String nombre_bus;
    private String fecha;
    private int costo;
    private int num_asientos;
    //opcional
    private boolean lleno;
    private ArrayList arrayAsientos;
    
    //----Constructores----
    //nulo
    public Bus(){
        nombre_bus = null;
        fecha = null;
        costo = 0;
        num_asientos = 0;
        //opcional
        lleno = false;
        arrayAsientos = new ArrayList();
    }
    
    public Bus(String nombre, String fecha, int costo, int num_asientos,boolean lleno){
        this.nombre_bus = nombre;
        this.fecha = fecha;
        this.costo = costo;
        this.num_asientos = num_asientos;
        //opcional
        this.lleno = lleno;
        arrayAsientos = new ArrayList();
    }
    
    //----Metodos----
    public String get_nombre(){
        return this.nombre_bus;
    }
    
}
