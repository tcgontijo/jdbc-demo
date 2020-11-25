package com.gontijo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DisciplinaDAO {

	public List<Disciplina> todos() {
		Connection conexao = FabricaDeConexao.getConnection();
		List<Disciplina> lista = new ArrayList<Disciplina>();
		String sql = "select * from disciplina";
		PreparedStatement stmt;
		try {
			stmt = conexao.prepareStatement(sql);
			ResultSet retorno = stmt.executeQuery();
			while (retorno.next()) {
				int id = retorno.getInt("id");
				String n = retorno.getString("nome");
				String prof = retorno.getString("professor");
				int prd = retorno.getInt("periodo");
				String cod = retorno.getString("codigo_sala_classroom");
				Disciplina d = new Disciplina(id, prd, n, prof, cod);
				lista.add(d);
			}
			retorno.close();
			stmt.close();
			conexao.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista;
	}
}
