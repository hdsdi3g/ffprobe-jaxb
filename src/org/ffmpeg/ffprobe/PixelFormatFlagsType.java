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
 * <p>Classe Java pour pixelFormatFlagsType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="pixelFormatFlagsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="big_endian" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="palette" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="bitstream" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="hwaccel" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="planar" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="rgb" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="pseudopal" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="alpha" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pixelFormatFlagsType")
public class PixelFormatFlagsType {

    @XmlAttribute(name = "big_endian", required = true)
    protected int bigEndian;
    @XmlAttribute(name = "palette", required = true)
    protected int palette;
    @XmlAttribute(name = "bitstream", required = true)
    protected int bitstream;
    @XmlAttribute(name = "hwaccel", required = true)
    protected int hwaccel;
    @XmlAttribute(name = "planar", required = true)
    protected int planar;
    @XmlAttribute(name = "rgb", required = true)
    protected int rgb;
    @XmlAttribute(name = "pseudopal", required = true)
    protected int pseudopal;
    @XmlAttribute(name = "alpha", required = true)
    protected int alpha;

    /**
     * Obtient la valeur de la propriété bigEndian.
     * 
     */
    public int getBigEndian() {
        return bigEndian;
    }

    /**
     * Définit la valeur de la propriété bigEndian.
     * 
     */
    public void setBigEndian(int value) {
        this.bigEndian = value;
    }

    /**
     * Obtient la valeur de la propriété palette.
     * 
     */
    public int getPalette() {
        return palette;
    }

    /**
     * Définit la valeur de la propriété palette.
     * 
     */
    public void setPalette(int value) {
        this.palette = value;
    }

    /**
     * Obtient la valeur de la propriété bitstream.
     * 
     */
    public int getBitstream() {
        return bitstream;
    }

    /**
     * Définit la valeur de la propriété bitstream.
     * 
     */
    public void setBitstream(int value) {
        this.bitstream = value;
    }

    /**
     * Obtient la valeur de la propriété hwaccel.
     * 
     */
    public int getHwaccel() {
        return hwaccel;
    }

    /**
     * Définit la valeur de la propriété hwaccel.
     * 
     */
    public void setHwaccel(int value) {
        this.hwaccel = value;
    }

    /**
     * Obtient la valeur de la propriété planar.
     * 
     */
    public int getPlanar() {
        return planar;
    }

    /**
     * Définit la valeur de la propriété planar.
     * 
     */
    public void setPlanar(int value) {
        this.planar = value;
    }

    /**
     * Obtient la valeur de la propriété rgb.
     * 
     */
    public int getRgb() {
        return rgb;
    }

    /**
     * Définit la valeur de la propriété rgb.
     * 
     */
    public void setRgb(int value) {
        this.rgb = value;
    }

    /**
     * Obtient la valeur de la propriété pseudopal.
     * 
     */
    public int getPseudopal() {
        return pseudopal;
    }

    /**
     * Définit la valeur de la propriété pseudopal.
     * 
     */
    public void setPseudopal(int value) {
        this.pseudopal = value;
    }

    /**
     * Obtient la valeur de la propriété alpha.
     * 
     */
    public int getAlpha() {
        return alpha;
    }

    /**
     * Définit la valeur de la propriété alpha.
     * 
     */
    public void setAlpha(int value) {
        this.alpha = value;
    }

}
