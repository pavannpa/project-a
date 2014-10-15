package com.project.dg;


/**
 * Fill is the abstract super class of all kinds of fills that are used to paint
 * the interior of graphical elements.
 * @author PAVAN_NAGARAJA
 * @version 1.0
 * @updated 15-????????-2014 22:55:17
 */
public abstract class Fill {

	/**
	 * a list of zero or more transforms to apply to this fill.
	 */
	public Transform transform;

	public Fill(){

	}

	public void finalize() throws Throwable {

	}
}//end Fill