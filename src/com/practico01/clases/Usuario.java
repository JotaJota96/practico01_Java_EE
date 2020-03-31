package com.practico01.clases;

public class Usuario {
    private String nick;
    private String correo;
    private String nombreCompleto;
    private String contrasenia;
    
    public Usuario(){
        this.nick = "";
        this.correo = "";
        this.nombreCompleto = "";
        this.contrasenia = "";
    }
    
    public Usuario(String nick, String correo, String nombreCompleto, String contraseña) {
        this.nick = nick;
        this.correo = correo;
        this.nombreCompleto = nombreCompleto;
        this.contrasenia = contraseña;
    }
    
    public boolean validarContrasenia(String contrasenia) {
    	return this.contrasenia == contrasenia;
    }
    
    //-------------------------------------------------------------------------------
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
        return contrasenia;
    }
    public void setContraseña(String contraseña) {
        this.contrasenia = contraseña;
    }

    @Override
    public String toString() {
        return "usuario [nick=" + nick + ", correo=" + correo + ", nombreCompleto=" + nombreCompleto + ", contraseña="
                + contrasenia + "]";
    }

}
