//Author: Eric Zair
//File: Circle.java
//Description: This class creates a circle


public class Circle implements Shape {


	//Variables
	private double radius;


	//Constructor
	public Circle(double _radius) {
		radius = _radius;
	}


	//Default constructor
	public Circle() {
		this(0);
	}


	//Setters
	public void setRadius(double _radius) {
		radius = _radius;
	}


	//Getters
	public double getRadius() {
		return radius;
	}


	//Other Class Methods
	//return perimeter of circle
	public double perimeter() {
		return (2 * 3.14 * radius);
	}


	//return area of a circle
	public double area() {
		return (3.14 * Math.pow(radius, 2));
	}


	//check if an object is equal
	public boolean equals(Object o) {
		if(o instanceof Circle) {
			Circle c = (Circle) o;
			return radius == c.getRadius();
		}
		else
			return false;
	}


}//class
