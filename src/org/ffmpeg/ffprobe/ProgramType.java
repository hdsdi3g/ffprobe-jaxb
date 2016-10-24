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
 * <p>Classe Java pour programType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="programType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tag" type="{http://www.ffmpeg.org/schema/ffprobe}tagType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="streams" type="{http://www.ffmpeg.org/schema/ffprobe}streamsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="program_id" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="program_num" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="nb_streams" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="start_time" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="start_pts" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="end_time" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="end_pts" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="pmt_pid" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="pcr_pid" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "programType", propOrder = {
    "tag",
    "streams"
})
public class ProgramType {

    protected List<TagType> tag;
    protected StreamsType streams;
    @XmlAttribute(name = "program_id", required = true)
    protected int programId;
    @XmlAttribute(name = "program_num", required = true)
    protected int programNum;
    @XmlAttribute(name = "nb_streams", required = true)
    protected int nbStreams;
    @XmlAttribute(name = "start_time")
    protected Float startTime;
    @XmlAttribute(name = "start_pts")
    protected Long startPts;
    @XmlAttribute(name = "end_time")
    protected Float endTime;
    @XmlAttribute(name = "end_pts")
    protected Long endPts;
    @XmlAttribute(name = "pmt_pid", required = true)
    protected int pmtPid;
    @XmlAttribute(name = "pcr_pid", required = true)
    protected int pcrPid;

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
     * Obtient la valeur de la propriété streams.
     * 
     * @return
     *     possible object is
     *     {@link StreamsType }
     *     
     */
    public StreamsType getStreams() {
        return streams;
    }

    /**
     * Définit la valeur de la propriété streams.
     * 
     * @param value
     *     allowed object is
     *     {@link StreamsType }
     *     
     */
    public void setStreams(StreamsType value) {
        this.streams = value;
    }

    /**
     * Obtient la valeur de la propriété programId.
     * 
     */
    public int getProgramId() {
        return programId;
    }

    /**
     * Définit la valeur de la propriété programId.
     * 
     */
    public void setProgramId(int value) {
        this.programId = value;
    }

    /**
     * Obtient la valeur de la propriété programNum.
     * 
     */
    public int getProgramNum() {
        return programNum;
    }

    /**
     * Définit la valeur de la propriété programNum.
     * 
     */
    public void setProgramNum(int value) {
        this.programNum = value;
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
     * Obtient la valeur de la propriété startPts.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getStartPts() {
        return startPts;
    }

    /**
     * Définit la valeur de la propriété startPts.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setStartPts(Long value) {
        this.startPts = value;
    }

    /**
     * Obtient la valeur de la propriété endTime.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getEndTime() {
        return endTime;
    }

    /**
     * Définit la valeur de la propriété endTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setEndTime(Float value) {
        this.endTime = value;
    }

    /**
     * Obtient la valeur de la propriété endPts.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEndPts() {
        return endPts;
    }

    /**
     * Définit la valeur de la propriété endPts.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEndPts(Long value) {
        this.endPts = value;
    }

    /**
     * Obtient la valeur de la propriété pmtPid.
     * 
     */
    public int getPmtPid() {
        return pmtPid;
    }

    /**
     * Définit la valeur de la propriété pmtPid.
     * 
     */
    public void setPmtPid(int value) {
        this.pmtPid = value;
    }

    /**
     * Obtient la valeur de la propriété pcrPid.
     * 
     */
    public int getPcrPid() {
        return pcrPid;
    }

    /**
     * Définit la valeur de la propriété pcrPid.
     * 
     */
    public void setPcrPid(int value) {
        this.pcrPid = value;
    }

}
