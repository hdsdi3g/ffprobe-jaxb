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
 * <p>Classe Java pour frameType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="frameType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tag" type="{http://www.ffmpeg.org/schema/ffprobe}tagType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="side_data_list" type="{http://www.ffmpeg.org/schema/ffprobe}frameSideDataListType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="media_type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="stream_index" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="key_frame" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="pts" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="pts_time" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="pkt_pts" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="pkt_pts_time" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="pkt_dts" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="pkt_dts_time" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="best_effort_timestamp" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="best_effort_timestamp_time" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="pkt_duration" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="pkt_duration_time" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="pkt_pos" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="pkt_size" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="sample_fmt" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="nb_samples" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="channels" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="channel_layout" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="pix_fmt" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="sample_aspect_ratio" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pict_type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="coded_picture_number" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="display_picture_number" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="interlaced_frame" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="top_field_first" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="repeat_pict" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "frameType", propOrder = {
    "tag",
    "sideDataList"
})
public class FrameType {

    protected List<TagType> tag;
    @XmlElement(name = "side_data_list")
    protected FrameSideDataListType sideDataList;
    @XmlAttribute(name = "media_type", required = true)
    protected String mediaType;
    @XmlAttribute(name = "stream_index")
    protected Integer streamIndex;
    @XmlAttribute(name = "key_frame", required = true)
    protected int keyFrame;
    @XmlAttribute(name = "pts")
    protected Long pts;
    @XmlAttribute(name = "pts_time")
    protected Float ptsTime;
    @XmlAttribute(name = "pkt_pts")
    protected Long pktPts;
    @XmlAttribute(name = "pkt_pts_time")
    protected Float pktPtsTime;
    @XmlAttribute(name = "pkt_dts")
    protected Long pktDts;
    @XmlAttribute(name = "pkt_dts_time")
    protected Float pktDtsTime;
    @XmlAttribute(name = "best_effort_timestamp")
    protected Long bestEffortTimestamp;
    @XmlAttribute(name = "best_effort_timestamp_time")
    protected Float bestEffortTimestampTime;
    @XmlAttribute(name = "pkt_duration")
    protected Long pktDuration;
    @XmlAttribute(name = "pkt_duration_time")
    protected Float pktDurationTime;
    @XmlAttribute(name = "pkt_pos")
    protected Long pktPos;
    @XmlAttribute(name = "pkt_size")
    protected Integer pktSize;
    @XmlAttribute(name = "sample_fmt")
    protected String sampleFmt;
    @XmlAttribute(name = "nb_samples")
    protected Long nbSamples;
    @XmlAttribute(name = "channels")
    protected Integer channels;
    @XmlAttribute(name = "channel_layout")
    protected String channelLayout;
    @XmlAttribute(name = "width")
    protected Long width;
    @XmlAttribute(name = "height")
    protected Long height;
    @XmlAttribute(name = "pix_fmt")
    protected String pixFmt;
    @XmlAttribute(name = "sample_aspect_ratio")
    protected String sampleAspectRatio;
    @XmlAttribute(name = "pict_type")
    protected String pictType;
    @XmlAttribute(name = "coded_picture_number")
    protected Long codedPictureNumber;
    @XmlAttribute(name = "display_picture_number")
    protected Long displayPictureNumber;
    @XmlAttribute(name = "interlaced_frame")
    protected Integer interlacedFrame;
    @XmlAttribute(name = "top_field_first")
    protected Integer topFieldFirst;
    @XmlAttribute(name = "repeat_pict")
    protected Integer repeatPict;

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
     *     {@link FrameSideDataListType }
     *     
     */
    public FrameSideDataListType getSideDataList() {
        return sideDataList;
    }

    /**
     * Définit la valeur de la propriété sideDataList.
     * 
     * @param value
     *     allowed object is
     *     {@link FrameSideDataListType }
     *     
     */
    public void setSideDataList(FrameSideDataListType value) {
        this.sideDataList = value;
    }

    /**
     * Obtient la valeur de la propriété mediaType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaType() {
        return mediaType;
    }

    /**
     * Définit la valeur de la propriété mediaType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaType(String value) {
        this.mediaType = value;
    }

    /**
     * Obtient la valeur de la propriété streamIndex.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStreamIndex() {
        return streamIndex;
    }

    /**
     * Définit la valeur de la propriété streamIndex.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStreamIndex(Integer value) {
        this.streamIndex = value;
    }

    /**
     * Obtient la valeur de la propriété keyFrame.
     * 
     */
    public int getKeyFrame() {
        return keyFrame;
    }

    /**
     * Définit la valeur de la propriété keyFrame.
     * 
     */
    public void setKeyFrame(int value) {
        this.keyFrame = value;
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
     * Obtient la valeur de la propriété pktPts.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPktPts() {
        return pktPts;
    }

    /**
     * Définit la valeur de la propriété pktPts.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPktPts(Long value) {
        this.pktPts = value;
    }

    /**
     * Obtient la valeur de la propriété pktPtsTime.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPktPtsTime() {
        return pktPtsTime;
    }

    /**
     * Définit la valeur de la propriété pktPtsTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPktPtsTime(Float value) {
        this.pktPtsTime = value;
    }

    /**
     * Obtient la valeur de la propriété pktDts.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPktDts() {
        return pktDts;
    }

    /**
     * Définit la valeur de la propriété pktDts.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPktDts(Long value) {
        this.pktDts = value;
    }

    /**
     * Obtient la valeur de la propriété pktDtsTime.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPktDtsTime() {
        return pktDtsTime;
    }

    /**
     * Définit la valeur de la propriété pktDtsTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPktDtsTime(Float value) {
        this.pktDtsTime = value;
    }

    /**
     * Obtient la valeur de la propriété bestEffortTimestamp.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBestEffortTimestamp() {
        return bestEffortTimestamp;
    }

    /**
     * Définit la valeur de la propriété bestEffortTimestamp.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBestEffortTimestamp(Long value) {
        this.bestEffortTimestamp = value;
    }

    /**
     * Obtient la valeur de la propriété bestEffortTimestampTime.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getBestEffortTimestampTime() {
        return bestEffortTimestampTime;
    }

    /**
     * Définit la valeur de la propriété bestEffortTimestampTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setBestEffortTimestampTime(Float value) {
        this.bestEffortTimestampTime = value;
    }

    /**
     * Obtient la valeur de la propriété pktDuration.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPktDuration() {
        return pktDuration;
    }

    /**
     * Définit la valeur de la propriété pktDuration.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPktDuration(Long value) {
        this.pktDuration = value;
    }

    /**
     * Obtient la valeur de la propriété pktDurationTime.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPktDurationTime() {
        return pktDurationTime;
    }

    /**
     * Définit la valeur de la propriété pktDurationTime.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPktDurationTime(Float value) {
        this.pktDurationTime = value;
    }

    /**
     * Obtient la valeur de la propriété pktPos.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPktPos() {
        return pktPos;
    }

    /**
     * Définit la valeur de la propriété pktPos.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPktPos(Long value) {
        this.pktPos = value;
    }

    /**
     * Obtient la valeur de la propriété pktSize.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPktSize() {
        return pktSize;
    }

    /**
     * Définit la valeur de la propriété pktSize.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPktSize(Integer value) {
        this.pktSize = value;
    }

    /**
     * Obtient la valeur de la propriété sampleFmt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSampleFmt() {
        return sampleFmt;
    }

    /**
     * Définit la valeur de la propriété sampleFmt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSampleFmt(String value) {
        this.sampleFmt = value;
    }

    /**
     * Obtient la valeur de la propriété nbSamples.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNbSamples() {
        return nbSamples;
    }

    /**
     * Définit la valeur de la propriété nbSamples.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNbSamples(Long value) {
        this.nbSamples = value;
    }

    /**
     * Obtient la valeur de la propriété channels.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getChannels() {
        return channels;
    }

    /**
     * Définit la valeur de la propriété channels.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setChannels(Integer value) {
        this.channels = value;
    }

    /**
     * Obtient la valeur de la propriété channelLayout.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelLayout() {
        return channelLayout;
    }

    /**
     * Définit la valeur de la propriété channelLayout.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelLayout(String value) {
        this.channelLayout = value;
    }

    /**
     * Obtient la valeur de la propriété width.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getWidth() {
        return width;
    }

    /**
     * Définit la valeur de la propriété width.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setWidth(Long value) {
        this.width = value;
    }

    /**
     * Obtient la valeur de la propriété height.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getHeight() {
        return height;
    }

    /**
     * Définit la valeur de la propriété height.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHeight(Long value) {
        this.height = value;
    }

    /**
     * Obtient la valeur de la propriété pixFmt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPixFmt() {
        return pixFmt;
    }

    /**
     * Définit la valeur de la propriété pixFmt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPixFmt(String value) {
        this.pixFmt = value;
    }

    /**
     * Obtient la valeur de la propriété sampleAspectRatio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSampleAspectRatio() {
        return sampleAspectRatio;
    }

    /**
     * Définit la valeur de la propriété sampleAspectRatio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSampleAspectRatio(String value) {
        this.sampleAspectRatio = value;
    }

    /**
     * Obtient la valeur de la propriété pictType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPictType() {
        return pictType;
    }

    /**
     * Définit la valeur de la propriété pictType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPictType(String value) {
        this.pictType = value;
    }

    /**
     * Obtient la valeur de la propriété codedPictureNumber.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCodedPictureNumber() {
        return codedPictureNumber;
    }

    /**
     * Définit la valeur de la propriété codedPictureNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCodedPictureNumber(Long value) {
        this.codedPictureNumber = value;
    }

    /**
     * Obtient la valeur de la propriété displayPictureNumber.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDisplayPictureNumber() {
        return displayPictureNumber;
    }

    /**
     * Définit la valeur de la propriété displayPictureNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDisplayPictureNumber(Long value) {
        this.displayPictureNumber = value;
    }

    /**
     * Obtient la valeur de la propriété interlacedFrame.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInterlacedFrame() {
        return interlacedFrame;
    }

    /**
     * Définit la valeur de la propriété interlacedFrame.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInterlacedFrame(Integer value) {
        this.interlacedFrame = value;
    }

    /**
     * Obtient la valeur de la propriété topFieldFirst.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTopFieldFirst() {
        return topFieldFirst;
    }

    /**
     * Définit la valeur de la propriété topFieldFirst.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTopFieldFirst(Integer value) {
        this.topFieldFirst = value;
    }

    /**
     * Obtient la valeur de la propriété repeatPict.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRepeatPict() {
        return repeatPict;
    }

    /**
     * Définit la valeur de la propriété repeatPict.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRepeatPict(Integer value) {
        this.repeatPict = value;
    }

}
