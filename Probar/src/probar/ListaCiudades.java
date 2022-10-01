package probar;
import java.util.ArrayList;
public class ListaCiudades {
    private ArrayList <Ciudad>listaCiudades;
    
    public ListaCiudades(){
        listaCiudades = new ArrayList();
    }
    
    public Ciudad get_i(int i){
        return listaCiudades.get(i);
    }
    
    public void setObject(Ciudad c){
        listaCiudades.add(c);
    }
    
    public int size(){
        return listaCiudades.size();
    }
    
    public void setObjectI(int i,Ciudad c){
        listaCiudades.remove(i);
        listaCiudades.add(i, c);
    }
}
