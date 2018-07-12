package com.techmais.curso.domains;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class IntemPedido implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ItemPedidoPk id = new ItemPedidoPk();
	
	private Double desconto;
	
	private Integer quantidade;
	
	private Double preço;
	
	public IntemPedido() {
	}//

	public IntemPedido(Pedido pedido,Produto produto, Double desconto, Integer quantidade, Double preço) {
		super();
		id.setPedido(pedido);
		id.setProduto(produto);
		this.desconto = desconto;
		this.quantidade = quantidade;
		this.preço = preço;
	}
	
	
	
	public Pedido getPedido() {
		
		return id.getPedido();
	}
	
	public Produto getProduto() {
		
		return id.getProduto();
	}
	
	public ItemPedidoPk getId() {
		return id;
	}

	public void setId(ItemPedidoPk id) {
		this.id = id;
	}

	public Double getDesconto() {
		return desconto;
	}

	public void setDesconto(Double desconto) {
		this.desconto = desconto;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPreço() {
		return preço;
	}

	public void setPreço(Double preço) {
		this.preço = preço;
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
		IntemPedido other = (IntemPedido) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
	
	
	

}//x
