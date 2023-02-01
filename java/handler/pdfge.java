package handler;

import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class pdfge {

	public static void main(String[] args) {
		try {
			
			
			String abcd="C:\\Users\\91976\\OneDrive\\Desktop\\advance JAVA\\jsp\\xyz.pdf";
			
			Document document = new Document();
			PdfWriter .getInstance(document,new FileOutputStream(abcd));
			
			document.open();
			
			Paragraph para = new Paragraph("this is para");
			document.add(para);
			
		System.out.println("finish");
			document.close();
			
			} catch (Exception e) {
				System.out.println(e);
			}
	}

}
