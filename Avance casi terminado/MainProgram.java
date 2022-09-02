package com.mycompany.proyecto1.prograav;

import java.io.BufferedReader;
//import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class MainProgram {
    
    //Importar archivo txt
    //[No terminado]
    /*
    public static void importar() throws IOException{
        //abrir archivo txt
        String filePath= "archivo.txt";
        BufferedReader lectorTxt = new BufferedReader(new FileReader(filePath));
        String lineText = null;
        int i = 1;
        
        while ((lineText = lectorTxt.readLine()) != null ){
            
            String []arr = lineText.split(",");
            
            //Meterle los datos...
            String nombre_ciudad_partida = arr[0];
            String nombre_ciudad_destino = arr[1];
            String bus_generico = arr[i+1];
            i++;
        }
        //cerrar txt
        lectorTxt.close();
        System.out.println("[Archivo Importado]");
    }
    */
    
    public static void listar(HashMap mapa){
        Iterator <String>val = mapa.keySet().iterator();
        
        //Recorrer HashMap
        while(val.hasNext()){
            String nombreCiudad = (String) val.next();
            Ciudad dato= (Ciudad) mapa.get(nombreCiudad);
            if (nombreCiudad != null){
            
                System.out.println("=========================================");
                System.out.println("Nombre ciudad: "+dato.get_nombre());
                System.out.println("[Listado de buses]\n");

                int k = (int)dato.getSizeArrayList();
                ArrayList list = dato.getArrayList();
                
                //Mostrar colección anidada.
                for(int i = 0; i < k ; i++){
                    Bus bus = (Bus) list.get(i);
                    System.out.println("Bus "+bus.get_nombre());
                    System.out.println("Destino: "+bus.get_destino());
                    System.out.println("Costo pasaje: "+bus.get_costo());
                    System.out.println("Fecha: "+bus.get_fecha());
                    System.out.println("Numero de asientos: "+bus.get_numAsientos());
                }
                System.out.println("\n=========================================");
            }
        }
    }
    
    public static void listarCiudades(HashMap mapa){
        Iterator <String>val = mapa.keySet().iterator();
        int aux = 0;
        //Recorrer HashMap
        while(val.hasNext()){
            String nombreCiudad = (String) val.next();
            Ciudad dato= (Ciudad) mapa.get(nombreCiudad);
            if (nombreCiudad != null){
                if (aux == 0){
                    System.out.println("=========================================");
                    aux++;
                }
                System.out.println("Nombre ciudad Partida: "+dato.get_nombre());
                System.out.println("=========================================");
            }
        }
    }
    
    //Inicializar mapa
    public static void iniciarMapa(HashMap mapa){
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
            mapa.put(name[i],prueba);
        }
    }
    
    //Función agregarBus
    public static void agregarBus(HashMap ciudades)throws IOException{
        
        BufferedReader lector = createLector();
        
        System.out.println("Ingrese la ciudad a agregar el bus: ");
        
        String nombreCiudad = lector.readLine();

        Ciudad dato = (Ciudad)ciudades.get(nombreCiudad);
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
         
        Bus bus = new Bus(nombreBus,fechaBus,costoBus,asientosBus,false,destino);
        
        //agregar bus a ciudad
        dato.agregarBus(bus);
        System.out.println("[Bus agregado]\n");
    }
    
    //Lectura
    public static BufferedReader createLector () throws IOException {
        BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
        return input;
    }
    
    public static void mostrarOpciones(){
        
        System.out.println("---------------------------------------");
        System.out.println("----- Sistema de gestión de buses -----");
        System.out.println("---------------------------------------\n");
        
        
        //Menú
        System.out.println("==================================");
        System.out.println("|-----------   MENU   -----------|");
        System.out.println("|--------------------------------|");
        System.out.println("|---- 1. Agregar bus-------------|");
        System.out.println("|---- 2. Listar Buses de ciudad--|");
        System.out.println("|---- 3. Listar Ciudades---------|");
        System.out.println("|---- 4. Buscar [No disponible]--|");
        System.out.println("|---- 5. Eliminar[No disponible]-|");
        System.out.println("|---- 6. Importar [No disponible]|");
        System.out.println("|---- 7. Salir ------------------|");
        System.out.println("|--------------------------------|");
        System.out.println("==================================");  
    }
    
    //Menú
    public static void menu () throws IOException {   
        //Ingrese la Opción
        BufferedReader lector = createLector();
        int option = 0;
        
        //para salir del while
        boolean salir = false;
        
        //HashMap
        HashMap <String,Ciudad>mapaCiudades = new HashMap();
        iniciarMapa(mapaCiudades);
        
        while (salir == false){
            //Mensaje
            mostrarOpciones();
            System.out.println("Ingrese la Opción que desee:");
            //Ingreso de Opción
            option = Integer.parseInt(lector.readLine());

            switch (option) {
            case 1:
                agregarBus(mapaCiudades);
                break;
            case 2:
                listar(mapaCiudades);
                break;
            case 3:
                listarCiudades(mapaCiudades);
                break;
            case 4:
                //eliminar();
                break;
            case 5:
                break;
            case 6:
                //importar();
                break;
            case 7:
                System.out.println("Gracias por usar el programa!");
                salir = true;
                break;
            default:
                System.out.println("Opción no Válida");
            }
        }
    }
    
    //Funcion main
    public static void main (String [] args) throws IOException {
        menu();
    }
    
    
}
