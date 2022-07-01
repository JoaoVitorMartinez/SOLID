package br.com.alura.rh.regra_de_negocio.promocaoSalarial;

import br.com.alura.rh.model.Funcionario;

import java.math.BigDecimal;

public interface Valida {
    boolean valida(Funcionario funcionario, BigDecimal aumento);
}
