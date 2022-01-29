package com.Commanddesignpattern;

public class Main {

	public static void main(String[] args) {
		 Menu invoker = new Menu();
		 
		  
		 invoker.setCommand("Create", new CreateCommand()); 
		 invoker.setCommand("Delete", new DeleteCommand()); 
		 
		 //Invoker invokes command 
		 invoker.runCommand("Create"); 
		 invoker.runCommand("Delete");



	}

}
