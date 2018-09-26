package views;

import java.awt.Color;
import java.awt.Font;
import controle.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import models.Usuario;

public class frmLogin extends javax.swing.JFrame {

    private Connection con = null;

    public frmLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPrincipal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblSair = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        btnEntrar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setMaximumSize(new java.awt.Dimension(400, 600));
        setMinimumSize(new java.awt.Dimension(400, 600));
        setUndecorated(true);

        jPanelPrincipal.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Logo");
        jLabel1.setFocusable(false);

        lblSair.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lblSair.setForeground(new java.awt.Color(255, 255, 255));
        lblSair.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSair.setText("X");
        lblSair.setToolTipText("Fechar a aplicação");
        lblSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSairMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblSairMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblSairMouseExited(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Constantia", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText(" Login: ");
        jLabel2.setFocusable(false);

        jLabel3.setFont(new java.awt.Font("Constantia", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Senha: ");
        jLabel3.setFocusable(false);

        txtLogin.setBackground(new java.awt.Color(153, 153, 153));
        txtLogin.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        txtLogin.setForeground(new java.awt.Color(255, 255, 255));
        txtLogin.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtLogin.setToolTipText("Digite seu nome de usuario");
        txtLogin.setBorder(null);

        txtSenha.setBackground(new java.awt.Color(153, 153, 153));
        txtSenha.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        txtSenha.setForeground(new java.awt.Color(255, 255, 255));
        txtSenha.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtSenha.setToolTipText("Digite sua senha");
        txtSenha.setBorder(null);

        btnEntrar.setBackground(new java.awt.Color(153, 153, 153));
        btnEntrar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnEntrar.setForeground(new java.awt.Color(51, 51, 51));
        btnEntrar.setText("Entrar");
        btnEntrar.setBorder(null);
        btnEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEntrar.setFocusable(false);
        btnEntrar.setMaximumSize(new java.awt.Dimension(85, 35));
        btnEntrar.setMinimumSize(new java.awt.Dimension(85, 35));
        btnEntrar.setPreferredSize(new java.awt.Dimension(85, 35));
        btnEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEntrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEntrarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnEntrarMousePressed(evt);
            }
        });
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });

        btnLimpar.setBackground(new java.awt.Color(153, 153, 153));
        btnLimpar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnLimpar.setForeground(new java.awt.Color(51, 51, 51));
        btnLimpar.setText("Limpar");
        btnLimpar.setBorder(null);
        btnLimpar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpar.setFocusable(false);
        btnLimpar.setMaximumSize(new java.awt.Dimension(85, 35));
        btnLimpar.setMinimumSize(new java.awt.Dimension(85, 35));
        btnLimpar.setPreferredSize(new java.awt.Dimension(85, 35));
        btnLimpar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLimparMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLimparMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnLimparMousePressed(evt);
            }
        });
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelPrincipalLayout = new javax.swing.GroupLayout(jPanelPrincipal);
        jPanelPrincipal.setLayout(jPanelPrincipalLayout);
        jPanelPrincipalLayout.setHorizontalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPrincipalLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblSair))
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                                .addGap(169, 169, 169)
                                .addComponent(jLabel1))
                            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPrincipalLayout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                                                .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(0, 65, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelPrincipalLayout.setVerticalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSair)
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(161, 161, 161)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(182, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelPrincipal, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void logar() {
        Usuario.login = txtLogin.getText();
        Usuario.senha = new String(txtSenha.getPassword());

        try {
            String sql = "SELECT * FROM usuario WHERE login = ? and senha = ?";
            con = Conexao.getConexao();
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, Usuario.login);
            pst.setString(2, Usuario.senha);

            ResultSet rs = pst.executeQuery();

            rs.next();

            if (rs.getString("login").equals(Usuario.login) && rs.getString("senha").equals(Usuario.senha)) {
                frmTelaPrincipal telaPrincipal = new frmTelaPrincipal();
                telaPrincipal.setVisible(true);
                this.dispose();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Usuário e/ou Senha inválido", "Erro", JOptionPane.ERROR_MESSAGE);
            limparCampos();
        }
    }

    private void lblSairMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSairMouseEntered
        // Quando o ponteiro do mouse entrar na área do label      
        lblSair.setFont(new Font("Century Gothic", Font.BOLD, 24));
        lblSair.setForeground(Color.RED);
    }//GEN-LAST:event_lblSairMouseEntered

    private void lblSairMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSairMouseExited
        // Quando o pornteiro do mouse sair da area do label
        lblSair.setFont(new Font("Century Gothic", Font.PLAIN, 24));
        lblSair.setForeground(Color.WHITE);
    }//GEN-LAST:event_lblSairMouseExited

    private void lblSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSairMouseClicked
        // Quando clicar no label
        System.exit(0);
    }//GEN-LAST:event_lblSairMouseClicked

    private void btnEntrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntrarMouseEntered
        // Quando o ponteiro do mouse entrar na área do botão
        btnEntrar.setBackground(Color.BLUE);
        btnEntrar.setForeground(Color.WHITE);
        btnEntrar.setFont(new Font("Century Gothic", Font.BOLD, 18));
    }//GEN-LAST:event_btnEntrarMouseEntered

    private void btnEntrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntrarMousePressed
        // Quando o ponteiro do mouse estiver pressionando o botão
        btnEntrarMouseEntered(evt);
    }//GEN-LAST:event_btnEntrarMousePressed

    private void btnEntrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntrarMouseExited
        // Quando o ponteiro do mouse sair da área do botão
        btnEntrar.setBackground(new Color(153, 153, 153));
        btnEntrar.setForeground(new Color(51, 51, 51));
        btnEntrar.setFont(new Font("Century Gothic", Font.PLAIN, 18));
    }//GEN-LAST:event_btnEntrarMouseExited

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        // Quando clicar no botao
        logar();
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void btnLimparMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimparMouseEntered
        // Quando o ponteiro do mouse entrar na área do botão
        btnLimpar.setBackground(Color.BLUE);
        btnLimpar.setForeground(Color.WHITE);
        btnLimpar.setFont(new Font("Century Gothic", Font.BOLD, 18));
    }//GEN-LAST:event_btnLimparMouseEntered

    private void btnLimparMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimparMouseExited
        // Quando o ponteiro do mouse sair da área do botão
        btnLimpar.setBackground(new Color(153, 153, 153));
        btnLimpar.setForeground(new Color(51, 51, 51));
        btnLimpar.setFont(new Font("Century Gothic", Font.PLAIN, 18));
    }//GEN-LAST:event_btnLimparMouseExited

    private void btnLimparMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimparMousePressed
        // Quando o ponteiro do mouse estiver pressionando o botão
        btnLimparMouseEntered(evt);
    }//GEN-LAST:event_btnLimparMousePressed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        // Quando clicar no botão cancelar
        limparCampos();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void limparCampos() {
        txtLogin.setText("");
        txtSenha.setText("");
        txtLogin.requestFocus();
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
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JLabel lblSair;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
