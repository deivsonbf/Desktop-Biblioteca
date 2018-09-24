package DAO;

import java.sql.Connection;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Livro;

public class LivroDAO {

    private Connection conn;
    private PreparedStatement stmt;
    private ResultSet rs;
    private ArrayList<Livro> lista = new ArrayList<>();

    public LivroDAO() {

        try {
            conn = new ConnectionFactory().abreConexao();
        } catch (SQLException ex) {
            Logger.getLogger(LivroDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void inserir(Livro livro) {

        String sql = "INSERT INTO livros (nome,autor,ano,nota,resenha,data_cadastro,editora,genero) VALUES (?,?,?,?,?,?,?,?)";

        try {

            Format formato = new SimpleDateFormat("yyyy-MM-dd");
            Date data = new Date();

            stmt = conn.prepareStatement(sql);

            stmt.setString(1, livro.getNome());
            stmt.setString(2, livro.getAutor());
            stmt.setInt(3, livro.getAno());
            stmt.setInt(4, livro.getNota());
            stmt.setString(5, livro.getResenha());
            stmt.setString(6, formato.format(data));
            stmt.setString(7, livro.getEditora());
            stmt.setString(8, livro.getGenero());

            stmt.execute();
            stmt.close();

        } catch (Exception e) {

            throw new RuntimeException("Erro" + e);
        }

    }

    public void alterar(Livro livro) {

        String sql = "UPDATE livros SET nome=?, autor=?, ano=?, nota=?, resenha=?, data_cadastro=?, editora=?, genero=? WHERE id_livro=?";

        try {
            Format formato = new SimpleDateFormat("yyyy-MM-dd");
            Date data = new Date();
            
            stmt = conn.prepareStatement(sql);

            stmt.setString(1, livro.getNome());
            stmt.setString(2, livro.getAutor());
            stmt.setInt(3, livro.getAno());
            stmt.setInt(4, livro.getNota());
            stmt.setString(5, livro.getResenha()); 
            stmt.setString(6, formato.format(data));
            stmt.setString(7, livro.getEditora());
            stmt.setString(8, livro.getGenero());
            stmt.setLong(9, livro.getId());

            stmt.execute();
            stmt.close();

        } catch (Exception e) {

            throw new RuntimeException("Erro" + e);
        }

    }

    public void excluir(int valor) {

        String sql = "DELETE from livros WHERE id_livro = " + valor;

        try {

            stmt = conn.prepareStatement(sql);
            stmt.execute();
            stmt.close();

        } catch (Exception e) {

            throw new RuntimeException("Erro" + e);
        }

    }

    public ArrayList<Livro> listarTodos() {

        String sql = "SELECT * FROM livros";

        try {

            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {

                Livro livro = new Livro();

                livro.setId(rs.getLong("id_livro"));
                livro.setNome(rs.getString("nome"));
                livro.setAutor(rs.getString("autor"));
                livro.setAno(rs.getInt("ano"));
                livro.setNota(rs.getInt("nota"));
                livro.setResenha(rs.getString("resenha"));
                livro.setEditora(rs.getString("editora"));
                livro.setGenero(rs.getString("genero"));
                livro.setDtCadastro(rs.getDate("data_cadastro"));

                lista.add(livro);

            }

        } catch (Exception e) {
            throw new RuntimeException("Erro" + e);
        }
        return lista;
    }

    public ArrayList<Livro> listarTodosAutor(String valor) {

        String sql = "SELECT * FROM livros WHERE nome LIKE '%" + valor + "%' ";

        try {

            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {

                Livro livro = new Livro();

                livro.setId(rs.getLong("id_livro"));
                livro.setNome(rs.getString("nome"));
                livro.setAutor(rs.getString("autor"));
                livro.setAno(rs.getInt("ano"));
                livro.setNota(rs.getInt("nota"));
                livro.setResenha(rs.getString("resenha"));
                livro.setEditora(rs.getString("editora"));
                livro.setGenero(rs.getString("genero"));
                livro.setDtCadastro(rs.getDate("data_cadastro"));

                lista.add(livro);

            }

        } catch (Exception e) {
            throw new RuntimeException("Erro" + e);
        }
        return lista;
    }

}
