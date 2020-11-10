package br.edu.iftm;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

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
			System.out.println(resultado.getString("titular") + " | " + resultado.getInt("numero") + " | "
					+ resultado.getInt("agencia") + " | " + resultado.getDouble("limite") + " | "
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
	    /*Conta c1 = new Conta("Jose da Silva", 1, 2, 1000.0, 500.0);
	    Conta c2 = new Conta("Mara Maravilha", 2, 2, 2000.0, -850.0);
		Conta c3 = new Conta("Ronaldo Fenômeno", 3, 2, 500.0, 22000.0);
		Conta c4 = new Conta("Tereza da Silva", 4, 2, 0.0, 1450.0);
		Conta c5 = new Conta("Iolanda Oliveira", 5, 2, 300.0, -280.0);*/
		ContaDAO dao = new ContaDAO();
		
		//Alterar a conta cujo o id = 1
		Scanner ss = new Scanner(System.in);
		Scanner s = new Scanner(System.in);
		System.out.println("Insira os novos dados para a tupla com id=1:\n");
		System.out.print("Titular:");
		String titular = ss.nextLine();
		System.out.print("Conta:");
		int numConta = s.nextInt();
		System.out.print("Agência:");
		int numAg = s.nextInt();
		System.out.print("Limite:");
		double limite = s.nextDouble();
		System.out.print("Saldo:");
		double saldo = s.nextDouble();
		
		Conta alteraId1 = new Conta(titular, numConta, numAg, limite, saldo);
		try {
			//dao.inserir(c1);
			//dao.inserir(c2);
			//dao.inserir(c3);
			//dao.inserir(c4);
			//dao.inserir(c5);
			dao.atualiza(alteraId1, 1);
			dao.listagem();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
