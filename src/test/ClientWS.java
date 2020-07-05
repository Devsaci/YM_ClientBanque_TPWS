package test;

import java.rmi.RemoteException;

import ws.BanqueServiceProxy;

public class ClientWS {

	public static void main(String[] args) throws Exception {
		BanqueServiceProxy proxy=new BanqueServiceProxy();
System.out.println(proxy.conversionEuroToDH(800));
	}

}
