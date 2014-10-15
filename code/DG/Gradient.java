package com.project.dg;


/**
 * Gradient is a kind of fill that paints a continuously smooth color transition
 * along the gradient range from one color to the next.
 * @author PAVAN_NAGARAJA
 * @version 1.0
 * @updated 15-????????-2014 22:55:17
 */
public abstract class Gradient extends Fill {

	/**
	 * a list of two or more gradient stops defining the color transitions of the
	 * gradient.
	 */
	public GradientStop stop;

	public Gradient(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}
}//end Gradient