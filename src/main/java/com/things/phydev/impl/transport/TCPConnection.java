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

import com.things.phydev.communication.Packet;
import com.things.phydev.communication.TransportListener;
import com.things.phydev.transport.Transport;

public class TCPConnection extends AbstractTransport implements Transport {

	@Override
	public void sendData(Packet mData) throws IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addTransportListener(TransportListener transportListener) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeTransportListener(TransportListener transportListener) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean close() {
		// TODO Auto-generated method stub
		return false;
	}

}
