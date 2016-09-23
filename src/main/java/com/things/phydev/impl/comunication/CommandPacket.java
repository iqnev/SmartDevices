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

package com.things.phydev.impl.comunication;

public class CommandPacket extends AbstractPacket {
    public int smartID;

    public int smartResourceID;

    /**
     *
     * @param deviceID
     * @param typePackage
     * @param dataFormat
     * @param packageID
     * @param errorCode
     * @param data
     * @param smartID
     * @param smartResourceID
     */
    public CommandPacket(String deviceID, int typePackage, int dataFormat,
                         long packageID, int errorCode, Object data, int smartID,
                         int smartResourceID) {

        super(deviceID, typePackage, dataFormat, packageID, errorCode, data);
        this.smartID = smartID;
        this.smartResourceID = smartResourceID;

    }

    @Override
    public int getErrorCode() {
        return this.errorCode;
    }

    @Override
    public int getTypePackage() {
        return this.typePackage;
    }

    @Override
    public String getDeviceId() {
        return this.deviceID;
    }

    @Override
    public Object getData() {
        return this.data;
    }

    @Override
    public long getPackageId() {
        return this.packageID;
    }

    @Override
    public int getDataFormat() {
        return this.dataFormat;
    }
}
