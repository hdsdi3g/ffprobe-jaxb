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
 * <p>Classe Java pour programVersionType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="programVersionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="copyright" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="build_date" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="build_time" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="compiler_ident" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="configuration" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "programVersionType")
public class ProgramVersionType {

    @XmlAttribute(name = "version", required = true)
    protected String version;
    @XmlAttribute(name = "copyright", required = true)
    protected String copyright;
    @XmlAttribute(name = "build_date")
    protected String buildDate;
    @XmlAttribute(name = "build_time")
    protected String buildTime;
    @XmlAttribute(name = "compiler_ident", required = true)
    protected String compilerIdent;
    @XmlAttribute(name = "configuration", required = true)
    protected String configuration;

    /**
     * Obtient la valeur de la propriété version.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Définit la valeur de la propriété version.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Obtient la valeur de la propriété copyright.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCopyright() {
        return copyright;
    }

    /**
     * Définit la valeur de la propriété copyright.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCopyright(String value) {
        this.copyright = value;
    }

    /**
     * Obtient la valeur de la propriété buildDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuildDate() {
        return buildDate;
    }

    /**
     * Définit la valeur de la propriété buildDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuildDate(String value) {
        this.buildDate = value;
    }

    /**
     * Obtient la valeur de la propriété buildTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuildTime() {
        return buildTime;
    }

    /**
     * Définit la valeur de la propriété buildTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuildTime(String value) {
        this.buildTime = value;
    }

    /**
     * Obtient la valeur de la propriété compilerIdent.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompilerIdent() {
        return compilerIdent;
    }

    /**
     * Définit la valeur de la propriété compilerIdent.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompilerIdent(String value) {
        this.compilerIdent = value;
    }

    /**
     * Obtient la valeur de la propriété configuration.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfiguration() {
        return configuration;
    }

    /**
     * Définit la valeur de la propriété configuration.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfiguration(String value) {
        this.configuration = value;
    }

}
