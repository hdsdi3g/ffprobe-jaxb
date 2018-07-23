
package org.ffmpeg.ffprobe;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for framesType complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="framesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;element name="frame" type="{http://www.ffmpeg.org/schema/ffprobe}frameType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;element name="subtitle" type="{http://www.ffmpeg.org/schema/ffprobe}subtitleType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "framesType", propOrder = {
    "frameOrSubtitle"
})
public class FramesType {

    @XmlElements({
        @XmlElement(name = "frame", type = FrameType.class),
        @XmlElement(name = "subtitle", type = SubtitleType.class)
    })
    protected List<Object> frameOrSubtitle;

    /**
     * Gets the value of the frameOrSubtitle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the frameOrSubtitle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFrameOrSubtitle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FrameType }
     * {@link SubtitleType }
     * 
     * 
     */
    public List<Object> getFrameOrSubtitle() {
        if (frameOrSubtitle == null) {
            frameOrSubtitle = new ArrayList<Object>();
        }
        return this.frameOrSubtitle;
    }

}
