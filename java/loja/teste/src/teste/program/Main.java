package teste.program;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		String driver = "org.postgresql.Driver";
		 String user = "postgres";
		 String senha = "root";
		 String url = "jdbc:postgresql://localhost:5432/postgres";

		 try{
			 Class.forName(driver);
			 Connection con = null;

			 con = (Connection) DriverManager.getConnection(url, user, senha);

			 System.out.println("Conexao realizada com sucesso.");

		 }
		 catch (ClassNotFoundException ex){
			 System.err.print(ex.getMessage());
		 }
		 catch (SQLException e){
			 System.err.print(e.getMessage());
		 }
	 	}
	
}
