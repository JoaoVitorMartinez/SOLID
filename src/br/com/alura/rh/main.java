package br.com.alura.rh;

import br.com.alura.rh.model.Cargo;
import br.com.alura.rh.model.Funcionario;
import br.com.alura.rh.regra_de_negocio.promocaoCargo.Promover;
import br.com.alura.rh.regra_de_negocio.promocaoSalarial.ValidaPeriodicidadeReajuste;
import br.com.alura.rh.regra_de_negocio.promocaoSalarial.ValidaReajusteSalarial;
import br.com.alura.rh.regra_de_negocio.promocaoSalarial.ValidaValorReajuste;

import java.math.BigDecimal;
import java.util.List;

public class main {

    public static void main(String [] args){
        Funcionario funcionario = new Funcionario("Joao", "10662373952", Cargo.ANALISTA,new BigDecimal("1000"));

        ValidaReajusteSalarial valida = new ValidaReajusteSalarial(List.of(new ValidaPeriodicidadeReajuste(), new ValidaValorReajuste()));

        System.out.println(funcionario.getSalario());
        valida.reajustarSalario(funcionario, new BigDecimal("400"));
        System.out.println(funcionario.getSalario());

        Promover promoveFuncionario = new Promover();

        promoveFuncionario.promover(funcionario, false);
        System.out.println(funcionario.getCargo());
        promoveFuncionario.promover(funcionario, true);
        promoveFuncionario.promover(funcionario, true);




    }
}
