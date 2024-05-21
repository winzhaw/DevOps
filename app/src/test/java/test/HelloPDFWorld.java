package test;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import java.io.File;
import java.io.IOException;

public class HelloPDFWorld {

    public static void main(String[] args) {
        try (PDDocument helloPdf = new PDDocument()) {
            PDPage page = new PDPage(PDRectangle.A4);
            helloPdf.addPage(page);
            
            PDPageContentStream contentStream = new PDPageContentStream(helloPdf, page);
            contentStream.beginText();
            contentStream.setFont(PDType1Font.HELVETICA, 36);
            contentStream.newLineAtOffset(5, 400);
            contentStream.showText("Hello DevOps!!!");
            contentStream.endText();
            contentStream.close();
            
            helloPdf.save(new File("simple.pdf")); // Passen Sie den Pfad nach Bedarf an
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
