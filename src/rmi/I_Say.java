package rmi;

import java.rmi.RemoteException;

public interface I_Say extends java.rmi.Remote{

    //��Ҫ�׳�remote�쳣 
    public String SaySth() throws RemoteException; 
	
}
