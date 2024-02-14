package com.numetry.twelthfeb;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;

public class QRCode {
	
	public static void main(String[] args) throws IOException, WriterException {
		
		String data = "Qr Code genrated by Vaijnath Kasande" ;
		
		String path = "./qrcode.png";
		
		BitMatrix matrix = new MultiFormatWriter().encode(data, BarcodeFormat.QR_CODE, 500, 500);
		
		MatrixToImageWriter.writeToPath(matrix, "png", Paths.get(path));
		
		System.out.println("Qr code successfully genrated");
		
		
		
	}

}
