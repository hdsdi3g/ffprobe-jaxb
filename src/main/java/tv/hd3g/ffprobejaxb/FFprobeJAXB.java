/*
 * This file is part of ffprobe-jaxb.
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation; either version 3 of the License, or
 * any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * 
 * Copyright (C) hdsdi3g for hd3g.tv 2018
 * 
*/
package tv.hd3g.ffprobejaxb;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

import org.w3c.dom.Document;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.ValidationEventHandler;
import javax.xml.bind.ValidationEventLocator;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.ffmpeg.ffprobe.ChapterType;
import org.ffmpeg.ffprobe.ErrorType;
import org.ffmpeg.ffprobe.FfprobeType;
import org.ffmpeg.ffprobe.FormatType;
import org.ffmpeg.ffprobe.FrameType;
import org.ffmpeg.ffprobe.LibraryVersionType;
import org.ffmpeg.ffprobe.PacketType;
import org.ffmpeg.ffprobe.PixelFormatType;
import org.ffmpeg.ffprobe.ProgramType;
import org.ffmpeg.ffprobe.ProgramVersionType;
import org.ffmpeg.ffprobe.StreamType;
import org.ffmpeg.ffprobe.SubtitleType;
import org.xml.sax.SAXException;

public class FFprobeJAXB {
	
	public final FfprobeType probe_result;
	
	public FFprobeJAXB(String xml_content, Consumer<String> onWarnLog) throws IOException {
		try {
			JAXBContext jc = JAXBContext.newInstance("org.ffmpeg.ffprobe");
			Unmarshaller unmarshaller = jc.createUnmarshaller();
			// prepare an error catcher if trouble are catched during import.
			unmarshaller.setEventHandler((ValidationEventHandler) e -> {
				ValidationEventLocator localtor = e.getLocator();
				onWarnLog.accept("XML validation: " + e.getMessage() + " [s" + e.getSeverity() + "] at line " + localtor.getLineNumber() + ", column " + localtor.getColumnNumber() + " offset " + localtor.getOffset() + " node: " + localtor.getNode() + ", object " + localtor.getObject());
				return true;
			});
			
			DocumentBuilderFactory xmlDocumentBuilderFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder xmlDocumentBuilder = xmlDocumentBuilderFactory.newDocumentBuilder();
			xmlDocumentBuilder.setErrorHandler(null);
			
			Document document = xmlDocumentBuilder.parse(new ByteArrayInputStream(xml_content.getBytes(StandardCharsets.UTF_8)));
			
			JAXBElement<FfprobeType> result = unmarshaller.unmarshal(document, FfprobeType.class);
			probe_result = result.getValue();
		} catch (JAXBException | SAXException | ParserConfigurationException e1) {
			throw new IOException("Can't load XML content", e1);
		}
	}
	
	public List<ChapterType> getChapters() {
		return probe_result.getChapters().getChapter();
	}
	
	public List<StreamType> getStreams() {
		return probe_result.getStreams().getStream();
	}
	
	public FormatType getFormat() {
		return probe_result.getFormat();
	}
	
	public ErrorType getError() {
		return probe_result.getError();
	}
	
	public ProgramVersionType getProgramVersion() {
		return probe_result.getProgramVersion();
	}
	
	public List<LibraryVersionType> getLibraryVersions() {
		return probe_result.getLibraryVersions().getLibraryVersion();
	}
	
	public List<PixelFormatType> getPixelFormats() {
		return probe_result.getPixelFormats().getPixelFormat();
	}
	
	public List<PacketType> getPackets() {
		return probe_result.getPackets().getPacket();
	}
	
	/**
	 * {@link FrameType }
	 * {@link SubtitleType }
	 */
	public List<Object> getFrames() {
		return probe_result.getFrames().getFrameOrSubtitle();
	}
	
	/**
	 * {@link PacketType }
	 * {@link FrameType }
	 * {@link SubtitleType }
	 */
	public List<Object> getPacketsAndFrames() {
		return probe_result.getPacketsAndFrames().getPacketOrFrameOrSubtitle();
	}
	
	public List<ProgramType> getPrograms() {
		return probe_result.getPrograms().getProgram();
	}
	
	public static final Predicate<StreamType> filterVideoStream = stream_type -> stream_type.getCodecType().equals("video");
	public static final Predicate<StreamType> filterAudioStream = stream_type -> stream_type.getCodecType().equals("audio");
	public static final Predicate<StreamType> filterDataStream = stream_type -> stream_type.getCodecType().equals("data");
	
	public Stream<StreamType> getVideoStreams() {
		return getStreams().stream().filter(filterVideoStream);
	}
	
	public Stream<StreamType> getAudiosStreams() {
		return getStreams().stream().filter(filterAudioStream);
	}
	
}
