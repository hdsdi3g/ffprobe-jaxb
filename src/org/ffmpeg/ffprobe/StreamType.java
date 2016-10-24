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
 * <p>Classe Java pour streamType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="streamType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="disposition" type="{http://www.ffmpeg.org/schema/ffprobe}streamDispositionType" minOccurs="0"/>
 *         &lt;element name="tag" type="{http://www.ffmpeg.org/schema/ffprobe}tagType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="side_data_list" type="{http://www.ffmpeg.org/schema/ffprobe}packetSideDataListType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="index" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="codec_name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="codec_long_name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="profile" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="codec_type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="codec_time_base" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="codec_tag" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="codec_tag_string" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="extradata" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="extradata_hash" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="coded_width" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="coded_height" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="has_b_frames" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="sample_aspect_ratio" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="display_aspect_ratio" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pix_fmt" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="level" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="color_range" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="color_space" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="color_transfer" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="color_primaries" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="chroma_location" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="timecode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="refs" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="sample_fmt" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="sample_rate" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="channels" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="channel_layout" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="bits_per_sample" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="r_frame_rate" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="avg_frame_rate" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="time_base" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="start_pts" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="start_time" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="duration_ts" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="duration" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="bit_rate" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="max_bit_rate" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="bits_per_raw_sample" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="nb_frames" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="nb_read_frames" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="nb_read_packets" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "streamType", propOrder = {
    "disposition",
    "tag",
    "sideDataList"
})
public class StreamType {

    protected StreamDispositionType disposition;
    protected List<TagType> tag;
    @XmlElement(name = "side_data_list")
    protected PacketSideDataListType sideDataList;
    @XmlAttribute(name = "index", required = true)
    protected int index;
    @XmlAttribute(name = "codec_name")
    protected String codecName;
    @XmlAttribute(name = "codec_long_name")
    protected String codecLongName;
    @XmlAttribute(name = "profile")
    protected String profile;
    @XmlAttribute(name = "codec_type")
    protected String codecType;
    @XmlAttribute(name = "codec_time_base", required = true)
    protected String codecTimeBase;
    @XmlAttribute(name = "codec_tag", required = true)
    protected String codecTag;
    @XmlAttribute(name = "codec_tag_string", required = true)
    protected String codecTagString;
    @XmlAttribute(name = "extradata")
    protected String extradata;
    @XmlAttribute(name = "extradata_hash")
    protected String extradataHash;
    @XmlAttribute(name = "width")
    protected Integer width;
    @XmlAttribute(name = "height")
    protected Integer height;
    @XmlAttribute(name = "coded_width")
    protected Integer codedWidth;
    @XmlAttribute(name = "coded_height")
    protected Integer codedHeight;
    @XmlAttribute(name = "has_b_frames")
    protected Integer hasBFrames;
    @XmlAttribute(name = "sample_aspect_ratio")
    protected String sampleAspectRatio;
    @XmlAttribute(name = "display_aspect_ratio")
    protected String displayAspectRatio;
    @XmlAttribute(name = "pix_fmt")
    protected String pixFmt;
    @XmlAttribute(name = "level")
    protected Integer level;
    @XmlAttribute(name = "color_range")
    protected String colorRange;
    @XmlAttribute(name = "color_space")
    protected String colorSpace;
    @XmlAttribute(name = "color_transfer")
    protected String colorTransfer;
    @XmlAttribute(name = "color_primaries")
    protected String colorPrimaries;
    @XmlAttribute(name = "chroma_location")
    protected String chromaLocation;
    @XmlAttribute(name = "timecode")
    protected String timecode;
    @XmlAttribute(name = "refs")
    protected Integer refs;
    @XmlAttribute(name = "sample_fmt")
    protected String sampleFmt;
    @XmlAttribute(name = "sample_rate")
    protected Integer sampleRate;
    @XmlAttribute(name = "channels")
    protected Integer channels;
    @XmlAttribute(name = "channel_layout")
    protected String channelLayout;
    @XmlAttribute(name = "bits_per_sample")
    protected Integer bitsPerSample;
    @XmlAttribute(name = "id")
    protected String id;
    @XmlAttribute(name = "r_frame_rate", required = true)
    protected String rFrameRate;
    @XmlAttribute(name = "avg_frame_rate", required = true)
    protected String avgFrameRate;
    @XmlAttribute(name = "time_base", required = true)
    protected String timeBase;
    @XmlAttribute(name = "start_pts")
    protected Long startPts;
    @XmlAttribute(name = "start_time")
    protected Float startTime;
    @XmlAttribute(name = "duration_ts")
    protected Long durationTs;
    @XmlAttribute(name = "duration")
    protected Float duration;
    @XmlAttribute(name = "bit_rate")
    protected Integer bitRate;
    @XmlAttribute(name = "max_bit_rate")
    protected Integer maxBitRate;
    @XmlAttribute(name = "bits_per_raw_sample")
    protected Integer bitsPerRawSample;
    @XmlAttribute(name = "nb_frames")
    protected Integer nbFrames;
    @XmlAttribute(name = "nb_read_frames")
    protected Integer nbReadFrames;
    @XmlAttribute(name = "nb_read_packets")
    protected Integer nbReadPackets;

    /**
     * Obtient la valeur de la propriété disposition.
     * 
     * @return
     *     possible object is
     *     {@link StreamDispositionType }
     *     
     */
    public StreamDispositionType getDisposition() {
        return disposition;
    }

    /**
     * Définit la valeur de la propriété disposition.
     * 
     * @param value
     *     allowed object is
     *     {@link StreamDispositionType }
     *     
     */
    public void setDisposition(StreamDispositionType value) {
        this.disposition = value;
    }

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
     * Obtient la valeur de la propriété index.
     * 
     */
    public int getIndex() {
        return index;
    }

    /**
     * Définit la valeur de la propriété index.
     * 
     */
    public void setIndex(int value) {
        this.index = value;
    }

    /**
     * Obtient la valeur de la propriété codecName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodecName() {
        return codecName;
    }

    /**
     * Définit la valeur de la propriété codecName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodecName(String value) {
        this.codecName = value;
    }

    /**
     * Obtient la valeur de la propriété codecLongName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodecLongName() {
        return codecLongName;
    }

    /**
     * Définit la valeur de la propriété codecLongName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodecLongName(String value) {
        this.codecLongName = value;
    }

    /**
     * Obtient la valeur de la propriété profile.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfile() {
        return profile;
    }

    /**
     * Définit la valeur de la propriété profile.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfile(String value) {
        this.profile = value;
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
     * Obtient la valeur de la propriété codecTimeBase.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodecTimeBase() {
        return codecTimeBase;
    }

    /**
     * Définit la valeur de la propriété codecTimeBase.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodecTimeBase(String value) {
        this.codecTimeBase = value;
    }

    /**
     * Obtient la valeur de la propriété codecTag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodecTag() {
        return codecTag;
    }

    /**
     * Définit la valeur de la propriété codecTag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodecTag(String value) {
        this.codecTag = value;
    }

    /**
     * Obtient la valeur de la propriété codecTagString.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodecTagString() {
        return codecTagString;
    }

    /**
     * Définit la valeur de la propriété codecTagString.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodecTagString(String value) {
        this.codecTagString = value;
    }

    /**
     * Obtient la valeur de la propriété extradata.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtradata() {
        return extradata;
    }

    /**
     * Définit la valeur de la propriété extradata.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtradata(String value) {
        this.extradata = value;
    }

    /**
     * Obtient la valeur de la propriété extradataHash.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtradataHash() {
        return extradataHash;
    }

    /**
     * Définit la valeur de la propriété extradataHash.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtradataHash(String value) {
        this.extradataHash = value;
    }

    /**
     * Obtient la valeur de la propriété width.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getWidth() {
        return width;
    }

    /**
     * Définit la valeur de la propriété width.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setWidth(Integer value) {
        this.width = value;
    }

    /**
     * Obtient la valeur de la propriété height.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHeight() {
        return height;
    }

    /**
     * Définit la valeur de la propriété height.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHeight(Integer value) {
        this.height = value;
    }

    /**
     * Obtient la valeur de la propriété codedWidth.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodedWidth() {
        return codedWidth;
    }

    /**
     * Définit la valeur de la propriété codedWidth.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodedWidth(Integer value) {
        this.codedWidth = value;
    }

    /**
     * Obtient la valeur de la propriété codedHeight.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodedHeight() {
        return codedHeight;
    }

    /**
     * Définit la valeur de la propriété codedHeight.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodedHeight(Integer value) {
        this.codedHeight = value;
    }

    /**
     * Obtient la valeur de la propriété hasBFrames.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHasBFrames() {
        return hasBFrames;
    }

    /**
     * Définit la valeur de la propriété hasBFrames.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHasBFrames(Integer value) {
        this.hasBFrames = value;
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
     * Obtient la valeur de la propriété displayAspectRatio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayAspectRatio() {
        return displayAspectRatio;
    }

    /**
     * Définit la valeur de la propriété displayAspectRatio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayAspectRatio(String value) {
        this.displayAspectRatio = value;
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
     * Obtient la valeur de la propriété level.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * Définit la valeur de la propriété level.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLevel(Integer value) {
        this.level = value;
    }

    /**
     * Obtient la valeur de la propriété colorRange.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorRange() {
        return colorRange;
    }

    /**
     * Définit la valeur de la propriété colorRange.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorRange(String value) {
        this.colorRange = value;
    }

    /**
     * Obtient la valeur de la propriété colorSpace.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorSpace() {
        return colorSpace;
    }

    /**
     * Définit la valeur de la propriété colorSpace.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorSpace(String value) {
        this.colorSpace = value;
    }

    /**
     * Obtient la valeur de la propriété colorTransfer.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorTransfer() {
        return colorTransfer;
    }

    /**
     * Définit la valeur de la propriété colorTransfer.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorTransfer(String value) {
        this.colorTransfer = value;
    }

    /**
     * Obtient la valeur de la propriété colorPrimaries.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorPrimaries() {
        return colorPrimaries;
    }

    /**
     * Définit la valeur de la propriété colorPrimaries.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorPrimaries(String value) {
        this.colorPrimaries = value;
    }

    /**
     * Obtient la valeur de la propriété chromaLocation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChromaLocation() {
        return chromaLocation;
    }

    /**
     * Définit la valeur de la propriété chromaLocation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChromaLocation(String value) {
        this.chromaLocation = value;
    }

    /**
     * Obtient la valeur de la propriété timecode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimecode() {
        return timecode;
    }

    /**
     * Définit la valeur de la propriété timecode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimecode(String value) {
        this.timecode = value;
    }

    /**
     * Obtient la valeur de la propriété refs.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRefs() {
        return refs;
    }

    /**
     * Définit la valeur de la propriété refs.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRefs(Integer value) {
        this.refs = value;
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
     * Obtient la valeur de la propriété sampleRate.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSampleRate() {
        return sampleRate;
    }

    /**
     * Définit la valeur de la propriété sampleRate.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSampleRate(Integer value) {
        this.sampleRate = value;
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
     * Obtient la valeur de la propriété bitsPerSample.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBitsPerSample() {
        return bitsPerSample;
    }

    /**
     * Définit la valeur de la propriété bitsPerSample.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBitsPerSample(Integer value) {
        this.bitsPerSample = value;
    }

    /**
     * Obtient la valeur de la propriété id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Définit la valeur de la propriété id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Obtient la valeur de la propriété rFrameRate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRFrameRate() {
        return rFrameRate;
    }

    /**
     * Définit la valeur de la propriété rFrameRate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRFrameRate(String value) {
        this.rFrameRate = value;
    }

    /**
     * Obtient la valeur de la propriété avgFrameRate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvgFrameRate() {
        return avgFrameRate;
    }

    /**
     * Définit la valeur de la propriété avgFrameRate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvgFrameRate(String value) {
        this.avgFrameRate = value;
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
     * Obtient la valeur de la propriété durationTs.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDurationTs() {
        return durationTs;
    }

    /**
     * Définit la valeur de la propriété durationTs.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDurationTs(Long value) {
        this.durationTs = value;
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
     * Obtient la valeur de la propriété bitRate.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBitRate() {
        return bitRate;
    }

    /**
     * Définit la valeur de la propriété bitRate.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBitRate(Integer value) {
        this.bitRate = value;
    }

    /**
     * Obtient la valeur de la propriété maxBitRate.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxBitRate() {
        return maxBitRate;
    }

    /**
     * Définit la valeur de la propriété maxBitRate.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxBitRate(Integer value) {
        this.maxBitRate = value;
    }

    /**
     * Obtient la valeur de la propriété bitsPerRawSample.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBitsPerRawSample() {
        return bitsPerRawSample;
    }

    /**
     * Définit la valeur de la propriété bitsPerRawSample.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBitsPerRawSample(Integer value) {
        this.bitsPerRawSample = value;
    }

    /**
     * Obtient la valeur de la propriété nbFrames.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNbFrames() {
        return nbFrames;
    }

    /**
     * Définit la valeur de la propriété nbFrames.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNbFrames(Integer value) {
        this.nbFrames = value;
    }

    /**
     * Obtient la valeur de la propriété nbReadFrames.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNbReadFrames() {
        return nbReadFrames;
    }

    /**
     * Définit la valeur de la propriété nbReadFrames.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNbReadFrames(Integer value) {
        this.nbReadFrames = value;
    }

    /**
     * Obtient la valeur de la propriété nbReadPackets.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNbReadPackets() {
        return nbReadPackets;
    }

    /**
     * Définit la valeur de la propriété nbReadPackets.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNbReadPackets(Integer value) {
        this.nbReadPackets = value;
    }

}
