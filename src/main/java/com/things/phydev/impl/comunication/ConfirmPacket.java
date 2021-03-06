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

public class ConfirmPacket extends AbstractPacket {

    /**
     * Acknowledgement ASCII code.
     */
    public static final char ACK_CODE = 0x06;

    /**
     * Negative-acknowledge ASCII code.
     */
    public static final char NAK_CODE = 0x21;

    /**
     * The type of confirm packet.
     */
    public char confirmType;

    /**
     *
     * @param deviceID
     * @param typePackage
     * @param dataFormat
     * @param packageID
     * @param errorCode
     * @param data
     */
    public ConfirmPacket(String deviceID, int typePackage, int dataFormat,
                         long packageID, int errorCode, Object data, char confirmType) {
        super(deviceID, typePackage, dataFormat, packageID, errorCode, data);

        this.confirmType = confirmType;

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
