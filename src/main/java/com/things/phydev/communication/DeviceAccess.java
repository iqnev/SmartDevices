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

import java.io.IOException;

public interface DeviceAccess {
    /**
     * Adds an organization with a parameter for sending request to any kind of
     * device. In order to use this method, you need to create an object of type
     * Message {@link Packet}. This method is asynchronous method and it doesn't
     * block. The response is obtained indefinitely.To get the answer the
     * application should register the event listener {@link ReceivedMessage}.
     *
     * @param pkData the package of data {@link Packet}.
     */
    public void postMessage(Packet pkData) throws IOException;

    /**
     * This method does the same job as above method
     * {@link DeviceAccess#postMessage(Packet)} but with the difference that it
     * is asynchronous. It blocks as long as the <b>Device</b> does not return
     * response.
     *
     * @param pkData the package of data {@link Packet}.
     * @return the response of data {@link ReceivedMessage}.
     */
    public ReceivedMessage sendMessage(Packet pkData) throws IOException;

    /**
     * This method adds the object by type <code>CommunicationListener</code>.
     * When the object is added, it is ready to receive events. If listener
     * communicationListener is <code>Null</code>, no exception is thrown and no
     * action is performed.
     *
     * @param communicationListener the object by type <code>CommunicationListener</code>
     *                              {@link CommunicationListener}.
     */
    public void addCommunicationListener(
            CommunicationListener communicationListener);

    /**
     * Removes the specified Message listener so that it no longer receives
     * Message events from this component. This method performs no function, nor
     * does it throw an exception, if the listener specified by the argument was
     * not previously added to this component. If listener communicationListener
     * is <code>Null</code>, no exception is thrown and no action is performed.
     *
     * @param communicationListener the object by type <code>CommunicationListener</code>
     *                              {@link CommunicationListener}.
     */
    public void removeCommunicationListener(
            CommunicationListener communicationListener);
}
