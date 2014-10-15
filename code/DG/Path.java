package com.project.dg;


/**
 * Path is a marked element that defines a custom shape whose geometry is
 * specified with a sequence of path commands.
 * @author PAVAN_NAGARAJA
 * @version 1.0
 * @updated 15-????????-2014 22:55:18
 */
public class Path extends MarkedElement {

	/**
	 * a list of path commands that define the geometry of the custom shape.
	 */
	public PathCommand command;

	public Path(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}
}//end Path