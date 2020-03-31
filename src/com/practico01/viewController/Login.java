package com.practico01.viewController;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import com.practico01.manejadores.ManejadorDeUsuarios;

@Named(value = "login")
@SessionScoped
public class Login implements Serializable{
	private static final long serialVersionUID = 1L;

	@EJB
	private ManejadorDeUsuarios manejadorDeUsuarios;
	
	private String usuario;
	private String contrasenia;

	
	public Login() {
		// TODO Auto-generated constructor stub
	}
	
	public String login() {
		if (manejadorDeUsuarios.validarLogin(usuario, contrasenia)) {
			return "bienvenida";
		}else {
			return "login";
		}
	}
	
	//-------------------------------------------------------------------------
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getContrasenia() {
		return contrasenia;
	}
	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
	
}
