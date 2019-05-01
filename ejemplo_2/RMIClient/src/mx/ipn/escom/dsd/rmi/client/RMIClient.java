package mx.ipn.escom.dsd.rmi.client;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.List;

import mx.escom.ipn.dsd.rmi.interfaces.BusquedaPersonaInterface;
import mx.escom.ipn.dsd.rmi.interfaces.CalculadoraInterface;
import mx.escom.ipn.dsd.rmi.interfaces.ConversorMonedaInterface;
import mx.escom.ipn.dsd.rmi.interfaces.exception.DivZeroException;
import mx.ipn.escom.dsd.rmi.entity.PersonaInterface;

public class RMIClient {
	public static void main(String[] args) {
		try {
			System.setSecurityManager(new SecurityManager());
			final Registry registry = LocateRegistry.getRegistry("localhost", Registry.REGISTRY_PORT);
			CalculadoraInterface calculadora = (CalculadoraInterface) registry.lookup("rmi://Calculadora");
			BusquedaPersonaInterface busqueda = (BusquedaPersonaInterface) registry.lookup("rmi://Busqueda");
			ConversorMonedaInterface conversor = (ConversorMonedaInterface) registry.lookup("rmi://Conversor");
			System.out.println("Enviando peticiones....");
			System.out.println("Suma: " + calculadora.suma(1, 3));
			System.out.println("Resta: " + calculadora.diferencia(1, 3));
			System.out.println("Producto: " + calculadora.producto(1, 3));
			System.out.println("Cociente 1: " + calculadora.cociente(1, 1));
			System.out.println("Busqueda de varias personas: ");
//			List<PersonaInterface> personas = (List<PersonaInterface>)busqueda.findByAttributes(null);
//			for (PersonaInterface p : personas) {
//				System.out.println("---> Persona: " + p.getId() + " " + p.getNombre() + " " + p.getPrimerApellido()
//						+ " " + p.getSegundoApellido());
//			}
//			System.out.println("Busqueda de una personas: ");
//			PersonaInterface p = busqueda.findById(1);
//			System.out.println("---> Persona: " + p.getId() + " " + p.getNombre() + " " + p.getPrimerApellido() + " "
//					+ p.getSegundoApellido());
			List<PersonaInterface> personas = busqueda.findByAttributes(null);
			for (Object p : personas) {
				System.out.println("--> Instancia: " + p.getClass());
			}
			System.out.println("---> Conversión: " + conversor.convert(1, 2, 300d));
		} catch (RemoteException re) {
			re.printStackTrace();
		} catch (NotBoundException nbe) {
			nbe.printStackTrace();
		} catch (DivZeroException dze) {
			dze.printStackTrace();
		}
	}
}
