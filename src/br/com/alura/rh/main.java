package br.com.alura.rh;

import br.com.alura.rh.model.Cargo;
import br.com.alura.rh.model.Funcionario;
import br.com.alura.rh.regra_de_negocio.ValidaReajusteSalarial;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.math.BigDecimal;

public class main {

    public static void main(String [] args){
        Funcionario funcionario = new Funcionario("Joao", "10662373952", Cargo.ANALISTA,new BigDecimal("1700"));
        ValidaReajusteSalarial valida = new ValidaReajusteSalarial();

        valida.reajustarSalario(funcionario, new BigDecimal("1700"));
        System.out.println(funcionario.getSalario());
    }
}
