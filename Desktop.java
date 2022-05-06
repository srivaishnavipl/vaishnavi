package org.system;

public class Desktop extends Computer {
	private int desktopSize = 1;
	public int DesktopSize() {
		return desktopSize;
		}    
	public static void main(String[] args) {
		Computer computer=new Computer();
		computer.ComputerModel();
		Desktop desktop=new Desktop();
		desktop.DesktopSize();
}
}