package exercises;

public class Rectangle {
	
	
	//Testprojekt
	//Sehr einfach
	private double length, width;
	
	public Rectangle (double length, double width) {
		this.length = length;
		this.width = width;	
	
	}
	
	
	// Umfangberechnung
	public double getSize() {
		return (this.width * 2) + (this.length * 2);
	}
	
	// Volumenberechnung
	public double getVolume() {
		return (this.length * this.width);
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}
	
	

}
