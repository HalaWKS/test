package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class SaySth extends UnicastRemoteObject implements I_Say{

	protected SaySth() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String SaySth() throws RemoteException {
		return null;
	}

}
