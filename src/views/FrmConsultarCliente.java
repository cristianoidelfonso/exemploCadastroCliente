package views;

import java.awt.Color;
import java.awt.Font;

public class FrmConsultarCliente extends javax.swing.JFrame {

    public FrmConsultarCliente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPrincipal = new javax.swing.JPanel();
        lblSairTelaConsulta = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1000, 600));
        setMinimumSize(new java.awt.Dimension(1000, 600));
        setUndecorated(true);

        jPanelPrincipal.setBackground(new java.awt.Color(51, 51, 51));

        lblSairTelaConsulta.setFont(new java.awt.Font("Constantia", 0, 24)); // NOI18N
        lblSairTelaConsulta.setForeground(new java.awt.Color(255, 255, 255));
        lblSairTelaConsulta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSairTelaConsulta.setText("X");
        lblSairTelaConsulta.setToolTipText("Voltar para a tela principal");
        lblSairTelaConsulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSairTelaConsultaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblSairTelaConsultaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblSairTelaConsultaMouseExited(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("Constantia", 0, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(51, 51, 255));
        lblTitulo.setText("Clientes cadastrados");

        javax.swing.GroupLayout jPanelPrincipalLayout = new javax.swing.GroupLayout(jPanelPrincipal);
        jPanelPrincipal.setLayout(jPanelPrincipalLayout);
        jPanelPrincipalLayout.setHorizontalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPrincipalLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 705, Short.MAX_VALUE)
                .addComponent(lblSairTelaConsulta)
                .addContainerGap())
        );
        jPanelPrincipalLayout.setVerticalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSairTelaConsulta)
                    .addComponent(lblTitulo))
                .addContainerGap(558, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelPrincipal, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblSairTelaConsultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSairTelaConsultaMouseClicked
        // Quando clicar na label
        frmTelaPrincipal telaprincipal = new frmTelaPrincipal();
        telaprincipal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblSairTelaConsultaMouseClicked

    private void lblSairTelaConsultaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSairTelaConsultaMouseEntered
        // Quando o ponteiro do mouse entrar na área do label
        lblSairTelaConsulta.setFont(new Font("Constantia", Font.BOLD, 24));
        lblSairTelaConsulta.setForeground(Color.RED);
    }//GEN-LAST:event_lblSairTelaConsultaMouseEntered

    private void lblSairTelaConsultaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSairTelaConsultaMouseExited
        // Quando o ponteiro do mouse entrar na área do label
        lblSairTelaConsulta.setFont(new Font("Constantia", Font.PLAIN, 24));
        lblSairTelaConsulta.setForeground(Color.WHITE);
    }//GEN-LAST:event_lblSairTelaConsultaMouseExited

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
            java.util.logging.Logger.getLogger(FrmConsultarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmConsultarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmConsultarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmConsultarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmConsultarCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JLabel lblSairTelaConsulta;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
