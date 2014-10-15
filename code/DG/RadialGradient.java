package com.project.dg;


/**
 * RadialGradient is a kind of gradient that fills a graphical element by smoothly
 * changing color values in a circle.
 * @author PAVAN_NAGARAJA
 * @version 1.0
 * @updated 15-????????-2014 22:55:18
 */
public class RadialGradient extends Gradient {

	/**
	 * a real number (>=0 and >=1) representing a ratio of the graphical element's
	 * width that is the x center point of the gradient.
	 */
	public Real centerX = 0.5;
	/**
	 * a real number (>=0 and >=1) representing a ratio of the graphical element's
	 * width that is the y center point of the gradient.
	 */
	public Real centerY = 0.5;
	/**
	 * a real number (>=0 and >=1) representing a ratio of the graphical element's
	 * width that is the x focus point of the gradient.
	 */
	public Real focusX = 0.5;
	/**
	 * a real number (>=0 and >=1) representing a ratio of the graphical element's
	 * width that is the y focus point of the gradient.
	 */
	public Real focusY = 0.5;
	/**
	 * a real number (>=0 and >=1) representing a ratio of the graphical element's
	 * size that is the radius of the gradient.
	 */
	public Real radius = 0.5;

	public RadialGradient(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}
}//end RadialGradient