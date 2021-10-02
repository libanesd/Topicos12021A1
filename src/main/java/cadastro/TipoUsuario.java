package cadastro;


public class TipoUsuario {
	//ADMINISTRADOR(1,"Adminstrador"),
	//CLIENTE(2,"Cliente");

	private int index;
	private String label;
	
	
	TipoUsuario(int index, String label) {
		this.index = index;
		this.label = label;
	}
	
	
	public int getIndex() {
		return index;
	}

	public String getLabel() {
		return label;
	}


}
