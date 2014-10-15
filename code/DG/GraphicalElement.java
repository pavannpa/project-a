package com.project.dg;


/**
 * GraphicalElement is the abstract superclass of all graphical elements that can
 * be nested in a canvas.
 * @author PAVAN_NAGARAJA
 * @version 1.0
 * @updated 15-????????-2014 22:55:17
 */
public abstract class GraphicalElement {

	/**
	 * a list of zero or more transforms to apply to this graphical element.
	 */
	public Transform transform;
	/**
	 * a list of shared styles for this graphical element.
	 */
	public Style sharedStyle;
	/**
	 * a list of locally-owned styles for this graphical element.
	 */
	public Style localStyle;
	/**
	 * an optional reference to a clip path element that masks the painting of this
	 * graphical element.
	 */
	public ClipPath clipPath;

	public GraphicalElement(){

	}

	public void finalize() throws Throwable {

	}
}//end GraphicalElement