package br.com.alura.rh.model;

import br.com.alura.rh.ValidacaoException;

public enum Cargo {

	ASSISTENTE{
		@Override
		public Cargo proximoCargo() {
			return ANALISTA;
		}
	}, ANALISTA {
		@Override
		public Cargo proximoCargo() {
			return GERENTE;
		}
	}, GERENTE {
		@Override
		public Cargo proximoCargo() {
			throw new ValidacaoException("Gerentes não podem ser promovidos");
		}
	};


	public abstract Cargo proximoCargo();
}
