package com.project.dg;


/**
 * LinearGradient is a kind of gradient that fills a graphical element by smoothly
 * changing color values along a vector.
 * @author PAVAN_NAGARAJA
 * @version 1.0
 * @updated 15-????????-2014 22:55:18
 */
public class LinearGradient extends Gradient {

	/**
	 * a real number (>=0 and >=1) representing a ratio of the graphical element's
	 * width that is the x start point of the gradient.
	 */
	public Real x1 = 0;
	/**
	 * a real number (>=0 and >=1) representing a ratio of the graphical element's
	 * width that is the x end point of the gradient.
	 */
	public Real x2 = 1;
	/**
	 * a real number (>=0 and >=1) representing a ratio of the graphical element's
	 * height that is the y start point of the gradient.
	 */
	public Real y1 = 0;
	/**
	 * a real number (>=0 and >=1) representing a ratio of the graphical element's
	 * height that is the y end point of the gradient.
	 */
	public Real y2 = 1;

	public LinearGradient(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}
}//end LinearGradient