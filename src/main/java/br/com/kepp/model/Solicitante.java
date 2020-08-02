package br.com.kepp.model;

public class Solicitante extends Pessoas {
	
	private Long telefone;
	private String email;
	private Long numeroSolicitacao;
	
	public Long getTelefone() {
		return telefone;
	}
	public void setTelefone(Long telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getNumeroSolicitacao() {
		return numeroSolicitacao;
	}
	public void setNumeroSolicitacao(Long numeroSolicitacao) {
		this.numeroSolicitacao = numeroSolicitacao;
	}
	
	

}
