package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLDataException;
import java.sql.SQLException;

public class ConnectionFactory {


    public Connection abreConexao() throws SQLException {

        try {
            
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/biblioteca?useSSL=false&useTimezone=true&serverTimezone=UTC", "root", "123456");
            
        } catch (Exception e) {
            
            throw new SQLDataException("Drive nao encontrado");
        }
     
    }
}
