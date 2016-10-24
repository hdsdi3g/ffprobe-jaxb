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
 * <p>
 * Classe Java pour subtitleType complex type.
 * <p>
 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="subtitleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="media_type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="subtitle" />
 *       &lt;attribute name="pts" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="pts_time" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="format" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="start_display_time" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="end_display_time" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="num_rects" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "subtitleType")
@SuppressWarnings("nls")
public class SubtitleType {
	
	@XmlAttribute(name = "media_type", required = true)
	protected String mediaType;
	@XmlAttribute(name = "pts")
	protected Long pts;
	@XmlAttribute(name = "pts_time")
	protected Float ptsTime;
	@XmlAttribute(name = "format")
	protected Integer format;
	@XmlAttribute(name = "start_display_time")
	protected Integer startDisplayTime;
	@XmlAttribute(name = "end_display_time")
	protected Integer endDisplayTime;
	@XmlAttribute(name = "num_rects")
	protected Integer numRects;
	
	/**
	 * Obtient la valeur de la propriété mediaType.
	 * @return
	 * 		possible object is
	 *         {@link String }
	 */
	public String getMediaType() {
		if (mediaType == null) {
			return "subtitle";
		} else {
			return mediaType;
		}
	}
	
	/**
	 * Définit la valeur de la propriété mediaType.
	 * @param value
	 *        allowed object is
	 *        {@link String }
	 */
	public void setMediaType(String value) {
		this.mediaType = value;
	}
	
	/**
	 * Obtient la valeur de la propriété pts.
	 * @return
	 * 		possible object is
	 *         {@link Long }
	 */
	public Long getPts() {
		return pts;
	}
	
	/**
	 * Définit la valeur de la propriété pts.
	 * @param value
	 *        allowed object is
	 *        {@link Long }
	 */
	public void setPts(Long value) {
		this.pts = value;
	}
	
	/**
	 * Obtient la valeur de la propriété ptsTime.
	 * @return
	 * 		possible object is
	 *         {@link Float }
	 */
	public Float getPtsTime() {
		return ptsTime;
	}
	
	/**
	 * Définit la valeur de la propriété ptsTime.
	 * @param value
	 *        allowed object is
	 *        {@link Float }
	 */
	public void setPtsTime(Float value) {
		this.ptsTime = value;
	}
	
	/**
	 * Obtient la valeur de la propriété format.
	 * @return
	 * 		possible object is
	 *         {@link Integer }
	 */
	public Integer getFormat() {
		return format;
	}
	
	/**
	 * Définit la valeur de la propriété format.
	 * @param value
	 *        allowed object is
	 *        {@link Integer }
	 */
	public void setFormat(Integer value) {
		this.format = value;
	}
	
	/**
	 * Obtient la valeur de la propriété startDisplayTime.
	 * @return
	 * 		possible object is
	 *         {@link Integer }
	 */
	public Integer getStartDisplayTime() {
		return startDisplayTime;
	}
	
	/**
	 * Définit la valeur de la propriété startDisplayTime.
	 * @param value
	 *        allowed object is
	 *        {@link Integer }
	 */
	public void setStartDisplayTime(Integer value) {
		this.startDisplayTime = value;
	}
	
	/**
	 * Obtient la valeur de la propriété endDisplayTime.
	 * @return
	 * 		possible object is
	 *         {@link Integer }
	 */
	public Integer getEndDisplayTime() {
		return endDisplayTime;
	}
	
	/**
	 * Définit la valeur de la propriété endDisplayTime.
	 * @param value
	 *        allowed object is
	 *        {@link Integer }
	 */
	public void setEndDisplayTime(Integer value) {
		this.endDisplayTime = value;
	}
	
	/**
	 * Obtient la valeur de la propriété numRects.
	 * @return
	 * 		possible object is
	 *         {@link Integer }
	 */
	public Integer getNumRects() {
		return numRects;
	}
	
	/**
	 * Définit la valeur de la propriété numRects.
	 * @param value
	 *        allowed object is
	 *        {@link Integer }
	 */
	public void setNumRects(Integer value) {
		this.numRects = value;
	}
	
}
