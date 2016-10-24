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
 * <p>Classe Java pour pixelFormatType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="pixelFormatType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="flags" type="{http://www.ffmpeg.org/schema/ffprobe}pixelFormatFlagsType" minOccurs="0"/>
 *         &lt;element name="components" type="{http://www.ffmpeg.org/schema/ffprobe}pixelFormatComponentsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="nb_components" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="log2_chroma_w" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="log2_chroma_h" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="bits_per_pixel" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pixelFormatType", propOrder = {
    "flags",
    "components"
})
public class PixelFormatType {

    protected PixelFormatFlagsType flags;
    protected PixelFormatComponentsType components;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "nb_components", required = true)
    protected int nbComponents;
    @XmlAttribute(name = "log2_chroma_w")
    protected Integer log2ChromaW;
    @XmlAttribute(name = "log2_chroma_h")
    protected Integer log2ChromaH;
    @XmlAttribute(name = "bits_per_pixel")
    protected Integer bitsPerPixel;

    /**
     * Obtient la valeur de la propriété flags.
     * 
     * @return
     *     possible object is
     *     {@link PixelFormatFlagsType }
     *     
     */
    public PixelFormatFlagsType getFlags() {
        return flags;
    }

    /**
     * Définit la valeur de la propriété flags.
     * 
     * @param value
     *     allowed object is
     *     {@link PixelFormatFlagsType }
     *     
     */
    public void setFlags(PixelFormatFlagsType value) {
        this.flags = value;
    }

    /**
     * Obtient la valeur de la propriété components.
     * 
     * @return
     *     possible object is
     *     {@link PixelFormatComponentsType }
     *     
     */
    public PixelFormatComponentsType getComponents() {
        return components;
    }

    /**
     * Définit la valeur de la propriété components.
     * 
     * @param value
     *     allowed object is
     *     {@link PixelFormatComponentsType }
     *     
     */
    public void setComponents(PixelFormatComponentsType value) {
        this.components = value;
    }

    /**
     * Obtient la valeur de la propriété name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Définit la valeur de la propriété name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtient la valeur de la propriété nbComponents.
     * 
     */
    public int getNbComponents() {
        return nbComponents;
    }

    /**
     * Définit la valeur de la propriété nbComponents.
     * 
     */
    public void setNbComponents(int value) {
        this.nbComponents = value;
    }

    /**
     * Obtient la valeur de la propriété log2ChromaW.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLog2ChromaW() {
        return log2ChromaW;
    }

    /**
     * Définit la valeur de la propriété log2ChromaW.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLog2ChromaW(Integer value) {
        this.log2ChromaW = value;
    }

    /**
     * Obtient la valeur de la propriété log2ChromaH.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLog2ChromaH() {
        return log2ChromaH;
    }

    /**
     * Définit la valeur de la propriété log2ChromaH.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLog2ChromaH(Integer value) {
        this.log2ChromaH = value;
    }

    /**
     * Obtient la valeur de la propriété bitsPerPixel.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBitsPerPixel() {
        return bitsPerPixel;
    }

    /**
     * Définit la valeur de la propriété bitsPerPixel.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBitsPerPixel(Integer value) {
        this.bitsPerPixel = value;
    }

}
