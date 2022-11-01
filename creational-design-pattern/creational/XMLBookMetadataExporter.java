package creational;

import java.io.PrintStream;

import javax.xml.parsers.ParserConfigurationException;

public class XMLBookMetadataExporter extends BookMetadataExporter {
    private XMLBookMetadataFormatter xmlBookFormat;

    public XMLBookMetadataExporter() {
        try {
            xmlBookFormat = new XMLBookMetadataFormatter();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
    }

    public void export(PrintStream stream) {
        for (Book book : books) {
            xmlBookFormat.append(book);
        }

        stream.println(xmlBookFormat.getMetadataString());
    };
}