package com.project.dg;


/**
 * Ellipse is a graphical element that defines an elliptical shape with a given
 * center point and two radii on the x and y axes.
 * @author PAVAN_NAGARAJA
 * @version 1.0
 * @updated 15-????????-2014 22:55:17
 */
public class Ellipse extends GraphicalElement {

	/**
	 * the center point of the ellipse in the x-y coordinate system.
	 */
	public Point center;
	/**
	 * a dimension that specifies the two radii of the ellipse (a width along the x-
	 * axis and a height along the y-axis)
	 */
	public Dimension radii;

	public Ellipse(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}
}//end Ellipse