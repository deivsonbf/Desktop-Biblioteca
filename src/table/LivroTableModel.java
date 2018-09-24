package table;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.Livro;

public class LivroTableModel extends AbstractTableModel {

    public static final int ID_LIVRO = 0;
    public static final int NOME = 1;
    public static final int AUTOR = 2;
    public static final int ANO = 3;
    public static final int RESENHA = 4;
    public static final int NOTA = 5;
    public static final int DT_CADASTRO = 6;
    public static final int EDITORA = 7;
    public static final int GENERO = 8;
    public ArrayList<Livro> lista = new ArrayList<>();

    public LivroTableModel(ArrayList<Livro> l) {
        lista = new ArrayList<>(l);
    }

    @Override
    public int getRowCount() {
        return lista.size();

    }

    @Override
    public int getColumnCount() {
        return 9;
    }

    @Override
    public Object getValueAt(int linhas, int colunas) {
        Livro livro = lista.get(linhas);

        if (colunas == ID_LIVRO) {
            return livro.getId();
        }
        if (colunas == NOME) {
            return livro.getNome();
        }
        if (colunas == AUTOR) {
            return livro.getAutor();
        }
        if (colunas == RESENHA) {
            return livro.getResenha();
        }
        if (colunas == NOTA) {
            return livro.getNota();
        }
        if (colunas == ANO) {
            return livro.getAno();
        }
        if (colunas == DT_CADASTRO) {
            return livro.getDtCadastro();
        }
        if (colunas == GENERO) {
            return livro.getGenero();
        }
        if (colunas == EDITORA) {
            return livro.getEditora();
        }

        return "";

    }

    public String getCollumName(int colunas) {

        if (colunas == ID_LIVRO) {
            return "id_livro";
        }
        if (colunas == NOME) {
            return "nome";
        }
        if (colunas == AUTOR) {
            return "autor";
        }
        if (colunas == RESENHA) {
            return "resenha";
        }
        if (colunas == NOTA) {
            return "nota";
        }
        if (colunas == ANO) {
            return "ano";
        }
        if (colunas == DT_CADASTRO) {
            return "data_cadatro";
        }
        if (colunas == GENERO) {
            return "genero";
        }
        if (colunas == EDITORA) {
            return "editora";
        }

        return "";

    }

}
