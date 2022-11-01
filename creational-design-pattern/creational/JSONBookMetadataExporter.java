package creational;

import java.io.PrintStream;

public class JSONBookMetadataExporter extends BookMetadataExporter {
    private JSONBookMetadataFormatter jsonBookFormat;

    public void export(PrintStream stream) {
        for (Book book : books) {
            jsonBookFormat.append(book);
        }

        stream.println(jsonBookFormat.getMetadataString());
    }

    public JSONBookMetadataExporter() {
        jsonBookFormat = new JSONBookMetadataFormatter();
    }

}