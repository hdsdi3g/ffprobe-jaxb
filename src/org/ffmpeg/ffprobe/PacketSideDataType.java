//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2016.10.08 à 10:32:23 PM CEST 
//


package org.ffmpeg.ffprobe;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour packetSideDataType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="packetSideDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="side_data_type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="side_data_size" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "packetSideDataType")
public class PacketSideDataType {

    @XmlAttribute(name = "side_data_type")
    protected String sideDataType;
    @XmlAttribute(name = "side_data_size")
    protected Integer sideDataSize;

    /**
     * Obtient la valeur de la propriété sideDataType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSideDataType() {
        return sideDataType;
    }

    /**
     * Définit la valeur de la propriété sideDataType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSideDataType(String value) {
        this.sideDataType = value;
    }

    /**
     * Obtient la valeur de la propriété sideDataSize.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSideDataSize() {
        return sideDataSize;
    }

    /**
     * Définit la valeur de la propriété sideDataSize.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSideDataSize(Integer value) {
        this.sideDataSize = value;
    }

}
