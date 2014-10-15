package com.project.dg;


/**
 * Group defines a group of graphical elements that can be styled, clipped and/or
 * transformed together.
 * @author PAVAN_NAGARAJA
 * @version 1.0
 * @updated 15-????????-2014 22:55:17
 */
public class Group extends GraphicalElement {

	/**
	 * the list of graphical elements that are members of (owned by) this group.
	 */
	public GraphicalElement member;

	public Group(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}
}//end Group