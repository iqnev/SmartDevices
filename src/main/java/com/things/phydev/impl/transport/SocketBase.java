/**
 * Copyright (c)  2017 Ivelin Yanev <bgfortran@gmail.com>.
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
package com.things.phydev.impl.transport;

import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

public class SocketBase {
	/*
	 * All open sockets.
	 */
	private volatile Map<String, Socket> openSockets;
	
	private static SocketBase instance = null;

	private SocketBase() {
		this.openSockets = new HashMap<String, Socket>();
	}
	
	public static SocketBase getInstance() {
		if (instance == null) {
			synchronized (SocketBase.class) {
				instance = new SocketBase();
			}
		}
		return instance;
	}
	
	/**
	 * Associates the specified socket with the specified device
	 * identification in map. If the map previously contained a mapping for the
	 * device identification, the old value is replaced by the specified value.
	 * 
	 * @param deviceID
	 * @param socket
	 */
	protected synchronized void addSocket(String deviceID, Socket socket) {
		if (deviceID != null) {
			this.openSockets.put(deviceID, socket);
		}
	}

	/**
	 * Returns the socket to which the specified device identification is
	 * mapped, or <code>NULL</code> if this map contains no mapping for the key.
	 * 
	 * @param deviceID
	 * @return
	 */
	protected synchronized Socket getSocket(String deviceID) {
		Socket socket = null;
		
		if((socket = this.openSockets.get(deviceID)) == null) { //TODO
			socket = null;
		}
		
		return socket;
	}
}
