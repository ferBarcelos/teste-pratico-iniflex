package classes;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Funcionario extends Pessoa {

	private BigDecimal salario;
	private String funcao;

	// construtor
	public Funcionario(String nome, LocalDate dataNascimento, BigDecimal salario, String funcao) {
		super(nome, dataNascimento);
		this.salario = salario;
		this.funcao = funcao;
	}

	//gets
	public BigDecimal getSalario() {
		return salario;
	}

	public String getFuncao() {
		return funcao;
	}

	//sets
	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	
	//método para formatar salário com separador de milhar e duas casas decimais
	public String formatarSalario() {
		return String.format("%,.2f", salario); 
	}	
	
	//método aumento de salário
	public void aumentarSalario (double percentual) {
		BigDecimal aumento = salario.multiply(BigDecimal.valueOf(percentual / 100.0));
        salario = salario.add(aumento);
	}
}
