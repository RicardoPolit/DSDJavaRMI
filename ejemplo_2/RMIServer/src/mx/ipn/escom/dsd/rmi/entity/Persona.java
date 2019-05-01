package mx.ipn.escom.dsd.rmi.entity;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Persona extends UnicastRemoteObject implements PersonaInterface {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String nombre;
	private String primerApellido;
	private String segundoApellido;
	private Integer edad;
	private String boleta;
	private Integer grado;

	public Persona(Integer id, String nombre, String primerApellido, String segundoApellido, Integer edad,
			String boleta, Integer grado) throws RemoteException {
		this.id = id;
		this.nombre = nombre;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.edad = edad;
		this.boleta = boleta;
		this.grado = grado;
	}

	public Persona() throws RemoteException {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPrimerApellido() {
		return primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	public String getSegundoApellido() {
		return segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getBoleta() {
		return boleta;
	}

	public void setBoleta(String boleta) {
		this.boleta = boleta;
	}

	public Integer getGrado() {
		return grado;
	}

	public void setGrado(Integer grado) {
		this.grado = grado;
	}
}
