package rmi;

import java.rmi.RemoteException;

public interface I_Say extends java.rmi.Remote{

    //需要抛出remote异常 
    public String SaySth() throws RemoteException; 
	
}
