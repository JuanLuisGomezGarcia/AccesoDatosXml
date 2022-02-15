
package dam_m06_t01_act_01_juanluisgomezgarcia;

import dam_m06_t01_act_01_juanluisgomezgarcia.Incidencias.Incidencia;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

public class trapaso {

    public static void main(String[] args) throws IOException, JAXBException {
        
       // Variables para acceder a los archivos en cualquier PC o sistema
       String rutaProyecto = System.getProperty("user.dir");  
       String separador = System.getProperty("file.separator");
       
       // Creamos una lista con las lineas del texto creado con anterioridad
       List <String> listaLineas = Files.readAllLines(Paths.get(rutaProyecto + separador + "src" + separador + "incidencias.txt"));
       
       //Creamos un arrayList de las incidencias y un objeto de incidencias donde meteremos el arrayList
       ArrayList <Incidencias.Incidencia> listaIncidencias = new ArrayList <>();
       Incidencias incidencias = new Incidencias();
       
       // Aqui creamos un conjunto de Strinf y arrays de String con lo que trataremos
       //La informacion del texto, dividiendo la informacion y usandolos para crear objetos incidencia
       String lineaPrimera,lineaSegunda,lineaTercera;
       String contenidoFechaHora,contenidoOrigen,contenidoDestino,contenidoDetalle,contenidoTipo;
       String []contenidoDetalleArray;
       String []contenidoTipoArray;
       
       //Empezamos a recorrer eel string que contiene las lineas del texto
       System.out.println("TEXTO INTRODUCIDO:");
       for (int i=0; i<listaLineas.size();i = i+3){
           
        // Utilizamos un if para separar los bloques de texto
        // y incrmentamos los i para que cada string coja la linea necesaria
           if(listaLineas.get(i).startsWith("%")){
              lineaPrimera = listaLineas.get(i);
              lineaSegunda = listaLineas.get(i+1);
              lineaTercera = listaLineas.get(i+2);
              
        //Mostramos las lineas para mostrar el texto en cuestion
           System.out.println(" \n" + lineaPrimera + "\n" +lineaSegunda + "\n" + lineaTercera);   
           
        // Dividimos los string de lineas con funciones split y lo metemos en los string
        //que representa cada atributo del objeto
              contenidoFechaHora = lineaPrimera.split(" ")[1];
              contenidoFechaHora += " " + lineaPrimera.split(" ")[2];
              contenidoOrigen = lineaPrimera.split(" ")[3];
              contenidoDestino = lineaPrimera.split(" ")[4];
          
        //Estos dos String para evitar un espacio al inicio y crear un espacio entre palabras creamos un bucle
        //que reccorra y copie el string palabra a palabra
              contenidoDetalle = "";
              contenidoDetalleArray = lineaSegunda.split(" ");
              for (String a : contenidoDetalleArray){
                  if(contenidoDetalle.isEmpty()){
                   contenidoDetalle +=a;}
                  else{contenidoDetalle +=" " + a;}}   
              
              contenidoTipo = "";
              contenidoTipoArray = lineaTercera.split(" ");
              for (String a : contenidoTipoArray){
                  if(contenidoTipo.isEmpty()){
                   contenidoTipo +=a;}
                  else{contenidoTipo +=" " + a;}}
              
        //Utilizamos los String generados anteriormente para crear los objetos de incidencia
               Incidencia nuevaIncidencia = new Incidencia();
               nuevaIncidencia.setFechahora(contenidoFechaHora);
               nuevaIncidencia.setDestino(contenidoDestino);
               nuevaIncidencia.setOrigen(contenidoOrigen);
               nuevaIncidencia.setDetalle(contenidoDetalle);
               nuevaIncidencia.setTipo(contenidoTipo);
               
        // y metemos esos objetos en el arrayList creado anteriormente
               listaIncidencias.add(nuevaIncidencia);}}
           
       
            System.out.println("XML CREADO:");
        //A continuacion introducimos el arrayList en el objeto de incidenias que creamos
            incidencias.setIncidencia(listaIncidencias);
        // Creamos un file que sera el futuro XML
            File incidenciaXML = new File(rutaProyecto + separador + "src" + separador +"incidencias.xml");
        // Creamos el jaxbContext con l clase incidencia
            JAXBContext jaxbContext = JAXBContext.newInstance(Incidencias.class);
        //y el marshaller que le dara forma
            javax.xml.bind.Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            jaxbMarshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FORMATTED_OUTPUT, true);
        //Los mostramos por pantalla
            jaxbMarshaller.marshal(incidencias,System.out);
            jaxbMarshaller.marshal(incidencias, incidenciaXML);
       
       
       //Creamos un objeto de la clase busqueda y le hacemos ejecutar la funcion para realizar
       //La busqueda planteada con XPATH
       System.out.println("\n BUSQUEDA XPATH");
       Buscador busqueda = new Buscador();
       busqueda.buscador();} }
