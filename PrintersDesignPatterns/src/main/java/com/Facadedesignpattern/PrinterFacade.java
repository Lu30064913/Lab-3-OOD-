package com.Facadedesignpattern;

public class PrinterFacade {
	private Printer copyData;
	private Printer faxData;
	private Printer scanData;
	
	public PrinterFacade() {
		copyData = new CopyData();
		faxData = new FaxData();
		scanData = new ScanData();
	}
	
	public void printCopiedData() {
		copyData.print();
	}
	public void printFaxData() {
		faxData.print();
	}
	public void printScannedData() {
		scanData.print();
	}
	
}
