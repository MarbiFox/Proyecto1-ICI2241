
package probar;
public class Bus {
     //Variables de instancia
    private String nombre_bus;
    private String destino;
    private String fecha;
    private int costo;
    private int num_asientos;
    
    //opcional
    //private boolean lleno;
    //private ArrayList arrayAsientos;
    
    //----Constructor----  
    public Bus(String nombre, String fecha,String destino, int costo, int num_asientos){
        this.nombre_bus = nombre;
        this.fecha = fecha;
        this.costo = costo;
        this.num_asientos = num_asientos;
        this.destino = destino;
        //opcional
        //this.lleno = lleno;
        //arrayAsientos = new ArrayList();
    }
    
    //----Metodos----
        
    //---Getter----
    public String get_nombre(){
        return this.nombre_bus;
    }
    
    public String get_destino(){
        return this.destino;
    }
    
    public String get_fecha(){
        return this.fecha;
    }
    
    public int get_costo(){
        return this.costo;
    }
    
    public int get_numAsientos(){
        return this.num_asientos;
    }
    
    //----Setter----
    
    public void set_nombre(String nombre_bus){
        this.nombre_bus = nombre_bus;
    }
       
    public void set_destino(String destino){
        this.destino = destino;
    }
    
    public void set_fecha(String fecha){
        this.fecha = fecha;
    }
    
    public void set_costo(int costo){
        this.costo = costo;
    }
    
    public void set_numAsientos(int num_asientos){
        this.num_asientos = num_asientos;
    }
    
    public void mostrar_informacion_bus(){
        System.out.println("----"+this.nombre_bus+"----");
        System.out.println("Destino: "+this.destino);
        System.out.println("Fecha: "+this.fecha);
        System.out.println("Precio: "+this.costo);
        System.out.println("NÂ° asientos: "+this.num_asientos);
        System.out.println("---------------------------");
    }
}
