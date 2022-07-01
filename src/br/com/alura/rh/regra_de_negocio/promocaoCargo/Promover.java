package br.com.alura.rh.regra_de_negocio.promocaoCargo;

import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.Cargo;
import br.com.alura.rh.model.Funcionario;

public class Promover {
    public void promover(Funcionario funcionario, boolean metaBatida){
        Cargo cargoAtual = funcionario.getCargo();
        if(Cargo.GERENTE == cargoAtual){
            throw new ValidacaoException("Gerentes não podem ser promovidos");
        }
        if(metaBatida){
            Cargo novoCargo = cargoAtual.proximoCargo();
            funcionario.promover(novoCargo);

        }else {
            throw new ValidacaoException("Funcionário não bateu a meta");
        }
    }

}
