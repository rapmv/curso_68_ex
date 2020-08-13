package entities;

public class Rectangle {
	public double width;
	public double height;
		
	public double Area() {
		return width*height;
	}
		
	public double Perimeter() {
		return (width+height)*2;	
	}
		
	public double Diagonal() {
		return Math.sqrt(Math.pow(width, 2.0)+Math.pow(height, 2.0));	
	}
	

}
