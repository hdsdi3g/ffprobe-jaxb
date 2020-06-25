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
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 *
 * Copyright (C) hdsdi3g for hd3g.tv 2018-2020
 *
 */
package tv.hd3g.ffprobejaxb;

import static java.nio.charset.StandardCharsets.UTF_8;
import static javax.xml.XMLConstants.ACCESS_EXTERNAL_DTD;
import static javax.xml.XMLConstants.ACCESS_EXTERNAL_SCHEMA;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.ffmpeg.ffprobe.ChapterType;
import org.ffmpeg.ffprobe.ErrorType;
import org.ffmpeg.ffprobe.FfprobeType;
import org.ffmpeg.ffprobe.FormatType;
import org.ffmpeg.ffprobe.LibraryVersionType;
import org.ffmpeg.ffprobe.PacketType;
import org.ffmpeg.ffprobe.PixelFormatType;
import org.ffmpeg.ffprobe.ProgramType;
import org.ffmpeg.ffprobe.ProgramVersionType;
import org.ffmpeg.ffprobe.StreamType;
import org.xml.sax.SAXException;

public class FFprobeJAXB {

	public final FfprobeType probeResult;
	private final String xmlContent;

	public FFprobeJAXB(final String xmlContent, final Consumer<String> onWarnLog) throws IOException {
		this.xmlContent = xmlContent;
		try {
			final var jc = JAXBContext.newInstance("org.ffmpeg.ffprobe");
			final var unmarshaller = jc.createUnmarshaller();

			/**
			 * Prepare an error catcher if trouble are catched during import.
			 */
			unmarshaller.setEventHandler(e -> {
				final var locator = e.getLocator();
				onWarnLog.accept("XML validation: "
				                 + e.getMessage() + " [s"
				                 + e.getSeverity() + "] at line "
				                 + locator.getLineNumber() + ", column "
				                 + locator.getColumnNumber() + " offset "
				                 + locator.getOffset() + " node: "
				                 + locator.getNode() + ", object "
				                 + locator.getObject());
				return true;
			});

			final var xmlDocumentBuilderFactory = DocumentBuilderFactory.newInstance();// NOSONAR
			xmlDocumentBuilderFactory.setAttribute(ACCESS_EXTERNAL_DTD, "");
			xmlDocumentBuilderFactory.setAttribute(ACCESS_EXTERNAL_SCHEMA, "");
			final var xmlDocumentBuilder = xmlDocumentBuilderFactory.newDocumentBuilder();
			xmlDocumentBuilder.setErrorHandler(null);

			final var document = xmlDocumentBuilder.parse(new ByteArrayInputStream(xmlContent.getBytes(UTF_8)));

			probeResult = unmarshaller.unmarshal(document, FfprobeType.class).getValue();
		} catch (JAXBException | SAXException | ParserConfigurationException e1) {
			throw new IOException("Can't load XML content", e1);
		}
	}

	public String getXmlContent() {
		return xmlContent;
	}

	public List<ChapterType> getChapters() {
		return probeResult.getChapters().getChapter();
	}

	public List<StreamType> getStreams() {
		return probeResult.getStreams().getStream();
	}

	public FormatType getFormat() {
		return probeResult.getFormat();
	}

	public ErrorType getError() {
		return probeResult.getError();
	}

	public ProgramVersionType getProgramVersion() {
		return probeResult.getProgramVersion();
	}

	public List<LibraryVersionType> getLibraryVersions() {
		return probeResult.getLibraryVersions().getLibraryVersion();
	}

	public List<PixelFormatType> getPixelFormats() {
		return probeResult.getPixelFormats().getPixelFormat();
	}

	public List<PacketType> getPackets() {
		return probeResult.getPackets().getPacket();
	}

	/**
	 * {@link FrameType }
	 * {@link SubtitleType }
	 */
	public List<Object> getFrames() {
		return probeResult.getFrames().getFrameOrSubtitle();
	}

	/**
	 * {@link PacketType }
	 * {@link FrameType }
	 * {@link SubtitleType }
	 */
	public List<Object> getPacketsAndFrames() {
		return probeResult.getPacketsAndFrames().getPacketOrFrameOrSubtitle();
	}

	public List<ProgramType> getPrograms() {
		return probeResult.getPrograms().getProgram();
	}

	public static final Predicate<StreamType> filterVideoStream = streamType -> streamType
	        .getCodecType().equals("video");
	public static final Predicate<StreamType> filterAudioStream = streamType -> streamType
	        .getCodecType().equals("audio");
	public static final Predicate<StreamType> filterDataStream = streamType -> streamType
	        .getCodecType().equals("data");

	public Stream<StreamType> getVideoStreams() {
		return getStreams().stream().filter(filterVideoStream);
	}

	public Stream<StreamType> getAudiosStreams() {
		return getStreams().stream().filter(filterAudioStream);
	}

}
