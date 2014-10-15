package com.project.dg;


/**
 * Style contains formatting properties that affect the appearance or style of
 * graphical elements.
 * @author PAVAN_NAGARAJA
 * @version 1.0
 * @updated 15-????????-2014 22:55:18
 */
public class Style {

	/**
	 * a color that is used to paint the enclosed regions of graphical element. A
	 * fillColor value is exclusive with a fill value. If both are specified, the fill
	 * value is used. If none is specified, no fill is applied (i.e. the element
	 * becomes see-through).
	 */
	public int fillColor;
	/**
	 * a real number (>=0 and <=1) representing the opacity of the fill or fillColor
	 * used to paint a graphical element. A value of 0 means totally transparent,
	 * while a value of 1 means totally opaque. The default is 1.
	 */
	public Real fillOpacity;
	/**
	 * whether the font used to render a text element has a <b>bold</b> style. The
	 * default is false.
	 */
	public Boolean fontBold;
	/**
	 * the color of the font used to render a text element. The default is black
	 * (red=0, green=0, blue=0).
	 */
	public int fontColor;
	/**
	 * whether the font used to render a text element has an <i>italic</i> style. The
	 * default is false.
	 */
	public Boolean fontItalic;
	/**
	 * the name of the font used to render a text element (e.g. "Times New Roman",
	 * "Arial" or "Helvetica"). The default is "Arial".
	 */
	public String fontName;
	/**
	 * a real number (>=0) representing the size (in unit of length) of the font used
	 * to render a text element. The default is 10.
	 */
	public Real fontSize;
	/**
	 * whether the font used to render a text element has a <b>strike-through</b>
	 * style. The default is false.
	 */
	public Boolean fontStrikeThrough;
	/**
	 * whether the font used to render a text element has an <b>underline</b> style.
	 * The default is false.
	 */
	public Boolean fontUnderline;
	/**
	 * the color of the stroke used to paint the outline of a graphical element. The
	 * default is black (red=0, green=0, blue=0).
	 */
	public int strokeColor;
	/**
	 * a list of real numbers specifying a pattern of alternating dash and gap lengths
	 * used in stroking the outline of a graphical element with the first one
	 * specifying a dash length. The size of the list is expected to be even. If the
	 * list is empty, the stroke is drawn solid. The default is empty list.
	 */
	public Real strokeDashLength;
	/**
	 * a real number (>=0 and <=1) representing the opacity of the stroke used for a
	 * graphical element. A value of 0 means totally transparent, while a value of 1
	 * means totally opaque. The default is 1.
	 */
	public Real strokeOpacity;
	/**
	 * a real number (>=0) representing the width of the stroke used to paint the
	 * outline of a graphical element. A value of 0 specifies no stroke is painted.
	 * The default is 1.
	 */
	public Real strokeWidth;
	/**
	 * a reference to a fill that is used to paint the enclosed regions of a graphical
	 * element. A fill value is exclusive with a fillColor value. If both are
	 * specified, the fill value is used. If none is specified, no fill is applied (i.
	 * e. the element becomes see-through).
	 */
	public Fill fill;

	public Style(){

	}

	public void finalize() throws Throwable {

	}
}//end Style