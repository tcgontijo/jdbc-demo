package br.edu.iftm;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ContaDAO {
	public void inserir(Conta c) throws SQLException {
		Connection conexao = FabricaDeConexao.getConnection();
		String sql = "insert into conta" + "(titular,numero,agencia,limite,saldo)" + " values (?,?,?,?,?)";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, c.getTitular());
		stmt.setInt(2, c.getNumero());
		stmt.setInt(3, c.getAgencia());
		stmt.setDouble(4, c.getLimite());
		stmt.setDouble(5, c.getSaldo());
		stmt.execute();
		stmt.close();
		conexao.close();
	}

	public void listagem() throws SQLException {
		Connection conexao = FabricaDeConexao.getConnection();
		String sql = "select * from conta";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		ResultSet resultado = stmt.executeQuery();
		while (resultado.next()) {
			System.out.println(resultado.getString("titular") + " | " + resultado.getInt("agencia") + " | "
					+ resultado.getInt("numero") + " | " + resultado.getDouble("limite") + " | "
					+ resultado.getDouble("saldo"));
		}
		resultado.close();
		stmt.close();
		conexao.close();
	}

	public void atualiza(Conta c, int id) throws SQLException {
		Connection conexao = FabricaDeConexao.getConnection();
		String sql = "update conta set titular = ?, numero = ?, agencia = ?, limite = ?, saldo = ? where id = ?";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, c.getTitular());
		stmt.setInt(2, c.getNumero());
		stmt.setInt(3, c.getAgencia());
		stmt.setDouble(4, c.getLimite());
		stmt.setDouble(5, c.getSaldo());
		stmt.setInt(6, id);		

		stmt.execute();
		
		stmt.close();
		conexao.close();
	}
	
	public void excluir(int id) throws SQLException {
		Connection conexao = FabricaDeConexao.getConnection();
		String sql = "delete from conta where id=?";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setInt(1, id);		

		stmt.execute();
		
		stmt.close();
		conexao.close();
	}

	public static void main(String[] args) {
		//Conta c = new Conta("titular", 1, 2, 10.0, 10.0);
		//Conta c3 = new Conta("ronaldo", 12, 21, 15.0, 15.0);
		ContaDAO dao = new ContaDAO();
		try {
			//dao.inserir(c);
			//dao.atualiza(c3, 2);
			dao.excluir(1);
			dao.listagem();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
