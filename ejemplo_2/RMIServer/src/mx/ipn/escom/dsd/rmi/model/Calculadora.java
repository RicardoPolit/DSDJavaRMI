package mx.ipn.escom.dsd.rmi.model;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import mx.escom.ipn.dsd.rmi.interfaces.CalculadoraInterface;
import mx.escom.ipn.dsd.rmi.interfaces.exception.DivZeroException;

public class Calculadora extends UnicastRemoteObject implements
		CalculadoraInterface {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Calculadora() throws RemoteException {
		super();
	}

	@Override
	public Integer suma(Integer a, Integer b) throws RemoteException {
		return a + b;
	}

	@Override
	public Integer diferencia(Integer a, Integer b) throws RemoteException {
		return a - b;
	}

	@Override
	public Integer producto(Integer a, Integer b) throws RemoteException {
		return a * b;
	}

	@Override
	public Integer cociente(Integer a, Integer b) throws RemoteException,
			DivZeroException {
		if (b.equals(0)) {
			throw new DivZeroException();
		}
		return a / b;
	}

	public Double getPi() {
		return Math.PI;
	}
}
