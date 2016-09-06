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

package com.things.phydev;


import java.util.List;

public interface Device {
    /**
     * The error code indicates that the end device is broken.
     */
    static final int DEVICE_BROKEN_ERROR = 1004;

    /**
     * The error code indicates that there is error when a protocol command is
     * sent.
     */
    static final int DEVICE_COMMUNICATION_ERROR = 1007;

    /**
     * The error code indicates that version of the device is not supported.
     */
    static final int DEVICE_VERSION_ERROR = 1009;

    /**
     * Indicates unknown error.
     */
    static final int DEVICE_UNKNOWN_ERROR = 1000;

    /**
     * The error code indicates that the controller or end device is not
     * available and it is not accessible.
     */
    static final int DEVICE_NOT_ACCESSIBLE_ERROR = 1011;

    /**
     * This method returns all SMART objects by a current device. User
     * applications can use this information for representation of the device
     * information. <br>
     * Each of this objects is provided by {@link class.
     *
     * @return the SMART objects.
     */
    public List<SmartObject> getAllSmartObjects();

    /**
     * Returns the unique id of the device. Each device has an unique id and it
     * distinguishes individual devices. The id consists of alphabet and
     * numbers. Its length is not fixed.
     *
     * @return the id's device.
     */
    public String getId();

    /**
     * This method add the object by type <code>SmartObject</code>. When the
     * object is added, it is ready to receive events. If listener ipsoListener
     * is <code>Null</code>, no exception is thrown and no action is performed.
     *
     * @param ipsoListener the object by type <code>IpsoObject</code> {@link SmartObject}.
     */
    public void addSmartListener(SmartListener ipsoListener);

    /**
     * Removes the specified SMART listener so that it no longer receives IPSO
     * events from this component. This method performs no function, nor does it
     * throw an exception, if the listener specified by the argument was not
     * previously added to this component. If listener ipsoListener is
     * <code>Null</code>, no exception is thrown and no action is performed.
     *
     * @param smartListener the object by type <code>IpsoObject</code> {@link SmartObject}.
     */
    public void removeIpsoListener(SmartListener smartListener);

    /**
     * Adds SMART object which is provided by SMART object id. When the method
     * gets the <code>smartID</code> then it checks if SMART object exists.
     *
     * @param smartID the id of the IPSO object.
     */
    public void addObjects(int smartID);
}
