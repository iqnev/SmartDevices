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

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

/**
 * @author fortran
 *
 */
public class TransportRequest implements Runnable{
	private Socket socket;
	private DataInputStream clientData;

	/**
	 * Default Constructor.
	 * 
	 * @param clientSocket
	 *            the connection to be made to this socket and accepts it.
	 */
	public TransportRequest(final Socket clientSocket) {
		this.socket = clientSocket;
	}

	@Override
	public void run() {
		try {
			clientData = new DataInputStream(this.socket.getInputStream());
			//reading the frame
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			closeResources();
		}
	}

	/**
	 * Closing all open resources.
	 */
	private void closeResources() {
		// Closing the stream handle
		if (clientData != null) {
			try {
				clientData.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
