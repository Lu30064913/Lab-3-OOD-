package com.Commanddesignpattern;

import java.util.HashMap;
import java.util.Map;

public class Menu {
	Map menuItems = new HashMap(); 
	
	public void setCommand(String operation, PrinterCommand cmd){ 
		menuItems.put(operation, cmd); 
		
	} 
	
	public void runCommand(String operation){ 
		((PrinterCommand) menuItems.get(operation)).print(); 
		}

	
}
