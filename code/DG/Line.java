package com.project.dg;


/**
 * Line is a marked element that defines a shape consisting of one straight line
 * between two points.
 * @author PAVAN_NAGARAJA
 * @version 1.0
 * @updated 15-????????-2014 22:55:17
 */
public class Line extends MarkedElement {

	/**
	 * the ending point of the line in the x-y coordinate system.
	 */
	public Point end;
	/**
	 * the starting point of the line in the x-y coordinate system.
	 */
	public Point start;

	public Line(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}
}//end Line