package com.techmais.curso;


import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.techmais.curso.domains.Categoria;
import com.techmais.curso.domains.Cidade;
import com.techmais.curso.domains.Cliente;
import com.techmais.curso.domains.Endereco;
import com.techmais.curso.domains.Estado;
import com.techmais.curso.domains.Pagamento;
import com.techmais.curso.domains.PagamentoComBoleto;
import com.techmais.curso.domains.PagamentoComCartao;
import com.techmais.curso.domains.Pedido;
import com.techmais.curso.domains.Produto;
import com.techmais.curso.domains.enus.EstadoPagamento;
import com.techmais.curso.domains.enus.TipoCliente;
import com.techmais.curso.repository.CategoriaRepository;
import com.techmais.curso.repository.CidadeRepository;
import com.techmais.curso.repository.ClienteRepository;
import com.techmais.curso.repository.EnderecoRepository;
import com.techmais.curso.repository.EstadoRepository;
import com.techmais.curso.repository.PagamentoRepository;
import com.techmais.curso.repository.PedidoRepository;
import com.techmais.curso.repository.ProdutoRepository;

@SpringBootApplication
public class CursoModeloConceitualApplication  implements CommandLineRunner{
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@Autowired
	private EstadoRepository estadoRepository;
	
	@Autowired
	private CidadeRepository cidadeRepository;
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	
	@Autowired
	private EnderecoRepository enderecoRepository;
	
	
	
	@Autowired
	PedidoRepository pedidoRepository;
	
	@Autowired
	PagamentoRepository pagamentoRepository;
	

	
	public static void main(String[] args) {
		SpringApplication.run(CursoModeloConceitualApplication.class, args);
	}//

	
	
	@Override
	public void run(String... args) throws Exception {
		

		Categoria cat1 = new Categoria(null,"Informatica");
		Categoria cat2 = new Categoria(null,"Escritorio");
		
		Produto p1 = new Produto(null,"Computador", 2000.00);
		Produto p2 = new Produto(null,"Impressora", 800.00);
		Produto p3 = new Produto(null,"Mouse", 80.00);
		
		
		//cat1.getProdutos().addAll(Arrays.asList(p1,p2,p3));
		//cat2.getProdutos().addAll(Arrays.asList(p2));
		
		p1.getCategorias().addAll(Arrays.asList(cat1));
		p2.getCategorias().addAll(Arrays.asList(cat1,cat2));
		p3.getCategorias().add(cat1);
		
		categoriaRepository.saveAll(Arrays.asList(cat1,cat2));
		produtoRepository.saveAll(Arrays.asList(p1,p2,p3));
		
		
		Estado est1 = new Estado(null,"Minas Gerais");
		Estado est2 = new Estado(null,"São Paulo");
		
		Cidade c1 = new Cidade(null, "Ubêrlandia",est1);
		Cidade c2 = new Cidade(null, "São Paulo",est2);
		Cidade c3 = new Cidade(null, "Campinas",est2);
		
		//est1.getCidades().add(c1);
		//est2.getCidades().addAll(Arrays.asList(c2,c3));
		
		estadoRepository.saveAll(Arrays.asList(est1,est2));
		cidadeRepository.saveAll(Arrays.asList(c1,c2,c3));
		
		

	
		Cliente cli1 = new Cliente(null, "Maria Silva", "maria@gmail.com","992558525", TipoCliente.PESSOA_FÍSICA);
		
		
		
		
		cli1.getTelefones().addAll(Arrays.asList("123456789","987654321"));
		
		Endereco e1 = new Endereco(null,"rua flores", "300", "Ap 203","B Jardim","385478-98114",cli1,c1);
		Endereco e2 = new Endereco(null,"Ave Marcos","105","Salão 800","Centro","75425-9877455",cli1,c2);
		 
		// cli1.getEnderecos().addAll(Arrays.asList(e1,e2));
		
		 clienteRepository.save(cli1);
		 enderecoRepository.saveAll(Arrays.asList(e1,e2));
		 
		 
		 SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy HH:mm");
		 

		 Pedido ped1 = new Pedido(null,sdf.parse("30/09/2017 10:32"),cli1,e1);
		 Pedido ped2 = new Pedido(null,sdf.parse("10/10/2017 11:35"), cli1,e2);
	
		 cli1.getPedidos().addAll(Arrays.asList(ped1,ped2));
		
		 
		 Pagamento pagto1 = new PagamentoComCartao(null, EstadoPagamento.QUITADO, ped1, 6);
		 ped1.setPagamento(pagto1);
		 
		 
		 Pagamento  pagto2 = new PagamentoComBoleto(null, EstadoPagamento.PENDENTE, ped2,sdf.parse("10/11/2017 00:00"));
		 ped2.setPagamento(pagto2);
		 
		 
		pedidoRepository.saveAll(Arrays.asList(ped1,ped2));
		pagamentoRepository.saveAll(Arrays.asList(pagto1,pagto2));
		 
		 
	}//
	
	
	
}//x
