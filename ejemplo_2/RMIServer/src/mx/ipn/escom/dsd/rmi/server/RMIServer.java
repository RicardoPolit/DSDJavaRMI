package mx.ipn.escom.dsd.rmi.server;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import mx.ipn.escom.dsd.rmi.model.Busqueda;
import mx.ipn.escom.dsd.rmi.model.Calculadora;
import mx.ipn.escom.dsd.rmi.model.ConversorMoneda;

public class RMIServer {
	public static void main(String[] args) {
		try {
			System.setSecurityManager(new SecurityManager());
			final Registry registry = LocateRegistry
					.createRegistry(Registry.REGISTRY_PORT);
			Calculadora calculadora = new Calculadora();
			Busqueda busqueda = new Busqueda();
			ConversorMoneda conversor = new ConversorMoneda();
			registry.rebind("rmi://Calculadora", calculadora);
			registry.rebind("rmi://Busqueda", busqueda);
			registry.rebind("rmi://Conversor", conversor);
		} catch (RemoteException re) {
			re.printStackTrace();
		}
	}
}
