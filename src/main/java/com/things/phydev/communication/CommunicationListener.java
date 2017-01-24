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

package com.things.phydev.communication;

public interface CommunicationListener {
    /**
     * This method called when a device sends data to the <b>Driver</b> and this
     * data is valid. Then the user, who use a message can get current
     * information, that provided by a message. The user has a set of the
     * following methods: {@link ReceivedMessage}.
     *
     * @param btMessage the package object {@link ReceivedMessage}.
     */
    public void messageRecieved(ReceivedMessage btMessage);

    /**
     * This method called when a new device wants attached to the <b>Driver</b>.
     * The event contains object, which consist common information about the
     * <b>Device</b>.
     *
     * @param btMessage the package object {@link ReceivedMessage}.
     */
    public void onDeviceAttached(ReceivedMessage btMessage);
}
