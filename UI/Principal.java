package BR.UNIPE.MLPIII.DESAFIO3.UI;

import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import BR.UNIPE.MLPIII.DESAFIO3.REPOSITORIO.ContaDB;

public class Principal {

	public static void main(String[] args) {

		String url = "jdbc:postgresql://localhost:1521/bancario";
		String login = "postgres";
		String senha = "123456";
		try {
			Class.forName("org.postgresql.Driver");
			Connection ban = DriverManager.getConnection(url, login, senha);
			Statement st = ban.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM Conta");

			List<ContaDB> contas = new ArrayList<>();
			ContaDB con = new ContaDB();

			// ResultSet rs = st.executeQuery("SELECT * FROM Saldo WHARE status
			// is true");

			while (rs.next()) {

				int id = rs.getInt("id");
				String numero = rs.getString("numero");
				double saldo = rs.getDouble("saldo");
				boolean status = rs.getBoolean("status");
				String titular = rs.getString("titular");
				con.setId(id);
				con.setNumero(numero);
				con.setSaldo(saldo);
				con.setStatus(status);
				con.setTitular(titular);
				contas.add(con);

			}
			for (ContaDB conta : contas) {
				System.out.println(conta);
			}
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}

}
