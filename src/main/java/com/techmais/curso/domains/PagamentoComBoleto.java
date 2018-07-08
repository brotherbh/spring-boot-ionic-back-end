package com.techmais.curso.domains;

import java.util.Date;

import com.techmais.curso.domains.enus.EstadoPagamento;



public class PagamentoComBoleto extends Pagamento {
	private static final long serialVersionUID = 1L;
	
	private Date dataVencimento;
	
	private Date dataPagamento;
	
	public PagamentoComBoleto() {
	}//

	public PagamentoComBoleto(Integer id, EstadoPagamento estadoPg, Pedido pedido, Date dataVencimento) {
		super(id, estadoPg, pedido);

      this.dataVencimento = dataVencimento;
	}//
	
	
	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public Date getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}
	
	
	
	
	

}//x
