
package dam_m06_t01_act_01_juanluisgomezgarcia;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Buscador {
     
    // Creamos la funcion que llamaremos en la clase traspaso
    public void buscador(){
    
    // Creamos la variables necesarias el file (XML) en el que buscaremos    
    String rutaProyecto = System.getProperty("user.dir");    
    String separador = System.getProperty("file.separator");
    File archivoXML = new File(rutaProyecto + separador + "src" + separador + "incidencias.xml");
    
    //En esta string metemos la busqueda XAPT que luego usaremos
    String consulta ="/incidencias/incidencia[destino='jramirez']/*";
    
    //Variable donde meteremos los resultados de al busqueda XPATH
    String salida = "";

    // Instanciamos el documentBuilderFactory
    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
    DocumentBuilder builder;
    try {
    builder = factory.newDocumentBuilder();
    
    // Generamos una variable doc con la importancion org.w3c.dom. para usar el DOM
    org.w3c.dom.Document doc;
    
    //Transformamos el archivoXML anteriormente creado con el builder a doc
    doc = builder.parse(archivoXML);       
    
    //Instanciamos el xpatchfacory con el cual compilarmos la consulta de XPATH que
    //Creamos en un String
    XPathFactory xPathfactory = XPathFactory.newInstance();
    XPath xpath = xPathfactory.newXPath();
    XPathExpression expr;
    expr = xpath.compile(consulta );
    
    //Creamos un objeto con el doc anteriormente creado y el xpath con la consulta compilada
    Object result = expr.evaluate(doc, XPathConstants.NODESET);
    
    //Y creamos una lista de nodos con el objeto anterior
    //en este nodo solo se encuentra los elementos resultantes de la consulta
    NodeList nodeList = (NodeList) result;
                
    // Vamos rellenando el String utilizado para la busqueda empezando por el atributo
    //Y despues reccorremos el nodo cogiendo el elemento y el contenido
    salida ="fechahora " + xpath.compile("/incidencias/incidencia[origen='agonzales']/@fechahora").evaluate(nodeList.item(1) )+"\n ";
    for (int i = 0; i < 4; i++){
    salida =  salida +  nodeList.item(i).getNodeName() +" " + nodeList.item(i).getChildNodes().item(0).getNodeValue() + "\n "  ;}
        
    //Lo separamos el dos bucles para realizar los dos objetos
    salida = salida + "fechahora " + xpath.compile("/incidencias/incidencia[origen='smartinez']/@fechahora").evaluate(nodeList.item(0) )+"\n ";
    for (int i = 4; i < 8; i++){
    salida =  salida +  nodeList.item(i).getNodeName() +" " + nodeList.item(i).getChildNodes().item(0).getNodeValue() + "\n "  ;}
    
    //Enseñamo por pantalla los nodos encontrados
    System.out.println(salida );
    
            } catch (XPathExpressionException | ParserConfigurationException | SAXException | IOException ex) {
                Logger.getLogger(Buscador.class.getName()).log(Level.SEVERE, null, ex);
            }}
}
