package br.com.alura.rh.regra_de_negocio.promocaoSalarial;

import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.Funcionario;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ValidaPeriodicidadeReajuste implements Valida{


    @Override
    public boolean valida(Funcionario funcionario, BigDecimal aumento) {
        if(funcionario.getDataUltimoReajuste() == null){
            return true;
        }
        int ultimoReajuste = funcionario.getDataUltimoReajuste().getMonthValue();
        int periodo = LocalDate.now().getMonthValue() - ultimoReajuste;

        if(periodo<6){

            throw new ValidacaoException("Um novo reajuste só pode ser feito após seis meses do último reajuste");

        }

        return true;
    }
}
