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

package com.things.phydev.impl.comunication;

import com.things.phydev.communication.Packet;

public abstract class AbstractPacket implements Packet {
    /**
     * The value of the Error.
     */
    public int errorCode;

    /**
     * The device identifier.
     */
    public String deviceID;

    /**
     * The type of the package.
     */
    public int typePackage;

    /**
     * The data format of the payload field.
     */
    public int dataFormat;

    /**
     * The unique identifier of the current package.
     */
    public long packageID;

    /**
     * The date of any kind.
     */
    public Object data;

    /**
     * @param deviceID
     * @param typePackage
     * @param dataFormat
     * @param packageID
     * @param errorCode
     * @param data
     */
    public AbstractPacket(String deviceID, int typePackage, int dataFormat,
                          long packageID, int errorCode, Object data) {
        this.deviceID = deviceID;
        this.dataFormat = dataFormat;
        this.typePackage = typePackage;
        this.packageID = packageID;
        this.errorCode = errorCode;
        this.data = data;
    }
}
