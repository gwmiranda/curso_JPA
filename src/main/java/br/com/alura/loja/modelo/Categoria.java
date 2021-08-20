package br.com.alura.loja.modelo;

import javax.persistence.*;

@Entity
@Table(name = "categorias")
public class Categoria {

	@EmbeddedId
	private CategotiaId id;

	public Categoria() {
	}
	
	public Categoria(String nome) {
		this.id = new CategotiaId(nome, "xpto");
	}

	public String getNome() {
		return this.id.getNome();
	}

}
