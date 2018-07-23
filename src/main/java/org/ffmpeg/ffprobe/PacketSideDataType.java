
package org.ffmpeg.ffprobe;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for packetSideDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected         content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="packetSideDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="side_data_type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="side_data_size" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "packetSideDataType")
public class PacketSideDataType {

    @XmlAttribute(name = "side_data_type")
    protected String sideDataType;
    @XmlAttribute(name = "side_data_size")
    protected Integer sideDataSize;

    /**
     * Gets the value of the sideDataType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSideDataType() {
        return sideDataType;
    }

    /**
     * Sets the value of the sideDataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSideDataType(String value) {
        this.sideDataType = value;
    }

    /**
     * Gets the value of the sideDataSize property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSideDataSize() {
        return sideDataSize;
    }

    /**
     * Sets the value of the sideDataSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSideDataSize(Integer value) {
        this.sideDataSize = value;
    }

}
