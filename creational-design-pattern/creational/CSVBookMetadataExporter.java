package creational;

import java.io.IOException;
import java.io.PrintStream;

public class CSVBookMetadataExporter extends BookMetadataExporter {
    private CSVBookMetadataFormatter csvBookFormat;

    public void export(PrintStream stream) {
        for (Book book : books) {
            csvBookFormat.append(book);
        }

        stream.println(csvBookFormat.getMetadataString());
    }

    public CSVBookMetadataExporter() {
        try {
            csvBookFormat = new CSVBookMetadataFormatter();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}