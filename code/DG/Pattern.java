package com.project.dg;


/**
 * Pattern is a kind of fill that paints a graphical element (a tile) repeatedly
 * at fixed intervals in x and y axes to cover the areas to be filled.
 * @author PAVAN_NAGARAJA
 * @version 1.0
 * @updated 15-????????-2014 22:55:18
 */
public class Pattern extends Fill {

	/**
	 * the bounds of the pattern that define a private coordinate system for the
	 * pattern's tile.
	 */
	public int bounds;
	/**
	 * a reference to a graphical element, owned by the pattern, that works as a tile
	 * to be painted repeatedly at a fixed interval to fill an closed area.
	 */
	public GraphicalElement tile;

	public Pattern(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}
}//end Pattern