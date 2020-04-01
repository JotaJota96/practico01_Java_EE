package com.practico01.manejadores;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Singleton;

import com.practico01.clases.Usuario;

@Singleton
public class ManejadorDeUsuarios {
	
	private List<Usuario> usuarios;
	
	public ManejadorDeUsuarios() {
		usuarios = new ArrayList<Usuario>();
	}
	
	public boolean registrarUsuario(Usuario u) {
		if (buscarUsuario(u.getNick(), u.getCorreo()) == null) {
			usuarios.add(u);
			
			System.out.println("--- Usuario agregado ---");
			for (Usuario usr : usuarios) {
				System.out.println(usr.toString());
			}
			System.out.println("------------------------");
			
			return true;
		}else {
			return false;
		}
	}
	
	public boolean validarLogin(String identificador, String contrasenia) {
		Usuario u = buscarUsuario(identificador);
		if (u == null) {
			System.out.println("Usuario no encontrado");
			return false;
		}else {
			System.out.println("Usuario encontrado, " + u.validarContrasenia(contrasenia));
			return u.validarContrasenia(contrasenia);
		}
	}
	
	private Usuario buscarUsuario(String identificador) {
		for (Usuario u : usuarios) {
			if (u.getNick().equals(identificador) || u.getContraseña().equals(identificador)) {
				return u;
			}
		}
		return null;
	}

	private Usuario buscarUsuario(String nick, String correo) {
		for (Usuario u : usuarios) {
			if (u.getNick().equals(nick) || u.getContraseña().equals(correo)) {
				return u;
			}
		}
		return null;
	}
	
}






