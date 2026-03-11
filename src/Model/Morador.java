package Model;

import java.util.Objects;

public class Morador {
	
	private String nome;
	private String cpf;
	private String senha;
	private String residencia;
	
	public Morador(String nome, String cpf, String senha, String residencia) {
		if (nome == null || nome.trim().equals(""))
 			throw new IllegalArgumentException("Nome inválido!");
		
		if (cpf == null || cpf.length() != 11)
            throw new IllegalArgumentException("O CPF deve ter onze dígitos!");
		
		if (senha == null || senha.length() < 8)
            throw new IllegalArgumentException("Senha deve ter no mínimo oito caracteres!");
		
		if (residencia == null || residencia.length() != 7)
            throw new IllegalArgumentException("O identificador de residência deve ter sete caracteres!");
		
		this.nome = nome;
		this.cpf = cpf;
		this.senha = senha;
		this.residencia = residencia;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public String getResidencia() {
		return residencia;
	}
	
	public void alterarSenha(String senhaAtual, String novaSenha) {
		if(senhaAtual == null) {
			throw new IllegalArgumentException("Senha atual inválida!");
		}
		
		if(!this.senha.equals(senhaAtual)){
			throw new IllegalArgumentException("Senha atual incorreta!");
		}
		
		if(novaSenha == null || novaSenha.length() < 8) {
			throw new IllegalArgumentException("Nova senha inválida!");
		}
		
		this.senha = novaSenha;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(cpf);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(getClass() != obj.getClass())
			return false;
		Morador other = (Morador) obj;
		return Objects.equals(cpf, other.cpf);
	}
	
	@Override
	public String toString() {
		return nome + "," + residencia;
	}
}