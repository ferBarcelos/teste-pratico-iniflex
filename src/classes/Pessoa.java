package classes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Pessoa {

	public String nome;
	public LocalDate dataNascimento;

	// construtor
	public Pessoa(String nome, LocalDate dataNascimento) {

		this.nome = nome;
		this.dataNascimento = dataNascimento;
	}

	// gets
	public String getNome() {
		return nome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	// sets
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setData(LocalDate data) {
		this.dataNascimento = dataNascimento;
	}
	
	// método para formatar data
	public String formatarData() {
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return dataNascimento.format(formatter);
		
	}
}
