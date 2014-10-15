package com.project.dg;


/**
 * Circle is a graphical element that defines a circular shape with a given center
 * point and a radius.
 * @author PAVAN_NAGARAJA
 * @version 1.0
 * @updated 15-????????-2014 22:55:17
 */
public class Circle extends GraphicalElement {

	/**
	 * the center point of the circle in the x-y coordinate system.
	 */
	public Point center;
	/**
	 * a real number (>=0) that represents the radius of the circle.
	 */
	public double radius;

	public Circle(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}
}//end Circle