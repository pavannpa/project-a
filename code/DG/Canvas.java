package com.project.dg;


/**
 * Canvas is a kind of group that represents the root of containment for all
 * graphical elements that render one diagram.
 * @author PAVAN_NAGARAJA
 * @version 1.0
 * @updated 15-????????-2014 22:55:17
 */
public class Canvas extends Group {

	/**
	 * a color that is used to paint the background of the canvas itself. A
	 * backgroundColor value is exclusive with a backgroundFill value. If both are
	 * specified, the backgroundFill value is used. If none is specified, no fill is
	 * applied (i.e. the canvas becomes see-through).
	 */
	public int backgroundColor;
	/**
	 * a set of styles packaged by the canvas and referenced by graphical elements in
	 * the canvas as shared styles.
	 */
	public Style packagedStyle;
	/**
	 * a reference to a fill that is used to paint the background of the canvas itself.
	 * A backgroundFill value is exclusive with a backgroundColor value. If both are
	 * specified, the backgroundFill value is used. If none is specified, no fill is
	 * applied (i.e. the canvas becomes see-through).
	 */
	public Fill backgroundFill;
	/**
	 * a set of fills packaged by the canvas and referenced by graphical elements in
	 * the canvas.
	 */
	public Fill packagedFill;
	/**
	 * A set of markers packaged by the canvas and referenced by marked elements in
	 * the canvas.
	 */
	public Marker packagedMarker;

	public Canvas(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}
}//end Canvas