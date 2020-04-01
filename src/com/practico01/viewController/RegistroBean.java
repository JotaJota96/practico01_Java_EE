package com.practico01.viewController;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import com.practico01.clases.Usuario;
import com.practico01.manejadores.ManejadorDeUsuarios;

import java.io.IOException;
import java.io.Serializable;

@Named(value = "registro")
@SessionScoped
public class RegistroBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@EJB
	private ManejadorDeUsuarios manejadorDeUsuarios;
	
	// nick, correo, nombre completo, contraseña
	private String nick;
	private String correo;
	private String nombreCompleto;
	private String contraseña;
	private String contraseñaVerificar;
	
	public RegistroBean() {
	}
	
	public String registrarse() throws IOException {
		Usuario nuevoUsuario = new Usuario(nick, correo, nombreCompleto, contraseña);
		boolean agregado = manejadorDeUsuarios.registrarUsuario(nuevoUsuario);
		String outcome;
		if (agregado) {
			outcome = "bienvenida";
		}else {
			outcome = "registro";
		}
		return outcome;
	}
	
	//---------------------------------------------------------------------------
	@PostConstruct
	public void init() {
		
	}
	
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
