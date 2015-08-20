package org.dimigo.inheritance;

public class FigureTest {

	public static void main(String[] args) {
		Circle c = new Circle(5);
		Triangle t = new Triangle(10, 10, 5, 8);
		Rectangle r = new Rectangle(20, 20, 5, 8);
		
		System.out.println(c.calcArea());
		c.printCenter();
		c.moveFigure(5, 5);
		c.printCenter();
		System.out.println(t.calcArea());
		t.printCenter();
		t.moveFigure(5, 5);
		t.printCenter();
		System.out.println(r.calcArea());
		r.printCenter();
		r.moveFigure(5, 5);
		r.printCenter();
	}

}
