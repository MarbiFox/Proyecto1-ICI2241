
package probar;

import java.util.HashMap;

public class MapaCiudades {
    private HashMap <String,Ciudad>mapaCiudades;
    
    public MapaCiudades(){
        mapaCiudades = new HashMap();
    }
    
    /*
     //Inicializar mapa
    public void iniciarMapa(){
        String []name = new String[25];
        name[0] = "Santiago";
        name[1] = "Quillota";
        name[2] = "Rancagua";
        name[4] = "ValparaÃ­so";
        name[5] = "Arica";
        name[6] = "Antofagasta";
        name[7] = "Valdivia";
        name[8] = "ConcepciÃ³n";
        
        for (int i = 0 ; i < 9 ; i++){
            Ciudad prueba = new Ciudad(name[i]);
            mapaCiudades.put(name[i],prueba);
        }
    }
    */
    
    public Ciudad get_ciudad(String name){
        if (mapaCiudades.get(name) != null){
            return mapaCiudades.get(name);
        }
        return null;
    }
    
    public void setObject(String n,Ciudad temp){
        mapaCiudades.put(n, temp);
    }
    
    public Ciudad searchObject(String n){
        return mapaCiudades.get(n);
    }
}
