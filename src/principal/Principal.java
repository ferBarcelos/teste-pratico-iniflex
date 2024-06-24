package principal;

import java.util.ArrayList;
import java.util.stream.Collectors;

import classes.Funcionario;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.*;

public class Principal {

	public static void main(String[] args) {

		// 3.1 Inserir os Funcionários
		List<Funcionario> funcionarios = new ArrayList<>();

		funcionarios.add(new Funcionario("Maria", LocalDate.of(2000, 10, 18), new BigDecimal("2009.44"), "Operador"));
		funcionarios.add(new Funcionario("João", LocalDate.of(1990, 05, 12), new BigDecimal("2284.38"), "Operador"));
		funcionarios.add(new Funcionario("Caio", LocalDate.of(1961, 05, 2), new BigDecimal("9836.14"), "Coordenador"));
		funcionarios.add(new Funcionario("Miguel", LocalDate.of(1988, 10, 14), new BigDecimal("19119.88"), "Diretor"));
		funcionarios
				.add(new Funcionario("Alice", LocalDate.of(1995, 01, 5), new BigDecimal("2234.68"), "Recepcionista"));
		funcionarios.add(new Funcionario("Heitor", LocalDate.of(1999, 11, 19), new BigDecimal("1582.72"), "Operador"));
		funcionarios.add(new Funcionario("Arthur", LocalDate.of(1993, 03, 31), new BigDecimal("4071.84"), "Contador"));
		funcionarios.add(new Funcionario("Laura", LocalDate.of(1994, 07, 8), new BigDecimal("3017.45"), "Gerente"));
		funcionarios
				.add(new Funcionario("Heloísa", LocalDate.of(2003, 05, 24), new BigDecimal("1606.85"), "Eletricista"));
		funcionarios.add(new Funcionario("Helena", LocalDate.of(1996, 9, 2), new BigDecimal("2799.93"), "Gerente"));

		// 3.2 Remover o funcionário
		funcionarios.removeIf(funcionario -> funcionario.getNome().equals("João"));

		// 3.3 Imprimir todos os funcionários
		System.out.println("Lista de funcionários:");
		for (Funcionario funcionario : funcionarios) {
			System.out.println("Nome: " + funcionario.getNome() + ", Data de Nascimento: " + funcionario.formatarData()
					+ ", Salário: R$ " + funcionario.formatarSalario() + ", Função: " + funcionario.getFuncao());
		}

		// 3.4 aumento de salário
		funcionarios.forEach(funcionario -> funcionario.aumentarSalario(10));

		// 3.5 Agrupar por Função
		Map<String, List<Funcionario>> porFuncao = funcionarios.stream()
				.collect(Collectors.groupingBy(Funcionario::getFuncao));

		// 3.6 Imprimir funcionários por função
		porFuncao.forEach((funcao, lista) -> {
			System.out.println("----------------------------------------------------------------------");
			System.out.println("Função: " + funcao);
			lista.forEach(funcionario -> System.out.printf("  Nome: %s, Data de Nascimento: %s, Salário: R$ %,.2f%n",
					funcionario.getNome(), funcionario.formatarData(), funcionario.getSalario()));
		});
		
		// 3.10 Imprimir em ordem alfabética
		
		System.out.println("----------------------------------------------------------------------");
		funcionarios.stream()
        .sorted(Comparator.comparing(Funcionario::getNome))
        .forEach(func -> System.out.printf("Nome: %s%n", func.getNome()));
	}
}
