package DAO;

import java.sql.Connection;
import java.sql.SQLException;

public class TestaConexao {
    
    
    
    public static void main(String[] args) throws SQLException{
        
        try (Connection con = new ConnectionFactory().abreConexao()) {
            System.out.println("Aberta com sucesso");
        }catch(SQLException ex){
            throw new SQLException(ex);
        }
            
        
        
    }
    
    
    
}
