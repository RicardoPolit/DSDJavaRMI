package mx.ipn.escom.dsd.rmi.model;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import mx.escom.ipn.dsd.rmi.interfaces.ConversorMonedaInterface;

public class ConversorMoneda extends UnicastRemoteObject implements ConversorMonedaInterface {

	public ConversorMoneda() throws RemoteException {
		super();
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public Double convert(Integer idOrigen, Integer idDestino, Double monto) throws RemoteException {
		return monto*20;
	}

}
