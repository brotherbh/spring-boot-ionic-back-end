package com.techmais.curso.domains;

import java.io.Serializable;

import com.techmais.curso.domains.enus.EstadoPagamento;

public class Pagamento implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private Integer id;
	
	private EstadoPagamento estadoPg;
	
	private Pedido pedido;
	
	public Pagamento() {
	}//

	public Pagamento(Integer id, EstadoPagamento estadoPg, Pedido pedido) {
		super();
		this.id = id;
		this.estadoPg = estadoPg;
		this.pedido = pedido;
	}

	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public EstadoPagamento getEstadoPg() {
		return estadoPg;
	}

	public void setEstadoPg(EstadoPagamento estadoPg) {
		this.estadoPg = estadoPg;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pagamento other = (Pagamento) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
}//x
