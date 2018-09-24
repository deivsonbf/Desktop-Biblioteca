package view;

import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import DAO.ConnectionFactory;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

public class RelatoriosTela extends javax.swing.JFrame {

    public RelatoriosTela() {
        initComponents();

        setLocationRelativeTo(null); //iniciar tela no centro
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        label1 = new java.awt.Label();
        title = new java.awt.Label();
        label3 = new java.awt.Label();
        titulo = new java.awt.Label();
        btAutorRel = new javax.swing.JButton();
        btGeneroRel = new javax.swing.JButton();
        btEditoraRel = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btAnoRel = new javax.swing.JButton();
        btAvaliacaoRel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel1.setBackground(new java.awt.Color(0, 51, 153));

        label1.setText("label1");

        title.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("BookManager 1.0");

        label3.setText("label3");

        titulo.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("Relatórios");

        btAutorRel.setText("Autores");
        btAutorRel.setActionCommand("Autores");
        btAutorRel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAutorRelActionPerformed(evt);
            }
        });

        btGeneroRel.setText("Genero");
        btGeneroRel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGeneroRelActionPerformed(evt);
            }
        });

        btEditoraRel.setText("Editora");
        btEditoraRel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditoraRelActionPerformed(evt);
            }
        });

        jButton3.setText("Voltar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        btAnoRel.setText("Ano de Lançamento");
        btAnoRel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAnoRelActionPerformed(evt);
            }
        });

        btAvaliacaoRel.setText("Avaliação");
        btAvaliacaoRel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAvaliacaoRelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btAutorRel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btGeneroRel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btEditoraRel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btAnoRel, javax.swing.GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)
                            .addComponent(btAvaliacaoRel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(27, 52, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(28, 28, 28))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btAutorRel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btGeneroRel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btEditoraRel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btAnoRel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btAvaliacaoRel, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        titulo.getAccessibleContext().setAccessibleName("Relatórios");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Chamando relatorio de autores
    private void btAutorRelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAutorRelActionPerformed

        // perguntando se deseja imprimir
        int confirma = JOptionPane.showConfirmDialog(null, "Deseja imprimir o relatório", "Confirmando...", JOptionPane.YES_NO_OPTION);

        if (confirma == JOptionPane.YES_OPTION) {
            //impressao do relatorio

            String src = "C:/Users/Deivson/Documents/NetBeansProjects/bookmanager-master/relatorios/relatorioAutores.jasper";

            JasperPrint jasperPrint = null;

            try {
                Connection conn = new ConnectionFactory().abreConexao();

                jasperPrint = JasperFillManager.fillReport(src, null, conn);

            } catch (Exception e) {

                JOptionPane.showMessageDialog(rootPane, "Erro ao gerar relatorio \n" + e);
            }

            JasperViewer view = new JasperViewer(jasperPrint, false);

            view.setVisible(true);


    }//GEN-LAST:event_btAutorRelActionPerformed
    }

    private void btGeneroRelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGeneroRelActionPerformed
        // perguntando se deseja imprimir

        int confirma = JOptionPane.showConfirmDialog(null, "Deseja imprimir o relatório", "Confirmando...", JOptionPane.YES_NO_OPTION);

        if (confirma == JOptionPane.YES_OPTION) {
            //impressao do relatorio

            String src = "C:/Users/Deivson/Documents/NetBeansProjects/bookmanager-master/relatorios/relatorioGenero.jasper";

            JasperPrint jasperPrint = null;

            try {
                Connection conn = new ConnectionFactory().abreConexao();

                jasperPrint = JasperFillManager.fillReport(src, null, conn);

            } catch (Exception e) {

                JOptionPane.showMessageDialog(rootPane, "Erro ao gerar relatorio \n" + e);
            }

            JasperViewer view = new JasperViewer(jasperPrint, false);

            view.setVisible(true);
    }//GEN-LAST:event_btGeneroRelActionPerformed
    }
    private void btEditoraRelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditoraRelActionPerformed

        int confirma = JOptionPane.showConfirmDialog(null, "Deseja imprimir o relatório", "Confirmando...", JOptionPane.YES_NO_OPTION);

        if (confirma == JOptionPane.YES_OPTION) {
            //impressao do relatorio

            String src = "C:/Users/Deivson/Documents/NetBeansProjects/bookmanager-master/relatorios/relatorioEditora.jasper";

            JasperPrint jasperPrint = null;

            try {
                Connection conn = new ConnectionFactory().abreConexao();

                jasperPrint = JasperFillManager.fillReport(src, null, conn);

            } catch (Exception e) {

                JOptionPane.showMessageDialog(rootPane, "Erro ao gerar relatorio \n" + e);
            }

            JasperViewer view = new JasperViewer(jasperPrint, false);

            view.setVisible(true);

    }//GEN-LAST:event_btEditoraRelActionPerformed
    }
    private void btAnoRelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAnoRelActionPerformed
        int confirma = JOptionPane.showConfirmDialog(null, "Deseja imprimir o relatório", "Confirmando...", JOptionPane.YES_NO_OPTION);

        if (confirma == JOptionPane.YES_OPTION) {
            //impressao do relatorio

            String src = "C:/Users/Deivson/Documents/NetBeansProjects/bookmanager-master/relatorios/relatorioAno.jasper";

            JasperPrint jasperPrint = null;

            try {
                Connection conn = new ConnectionFactory().abreConexao();

                jasperPrint = JasperFillManager.fillReport(src, null, conn);

            } catch (Exception e) {

                JOptionPane.showMessageDialog(rootPane, "Erro ao gerar relatorio \n" + e);
            }

            JasperViewer view = new JasperViewer(jasperPrint, false);

            view.setVisible(true);
    }//GEN-LAST:event_btAnoRelActionPerformed
    }
    private void btAvaliacaoRelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAvaliacaoRelActionPerformed
        int confirma = JOptionPane.showConfirmDialog(null, "Deseja imprimir o relatório", "Confirmando...", JOptionPane.YES_NO_OPTION);

        if (confirma == JOptionPane.YES_OPTION) {
            //impressao do relatorio

            String src = "C:/Users/Deivson/Documents/NetBeansProjects/bookmanager-master/relatorios/relatorioAvaliacao.jasper";

            JasperPrint jasperPrint = null;

            try {
                Connection conn = new ConnectionFactory().abreConexao();

                jasperPrint = JasperFillManager.fillReport(src, null, conn);

            } catch (Exception e) {

                JOptionPane.showMessageDialog(rootPane, "Erro ao gerar relatorio \n" + e);
            }

            JasperViewer view = new JasperViewer(jasperPrint, false);

            view.setVisible(true);
    }//GEN-LAST:event_btAvaliacaoRelActionPerformed
    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //para a execução
        dispose(); //fecha a tela
        try {
            new PesquisaTela().setVisible(true);
        } catch (SQLException ex) {
        
            ex.printStackTrace();
            
        }
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(RelatoriosTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RelatoriosTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RelatoriosTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RelatoriosTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RelatoriosTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAnoRel;
    private javax.swing.JButton btAutorRel;
    private javax.swing.JButton btAvaliacaoRel;
    private javax.swing.JButton btEditoraRel;
    private javax.swing.JButton btGeneroRel;
    private javax.swing.JButton jButton3;
    private java.awt.Label label1;
    private java.awt.Label label3;
    private java.awt.Panel panel1;
    private java.awt.Label title;
    private java.awt.Label titulo;
    // End of variables declaration//GEN-END:variables
}
