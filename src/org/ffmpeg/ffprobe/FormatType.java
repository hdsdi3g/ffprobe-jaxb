//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2016.10.08 à 10:32:23 PM CEST 
//


package org.ffmpeg.ffprobe;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour formatType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="formatType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tag" type="{http://www.ffmpeg.org/schema/ffprobe}tagType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="filename" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="nb_streams" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="nb_programs" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="format_name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="format_long_name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="start_time" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="duration" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="size" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="bit_rate" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="probe_score" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "formatType", propOrder = {
    "tag"
})
public class FormatType {

    protected List<TagType> tag;
    @XmlAttribute(name = "filename", required = true)
    protected String filename;
    @XmlAttribute(name = "nb_streams", required = true)
    protected int nbStreams;
    @XmlAttribute(name = "nb_programs", required = true)
    protected int nbPrograms;
    @XmlAttribute(name = "format_name", required = true)
    protected String formatName;
    @XmlAttribute(name = "format_long_name")
    protected String formatLongName;
    @XmlAttribute(name = "start_time")
    protected Float startTime;
    @XmlAttribute(name = "duration")
    protected Float duration;
    @XmlAttribute(name = "size")
    protected Long size;
    @XmlAttribute(name = "bit_rate")
    protected Long bitRate;
    @XmlAttribute(name = "probe_score")
    protected Integer probeScore;

    /**
     * Gets the value of the tag property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tag property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTag().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TagType }
     * 
     * 
     */
    public List<TagType> getTag() {
        if (tag == null) {
            tag = new ArrayList<TagType>();
        }
        return this.tag;
    }

    /**
     * Obtient la valeur de la propriété filename.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilename() {
        return filename;
    }

    /**
     * Définit la valeur de la propriété filename.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilename(String value) {
        this.filename = value;
    }

    /**
     * Obtient la valeur de la propriété nbStreams.
     * 
     */
    public int getNbStreams() {
        return nbStreams;
    }

    /**
     * Définit la valeur de la propriété nbStreams.
     * 
     */
    public void setNbStreams(int value) {
        this.nbStreams = value;
    }

    /**
     * Obtient la valeur de la propriété nbPrograms.
     * 
     */
    public int getNbPrograms() {
        return nbPrograms;
    }

    /**
     * Définit la valeur de la propriété nbPrograms.
     * 
     */
    public void setNbPrograms(int value) {
        this.nbPrograms = value;
    }

    /**
     * Obtient la valeur de la propriété formatName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormatName() {
        return formatName;
    }

    /**
     * Définit la valeur de la propriété formatName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormatName(String value) {
        this.formatName = value;
    }

    /**
     * Obtient la valeur de la propriété formatLongName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormatLongName() {
        return formatLongName;
    }

    /**
     * Définit la valeur de la propriété formatLongName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormatLongName(String value) {
        this.formatLongName = value;
    }

    /**
     * Obtient la valeur de la propriété startTime.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getStartTime() {
        return startTime;
    }

    /**
     * Définit la valeur de la propriété startTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setStartTime(Float value) {
        this.startTime = value;
    }

    /**
     * Obtient la valeur de la propriété duration.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDuration() {
        return duration;
    }

    /**
     * Définit la valeur de la propriété duration.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDuration(Float value) {
        this.duration = value;
    }

    /**
     * Obtient la valeur de la propriété size.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSize() {
        return size;
    }

    /**
     * Définit la valeur de la propriété size.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSize(Long value) {
        this.size = value;
    }

    /**
     * Obtient la valeur de la propriété bitRate.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBitRate() {
        return bitRate;
    }

    /**
     * Définit la valeur de la propriété bitRate.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBitRate(Long value) {
        this.bitRate = value;
    }

    /**
     * Obtient la valeur de la propriété probeScore.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProbeScore() {
        return probeScore;
    }

    /**
     * Définit la valeur de la propriété probeScore.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProbeScore(Integer value) {
        this.probeScore = value;
    }

}
