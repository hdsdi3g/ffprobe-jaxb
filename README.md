Use with Java and JAXB API for import [ffprobe](https://ffmpeg.org/ffprobe.html) xml result.

![Java CI with Maven](https://github.com/hdsdi3g/ffprobe-jaxb/workflows/Java%20CI%20with%20Maven/badge.svg)

Usage, with Java 8+:
```java
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.ValidationEventHandler;
import javax.xml.bind.ValidationEventLocator;

import org.ffmpeg.ffprobe.FfprobeType;
import org.ffmpeg.ffprobe.StreamType;
import org.ffmpeg.ffprobe.StreamsType;

import org.w3c.dom.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
```
Start `ffprobe -print_format xml -show_streams -show_format -hide_banner -i <my-media-file>` and get a XML (via stdout) to give to Java.

And import the XML:
```java
// load JAXB classes
JAXBContext jc = JAXBContext.newInstance("org.ffmpeg.ffprobe");
Unmarshaller unmarshaller = jc.createUnmarshaller();

// prepare an error catcher if trouble are catched during import.
unmarshaller.setEventHandler((ValidationEventHandler) e -> {
	ValidationEventLocator localtor = e.getLocator();
	log.warn("XML validation: " + e.getMessage() + " [s" + e.getSeverity() + "] at line " + localtor.getLineNumber() + ", column " + localtor.getColumnNumber() + " offset " + localtor.getOffset() + " node: " + localtor.getNode() + ", object " + localtor.getObject());
	return true;
});

// load XML datas
DocumentBuilderFactory xmlDocumentBuilderFactory = DocumentBuilderFactory.newInstance();
DocumentBuilder xmlDocumentBuilder = xmlDocumentBuilderFactory.newDocumentBuilder();
xmlDocumentBuilder.setErrorHandler(null);
Document document = xmlDocumentBuilder.parse(new ByteArrayInputStream(ffprobe_stdout.getBytes()));

// An do the importing
JAXBElement<FfprobeType> result = unmarshaller.unmarshal(document, FfprobeType.class);
FfprobeType analyst_result = result.getValue();
```
BEWARE TO NOT LOAD XML RAW TEXT DIRECTLY INTO Unmarshaller: BIG PROBLEMS WITH XSD REFS !

Code automatically generated with `xjc`. See update.sh for exact method.
