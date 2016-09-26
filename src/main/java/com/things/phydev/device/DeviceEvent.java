/**
 * Copyright (c)  2016 Ivelin Yanev <qnev89@gmail.com>.
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

package com.things.phydev.device;

import com.things.phydev.SmartObject;
import com.things.phydev.device.Device;

public interface DeviceEvent {
    /**
     * Retrieve the value of an event device object. This object consist of all
     * information about a current device.
     *
     * @return the device object {@link Device}.
     */
    public Device getDevice();

    /**
     * Retrieve the value of an event SMART object. Through this method you can
     * recieve value changed of the SMART resource.
     *
     * @return
     */
    public SmartObject getSmart();

    /**
     * Returns the topic of this event.
     *
     * @return the topic of this event.
     */
    public String getTopic();
}
