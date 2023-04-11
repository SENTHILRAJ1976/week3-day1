package org.system;

public class Computer extends Desktop {
	
	
	public void ComputerModel() {
		
		System.out.println("Choose the computer model as your choice");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Computer comp = new Computer();
		
		comp.ComputerModel();
		comp.desktopSize();
		
		
	}

}
