/**
 * Copyright (c) 2000-2015 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */
package com.liferay.faces.alloy.component.media;

import com.liferay.faces.util.component.Styleable;

/**
 * @author  Bruno Basto
 * @author  Kyle Stiemann
 */
public abstract class Media extends MediaBase implements Styleable {

	// Public Constants
	public static final String COMPONENT_FAMILY = "com.liferay.faces.alloy.component.media";

	@Override
	public String getFamily() {
		return COMPONENT_FAMILY;
	}
}