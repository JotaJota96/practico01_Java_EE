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
	
	public void registrarUsuario(Usuario u) {
		usuarios.add(u);
		System.out.println("--- Usuario agregado ---");
		for (Usuario usr : usuarios) {
			System.out.println(usr.toString());
		}
		System.out.println("------------------------");
	}
	
	public boolean validarLogin(String usuario, String contrasenia) {
		for (Usuario u : usuarios) {
			if (u.getNick().equals(usuario) || u.getNick().equals(usuario)) {
				return u.validarContrasenia(contrasenia);
			}
		}
		return false;
	}
}






