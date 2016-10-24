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
 * <p>Classe Java pour streamDispositionType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="streamDispositionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="default" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="dub" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="original" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="comment" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="lyrics" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="karaoke" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="forced" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="hearing_impaired" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="visual_impaired" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="clean_effects" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="attached_pic" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "streamDispositionType")
public class StreamDispositionType {

    @XmlAttribute(name = "default", required = true)
    protected int _default;
    @XmlAttribute(name = "dub", required = true)
    protected int dub;
    @XmlAttribute(name = "original", required = true)
    protected int original;
    @XmlAttribute(name = "comment", required = true)
    protected int comment;
    @XmlAttribute(name = "lyrics", required = true)
    protected int lyrics;
    @XmlAttribute(name = "karaoke", required = true)
    protected int karaoke;
    @XmlAttribute(name = "forced", required = true)
    protected int forced;
    @XmlAttribute(name = "hearing_impaired", required = true)
    protected int hearingImpaired;
    @XmlAttribute(name = "visual_impaired", required = true)
    protected int visualImpaired;
    @XmlAttribute(name = "clean_effects", required = true)
    protected int cleanEffects;
    @XmlAttribute(name = "attached_pic", required = true)
    protected int attachedPic;

    /**
     * Obtient la valeur de la propriété default.
     * 
     */
    public int getDefault() {
        return _default;
    }

    /**
     * Définit la valeur de la propriété default.
     * 
     */
    public void setDefault(int value) {
        this._default = value;
    }

    /**
     * Obtient la valeur de la propriété dub.
     * 
     */
    public int getDub() {
        return dub;
    }

    /**
     * Définit la valeur de la propriété dub.
     * 
     */
    public void setDub(int value) {
        this.dub = value;
    }

    /**
     * Obtient la valeur de la propriété original.
     * 
     */
    public int getOriginal() {
        return original;
    }

    /**
     * Définit la valeur de la propriété original.
     * 
     */
    public void setOriginal(int value) {
        this.original = value;
    }

    /**
     * Obtient la valeur de la propriété comment.
     * 
     */
    public int getComment() {
        return comment;
    }

    /**
     * Définit la valeur de la propriété comment.
     * 
     */
    public void setComment(int value) {
        this.comment = value;
    }

    /**
     * Obtient la valeur de la propriété lyrics.
     * 
     */
    public int getLyrics() {
        return lyrics;
    }

    /**
     * Définit la valeur de la propriété lyrics.
     * 
     */
    public void setLyrics(int value) {
        this.lyrics = value;
    }

    /**
     * Obtient la valeur de la propriété karaoke.
     * 
     */
    public int getKaraoke() {
        return karaoke;
    }

    /**
     * Définit la valeur de la propriété karaoke.
     * 
     */
    public void setKaraoke(int value) {
        this.karaoke = value;
    }

    /**
     * Obtient la valeur de la propriété forced.
     * 
     */
    public int getForced() {
        return forced;
    }

    /**
     * Définit la valeur de la propriété forced.
     * 
     */
    public void setForced(int value) {
        this.forced = value;
    }

    /**
     * Obtient la valeur de la propriété hearingImpaired.
     * 
     */
    public int getHearingImpaired() {
        return hearingImpaired;
    }

    /**
     * Définit la valeur de la propriété hearingImpaired.
     * 
     */
    public void setHearingImpaired(int value) {
        this.hearingImpaired = value;
    }

    /**
     * Obtient la valeur de la propriété visualImpaired.
     * 
     */
    public int getVisualImpaired() {
        return visualImpaired;
    }

    /**
     * Définit la valeur de la propriété visualImpaired.
     * 
     */
    public void setVisualImpaired(int value) {
        this.visualImpaired = value;
    }

    /**
     * Obtient la valeur de la propriété cleanEffects.
     * 
     */
    public int getCleanEffects() {
        return cleanEffects;
    }

    /**
     * Définit la valeur de la propriété cleanEffects.
     * 
     */
    public void setCleanEffects(int value) {
        this.cleanEffects = value;
    }

    /**
     * Obtient la valeur de la propriété attachedPic.
     * 
     */
    public int getAttachedPic() {
        return attachedPic;
    }

    /**
     * Définit la valeur de la propriété attachedPic.
     * 
     */
    public void setAttachedPic(int value) {
        this.attachedPic = value;
    }

}
