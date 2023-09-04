package org.system;

public class Desktop extends Computer {
	
	public void desktopSize() {
		System.out.println("The size of the Desktop is 28 inches");
	}
	public static void main(String[] args) {
		Desktop desktop=new Desktop();
		desktop.computerModel();
		desktop.desktopSize();
	}

}
