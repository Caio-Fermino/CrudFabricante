/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.view;

import br.ulbra.model.Usuario;
import br.ulbra.model.UsuarioDao;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jeferson
 */
public class FrCadModelo extends javax.swing.JFrame {

    /**
     * Creates new form FrCadUsuario
     */
    public FrCadModelo() throws SQLException {
        initComponents();
        setLocationRelativeTo(null);
        showTable();
        controlarTela(1);
    }

    public void showTable() throws SQLException {
        DefaultTableModel modelo = (DefaultTableModel) tbUsuarios.getModel();
        modelo.setNumRows(0);
        UsuarioDao udao = new UsuarioDao();
        for (Usuario p : udao.read()) {
            modelo.addRow(new Object[]{
                p.getId(),
                p.getNome(),
                p.getEmail(),
                p.getSenha(),
                p.getTipo()
            });
        }
    }

    public void showTableForName(String nome) throws SQLException {
        DefaultTableModel modelo = (DefaultTableModel) tbUsuarios.getModel();
        modelo.setNumRows(0);
        UsuarioDao udao = new UsuarioDao();
        for (Usuario p : udao.readPesq(nome)) {
            modelo.addRow(new Object[]{
                p.getId(),
                p.getNome(),
                p.getEmail(),
                p.getSenha(),
                p.getTipo()
            });
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtTipo = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbUsuarios = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        txtPesquisa = new javax.swing.JTextField();
        btPesquisar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btSalvar = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        txtSenha = new javax.swing.JPasswordField();
        btNovo = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        txtTipo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADMINISTRADOR", "USUÁRIO" }));
        txtTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipoActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 51, 255), 3, true));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 3, 36)); // NOI18N
        jLabel1.setText("Cadastro de Modelo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(jLabel1)
                .addContainerGap(132, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 70));

        jLabel2.setText("CÓDIGO");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        txtid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 68, 34));

        jLabel3.setText("MARCA");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, -1, -1));

        txtNome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 210, 34));

        jLabel4.setText("MODELO");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        txtEmail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 340, 34));

        tbUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "NOME", "E-MAIL", "SENHA", "TIPO"
            }
        ));
        tbUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbUsuariosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbUsuarios);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 570, 80));

        jLabel6.setText("NOME");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));

        txtPesquisa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 380, 30));

        btPesquisar.setBackground(new java.awt.Color(102, 153, 0));
        btPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/lupa.png"))); // NOI18N
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(btPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 350, 44, 34));

        jLabel7.setText("ANO");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        btSalvar.setBackground(new java.awt.Color(0, 102, 102));
        btSalvar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btSalvar.setText("SALVAR");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 130, -1, 34));

        btAlterar.setBackground(new java.awt.Color(153, 102, 255));
        btAlterar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btAlterar.setText("ALTERAR");
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });
        getContentPane().add(btAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, 90, 34));

        btExcluir.setBackground(new java.awt.Color(204, 153, 0));
        btExcluir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btExcluir.setText("EXCLUIR");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, 170, 34));
        getContentPane().add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 340, 30));

        btNovo.setBackground(new java.awt.Color(0, 153, 255));
        btNovo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btNovo.setText("NOVO");
        btNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoActionPerformed(evt);
            }
        });
        getContentPane().add(btNovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, 70, 34));

        btLimpar.setBackground(new java.awt.Color(102, 102, 102));
        btLimpar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btLimpar.setText("LIMPAR");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });
        getContentPane().add(btLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 200, 80, 34));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        Usuario u = new Usuario();
        u.setNome(txtNome.getText());
        u.setEmail(txtEmail.getText());
        u.setSenha(txtSenha.getText());
        switch (txtTipo.getSelectedIndex()) {
            case 0:
                u.setTipo("Administrador");
                break;
            case 1:
                u.setTipo("Usuário");
                break;
        }
        try {
            UsuarioDao udao = new UsuarioDao();
            udao.create(u);
            showTable();
            controlarTela(1);
            limparCampos();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro:" + e.getMessage());
        }


    }//GEN-LAST:event_btSalvarActionPerformed

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed

        try {
            showTableForName(txtPesquisa.getText());
        } catch (SQLException ex) {
            Logger.getLogger(FrCadModelo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btPesquisarActionPerformed

    private void tbUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbUsuariosMouseClicked
        if (tbUsuarios.getSelectedRow() != -1) {
            txtid.setText(tbUsuarios.getValueAt(tbUsuarios.getSelectedRow(), 0)
                    .toString());
            txtNome.setText(tbUsuarios.getValueAt(tbUsuarios.getSelectedRow(), 1)
                    .toString());
            txtEmail.setText(tbUsuarios.getValueAt(tbUsuarios.getSelectedRow(), 2)
                    .toString());
            txtSenha.setText(tbUsuarios.getValueAt(tbUsuarios.getSelectedRow(), 3)
                    .toString());
            txtTipo.setSelectedItem(tbUsuarios.getValueAt(tbUsuarios.getSelectedRow(), 4)
                    .toString());
            controlarTela(3);

        }
    }//GEN-LAST:event_tbUsuariosMouseClicked

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
        controlarTela(2);
    }//GEN-LAST:event_btNovoActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        Usuario u = new Usuario();
        u.setId(Integer.parseInt(txtid.getText()));
        u.setNome(txtNome.getText());
        u.setEmail(txtEmail.getText());
        u.setSenha(txtSenha.getText());
        switch (txtTipo.getSelectedIndex()) {
            case 0:
                u.setTipo("Administrador");
                break;
            case 1:
                u.setTipo("Usuário");
                break;
        }

        UsuarioDao udao;
        try {
            udao = new UsuarioDao();
            udao.update(u);
            showTable();
            controlarTela(1);
        } catch (SQLException ex) {
            Logger.getLogger(FrCadModelo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(FrCadModelo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btAlterarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        Usuario u = new Usuario();
        u.setId(Integer.parseInt(txtid.getText()));
        UsuarioDao udao;
        try {
            udao = new UsuarioDao();
            udao.delete(u);
            showTable();
            controlarTela(1);
            limparCampos();
        } catch (SQLException ex) {
            Logger.getLogger(FrCadModelo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        limparCampos();
        controlarTela(1);
    }//GEN-LAST:event_btLimparActionPerformed

    private void txtTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipoActionPerformed
  public void limparCampos(){
            txtid.setText(null);
            txtNome.setText(null);
            txtEmail.setText(null);
            txtSenha.setText(null);
            txtTipo.setSelectedIndex(0);
  }
    public void controlarTela(int op) {
        if (op == 1) { //quando inicializado o formulario pela primeira vez
            txtid.setEnabled(false);
            txtNome.setEnabled(false);
            txtEmail.setEnabled(false);
            txtSenha.setEnabled(false);
            txtTipo.setEnabled(false);
            btSalvar.setEnabled(false);
            btExcluir.setEnabled(false);
            btAlterar.setEnabled(false);
            btNovo.setEnabled(true);
            
        }else if(op==2){ //quando clicado o botão novo
            txtid.setEnabled(false);
            txtNome.setEnabled(true);
            txtEmail.setEnabled(true);
            txtSenha.setEnabled(true);
            txtTipo.setEnabled(true);
            btSalvar.setEnabled(true);
            btExcluir.setEnabled(false);
            btAlterar.setEnabled(false);
            btNovo.setEnabled(false);
            txtNome.requestFocus();
            limparCampos();
            
        }else if(op==3){
             txtNome.setEnabled(true);
            txtEmail.setEnabled(true);
            txtSenha.setEnabled(true);
            txtTipo.setEnabled(true);
            btSalvar.setEnabled(false);
            btExcluir.setEnabled(true);
            btAlterar.setEnabled(true);
            btNovo.setEnabled(true);
        }

    }

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(FrCadModelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrCadModelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrCadModelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrCadModelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new FrCadModelo().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(FrCadModelo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tbUsuarios;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPesquisa;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JComboBox<String> txtTipo;
    private javax.swing.JTextField txtid;
    // End of variables declaration//GEN-END:variables
}
