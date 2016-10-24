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
 * <p>Classe Java pour libraryVersionType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="libraryVersionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="major" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="minor" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="micro" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="ident" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "libraryVersionType")
public class LibraryVersionType {

    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "major", required = true)
    protected int major;
    @XmlAttribute(name = "minor", required = true)
    protected int minor;
    @XmlAttribute(name = "micro", required = true)
    protected int micro;
    @XmlAttribute(name = "version", required = true)
    protected int version;
    @XmlAttribute(name = "ident", required = true)
    protected String ident;

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
     * Obtient la valeur de la propriété major.
     * 
     */
    public int getMajor() {
        return major;
    }

    /**
     * Définit la valeur de la propriété major.
     * 
     */
    public void setMajor(int value) {
        this.major = value;
    }

    /**
     * Obtient la valeur de la propriété minor.
     * 
     */
    public int getMinor() {
        return minor;
    }

    /**
     * Définit la valeur de la propriété minor.
     * 
     */
    public void setMinor(int value) {
        this.minor = value;
    }

    /**
     * Obtient la valeur de la propriété micro.
     * 
     */
    public int getMicro() {
        return micro;
    }

    /**
     * Définit la valeur de la propriété micro.
     * 
     */
    public void setMicro(int value) {
        this.micro = value;
    }

    /**
     * Obtient la valeur de la propriété version.
     * 
     */
    public int getVersion() {
        return version;
    }

    /**
     * Définit la valeur de la propriété version.
     * 
     */
    public void setVersion(int value) {
        this.version = value;
    }

    /**
     * Obtient la valeur de la propriété ident.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdent() {
        return ident;
    }

    /**
     * Définit la valeur de la propriété ident.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdent(String value) {
        this.ident = value;
    }

}
