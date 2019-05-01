package mx.ipn.escom.dsd.rmi.interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import mx.ipn.escom.dsd.rmi.modelo.Persona;

public interface BusquedaPersonaInterface extends Remote {
	public List<Persona> findByAttributes(Persona persona) throws RemoteException;
}
