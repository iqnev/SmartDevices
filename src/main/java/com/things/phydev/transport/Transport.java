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

package com.things.phydev.transport;

import com.things.phydev.communication.Packet;
import com.things.phydev.communication.TransportListener;

import java.io.IOException;

public interface Transport {
    /**
     * * When an object implementing interface <code>Transport</code> is used to
     * send data by open communication chanel(socket). This method is designed
     * to provide a mechanism that sends data.
     *
     * @param mData the date for wrapped in the appropriate format.
     * @throws IOException if Socket can't be used.
     * @throws IOException
     */
    public void sendData(Packet mData) throws IOException;

    /**
     * This method adds the object by type <code>TransportListener</code>. When
     * the object is added, it is ready to receive events. If listener
     * transportListener is <code>Null</code>, no exception is thrown and no
     * action is performed.
     *
     * @param transportListener the object by type <code>TransportListener</code>
     *                          {@link TransportListener}.
     */
    public void addTransportListener(TransportListener transportListener);

    /**
     * Removes the specified transport listener so that it no longer receives
     * events from this component. This method performs no function, nor does it
     * throw an exception, if the listener specified by the argument was not
     * previously added to this component. If listener transportListener is
     * <code>Null</code>, no exception is thrown and no action is performed.
     *
     * @param transportListener the object by type <code>TransportListener</code>
     *                          {@link TransportListener}.
     */
    public void removeTransportListener(TransportListener transportListener);

    /**
     * Closes the open connection.
     *
     * @return <code>true</code> if the connection is closed. <code>false</code>
     * otherwise.
     */
    public boolean close();
}
