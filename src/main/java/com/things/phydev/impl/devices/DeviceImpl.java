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

import java.util.List;

import com.things.phydev.SmartObject;
import com.things.phydev.communication.DeviceAccess;
import com.things.phydev.device.Device;
import com.things.phydev.device.DeviceListener;

/**
 * @author fortran
 *
 */
public class DeviceImpl extends AbstractDevice implements Device{
	
	public DeviceImpl(String ID, DeviceAccess deviceAccess) {
		super();
		this.ID = ID;
		this.deviceAccess = deviceAccess;
	}
	
	@Override
	public List<SmartObject> getAllSmartObjects() {
		return this.objects;
	}

	@Override
	public String getId() {
		return this.ID;
	}

	@Override
	public void addSmartListener(DeviceListener devListener) {
		if (smartListener != null) {
			this.smartListener.add(devListener); //TODO
		}
		
	}

	@Override
	public void removeIpsoListener(DeviceListener deviceListener) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addObjects(int smartID) {
		// TODO Auto-generated method stub
		
	}

}
