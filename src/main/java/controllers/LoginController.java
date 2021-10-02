package controllers;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import cadastro.Usuario;


@Named
@RequestScoped
public class LoginController {
	
	private String usuario = "teste";
	private String senha = "123";
	
	
	
	
	
	public String entrar() {
		System.out.println("Entrou");
		System.out.println(getUsuario());
		System.out.println(getSenha());
		
		if (getUsuario().equals("exemplo") && getSenha().equals("123")) {
			return "menu.xhtml?faces-redirect=true";
		}
		return null;
	}
	
	public void limpar() {
		usuario = "";
		senha = "";
	}
	
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
}
