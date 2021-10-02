package controllers;



import java.io.Serializable;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class MenuController implements Serializable {
	
	
	private static final long serialVersionUID = -8262345434693546738L;

	
	public String goToLogin() {

		return "login";
	}

	public String goToCadastrar() {
		return "cadastroautomovel";
	}
	
	public String goToConsulta() {
		return "consulta";
	}
	
	public String goToAdministradores() {
		return "administradores";
	}



}
