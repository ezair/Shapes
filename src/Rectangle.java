//Author: Eric Zair
//File: Rectangle.java
//Description:	This class creates a rectangle


public class Rectangle implements Shape {


	//Variables
	private double length;
	private double width;


	//Constructor
	public Rectangle(double len, double wid) {
		length = len;
		width = wid;
	}


	//Second constructor
	public Rectangle(double size) {
		this(size, size);
	}


	//Default constructor
	public Rectangle() {
		this(0, 0);
	}

	//Setters
	//set value of length
	public void setLength(double _length) {
		length = _length;
	}


	//set value of width
	public void setWidth(double _width) {
		width = _width;
	}


	//Getters
	//return value of length
	public double getLength() {
		return length;
	}


	//return value of width
	public double getWidth() {
		return width;
	}


	//Methods
	//returns area of Rectangle
	public double area() {
		return (length * width);
	}


	//returns perimeter of Rectangle
	public double perimeter() {
		return (2 * length) + (2 * width);
	}


	//returns the rectangle in string form
	public String toString() {
		return "Length: " + length + " Width: " + width;
	}


	//check to see if this rectangle is equal
	//to another object
	public boolean equals(Object o) {
		if(o instanceof Rectangle) {
			Rectangle r = (Rectangle) o;
			return (width == r.getWidth() 
			&& length == r.getLength());
		}
		else
			return false;
	}


	//Methods to print rectangle
	//prints width or rectangle
	private void drawWidth() {
		for(int i = 0; i < width; i++)
			System.out.print("+");
		System.out.println();
	}

	//this method draws an image of the
	//rectangle
	public void draw() {
		drawWidth();
		//print legnth of rectangle
		for(int i = 0; i < length; i++) {
			String s = "+";
			for(int j = 0; j < (width-2); j++)
				s += " ";
			s += "+";
			System.out.println(s);
		}
		drawWidth();
	}


}//class