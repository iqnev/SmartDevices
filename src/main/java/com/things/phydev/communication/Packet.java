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

package com.things.phydev.communication;

public interface Packet {
    /**
     * Indicates that the communication has Serial Data Format.
     */
    public static final int SERIAL_DATA_FORMAT = 1;

    /**
     * Indicates that the communication has JSON Data Format.
     */
    public static final int JSON_DATA_FORMAT = 2;

    /**
     * The constant, which indicates that the type of the package is "attached a
     * new device".
     */
    public static final int MESSAGE_ATTACH = 1;

    /**
     * The default communication package;
     */
    public static final int MESSAGE_REQUEST = 2;

    /**
     * The package for verification of the operations.
     */
    public static final int MESSAGE_ACKNOWLEDGE = 3;

    /**
     * The package for any kind error operations.
     */
    public static final int MESSAGE_ERROR = 4;

    /**
     * Returns the error code, which can occurs during the communication between
     * the <b>Driver</b> and the <b>Device</b>.
     *
     * @return the error code.
     */
    public int getErrorCode();

    /**
     * Return the type of the message. These constants are defined above. Also
     * this code determined, which event will be sent to the upper layer.
     *
     * @return the type of the message.
     */
    public int getTypePackage();

    /**
     * This method returns the unique id of a device
     *
     * @return the unique id of a device.
     */
    public String getDeviceId();

    /**
     * This method returns the parameter, that can contain any kind additional
     * data.
     *
     * @return the additional data or <code>Null</code>.
     */
    public Object getData();

    /**
     * Returns the package id. This id is a unique identifier for every message,
     * which was sent by the <b>Driver</b>.
     *
     * @return the package id.
     */
    public long getPackageId();

    /**
     * Returns data format, which is supported by the current communication
     * between the device and the the driver.
     *
     * @return the data format
     */
    public int getDataFormat();
}
