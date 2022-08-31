package com.mycompany.proyecto1.prograav;
import java.util.ArrayList;

public class Bus {
    //Variables de instancia
    private String nombre;
    private int fecha;
    private int costo;
    private int num_asientos;
    
    //opcional
    private boolean lleno;
    private ArrayList arrayAsientos;
    
    //----Metodos----
    public String get_nombre(){
        return this.nombre;
    }
    
}
