package com.tatiane.EntregaMedicamentosSus.Entities;

public class Entregador extends Pessoa{
private static final long serialVersionUID = 1L;

	private String login;
	private String senha;
	
	public Entregador() {
		
	}

	public Entregador(String login, String senha) {
		super();
		this.login = login;
		this.senha = senha;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
}
