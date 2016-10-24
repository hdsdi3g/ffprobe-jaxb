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
 * <p>Classe Java pour chapterType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="chapterType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tag" type="{http://www.ffmpeg.org/schema/ffprobe}tagType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="time_base" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="start" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="start_time" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="end" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="end_time" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "chapterType", propOrder = {
    "tag"
})
public class ChapterType {

    protected List<TagType> tag;
    @XmlAttribute(name = "id", required = true)
    protected int id;
    @XmlAttribute(name = "time_base", required = true)
    protected String timeBase;
    @XmlAttribute(name = "start", required = true)
    protected int start;
    @XmlAttribute(name = "start_time")
    protected Float startTime;
    @XmlAttribute(name = "end", required = true)
    protected int end;
    @XmlAttribute(name = "end_time", required = true)
    protected float endTime;

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
     * Obtient la valeur de la propriété id.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Définit la valeur de la propriété id.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Obtient la valeur de la propriété timeBase.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeBase() {
        return timeBase;
    }

    /**
     * Définit la valeur de la propriété timeBase.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeBase(String value) {
        this.timeBase = value;
    }

    /**
     * Obtient la valeur de la propriété start.
     * 
     */
    public int getStart() {
        return start;
    }

    /**
     * Définit la valeur de la propriété start.
     * 
     */
    public void setStart(int value) {
        this.start = value;
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
     * Obtient la valeur de la propriété end.
     * 
     */
    public int getEnd() {
        return end;
    }

    /**
     * Définit la valeur de la propriété end.
     * 
     */
    public void setEnd(int value) {
        this.end = value;
    }

    /**
     * Obtient la valeur de la propriété endTime.
     * 
     */
    public float getEndTime() {
        return endTime;
    }

    /**
     * Définit la valeur de la propriété endTime.
     * 
     */
    public void setEndTime(float value) {
        this.endTime = value;
    }

}
