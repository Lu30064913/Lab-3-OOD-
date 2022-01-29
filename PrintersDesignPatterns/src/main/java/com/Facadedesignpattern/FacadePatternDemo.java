package com.Facadedesignpattern;

public class FacadePatternDemo {
	 public static void main(String[] args) {
	      PrinterFacade pFacade = new PrinterFacade();

	      pFacade.printCopiedData();
	      pFacade.printFaxData();
	      pFacade.printScannedData();	
	   }	
}
