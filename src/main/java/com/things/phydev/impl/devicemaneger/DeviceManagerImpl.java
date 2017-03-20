/**
 * Copyright (c)  2016 Ivelin Yanev <bgfortran@gmail.com>.
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

package com.things.phydev.impl.devicemaneger;

import com.things.phydev.device.Device;
import com.things.phydev.device.DeviceListener;
import com.things.phydev.device.DeviceManager;
import com.things.phydev.communication.CommunicationListener;
import com.things.phydev.communication.DeviceAccess;
import com.things.phydev.communication.ReceivedMessage;

import java.util.List;

/**
 * TODO
 */
public class DeviceManagerImpl extends AbstractDeviceManager implements CommunicationListener, DeviceManager {
	
	/**
	 * 
	 * @param deviceAccess
	 */
	public DeviceManagerImpl(final DeviceAccess deviceAccess) {
		this.dAccess = deviceAccess;
		
		this.dAccess.addCommunicationListener(this);
	}

    @Override
    public boolean addDevice(String devID) {
        return false;
    }

    @Override
    public boolean deleteDevice(String devID) {
    	boolean successDeleted = false;
    	if(devID != null) {
    		this.devices.remove(1); //Todo add method getDeviceByID()
    		successDeleted = true;
    	}
        return successDeleted;
    }

    @Override
    public boolean addSmartResource(String devID, int smartID) {
        return false;
    }

    @Override
    public void messageRecieved(ReceivedMessage btMessage) {

    }

    @Override
    public void onDeviceAttached(ReceivedMessage btMessage) {

    }

    @Override
    public List<Device> getAllDevices() {
        return this.devices;
    }

    @Override
    public void removeDeviceListener(DeviceListener deviceListener) {
        if(deviceListener != null) {
            this.deviceListenerList.remove(deviceListener);
        }
    }

    @Override
    public void addDeviceListener(DeviceListener deviceListener) {
        if(deviceListener != null) {
            this.deviceListenerList.add(deviceListener);
        }
    }
}
