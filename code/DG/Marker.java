package com.project.dg;


/**
 * Marker is a kind of group that is used as a decoration (e.g. an arrowhead) for
 * the vertices of a marked graphical element.
 * @author PAVAN_NAGARAJA
 * @version 1.0
 * @updated 15-????????-2014 22:55:18
 */
public class Marker extends Group {

	/**
	 * a point within the bounds of the marker that aligns exactly with the marked
	 * element's vertex.
	 */
	public int reference;
	/**
	 * the size of the marker
	 */
	public int size;

	public Marker(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}
}//end Marker