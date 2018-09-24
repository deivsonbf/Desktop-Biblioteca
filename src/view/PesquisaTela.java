package view;

import DAO.LivroDAO;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.Livro;
import table.LivroTableModel;

public class PesquisaTela extends javax.swing.JFrame {

    Livro livro = new Livro();
    LivroDAO lvr = new LivroDAO();

    public PesquisaTela() throws SQLException {
        initComponents();
        setLocationRelativeTo(null); //iniciar tela no centro

        tbLivros.setModel(new LivroTableModel(new LivroDAO().listarTodos()));//USAREMOS O METORDO LISTAR E A CLASSE LIVROSTABLEMODEL TODOS PARA LISTAR OS LIVROS NA TABELA 
        btExcluirUp.setEnabled(false); //desabilitando o botao excluir

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tfAno = new javax.swing.JTextField();
        tfNota = new javax.swing.JTextField();
        tfGenero = new javax.swing.JTextField();
        tfEditora = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfCodigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taResenha = new javax.swing.JTextArea();
        tfAutor = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        tfAno1 = new javax.swing.JTextField();
        tfNota1 = new javax.swing.JTextField();
        tfGenero1 = new javax.swing.JTextField();
        tfEditora1 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        tfCodigo1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        tfNome1 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        taResenha1 = new javax.swing.JTextArea();
        tfAutor1 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btRelatorio = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        labPesquisar = new javax.swing.JLabel();
        tfPesquisar = new javax.swing.JTextField();
        btEditar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbLivros = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        tfAnoUp = new javax.swing.JTextField();
        tfNotaUp = new javax.swing.JTextField();
        tfGeneroUp = new javax.swing.JTextField();
        tfEditoraUp = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        tfCodigUp = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        tfNomeUp = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        taResenhaUp = new javax.swing.JTextArea();
        tfAutorUp = new javax.swing.JTextField();
        btExcluirUp = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();

        jPanel2.setBackground(new java.awt.Color(0, 51, 102));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 706, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Ano:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Nota:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Editora:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Gênero:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Resenha:");

        tfAno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfAnoActionPerformed(evt);
            }
        });

        tfNota.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tfGenero.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tfEditora.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfEditora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEditoraActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Código:");

        tfCodigo.setEditable(false);
        tfCodigo.setBackground(new java.awt.Color(0, 0, 102));
        tfCodigo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfCodigo.setForeground(new java.awt.Color(255, 255, 255));
        tfCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCodigoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Nome:");

        tfNome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Autor:");

        taResenha.setColumns(20);
        taResenha.setRows(5);
        jScrollPane1.setViewportView(taResenha);

        tfAutor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Ano:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Nota:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Editora:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Gênero:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Resenha:");

        tfAno1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfAno1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfAno1ActionPerformed(evt);
            }
        });

        tfNota1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tfGenero1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tfEditora1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfEditora1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEditora1ActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Código:");

        tfCodigo1.setEditable(false);
        tfCodigo1.setBackground(new java.awt.Color(0, 0, 102));
        tfCodigo1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfCodigo1.setForeground(new java.awt.Color(255, 255, 255));
        tfCodigo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCodigo1ActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Nome:");

        tfNome1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Autor:");

        taResenha1.setColumns(20);
        taResenha1.setRows(5);
        jScrollPane3.setViewportView(taResenha1);

        tfAutor1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(0, 51, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BookManager 1.0");

        btRelatorio.setText("Relatorios");
        btRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRelatorioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(btRelatorio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(26, 26, 26))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btRelatorio)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(27, 27, 27))
        );

        jPanel4.setBackground(new java.awt.Color(0, 51, 102));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        labPesquisar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labPesquisar.setText("Pesquisar (nome do livro):");

        tfPesquisar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPesquisarActionPerformed(evt);
            }
        });

        btEditar.setText("Cadastrar/Atualizar");
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });

        tbLivros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbLivros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbLivrosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbLivros);

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("Ano:");

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("Nota:");

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("Editora:");

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setText("Gênero:");

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setText("Resenha:");

        tfAnoUp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfAnoUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfAnoUpActionPerformed(evt);
            }
        });

        tfNotaUp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tfGeneroUp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tfEditoraUp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfEditoraUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEditoraUpActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setText("Código:");

        tfCodigUp.setEditable(false);
        tfCodigUp.setBackground(new java.awt.Color(0, 0, 102));
        tfCodigUp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfCodigUp.setForeground(new java.awt.Color(255, 255, 255));
        tfCodigUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCodigUpActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setText("Nome:");

        tfNomeUp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel25.setText("Autor:");

        taResenhaUp.setColumns(20);
        taResenhaUp.setRows(5);
        jScrollPane4.setViewportView(taResenhaUp);

        tfAutorUp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btExcluirUp.setText("Excluir");
        btExcluirUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirUpActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Deivson\\Pictures\\Saved Pictures\\Icones\\logout_blue.png")); // NOI18N
        jButton2.setText("Sair");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(labPesquisar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 814, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(13, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel23))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfCodigUp, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfNomeUp, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(jLabel25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfAutorUp, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfEditoraUp, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(90, 90, 90)
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfGeneroUp, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfAnoUp, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfNotaUp, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btExcluirUp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btEditar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel23)
                            .addComponent(tfCodigUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(tfNomeUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25)
                            .addComponent(tfAutorUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(jLabel21)
                            .addComponent(tfEditoraUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfGeneroUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(tfAnoUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19)
                            .addComponent(tfNotaUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labPesquisar))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(btEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btExcluirUp, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //botao Editar/Cadastrar
    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        //Realizando a verificação se há campos vazios, caso nao houver prossegue com a transacao no else
        if (tfNomeUp.getText().equals("") || tfAutorUp.getText().equals("") || tfEditoraUp.getText().equals("")
                || tfGeneroUp.getText().equals("") || tfAnoUp.getText().equals("") || tfNomeUp.getText().equals("") || taResenhaUp.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Há campos em branco", "Verificação de campos", JOptionPane.WARNING_MESSAGE);
        } else {
            if (tfCodigUp.getText().equals("")) {

                livro.setNome(tfNomeUp.getText());
                livro.setAutor(tfAutorUp.getText());
                livro.setResenha(taResenhaUp.getText());
                livro.setEditora(tfEditoraUp.getText());
                livro.setGenero(tfGeneroUp.getText());
                livro.setNota(Integer.parseInt(tfNotaUp.getText()));
                livro.setAno(Integer.parseInt(tfAnoUp.getText()));
                livro.setEditora(tfEditoraUp.getText());
                lvr.inserir(livro);

                String msg2 = "Cadastrado com sucesso!";
                JOptionPane.showMessageDialog(null, msg2);

            } else {

                livro.setId(Long.parseLong(tfCodigUp.getText()));
                livro.setNome(tfNomeUp.getText());
                livro.setAutor(tfAutorUp.getText());
                livro.setResenha(taResenhaUp.getText());
                livro.setEditora(tfEditoraUp.getText());
                livro.setGenero(tfGeneroUp.getText());
                livro.setNota(Integer.parseInt(tfNotaUp.getText()));
                livro.setAno(Integer.parseInt(tfAnoUp.getText()));
                livro.setEditora(tfEditoraUp.getText());

                lvr.alterar(livro);

                String msg2 = "Atualizado com sucesso!";
                JOptionPane.showMessageDialog(null, msg2);

            }

            tbLivros.setModel(new LivroTableModel(new LivroDAO().listarTodos()));
            tfCodigUp.setText("");
            tfNomeUp.setText("");
            tfAutorUp.setText("");
            taResenhaUp.setText("");
            tfEditoraUp.setText("");
            tfGeneroUp.setText("");
            tfAnoUp.setText("");
            tfNotaUp.setText("");
            tfAutorUp.setText("");

        }
    }//GEN-LAST:event_btEditarActionPerformed

    private void tfPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPesquisarActionPerformed
        String nome = tfPesquisar.getText();

        tbLivros.setModel(new LivroTableModel(new LivroDAO().listarTodosAutor(nome)));


    }//GEN-LAST:event_tfPesquisarActionPerformed

    private void tfAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAnoActionPerformed

    private void tfEditoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEditoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfEditoraActionPerformed

    private void tfCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCodigoActionPerformed

    private void tfAno1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAno1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAno1ActionPerformed

    private void tfEditora1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEditora1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfEditora1ActionPerformed

    private void tfCodigo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCodigo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCodigo1ActionPerformed

    private void tfAnoUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAnoUpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAnoUpActionPerformed

    private void tfEditoraUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEditoraUpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfEditoraUpActionPerformed

    private void tfCodigUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCodigUpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCodigUpActionPerformed

    private void btExcluirUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirUpActionPerformed

        int escolha = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir?", "Exclusao", JOptionPane.YES_NO_OPTION);

        if (escolha == 0) {
            int codigo = (int) Long.parseLong(tfCodigUp.getText());
            lvr.excluir(codigo);
            tbLivros.setModel(new LivroTableModel(new LivroDAO().listarTodos()));
            tfNomeUp.setText("");
            tfAutorUp.setText("");
            taResenhaUp.setText("");
            tfEditoraUp.setText("");
            tfGeneroUp.setText("");
            tfAnoUp.setText("");
            tfNotaUp.setText("");
            tfAutorUp.setText("");

            String msg3 = "Excluido com sucesso!";
            JOptionPane.showMessageDialog(null, msg3);
        } else {

        }


    }//GEN-LAST:event_btExcluirUpActionPerformed

    // Método que coloca os dados nos campos a serem atualizados ou excluidos
    private void tbLivrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbLivrosMouseClicked

        tfCodigUp.setText(tbLivros.getValueAt(tbLivros.getSelectedRow(), LivroTableModel.ID_LIVRO).toString());
        tfNomeUp.setText(tbLivros.getValueAt(tbLivros.getSelectedRow(), LivroTableModel.NOME).toString());
        tfAutorUp.setText(tbLivros.getValueAt(tbLivros.getSelectedRow(), LivroTableModel.AUTOR).toString());
        taResenhaUp.setText(tbLivros.getValueAt(tbLivros.getSelectedRow(), LivroTableModel.RESENHA).toString());
        tfAnoUp.setText(tbLivros.getValueAt(tbLivros.getSelectedRow(), LivroTableModel.ANO).toString());
        tfNotaUp.setText(tbLivros.getValueAt(tbLivros.getSelectedRow(), LivroTableModel.NOTA).toString());
        tfEditoraUp.setText(tbLivros.getValueAt(tbLivros.getSelectedRow(), LivroTableModel.EDITORA).toString());
        tfGeneroUp.setText(tbLivros.getValueAt(tbLivros.getSelectedRow(), LivroTableModel.GENERO).toString());
        btExcluirUp.setEnabled(true); //Reabilitando o botao 

    }//GEN-LAST:event_tbLivrosMouseClicked

    //botao sair do sistema, e para a execução do mesmo
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //para a execução
        dispose(); //fecha a tela
        
    }//GEN-LAST:event_jButton2ActionPerformed

    //limpa os campos ao clicar o botao limpar
    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        tfCodigUp.setText("");
        tfNomeUp.setText("");
        tfAutorUp.setText("");
        taResenhaUp.setText("");
        tfEditoraUp.setText("");
        tfGeneroUp.setText("");
        tfAnoUp.setText("");
        tfNotaUp.setText("");
        tfAutorUp.setText("");
    }//GEN-LAST:event_btLimparActionPerformed

    private void btRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRelatorioActionPerformed
        new RelatoriosTela().setVisible(true);
        dispose();
    }//GEN-LAST:event_btRelatorioActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PesquisaTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PesquisaTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PesquisaTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PesquisaTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new PesquisaTela().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(PesquisaTela.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btExcluirUp;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btRelatorio;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel labPesquisar;
    private javax.swing.JTextArea taResenha;
    private javax.swing.JTextArea taResenha1;
    private javax.swing.JTextArea taResenhaUp;
    private javax.swing.JTable tbLivros;
    private javax.swing.JTextField tfAno;
    private javax.swing.JTextField tfAno1;
    private javax.swing.JTextField tfAnoUp;
    private javax.swing.JTextField tfAutor;
    private javax.swing.JTextField tfAutor1;
    private javax.swing.JTextField tfAutorUp;
    private javax.swing.JTextField tfCodigUp;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfCodigo1;
    private javax.swing.JTextField tfEditora;
    private javax.swing.JTextField tfEditora1;
    private javax.swing.JTextField tfEditoraUp;
    private javax.swing.JTextField tfGenero;
    private javax.swing.JTextField tfGenero1;
    private javax.swing.JTextField tfGeneroUp;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfNome1;
    private javax.swing.JTextField tfNomeUp;
    private javax.swing.JTextField tfNota;
    private javax.swing.JTextField tfNota1;
    private javax.swing.JTextField tfNotaUp;
    private javax.swing.JTextField tfPesquisar;
    // End of variables declaration//GEN-END:variables
}
