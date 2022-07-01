package br.com.alura.rh.model;

import java.math.BigDecimal;
import java.time.LocalDate;


public class Funcionario extends Pessoa{


	private LocalDate dataUltimoReajuste ;

	public Funcionario(String nome, String cpf, Cargo cargo, BigDecimal salario) {
		super(nome, cpf, cargo, salario);

	}

	public void recebeReajuste(BigDecimal aumento) {

		super.setSalario(aumento);
		this.dataUltimoReajuste = LocalDate.now();
	}



	public LocalDate getDataUltimoReajuste() {
		return dataUltimoReajuste;
	}


	public void promover(Cargo novoCargo) {
		super.setCargo(novoCargo);
	}
}
