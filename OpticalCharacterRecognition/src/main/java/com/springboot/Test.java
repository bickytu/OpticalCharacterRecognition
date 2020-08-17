package com.springboot;

import java.io.File;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class Test {

	public static void main(String[] args) throws TesseractException {
		Tesseract tesseract = new Tesseract();
		tesseract.setDatapath("/home/bicky/Pictures/Opc/eng.traineddata"); ///
		System.out.println(tesseract.doOCR(new File("home/bicky/Downloads/teseract.png")));
	}
}
