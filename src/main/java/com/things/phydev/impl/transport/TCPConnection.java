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

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.things.phydev.communication.Packet;
import com.things.phydev.communication.TransportListener;
import com.things.phydev.transport.Transport;

public class TCPConnection extends AbstractTransport implements Transport {
	
	private static TCPConnection instance;

	private ServerSocket serverSocket = null;

	private Socket clientSocket;

	private static final int PORT = 2323;

	private static final int MAX_THREAD = 13;
	
	private ExecutorService executorService = Executors
			.newFixedThreadPool(MAX_THREAD);
	
	private void TCPConnection() throws IOException {
		
		connect();
	}
	
	public static TCPConnection getInstance() throws IOException {
		if (instance == null) {
			synchronized (TCPConnection.class) {
				instance = new TCPConnection();
			}
		}
		return instance;
	}	
	
	private void connect() throws IOException {
		serverSocket = new ServerSocket(PORT);
	}
	
	private void start() throws IOException {
		try {
			while (true) {
				clientSocket = serverSocket.accept();
				executorService.execute(new TransportRequest(clientSocket));
			}
		} finally {
			// shutdown the thread-pool when we are done
			executorService.shutdown();
			if (clientSocket != null) {
				clientSocket.close();
			}
		}
	}
	
	@Override
	public void sendData(Packet mData) throws IOException {
		// TODO gets socket by device id and getRequestPackage method Calling
		if(mData.getDeviceId() == null) {
			throw new NullPointerException("Device ID is null");
		}
		
		
	}

	@Override
	public void addTransportListener(TransportListener transportListener) {
		if (transportListener != null) {
			this.tListeners.add(transportListener);
		}
		
	}

	@Override
	public void removeTransportListener(TransportListener transportListener) {
		if (transportListener != null) {
			this.tListeners.remove(transportListener);
		}
		
	}

	@Override
	public boolean close() {
		// TODO Auto-generated method stub
		return false;
	}

}
