package com.mycompany.proyecto1.prograav;

import java.util.HashMap;
import java.util.Iterator;

public class MapaCiudades {
    private HashMap mapaCiudades;
    
    public MapaCiudades(){
        mapaCiudades = new HashMap();
    }
    
     //Inicializar mapa
    public void iniciarMapa(){
        String []name = new String[25];
        name[0] = "Santiago";
        name[1] = "Quillota";
        name[2] = "Rancagua";
        name[4] = "Valparaíso";
        name[5] = "Arica";
        name[6] = "Antofagasta";
        name[7] = "Valdivia";
        name[8] = "Concepción";
        
        for (int i = 0 ; i < 9 ; i++){
            Ciudad prueba = new Ciudad(name[i]);
            mapaCiudades.put(name[i],prueba);
        }
    }
    
    public Ciudad get_ciudad(String name){
        if ((Ciudad)mapaCiudades.get(name) != null){
            return (Ciudad)mapaCiudades.get(name);
        }
        return null;
    }
    
    public Iterator get_iterator(){
        return (Iterator)mapaCiudades.keySet().iterator();
    }
}
