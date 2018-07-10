package com.techmais.curso.domains;

import javax.persistence.Entity;

import com.techmais.curso.domains.enus.EstadoPagamento;


@Entity
public class PagamentoComCartao extends Pagamento {
	private static final long serialVersionUID = 1L;
	
	private Integer numeroDeParcelas;
	
	
	public PagamentoComCartao() {
	}//


	public PagamentoComCartao(Integer id, EstadoPagamento estadoPg, Pedido pedido, Integer numeroDeParcelas) {
		super(id, estadoPg, pedido);

		this.setNumeroDeParcelas(numeroDeParcelas);
	}


	public Integer getNumeroDeParcelas() {
		return numeroDeParcelas;
	}


	public void setNumeroDeParcelas(Integer numeroDeParcelas) {
		this.numeroDeParcelas = numeroDeParcelas;
	}
	

	
	
	
}//x
