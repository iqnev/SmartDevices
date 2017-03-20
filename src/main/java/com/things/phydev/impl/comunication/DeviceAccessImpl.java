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

import com.things.phydev.communication.CommunicationListener;
import com.things.phydev.communication.DeviceAccess;
import com.things.phydev.communication.Packet;
import com.things.phydev.communication.ReceivedMessage;
import com.things.phydev.communication.TransportListener;
import com.things.phydev.transport.Transport;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DeviceAccessImpl implements DeviceAccess, TransportListener{
	
	private static DeviceAccessImpl instance;
	private Transport transportStream;
	private List<CommunicationListener> communicationListeners;
	
	/**
	 * 
	 * @param msTransport
	 */
	private DeviceAccessImpl(Transport mTransport) {
		this.communicationListeners = new ArrayList<CommunicationListener>();

		this.transportStream = mTransport;
	}
	
	/**
	 * Returns the Singleton instance if <code>DeviceAccessImpl</code> class,
	 * creating it if necessary.
	 * @param msTransport
	 * @return
	 */
	public static DeviceAccessImpl getInstance(Transport msTransport) {
		if (instance == null) {
			instance = new DeviceAccessImpl(msTransport);
		}

		return instance;
	}
	
    @Override
    public void postMessage(Packet pkData) throws IOException {
        pkData.getDataFormat();
		
		this.transportStream.sendData(pkData);
    }

    @Override
    public ReceivedMessage sendMessage(Packet pkData) throws IOException {
        return null;
    }

    @Override
    public void addCommunicationListener(CommunicationListener communicationListener) {
    	if (communicationListener != null) {
			this.communicationListeners.add(communicationListener);
		}
    }

    @Override
    public void removeCommunicationListener(CommunicationListener communicationListener) {
    	if (communicationListener != null) {
			this.communicationListeners.remove(communicationListener);
		}
    }

	@Override
	public void transportDataRecived(ReceivedMessage btMessage) {
		if (btMessage != null) {
			notifyListeners(btMessage);
		}		
	}
	
	public void notifyListeners(ReceivedMessage btMessage) {
		for (CommunicationListener communicationListener : communicationListeners) {
			communicationListener.messageRecieved(btMessage);
		}
	}
}
