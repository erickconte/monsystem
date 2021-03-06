package br.com.itaumon.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //Indica para o Spring que esta classe estara ligada a uma tabela do BD
@Table(name="TB_USUARIO")//indica a tabela que esta ligada a classe
public class Usuario {
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)//fala que o campo sera autoincrementado
	@Id
	@Column(name="id")//especifica qual coluna relacionada com o atributo
	private int id;
	
	@Column(name="nome", length=50)
	private String nome;
	
	@Column(name="email", length=70)
	private String email;
	
	@Column(name="racf", length=70)
	private String racf;
	
	@Column(name="senha", length=20)
	private String senha;
	
	@Column(name="foto", length=100)
	private String foto;

	public Usuario() {
		super();
	}

	public Usuario(int id, String nome, String email, String racf, String senha, String foto) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.racf = racf;
		this.senha = senha;
		this.foto = foto;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRacf() {
		return racf;
	}

	public void setRacf(String racf) {
		this.racf = racf;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}
	
	

}

