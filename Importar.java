    //Importar archivo txt
    public static void importar() throws IOException{
        //abrir archivo txt
        String filePath= "archivo.txt";
        BufferedReader lectorTxt = new BufferedReader(new FileReader(filePath));
        String lineText = null;
        int i = 0;
        
        while ((lineText = lectorTxt.readLine()) != null ){
            
            String []arr = lineText.split(",");
            
            //Meterle los datos...
            String nombre_ciudad = arr[0];
            String bus_generico = arr[i];
            i++;
        }
        lectorTxt.close();
        System.out.println("[Archivo Importado]");
    }