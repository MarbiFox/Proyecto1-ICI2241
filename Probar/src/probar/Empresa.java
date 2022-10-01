
package probar;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Empresa {
    private ListaCiudades listaCiudades = new ListaCiudades();
    private MapaCiudades mapaCiudades = new MapaCiudades();
    
    //Lectura
    public static BufferedReader createLector () throws IOException {
        BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
        return input;
    }
    
    //FunciÃ³n agregarBus
    public void agregarBus()throws IOException{
        
        BufferedReader lector = createLector();
        
        System.out.println("Ingrese la ciudad a agregar el bus: ");
        
        String nombreCiudad = lector.readLine();

        Ciudad dato = mapaCiudades.get_ciudad(nombreCiudad);
        if (dato == null){
            System.out.println("[Ciudad no encontrada en el sistema]");
            return;
        }

        System.out.println("Ingrese el nombre del bus: ");
        String nombreBus = lector.readLine();
        
        System.out.println("Ingrese Destino del bus: ");
        String destino = lector.readLine();
        
        System.out.println("Ingrese la fecha del bus: ");
        String fechaBus = lector.readLine();
        
        System.out.println("Ingrese el costo del pasaje: ");
        int costoBus = Integer.parseInt(lector.readLine());
        
        System.out.println("Ingrese el numero de asientos: ");
        int asientosBus = Integer.parseInt(lector.readLine());
         
        Bus bus = new Bus(nombreBus,fechaBus,destino,costoBus,asientosBus);
        
        //agregar bus a ciudad
        dato.agregarBus(bus);
        System.out.println("[Bus agregado]\n");
    }
    
    public static void mostrarOpciones(){
        
        System.out.println("---------------------------------------");
        System.out.println("----- Sistema de gestiÃ³n de buses -----");
        System.out.println("---------------------------------------\n");
       
        //MenÃº
        System.out.println("==================================");
        System.out.println("|-----------   MENU   -----------|");
        System.out.println("|--------------------------------|");
        System.out.println("|---- 1. Agregar bus-------------|");
        System.out.println("|---- 2. Listar Buses de ciudad--|");
        System.out.println("|---- 3. Listar Ciudades---------|");
        System.out.println("|---- 4. Eliminar----------------|");
        System.out.println("|---- 5. Modificar---------------|");
        System.out.println("|---- 6. Importar [No disponible]|");
        System.out.println("|---- 7. Salir ------------------|");
        System.out.println("|--------------------------------|");
        System.out.println("==================================");  
    }
    
    public void menu() throws IOException{
        //Ingrese la OpciÃ³n
        BufferedReader lector = createLector();
        int option = 0;
        
        //para salir del while
        boolean salir = false;
        
        while (salir == false){
            //Mensaje
            mostrarOpciones();
            System.out.println("Ingrese la OpciÃ³n que desee:");
            //Ingreso de OpciÃ³n
            option = Integer.parseInt(lector.readLine());

            switch (option) {
            case 1:
                agregarBus();
                break;
            case 2:
                //listar();
                break;
            case 3:
                listar_lista();
                break;
            case 4:
                eliminar();
                break;
            case 5:
                modificar();
                break;
            case 6:
                importar();
                break;
            case 7:
                System.out.println("Gracias por usar el programa!");
                salir = true;
                break;
            default:
                System.out.println("OpciÃ³n no VÃ¡lida");
            }
        }
    }
    public void listar_lista(){
        for(int i = 0; i < listaCiudades.size(); i++){
            System.out.println("-----------------");
            Ciudad aux = listaCiudades.get_i(i);
            System.out.println(aux.get_nombre());
            System.out.println("-----------------");
            System.out.println("Buses");
            for(int j = 0; j<aux.getSizeArrayList();j++){
                Bus b = aux.get_bus(j);
                System.out.println("Nombre bus: "+b.get_nombre());
                System.out.println("Origen: "+aux.get_nombre());
                System.out.println("Destino: "+b.get_destino());
                System.out.println("Fecha: "+b.get_fecha());
                System.out.println("Precio: "+b.get_costo());
                System.out.println("Asientos: "+b.get_numAsientos());
                System.out.println("\n");
            }            
        }
        System.out.println(listaCiudades.size());
    }
    
    public void importar() throws FileNotFoundException, IOException{
        String lib = "Libro1.txt";
        BufferedReader lector = new BufferedReader(new FileReader(lib));
        
        String line = null;
        /*Importar lo que esta en el archivo Libro1.txt*/
        while((line = lector.readLine()) != null){
            String[] arr = line.split(";");
            
            Ciudad c = new Ciudad(arr[0]);
            listaCiudades.setObject(c);
        }
        
        lector.close();
        /*Recorrer las ciudades e ir diciendo que importen sus buses*/
        for(int i = 0; i < listaCiudades.size();i++){
            Ciudad c = listaCiudades.get_i(i);
            c.importar();
            listaCiudades.setObjectI(i,c);
            mapaCiudades.setObject(c.get_nombre(),c);
        }
        
    }

    public void modificar()throws IOException{
        System.out.println("Ingrese Ciudad");
        BufferedReader lector = createLector();
        String name = lector.readLine();
        
        Ciudad c = mapaCiudades.get_ciudad(name);
        if (c != null){
            System.out.println("Ingrese bus a modificar:");
            name = lector.readLine();
            Bus b = c.obtenerBus(name);
            if (b != null){
                System.out.println("Ingrese nuevo Nombre:");
                String nombre = lector.readLine();
                b.set_nombre(nombre);
                
                System.out.println("Ingrese nueva Fecha:");
                String fecha = lector.readLine();
                b.set_fecha(fecha);
                
                System.out.println("Ingrese nuevo Destino:");
                String destino = lector.readLine();
                b.set_destino(destino);
                
                System.out.println("Ingrese nuevo Costo:");
                int costo = Integer.parseInt(lector.readLine());
                b.set_costo(costo);
                
                System.out.println("Ingrese nuevo número de asientos:");
                int num = Integer.parseInt(lector.readLine());
                b.set_numAsientos(num);

            }
            else{
                System.out.println("Bus no encontrado");
            }
        }
        else{
            System.out.println("Ciudad no encontrada");
        }
    }
    
    public void eliminar()throws IOException{
        System.out.println("Ingrese Ciudad");
        BufferedReader lector = createLector();
        String name = lector.readLine();
        
        Ciudad c = mapaCiudades.get_ciudad(name);
        if (c != null){
            System.out.println("Ingrese nombre bus");
            String nombre = lector.readLine();
            c.eliminarBus(nombre);
        }
        else{
            System.out.println("Ciudad no encontrada");
        }
    }
}
