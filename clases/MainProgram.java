package com.mycompany.proyecto1.prograav;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class MainProgram {
    
    //Importar archivo txt
    //[No terminado]
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
    
    public static void listar(){
        
    }
    
    //Inicializar mapa
    public static void iniciarMapa(HashMap mapa){
        String []name = new String[3];
        name[0] = "hola";
        name[1] = "hola2";
        name[2] = "hola3";
        
        for (int i = 0 ; i < 3 ; i++){
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
            System.out.println("[Ciudad no encontrada]");
            return;
        }

        System.out.println("Ingrese el nombre del bus: ");
        String nombreBus = lector.readLine();
        System.out.println("Ingrese la fecha del bus: ");
        String fechaBus = lector.readLine();
        System.out.println("Ingrese el costo del pasaje: ");
        int costoBus = Integer.parseInt(lector.readLine());
        System.out.println("Ingrese el numero de asientos: ");
        int asientosBus = Integer.parseInt(lector.readLine());

        Bus bus = new Bus(nombreBus,fechaBus,costoBus,asientosBus,false);
        dato.agregar(bus);

    }
    
    //Lectura
    public static BufferedReader createLector () throws IOException {
        BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
        return input;
    }
    
    //Funcion main
    public static void main (String [] args) throws IOException {
        menu();
    }
    
    //Menú
    public static void menu () throws IOException {
        //Bienvenida
        System.out.println("----------------------------------");
        System.out.println("----- Bienvenido al Programa -----");
        System.out.println("----------------------------------\n");
        
        //Menú
        System.out.println("==================================");
        System.out.println("|-----------   MENU   -----------|");
        System.out.println("|--------------------------------|");
        System.out.println("|---- 1. Agregar ----------------|");
        System.out.println("|---- 2. Listar -----------------|");
        System.out.println("|---- 3. Buscar -----------------|");
        System.out.println("|---- 4. Eliminar ---------------|");
        System.out.println("|---- 5. Importar ---------------|");
        System.out.println("|---- 6. Salir ------------------|");
        System.out.println("|--------------------------------|");
        System.out.println("==================================");    
        
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
            System.out.println("Ingrese la Opción que desee:");
            //Ingreso de Opción
            option = Integer.parseInt(lector.readLine());

            switch (option) {
            case 1:
                agregarBus(mapaCiudades);
                break;
            case 2:
                listar();
                break;
            case 3:
                //buscar();
                break;
            case 4:
                //eliminar();
                break;
            case 5:
                importar();
                break;
            case 6:
                System.out.println("Gracias por usar el programa!");
                salir = true;
                break;
            default:
                System.out.println("Opción no Válida");
            }
        }
    }
}
