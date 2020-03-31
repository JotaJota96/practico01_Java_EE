package com.practico01.viewController;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named(value = "bienvenida")
@SessionScoped
public class Bienvenida implements Serializable {
	private static final long serialVersionUID = 1L;

	public Bienvenida() {
		// TODO Auto-generated constructor stub
	}

}
