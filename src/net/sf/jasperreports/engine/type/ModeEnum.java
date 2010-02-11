/*
 * JasperReports - Free Java Reporting Library.
 * Copyright (C) 2001 - 2009 Jaspersoft Corporation. All rights reserved.
 * http://www.jaspersoft.com
 *
 * Unless you have purchased a commercial license agreement from Jaspersoft,
 * the following license terms apply:
 *
 * This program is part of JasperReports.
 *
 * JasperReports is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * JasperReports is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with JasperReports. If not, see <http://www.gnu.org/licenses/>.
 */
package net.sf.jasperreports.engine.type;

import net.sf.jasperreports.engine.JRConstants;



/**
 * @author Teodor Danciu (teodord@users.sourceforge.net)
 * @version $Id: JasperCompileManager.java 3033 2009-08-27 11:46:22Z teodord $
 */
public class ModeEnum extends AbstractEnum
{
	/**
	 *
	 */
	private static final long serialVersionUID = JRConstants.SERIAL_VERSION_UID;


	/**
	 * Specifies that the element is opaque.
	 */ 
	public static final ModeEnum OPAQUE = new ModeEnum((byte)1, "Opaque");
	
	/**
	 * Specifies that the element is transparent.
	 */ 
	public static final ModeEnum TRANSPARENT = new ModeEnum((byte)2, "Transparent");
	

	private ModeEnum(byte value, String xml)
	{
		super(value, xml);
	}
}
