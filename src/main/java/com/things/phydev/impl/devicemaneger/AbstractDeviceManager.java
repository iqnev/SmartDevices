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

import com.things.phydev.communication.DeviceAccess;
import com.things.phydev.device.Device;
import com.things.phydev.device.DeviceEvent;
import com.things.phydev.device.DeviceListener;


import java.util.ArrayList;
import java.util.List;

public abstract class AbstractDeviceManager {

    /**
     * The list with all devices.
     */
    public  List<Device> devices;
    
    public DeviceAccess dAccess;

    /**
     * The list with registered event listeners.
     */
    public List<DeviceListener> deviceListenerList;

    /**
     *
     */
    public AbstractDeviceManager() {
        this.devices = new ArrayList<Device>();
    }


    public void notifyListeners(DeviceEvent deviceEvent) {
        for (DeviceListener deviceListener : deviceListenerList) {
            //TODO
        }
    }

    /**
     *
     * @param devID
     * @return
     */
    public abstract boolean addDevice(String devID);

    /**
     *
     * @param devID
     * @return
     */
    public abstract boolean deleteDevice(String devID);

    /**
     *
     * @param devID
     * @param smartID
     * @return
     */
    public abstract boolean addSmartResource(String devID, int smartID);
}
