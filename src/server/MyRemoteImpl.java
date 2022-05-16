package server;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

@SuppressWarnings("serial")
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {

	public String sayHello() throws RemoteException {
		return "Server says, 'Hey'";
	}
	
	public MyRemoteImpl() throws RemoteException { }
	
	public static void main (String[] args) {
		try {
			MyRemote service = new MyRemoteImpl();
			Naming.bind("Remote Hello", service);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	
}
