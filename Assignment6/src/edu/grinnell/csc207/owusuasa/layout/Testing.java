package edu.grinnell.csc207.owusuasa.layout;

import java.io.PrintWriter;

public class Testing {

	public static void main(String[] args) {

		TextLine hello = new TextLine("Hello");
		TextLine goodbye = new TextLine("Goodbye");
		
		VComposition comp1 = new VComposition(hello,goodbye);
		
		BoxedBlock compA = new BoxedBlock (comp1) ;
		PrintWriter pen = new PrintWriter(System.out, true) ;
		TBUtils.print(pen, compA);
		
		BoxedBlock helloA = new BoxedBlock (hello) ;
		BoxedBlock goodbyeA = new BoxedBlock (goodbye) ;
		
		VComposition comp2 = new VComposition(helloA, goodbyeA) ;
		
		TBUtils.print(pen, comp2);
		
		HComposition comp3 = new HComposition(helloA, goodbye) ;
		
		TBUtils.print(pen, comp3);
		
		HComposition comp4 = new HComposition(goodbye, helloA) ;
		
		TBUtils.print(pen, comp4);
		
		/* Sketch */
	
	}

}
