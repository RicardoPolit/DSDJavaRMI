package mx.ipn.escom.dsd.rmi.model;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

import mx.escom.ipn.dsd.rmi.interfaces.BusquedaPersonaInterface;
import mx.ipn.escom.dsd.rmi.entity.Persona;
import mx.ipn.escom.dsd.rmi.entity.PersonaInterface;

public class Busqueda extends UnicastRemoteObject implements BusquedaPersonaInterface {

	public Busqueda() throws RemoteException {
		super();
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public List<PersonaInterface> findByAttributes(PersonaInterface persona) throws RemoteException {
		List<PersonaInterface> personas = new ArrayList<>();
		personas.add(new Persona(1, "Hermes Francisco", "montes", "casiano", 31, "2006630193", 8));
		personas.add(new Persona(2, "Juan Carlos", "montes", "casiano", 31, "2006630193", 8));
		personas.add(new Persona(3, "Pedro", "montes", "casiano", 31, "2006630193", 8));
		return personas;
	}

	@Override
	public Persona findById(Integer id) throws RemoteException {
		return new Persona(1, "Hermes Francisco", "montes", "casiano", 31, "2006630193", 8);
	}

}
