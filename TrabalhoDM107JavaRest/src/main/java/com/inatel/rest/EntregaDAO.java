package com.inatel.rest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class EntregaDAO {
	public void insert(Connection conn, EntregaModel entrega) throws SQLException {
		String sql = "insert into entrega (cpf_recebedor, data_entrega, id_cliente, nome_recebedor, numero_pedido) values (?, ?, ?, ?, ?);";
		PreparedStatement pstm;
		pstm = conn.prepareStatement(sql);
		pstm.setString(1, entrega.getCpf_recebedor());
		pstm.setTimestamp(2, new java.sql.Timestamp(entrega.getData_entrega().getTime()));
		pstm.setInt(3, entrega.getId_cliente());
		pstm.setString(4, entrega.getNome_recebedor());
		pstm.setInt(5, entrega.getNumero_pedido());
		pstm.execute();
	}

	public EntregaModel findByNumeroPedido(Connection conn, int numeroPedido) throws SQLException {
		String sql = "select * from entrega where numero_pedido = ?";
		PreparedStatement pstm;
		pstm = conn.prepareStatement(sql);
		pstm.setInt(1, numeroPedido);
		ResultSet rs = pstm.executeQuery();
		EntregaModel entrega = new EntregaModel();
		while (rs.next()) {
			int id = rs.getInt("id");
			String cpfRecebedor = rs.getString("cpf_recebedor");
			Date dataEntrega = rs.getTimestamp("data_entrega");
			int idCliente = rs.getInt("id_cliente");
			String nomeRecebedor = rs.getString("nome_recebedor");
			entrega = new EntregaModel(id, idCliente, dataEntrega, nomeRecebedor, cpfRecebedor, numeroPedido);
		}
		return entrega;
	}
}
