package com.inatel.rest;

import java.util.Date;

public class EntregaModel {
	private int id;
	private int id_cliente;
	private Date data_entrega;
	private String nome_recebedor;
	private String cpf_recebedor;
	private int numero_pedido;
	
	public EntregaModel() {
		super();
	}
	
	public EntregaModel(int id, int idCliente, Date dataEntrega, String nomeRecebedor, String cpfRecebedor,
			int numeroPedido) {
		super();
		this.id = id;
		this.id_cliente = idCliente;
		this.data_entrega = dataEntrega;
		this.nome_recebedor = nomeRecebedor;
		this.cpf_recebedor = cpfRecebedor;
		this.numero_pedido = numeroPedido;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}

	public Date getData_entrega() {
		return data_entrega;
	}

	public void setData_entrega(Date data_entrega) {
		this.data_entrega = data_entrega;
	}

	public String getNome_recebedor() {
		return nome_recebedor;
	}

	public void setNome_recebedor(String nome_recebedor) {
		this.nome_recebedor = nome_recebedor;
	}

	public String getCpf_recebedor() {
		return cpf_recebedor;
	}

	public void setCpf_recebedor(String cpf_recebedor) {
		this.cpf_recebedor = cpf_recebedor;
	}

	public int getNumero_pedido() {
		return numero_pedido;
	}

	public void setNumero_pedido(int numero_pedido) {
		this.numero_pedido = numero_pedido;
	}
}
