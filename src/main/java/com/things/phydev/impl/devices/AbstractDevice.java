/**
 * Copyright (c)  2017 Ivelin Yanev <bgfortran@gmail.com>.
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or (at your option) any later version.
 * <p>
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * <p>
 * You should have received a copy of the GNU General Public License along with
 * this program; if not, write to the Free Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110, USA
 */
package com.things.phydev.impl.devices;

import java.util.ArrayList;
import java.util.List;

import com.things.phydev.SmartObject;
import com.things.phydev.communication.DeviceAccess;

/**
 * @author fortran
 *
 */
public abstract class AbstractDevice {
	
	protected final List<SmartObject> objects;

	
	protected List<SmartObject> smartListener;

	
	protected String ID;

	
	protected DeviceAccess deviceAccess;

	protected AbstractDevice() {
		this.objects = new ArrayList<SmartObject>();
	}
}
