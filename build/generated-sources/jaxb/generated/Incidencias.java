//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantaci�n de la referencia de enlace (JAXB) XML v2.2.5-2 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perder�n si se vuelve a compilar el esquema de origen. 
// Generado el: PM.02.08 a las 02:20:17 PM CET 
//


package generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="incidencia" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="origen" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="destino" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="detalle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="tipo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="fechahora" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "incidencia"
})
@XmlRootElement(name = "incidencias")
public class Incidencias {

    protected List<Incidencias.Incidencia> incidencia;

    /**
     * Gets the value of the incidencia property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the incidencia property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncidencia().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Incidencias.Incidencia }
     * 
     * 
     */
    public List<Incidencias.Incidencia> getIncidencia() {
        if (incidencia == null) {
            incidencia = new ArrayList<Incidencias.Incidencia>();
        }
        return this.incidencia;
    }

            public void setIncidencia(ArrayList<Incidencia> listaIncidencia) {
            this.incidencia = listaIncidencia;
        }
        
    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="origen" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="destino" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="detalle" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="tipo" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *       &lt;attribute name="fechahora" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "origen",
        "destino",
        "detalle",
        "tipo"
    })
    public static class Incidencia {

        @XmlElement(required = true)
        protected String origen;
        @XmlElement(required = true)
        protected String destino;
        @XmlElement(required = true)
        protected String detalle;
        @XmlElement(required = true)
        protected String tipo;
        @XmlAttribute(name = "fechahora", required = true)
        protected String fechahora;

        /**
         * Obtiene el valor de la propiedad origen.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrigen() {
            return origen;
        }

        /**
         * Define el valor de la propiedad origen.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrigen(String value) {
            this.origen = value;
        }

        /**
         * Obtiene el valor de la propiedad destino.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDestino() {
            return destino;
        }

        /**
         * Define el valor de la propiedad destino.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDestino(String value) {
            this.destino = value;
        }

        /**
         * Obtiene el valor de la propiedad detalle.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDetalle() {
            return detalle;
        }

        /**
         * Define el valor de la propiedad detalle.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDetalle(String value) {
            this.detalle = value;
        }

        /**
         * Obtiene el valor de la propiedad tipo.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTipo() {
            return tipo;
        }

        /**
         * Define el valor de la propiedad tipo.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTipo(String value) {
            this.tipo = value;
        }

        /**
         * Obtiene el valor de la propiedad fechahora.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFechahora() {
            return fechahora;
        }

        /**
         * Define el valor de la propiedad fechahora.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFechahora(String value) {
            this.fechahora = value;
        }

    }

}
