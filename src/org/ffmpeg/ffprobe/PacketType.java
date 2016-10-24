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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour packetType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="packetType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tag" type="{http://www.ffmpeg.org/schema/ffprobe}tagType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="side_data_list" type="{http://www.ffmpeg.org/schema/ffprobe}packetSideDataListType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="codec_type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="stream_index" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="pts" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="pts_time" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="dts" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="dts_time" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="duration" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="duration_time" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="convergence_duration" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="convergence_duration_time" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="size" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="pos" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="flags" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="data" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="data_hash" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "packetType", propOrder = {
    "tag",
    "sideDataList"
})
public class PacketType {

    protected List<TagType> tag;
    @XmlElement(name = "side_data_list")
    protected PacketSideDataListType sideDataList;
    @XmlAttribute(name = "codec_type", required = true)
    protected String codecType;
    @XmlAttribute(name = "stream_index", required = true)
    protected int streamIndex;
    @XmlAttribute(name = "pts")
    protected Long pts;
    @XmlAttribute(name = "pts_time")
    protected Float ptsTime;
    @XmlAttribute(name = "dts")
    protected Long dts;
    @XmlAttribute(name = "dts_time")
    protected Float dtsTime;
    @XmlAttribute(name = "duration")
    protected Long duration;
    @XmlAttribute(name = "duration_time")
    protected Float durationTime;
    @XmlAttribute(name = "convergence_duration")
    protected Long convergenceDuration;
    @XmlAttribute(name = "convergence_duration_time")
    protected Float convergenceDurationTime;
    @XmlAttribute(name = "size", required = true)
    protected long size;
    @XmlAttribute(name = "pos")
    protected Long pos;
    @XmlAttribute(name = "flags", required = true)
    protected String flags;
    @XmlAttribute(name = "data")
    protected String data;
    @XmlAttribute(name = "data_hash")
    protected String dataHash;

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
     * Obtient la valeur de la propriété sideDataList.
     * 
     * @return
     *     possible object is
     *     {@link PacketSideDataListType }
     *     
     */
    public PacketSideDataListType getSideDataList() {
        return sideDataList;
    }

    /**
     * Définit la valeur de la propriété sideDataList.
     * 
     * @param value
     *     allowed object is
     *     {@link PacketSideDataListType }
     *     
     */
    public void setSideDataList(PacketSideDataListType value) {
        this.sideDataList = value;
    }

    /**
     * Obtient la valeur de la propriété codecType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodecType() {
        return codecType;
    }

    /**
     * Définit la valeur de la propriété codecType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodecType(String value) {
        this.codecType = value;
    }

    /**
     * Obtient la valeur de la propriété streamIndex.
     * 
     */
    public int getStreamIndex() {
        return streamIndex;
    }

    /**
     * Définit la valeur de la propriété streamIndex.
     * 
     */
    public void setStreamIndex(int value) {
        this.streamIndex = value;
    }

    /**
     * Obtient la valeur de la propriété pts.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPts() {
        return pts;
    }

    /**
     * Définit la valeur de la propriété pts.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPts(Long value) {
        this.pts = value;
    }

    /**
     * Obtient la valeur de la propriété ptsTime.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPtsTime() {
        return ptsTime;
    }

    /**
     * Définit la valeur de la propriété ptsTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPtsTime(Float value) {
        this.ptsTime = value;
    }

    /**
     * Obtient la valeur de la propriété dts.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDts() {
        return dts;
    }

    /**
     * Définit la valeur de la propriété dts.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDts(Long value) {
        this.dts = value;
    }

    /**
     * Obtient la valeur de la propriété dtsTime.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDtsTime() {
        return dtsTime;
    }

    /**
     * Définit la valeur de la propriété dtsTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDtsTime(Float value) {
        this.dtsTime = value;
    }

    /**
     * Obtient la valeur de la propriété duration.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDuration() {
        return duration;
    }

    /**
     * Définit la valeur de la propriété duration.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDuration(Long value) {
        this.duration = value;
    }

    /**
     * Obtient la valeur de la propriété durationTime.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDurationTime() {
        return durationTime;
    }

    /**
     * Définit la valeur de la propriété durationTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDurationTime(Float value) {
        this.durationTime = value;
    }

    /**
     * Obtient la valeur de la propriété convergenceDuration.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getConvergenceDuration() {
        return convergenceDuration;
    }

    /**
     * Définit la valeur de la propriété convergenceDuration.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setConvergenceDuration(Long value) {
        this.convergenceDuration = value;
    }

    /**
     * Obtient la valeur de la propriété convergenceDurationTime.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getConvergenceDurationTime() {
        return convergenceDurationTime;
    }

    /**
     * Définit la valeur de la propriété convergenceDurationTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setConvergenceDurationTime(Float value) {
        this.convergenceDurationTime = value;
    }

    /**
     * Obtient la valeur de la propriété size.
     * 
     */
    public long getSize() {
        return size;
    }

    /**
     * Définit la valeur de la propriété size.
     * 
     */
    public void setSize(long value) {
        this.size = value;
    }

    /**
     * Obtient la valeur de la propriété pos.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPos() {
        return pos;
    }

    /**
     * Définit la valeur de la propriété pos.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPos(Long value) {
        this.pos = value;
    }

    /**
     * Obtient la valeur de la propriété flags.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlags() {
        return flags;
    }

    /**
     * Définit la valeur de la propriété flags.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlags(String value) {
        this.flags = value;
    }

    /**
     * Obtient la valeur de la propriété data.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getData() {
        return data;
    }

    /**
     * Définit la valeur de la propriété data.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setData(String value) {
        this.data = value;
    }

    /**
     * Obtient la valeur de la propriété dataHash.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataHash() {
        return dataHash;
    }

    /**
     * Définit la valeur de la propriété dataHash.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataHash(String value) {
        this.dataHash = value;
    }

}
