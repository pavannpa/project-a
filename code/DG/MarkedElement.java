package com.project.dg;


/**
 * MarkedElement is a graphic element that can be decorated at its vertices with
 * markers (e.g. arrowheads).
 * @author PAVAN_NAGARAJA
 * @version 1.0
 * @updated 15-????????-2014 22:55:18
 */
public abstract class MarkedElement extends GraphicalElement {

	/**
	 * an optional mid marker that aligns with all vertices of the marked element
	 * except the first and the last.
	 */
	public Marker midMarker;
	/**
	 * an optional end marker that aligns with the last vertex of the marked element.
	 */
	public Marker endMarker;
	/**
	 * an optional start marker that aligns with the first vertex of the marked
	 * element.
	 */
	public Marker startMarker;

	public MarkedElement(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}
}//end MarkedElement