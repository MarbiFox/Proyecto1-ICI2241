
package com.mycompany.proyecto1.prograav;

import java.util.ArrayList;

public class ListaBuses {
    private ArrayList buses;
    
    public ListaBuses(){
         buses = new ArrayList();
    }
    
    public int get_size(){
        return buses.size();
    }
    
    public Bus get_getter(int i){
        return (Bus)buses.get(i);
    }
    
    public ArrayList get_arrayList(){
        return buses;
    }
    
    public void addBus(Bus b){
        buses.add(b);
    }

}
