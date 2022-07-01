package br.com.alura.rh.regra_de_negocio.promocaoSalarial;

import br.com.alura.rh.model.Funcionario;

import java.math.BigDecimal;
import java.util.List;

public  class ValidaReajusteSalarial {

    private final List<Valida> validacao;

    public ValidaReajusteSalarial(List<Valida> validacao) {
        this.validacao = validacao;
    }

    public  void reajustarSalario(Funcionario funcionario, BigDecimal aumento){
        this.validacao.forEach(v -> v.valida(funcionario, aumento));

        funcionario.recebeReajuste(funcionario.getSalario().add(aumento));

    }

}
