package com.project.dg;


/**
 * Image is a graphical element that defines a shape that paints an image with a
 * given URL within given bounds.
 * @author PAVAN_NAGARAJA
 * @version 1.0
 * @updated 15-????????-2014 22:55:17
 */
public class Image extends GraphicalElement {

	/**
	 * the bounds within which the image is rendered.
	 */
	public Bounds bounds;
	/**
	 * wether to preserve the aspect ratio of the image upon scaling, i.e. the same
	 * scale factor for width and height.
	 */
	public Boolean isAspectRatioPreserved;
	/**
	 * the URL of a referenced image file.
	 */
	public String source;

	public Image(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}
}//end Image