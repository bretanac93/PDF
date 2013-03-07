package pdf;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
//import wicket.contrib.tinymce.*;


public class PDFGen
{
    public static void PDF( String DirPath, String FileName, String Text, Font fonts ) throws FileNotFoundException, DocumentException
        {
        FileOutputStream Dir = new FileOutputStream( DirPath + FileName );
        Document doc = new Document();
        PdfWriter.getInstance( doc, Dir );
        
        doc.open();
        doc.add( new Paragraph(Text, fonts) );
        doc.close();
        }
}
