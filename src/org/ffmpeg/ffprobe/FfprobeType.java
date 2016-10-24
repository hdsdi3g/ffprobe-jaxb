//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2016.10.08 à 10:32:23 PM CEST 
//

package org.ffmpeg.ffprobe;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Classe Java pour ffprobeType complex type.
 * <p>
 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ffprobeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="program_version" type="{http://www.ffmpeg.org/schema/ffprobe}programVersionType" minOccurs="0"/>
 *         &lt;element name="library_versions" type="{http://www.ffmpeg.org/schema/ffprobe}libraryVersionsType" minOccurs="0"/>
 *         &lt;element name="pixel_formats" type="{http://www.ffmpeg.org/schema/ffprobe}pixelFormatsType" minOccurs="0"/>
 *         &lt;element name="packets" type="{http://www.ffmpeg.org/schema/ffprobe}packetsType" minOccurs="0"/>
 *         &lt;element name="frames" type="{http://www.ffmpeg.org/schema/ffprobe}framesType" minOccurs="0"/>
 *         &lt;element name="packets_and_frames" type="{http://www.ffmpeg.org/schema/ffprobe}packetsAndFramesType" minOccurs="0"/>
 *         &lt;element name="programs" type="{http://www.ffmpeg.org/schema/ffprobe}programsType" minOccurs="0"/>
 *         &lt;element name="streams" type="{http://www.ffmpeg.org/schema/ffprobe}streamsType" minOccurs="0"/>
 *         &lt;element name="chapters" type="{http://www.ffmpeg.org/schema/ffprobe}chaptersType" minOccurs="0"/>
 *         &lt;element name="format" type="{http://www.ffmpeg.org/schema/ffprobe}formatType" minOccurs="0"/>
 *         &lt;element name="error" type="{http://www.ffmpeg.org/schema/ffprobe}errorType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ffprobeType", propOrder = { "programVersion", "libraryVersions", "pixelFormats", "packets", "frames", "packetsAndFrames", "programs", "streams", "chapters", "format", "error" })
public class FfprobeType {
	
	@XmlElement(name = "program_version")
	protected ProgramVersionType programVersion;
	@XmlElement(name = "library_versions")
	protected LibraryVersionsType libraryVersions;
	@XmlElement(name = "pixel_formats")
	protected PixelFormatsType pixelFormats;
	protected PacketsType packets;
	protected FramesType frames;
	@XmlElement(name = "packets_and_frames")
	protected PacketsAndFramesType packetsAndFrames;
	protected ProgramsType programs;
	protected StreamsType streams;
	protected ChaptersType chapters;
	protected FormatType format;
	protected ErrorType error;
	
	/**
	 * Obtient la valeur de la propriété programVersion.
	 * @return
	 * 		possible object is
	 *         {@link ProgramVersionType }
	 */
	public ProgramVersionType getProgramVersion() {
		return programVersion;
	}
	
	/**
	 * Définit la valeur de la propriété programVersion.
	 * @param value
	 *        allowed object is
	 *        {@link ProgramVersionType }
	 */
	public void setProgramVersion(ProgramVersionType value) {
		this.programVersion = value;
	}
	
	/**
	 * Obtient la valeur de la propriété libraryVersions.
	 * @return
	 * 		possible object is
	 *         {@link LibraryVersionsType }
	 */
	public LibraryVersionsType getLibraryVersions() {
		return libraryVersions;
	}
	
	/**
	 * Définit la valeur de la propriété libraryVersions.
	 * @param value
	 *        allowed object is
	 *        {@link LibraryVersionsType }
	 */
	public void setLibraryVersions(LibraryVersionsType value) {
		this.libraryVersions = value;
	}
	
	/**
	 * Obtient la valeur de la propriété pixelFormats.
	 * @return
	 * 		possible object is
	 *         {@link PixelFormatsType }
	 */
	public PixelFormatsType getPixelFormats() {
		return pixelFormats;
	}
	
	/**
	 * Définit la valeur de la propriété pixelFormats.
	 * @param value
	 *        allowed object is
	 *        {@link PixelFormatsType }
	 */
	public void setPixelFormats(PixelFormatsType value) {
		this.pixelFormats = value;
	}
	
	/**
	 * Obtient la valeur de la propriété packets.
	 * @return
	 * 		possible object is
	 *         {@link PacketsType }
	 */
	public PacketsType getPackets() {
		return packets;
	}
	
	/**
	 * Définit la valeur de la propriété packets.
	 * @param value
	 *        allowed object is
	 *        {@link PacketsType }
	 */
	public void setPackets(PacketsType value) {
		this.packets = value;
	}
	
	/**
	 * Obtient la valeur de la propriété frames.
	 * @return
	 * 		possible object is
	 *         {@link FramesType }
	 */
	public FramesType getFrames() {
		return frames;
	}
	
	/**
	 * Définit la valeur de la propriété frames.
	 * @param value
	 *        allowed object is
	 *        {@link FramesType }
	 */
	public void setFrames(FramesType value) {
		this.frames = value;
	}
	
	/**
	 * Obtient la valeur de la propriété packetsAndFrames.
	 * @return
	 * 		possible object is
	 *         {@link PacketsAndFramesType }
	 */
	public PacketsAndFramesType getPacketsAndFrames() {
		return packetsAndFrames;
	}
	
	/**
	 * Définit la valeur de la propriété packetsAndFrames.
	 * @param value
	 *        allowed object is
	 *        {@link PacketsAndFramesType }
	 */
	public void setPacketsAndFrames(PacketsAndFramesType value) {
		this.packetsAndFrames = value;
	}
	
	/**
	 * Obtient la valeur de la propriété programs.
	 * @return
	 * 		possible object is
	 *         {@link ProgramsType }
	 */
	public ProgramsType getPrograms() {
		return programs;
	}
	
	/**
	 * Définit la valeur de la propriété programs.
	 * @param value
	 *        allowed object is
	 *        {@link ProgramsType }
	 */
	public void setPrograms(ProgramsType value) {
		this.programs = value;
	}
	
	/**
	 * Obtient la valeur de la propriété streams.
	 * @return
	 * 		possible object is
	 *         {@link StreamsType }
	 */
	public StreamsType getStreams() {
		return streams;
	}
	
	/**
	 * Définit la valeur de la propriété streams.
	 * @param value
	 *        allowed object is
	 *        {@link StreamsType }
	 */
	public void setStreams(StreamsType value) {
		this.streams = value;
	}
	
	/**
	 * Obtient la valeur de la propriété chapters.
	 * @return
	 * 		possible object is
	 *         {@link ChaptersType }
	 */
	public ChaptersType getChapters() {
		return chapters;
	}
	
	/**
	 * Définit la valeur de la propriété chapters.
	 * @param value
	 *        allowed object is
	 *        {@link ChaptersType }
	 */
	public void setChapters(ChaptersType value) {
		this.chapters = value;
	}
	
	/**
	 * Obtient la valeur de la propriété format.
	 * @return
	 * 		possible object is
	 *         {@link FormatType }
	 */
	public FormatType getFormat() {
		return format;
	}
	
	/**
	 * Définit la valeur de la propriété format.
	 * @param value
	 *        allowed object is
	 *        {@link FormatType }
	 */
	public void setFormat(FormatType value) {
		this.format = value;
	}
	
	/**
	 * Obtient la valeur de la propriété error.
	 * @return
	 * 		possible object is
	 *         {@link ErrorType }
	 */
	public ErrorType getError() {
		return error;
	}
	
	/**
	 * Définit la valeur de la propriété error.
	 * @param value
	 *        allowed object is
	 *        {@link ErrorType }
	 */
	public void setError(ErrorType value) {
		this.error = value;
	}
	
}
