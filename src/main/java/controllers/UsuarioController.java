package controllers;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import cadastro.Usuario;

@Named
@ViewScoped
public class UsuarioController implements Serializable {
	
	private static final long serialVersionUID = -6458187335274531216L;
	private Integer cont = 0;
	private Usuario usuario;
	private List<Usuario> listaUsuario;

	
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public void validarNome() {
		
	}
	
	
	public void editar() {

	}
	public void incluir() {

		}
	
	
	
	
	public void excluir() {
		
	}
	
	public void excluir(Usuario usu) {
	
	}
	
	public void limpar() {
		usuario = null;
	}

	public List<Usuario> getListaUsuario() {
		if(listaUsuario == null) {
			listaUsuario = new ArrayList<Usuario>();
	//		listaUsuario.add(new Usuario(++cont,"Leonardo", "12345678910", "jo123123@gmail.com", "321"));
	//		listaUsuario.add(new Usuario(++cont,"Leandro", "12345678910", "m123123ia@gmail.com", "333"));
	//		listaUsuario.add(new Usuario(++cont,"Lucas", "12345678910", "j123@gmail.com", "444"));
	//		listaUsuario.add(new Usuario(++cont,"Maria", "12345678910", "j123123ao@gmail.com", "321"));
	//		listaUsuario.add(new Usuario(++cont,"Jose", "12345678910", "m123123a@gmail.com", "333"));
	//		listaUsuario.add(new Usuario(++cont,"Fesrnando", "12345678910", "j123123e@gmail.com", "444"));
		
		}
		return listaUsuario;
	}
	
}
