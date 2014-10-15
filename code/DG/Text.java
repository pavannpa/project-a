package com.project.dg;


/**
 * Text is a graphical element that defines a shape that renders a character
 * string within a bounding box.
 * @author PAVAN_NAGARAJA
 * @version 1.0
 * @updated 15-????????-2014 22:55:18
 */
public class Text extends GraphicalElement {

	/**
	 * the text alignment when wrapped into multiple lines.
	 */
	public AlignmentKind alignment;
	/**
	 * the bounds inside which the text is rendered (possibly wrapped into multiple
	 * lines)
	 */
	public Bounds bounds;
	/**
	 * the text as a string of characters.
	 */
	public String data;

	public Text(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}
}//end Text