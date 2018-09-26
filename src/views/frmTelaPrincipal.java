package views;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;

public class frmTelaPrincipal extends javax.swing.JFrame {

    public frmTelaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPrincipal = new javax.swing.JPanel();
        lblSairTelaPrincipal = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuArquivo = new javax.swing.JMenu();
        arqCadastrarUsuario = new javax.swing.JMenuItem();
        arqCadastrarCliente = new javax.swing.JMenuItem();
        arqConsultarCliente = new javax.swing.JMenuItem();
        arqSair = new javax.swing.JMenuItem();
        menuSobre = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1000, 600));
        setMinimumSize(new java.awt.Dimension(1000, 600));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1000, 600));

        jPanelPrincipal.setBackground(new java.awt.Color(51, 51, 51));
        jPanelPrincipal.setFont(new java.awt.Font("Constantia", 0, 14)); // NOI18N

        lblSairTelaPrincipal.setBackground(new java.awt.Color(51, 51, 51));
        lblSairTelaPrincipal.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lblSairTelaPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        lblSairTelaPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSairTelaPrincipal.setText("X");
        lblSairTelaPrincipal.setToolTipText("Fechar a aplicação");
        lblSairTelaPrincipal.setFocusable(false);
        lblSairTelaPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSairTelaPrincipalMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblSairTelaPrincipalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblSairTelaPrincipalMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanelPrincipalLayout = new javax.swing.GroupLayout(jPanelPrincipal);
        jPanelPrincipal.setLayout(jPanelPrincipalLayout);
        jPanelPrincipalLayout.setHorizontalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPrincipalLayout.createSequentialGroup()
                .addContainerGap(973, Short.MAX_VALUE)
                .addComponent(lblSairTelaPrincipal)
                .addContainerGap())
        );
        jPanelPrincipalLayout.setVerticalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSairTelaPrincipal)
                .addContainerGap(536, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelPrincipal, java.awt.BorderLayout.CENTER);

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setBorder(null);
        jMenuBar1.setForeground(new java.awt.Color(0, 0, 0));
        jMenuBar1.setMaximumSize(new java.awt.Dimension(74, 21));
        jMenuBar1.setMinimumSize(new java.awt.Dimension(74, 21));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(74, 21));

        menuArquivo.setBackground(new java.awt.Color(255, 255, 255));
        menuArquivo.setBorder(null);
        menuArquivo.setForeground(new java.awt.Color(0, 0, 0));
        menuArquivo.setText("Arquivo");

        arqCadastrarUsuario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.SHIFT_MASK));
        arqCadastrarUsuario.setText("Cadastrar Usuário");
        arqCadastrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arqCadastrarUsuarioActionPerformed(evt);
            }
        });
        menuArquivo.add(arqCadastrarUsuario);

        arqCadastrarCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_MASK));
        arqCadastrarCliente.setText("Cadastrar Cliente");
        arqCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arqCadastrarClienteActionPerformed(evt);
            }
        });
        menuArquivo.add(arqCadastrarCliente);

        arqConsultarCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK));
        arqConsultarCliente.setText("Consultar Cliente");
        arqConsultarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arqConsultarClienteActionPerformed(evt);
            }
        });
        menuArquivo.add(arqConsultarCliente);

        arqSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        arqSair.setText("Sair");
        arqSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arqSairActionPerformed(evt);
            }
        });
        menuArquivo.add(arqSair);

        jMenuBar1.add(menuArquivo);

        menuSobre.setBackground(new java.awt.Color(255, 255, 255));
        menuSobre.setBorder(null);
        menuSobre.setForeground(new java.awt.Color(0, 0, 0));
        menuSobre.setText("Sobre");
        jMenuBar1.add(menuSobre);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblSairTelaPrincipalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSairTelaPrincipalMouseEntered
        // Quando o ponteiro do mouse entrar na área do label      
        lblSairTelaPrincipal.setFont(new Font("Century Gothic", Font.BOLD, 24));
        lblSairTelaPrincipal.setForeground(Color.RED);     
    }//GEN-LAST:event_lblSairTelaPrincipalMouseEntered

    private void lblSairTelaPrincipalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSairTelaPrincipalMouseExited
        // Quando o ponteiro do mouse entrar na área do label      
        lblSairTelaPrincipal.setFont(new Font("Century Gothic", Font.PLAIN, 24));
        lblSairTelaPrincipal.setForeground(Color.WHITE);     
    }//GEN-LAST:event_lblSairTelaPrincipalMouseExited

    private void lblSairTelaPrincipalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSairTelaPrincipalMouseClicked
        // Quando clicar no label lblSairTelaPrincipal
        System.exit(0);
    }//GEN-LAST:event_lblSairTelaPrincipalMouseClicked

    private void arqSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arqSairActionPerformed
        // Clicar no menu Arquivo -> Sair
        System.exit(0);
    }//GEN-LAST:event_arqSairActionPerformed

    private void arqConsultarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arqConsultarClienteActionPerformed
        // TODO add your handling code here:
        //JOptionPane.showMessageDialog(null, "Consultar");
        FrmConsultarCliente telaconsulta = new FrmConsultarCliente();
        telaconsulta.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_arqConsultarClienteActionPerformed

    private void arqCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arqCadastrarClienteActionPerformed
        // TODO add your handling code here:
        //JOptionPane.showMessageDialog(null, "Cadastrar");
        FrmCadastrarCliente telaCadastroCliente = new FrmCadastrarCliente();
        telaCadastroCliente.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_arqCadastrarClienteActionPerformed

    private void arqCadastrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arqCadastrarUsuarioActionPerformed
        // TODO add your handling code here:
        // JOptionPane.showMessageDialog(null, "Cadastrar Usuario");
        FrmCadastrarUsuario telaCadastroUsuario = new FrmCadastrarUsuario();
        telaCadastroUsuario.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_arqCadastrarUsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(frmTelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmTelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmTelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmTelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmTelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem arqCadastrarCliente;
    private javax.swing.JMenuItem arqCadastrarUsuario;
    private javax.swing.JMenuItem arqConsultarCliente;
    private javax.swing.JMenuItem arqSair;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JLabel lblSairTelaPrincipal;
    private javax.swing.JMenu menuArquivo;
    private javax.swing.JMenu menuSobre;
    // End of variables declaration//GEN-END:variables
}
