package com.practico01.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@SuppressWarnings("deprecation")
@ManagedBean(name="registro")
@SessionScoped
public class RegistroBean {
	// nick, correo, nombre completo, contraseña
	private String nick;
	private String correo;
	private String nombreCompleto;
	private String contraseña;
	private String contraseñaVerificar;
	
	public RegistroBean() {
		// TODO Auto-generated constructor stub
	}
	
	public void registrarse() {
		System.out.println(this.toString());
	}
	
	//---------------------------------------------------------------------------
	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}
	
	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public String getContraseñaVerificar() {
		return contraseñaVerificar;
	}

	public void setContraseñaVerificar(String contraseñaVerificar) {
		this.contraseñaVerificar = contraseñaVerificar;
	}

	@Override
	public String toString() {
		return "RegistroBean [nick=" + nick + ", correo=" + correo + ", nombreCompleto=" + nombreCompleto
				+ ", contraseña=" + contraseña + ", contraseñaVerificar=" + contraseñaVerificar + "]";
	}
	
}
