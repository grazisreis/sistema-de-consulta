package db;

import java.sql.Connection;
import java.sql.DriverManager; 
import java.sql.SQLException;

public class Conexao {

    public static Connection conectar() throws SQLException{

        String servidor = "localhost";
        String banco = "sistema_consulta";
        String usuario = "root";
        String senha = "sigra01"; // verifique se essa é a senha correta

        String url = "jdbc:mysql://" + servidor + ":3306/" + banco;

        try{
            return DriverManager.getConnection(url, usuario, senha);

        } catch (SQLException e){
            System.out.println("Erro ao conectar ao banco de dados: " + e.getMessage());
            throw e;
        }

    }

}


