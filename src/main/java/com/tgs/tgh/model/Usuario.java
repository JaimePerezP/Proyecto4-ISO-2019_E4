package com.tgs.tgh.model;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

import com.tgs.tgh.dao.UsuarioDAO;

@Document (collection = "Usuarios")
public class Usuario {

	private String DNI;
	private String password;
	private String nombre;
	private String apellidos;
	private String fechaNac;
	private String domicilio;
	private String poblacion;
	private int codigoPostal;
	private long telefono;
	private String email;
	
	
	public Usuario(String dNI, String password, String nombre, String apellidos, String fechaNac, String domicilio, String poblacion,
			int codigoPostal, long telefono, String email) {
		super();
		DNI = dNI;
		this.password = password;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNac = fechaNac;
		this.domicilio = domicilio;
		this.poblacion = poblacion;
		this.codigoPostal = codigoPostal;
		this.telefono = telefono;
		this.email = email;
	}

	public Usuario() {
		
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String getPoblacion() {
		return poblacion;
	}

	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}

	public int getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public long getTelefono() {
		return telefono;
	}

	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	
	public String getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(String fechaNac) {
		this.fechaNac = fechaNac;
	}
	
	public static Usuario identify(String userName, String pwd) throws Exception {
		return UsuarioDAO.login(userName, pwd);
	}

}