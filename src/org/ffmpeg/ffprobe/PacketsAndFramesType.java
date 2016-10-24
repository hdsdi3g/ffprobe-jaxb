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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour packetsAndFramesType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="packetsAndFramesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="packet" type="{http://www.ffmpeg.org/schema/ffprobe}packetType" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="frame" type="{http://www.ffmpeg.org/schema/ffprobe}frameType" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="subtitle" type="{http://www.ffmpeg.org/schema/ffprobe}subtitleType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "packetsAndFramesType", propOrder = {
    "packetOrFrameOrSubtitle"
})
public class PacketsAndFramesType {

    @XmlElements({
        @XmlElement(name = "packet", type = PacketType.class),
        @XmlElement(name = "frame", type = FrameType.class),
        @XmlElement(name = "subtitle", type = SubtitleType.class)
    })
    protected List<Object> packetOrFrameOrSubtitle;

    /**
     * Gets the value of the packetOrFrameOrSubtitle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packetOrFrameOrSubtitle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPacketOrFrameOrSubtitle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PacketType }
     * {@link FrameType }
     * {@link SubtitleType }
     * 
     * 
     */
    public List<Object> getPacketOrFrameOrSubtitle() {
        if (packetOrFrameOrSubtitle == null) {
            packetOrFrameOrSubtitle = new ArrayList<Object>();
        }
        return this.packetOrFrameOrSubtitle;
    }

}
