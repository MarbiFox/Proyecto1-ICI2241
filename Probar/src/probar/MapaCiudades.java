
package probar;

import java.util.HashMap;

public class MapaCiudades {
    private HashMap <String,Ciudad>mapaCiudades;
    
    public MapaCiudades(){
        mapaCiudades = new HashMap();
    }

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
