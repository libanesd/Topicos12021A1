package models;

import java.time.LocalDate;
import java.util.Objects;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;


public class Usuario implements Cloneable {
	private Integer id;
	private String nome;
	private String cpf;
	@Email(message = "Email com formato inválido.")
	@NotBlank(message = "O email deve ser informado")
	private String email;
	private String senha;
	public Usuario() {

	}

	public Usuario(Integer id, String nome, String cpf, String email, String senha) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.senha = senha;

	}


}
