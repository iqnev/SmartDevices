package com.things.phydev.impl.transport;

import java.io.IOException;

import com.things.phydev.communication.Packet;
import com.things.phydev.communication.TransportListener;
import com.things.phydev.transport.Transport;

public class SerialConnection implements Transport{

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
