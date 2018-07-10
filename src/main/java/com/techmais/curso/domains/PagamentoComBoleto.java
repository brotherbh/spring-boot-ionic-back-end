package com.techmais.curso.domains;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.techmais.curso.domains.enus.EstadoPagamento;


@Entity
public class PagamentoComBoleto extends Pagamento {
	private static final long serialVersionUID = 1L;
	
	@Temporal(TemporalType.DATE)
	private Date dataVencimento;
	
	@Temporal(TemporalType.DATE)
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
