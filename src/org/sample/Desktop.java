package org.sample;

public class Desktop extends Computer {
	private void desktopSize() {
		System.out.println("desktop size is 24inch");
		
	}
	
	public static void main(String[] args) {
		Desktop d=new Desktop();
		d.desktopSize();
		d.computermodel();
		
	}

}
