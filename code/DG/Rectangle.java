package com.project.dg;


/**
 * Rectangle is a graphical element that defines a rectangular shape with given
 * bounds. A rectangle may be given rounded corners by setting its corner radius.
 * @author PAVAN_NAGARAJA
 * @version 1.0
 * @updated 15-????????-2014 22:55:18
 */
public class Rectangle extends GraphicalElement {

	/**
	 * the bounds of the rectangle in the x-y coordinate system.
	 */
	public Bounds bounds;
	/**
	 * a radius for the rectangle's rounded corners. When the radius is 0, the
	 * rectangle is drawn with sharp corners.
	 */
	public Real cornerRadius = 0;

	public Rectangle(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}
}//end Rectangle