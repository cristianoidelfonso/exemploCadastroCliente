package views;

import java.awt.Color;
import java.awt.Font;

public class FrmCadastrarCliente extends javax.swing.JFrame {

    public FrmCadastrarCliente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPrincipal = new javax.swing.JPanel();
        lblSairTelaCadastro = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblIDCliente = new javax.swing.JLabel();
        lblEndereco = new javax.swing.JLabel();
        lblRua = new javax.swing.JLabel();
        lblNumero = new javax.swing.JLabel();
        lblBairro = new javax.swing.JLabel();
        lblCidade = new javax.swing.JLabel();
        lblEstado = new javax.swing.JLabel();
        lblDataNascimento = new javax.swing.JLabel();
        lblTelefone = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblCpf = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jFormattedTextField2 = new javax.swing.JFormattedTextField();
        jTextField4 = new javax.swing.JTextField();
        jFormattedTextField4 = new javax.swing.JFormattedTextField();
        jFormattedTextField5 = new javax.swing.JFormattedTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1000, 600));
        setMinimumSize(new java.awt.Dimension(1000, 600));
        setUndecorated(true);

        jPanelPrincipal.setBackground(new java.awt.Color(51, 51, 51));

        lblSairTelaCadastro.setFont(new java.awt.Font("Constantia", 0, 24)); // NOI18N
        lblSairTelaCadastro.setForeground(new java.awt.Color(255, 255, 255));
        lblSairTelaCadastro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSairTelaCadastro.setText("X");
        lblSairTelaCadastro.setToolTipText("Voltar para a tela principal");
        lblSairTelaCadastro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSairTelaCadastroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblSairTelaCadastroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblSairTelaCadastroMouseExited(evt);
            }
        });
        lblSairTelaCadastro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lblSairTelaCadastroKeyTyped(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("Constantia", 0, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(51, 51, 255));
        lblTitulo.setText("Cadastro de clientes");

        lblNome.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        lblNome.setForeground(new java.awt.Color(255, 255, 255));
        lblNome.setText("Nome :");

        lblIDCliente.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        lblIDCliente.setForeground(new java.awt.Color(255, 255, 255));
        lblIDCliente.setText("ID :");

        lblEndereco.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        lblEndereco.setForeground(new java.awt.Color(255, 255, 255));
        lblEndereco.setText("Endereço");

        lblRua.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        lblRua.setForeground(new java.awt.Color(255, 255, 255));
        lblRua.setText("Rua:");

        lblNumero.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        lblNumero.setForeground(new java.awt.Color(255, 255, 255));
        lblNumero.setText("Número:");

        lblBairro.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        lblBairro.setForeground(new java.awt.Color(255, 255, 255));
        lblBairro.setText("Bairro:");

        lblCidade.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        lblCidade.setForeground(new java.awt.Color(255, 255, 255));
        lblCidade.setText("Cidade:");

        lblEstado.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        lblEstado.setForeground(new java.awt.Color(255, 255, 255));
        lblEstado.setText("Estado:");

        lblDataNascimento.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        lblDataNascimento.setForeground(new java.awt.Color(255, 255, 255));
        lblDataNascimento.setText("Data de nasc.:");

        lblTelefone.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        lblTelefone.setForeground(new java.awt.Color(255, 255, 255));
        lblTelefone.setText("Telefone:");

        lblEmail.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblEmail.setText("Email:");

        lblCpf.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        lblCpf.setForeground(new java.awt.Color(255, 255, 255));
        lblCpf.setText("CPF:");

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(153, 153, 153));
        jTextField1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setBorder(null);
        jTextField1.setMaximumSize(new java.awt.Dimension(0, 23));

        jFormattedTextField2.setBackground(new java.awt.Color(153, 153, 153));
        jFormattedTextField2.setBorder(null);
        jFormattedTextField2.setForeground(new java.awt.Color(255, 255, 255));
        try {
            jFormattedTextField2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jFormattedTextField2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        jTextField4.setBackground(new java.awt.Color(153, 153, 153));
        jTextField4.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(255, 255, 255));
        jTextField4.setBorder(null);
        jTextField4.setMaximumSize(new java.awt.Dimension(0, 23));

        jFormattedTextField4.setBackground(new java.awt.Color(153, 153, 153));
        jFormattedTextField4.setBorder(null);
        jFormattedTextField4.setForeground(new java.awt.Color(255, 255, 255));
        try {
            jFormattedTextField4.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField4.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jFormattedTextField4.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        jFormattedTextField5.setBackground(new java.awt.Color(153, 153, 153));
        jFormattedTextField5.setBorder(null);
        jFormattedTextField5.setForeground(new java.awt.Color(255, 255, 255));
        try {
            jFormattedTextField5.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField5.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jFormattedTextField5.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        jTextField10.setBackground(new java.awt.Color(153, 153, 153));
        jTextField10.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jTextField10.setForeground(new java.awt.Color(255, 255, 255));
        jTextField10.setBorder(null);
        jTextField10.setMaximumSize(new java.awt.Dimension(0, 23));

        jTextField11.setBackground(new java.awt.Color(153, 153, 153));
        jTextField11.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jTextField11.setForeground(new java.awt.Color(255, 255, 255));
        jTextField11.setBorder(null);
        jTextField11.setMaximumSize(new java.awt.Dimension(0, 23));

        jTextField12.setBackground(new java.awt.Color(153, 153, 153));
        jTextField12.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jTextField12.setForeground(new java.awt.Color(255, 255, 255));
        jTextField12.setBorder(null);
        jTextField12.setMaximumSize(new java.awt.Dimension(0, 23));

        jTextField13.setBackground(new java.awt.Color(153, 153, 153));
        jTextField13.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jTextField13.setForeground(new java.awt.Color(255, 255, 255));
        jTextField13.setBorder(null);
        jTextField13.setMaximumSize(new java.awt.Dimension(0, 23));

        jTextField14.setBackground(new java.awt.Color(153, 153, 153));
        jTextField14.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jTextField14.setForeground(new java.awt.Color(255, 255, 255));
        jTextField14.setBorder(null);
        jTextField14.setMaximumSize(new java.awt.Dimension(0, 23));

        jComboBox1.setBackground(new java.awt.Color(153, 153, 153));
        jComboBox1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Minas  Gerais", "São Paulo", "Rio de Janeiro", "Espirito Santo", "Paraná", "Santa Catarina", "Rio Grande do Sul", "Goiás", "Mato Grosso", "Mato Grosso do Sul", "Brasilia", "Tocantins", "Acre", "Rondônia", "" }));

        javax.swing.GroupLayout jPanelPrincipalLayout = new javax.swing.GroupLayout(jPanelPrincipal);
        jPanelPrincipal.setLayout(jPanelPrincipalLayout);
        jPanelPrincipalLayout.setHorizontalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addComponent(lblTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblSairTelaCadastro))
                    .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                        .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                                .addComponent(lblNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                                .addComponent(lblEmail)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                                .addComponent(lblTelefone)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFormattedTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                                .addComponent(lblDataNascimento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFormattedTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblEndereco)
                            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                                .addComponent(lblIDCliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(lblCpf)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelPrincipalLayout.createSequentialGroup()
                                        .addComponent(lblCidade)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelPrincipalLayout.createSequentialGroup()
                                        .addComponent(lblBairro)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelPrincipalLayout.createSequentialGroup()
                                        .addComponent(lblRua)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(12, 12, 12)
                                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblNumero)
                                    .addComponent(lblEstado))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 315, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelPrincipalLayout.setVerticalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSairTelaCadastro)
                    .addComponent(lblTitulo))
                .addGap(26, 26, 26)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIDCliente)
                    .addComponent(lblCpf)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDataNascimento)
                    .addComponent(jFormattedTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefone)
                    .addComponent(jFormattedTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(lblEndereco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRua)
                    .addComponent(lblNumero)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBairro)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCidade)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEstado))
                .addContainerGap(152, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelPrincipal, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblSairTelaCadastroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSairTelaCadastroMouseClicked
        // Quando clicar na label
        frmTelaPrincipal telaprincipal = new frmTelaPrincipal();
        telaprincipal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblSairTelaCadastroMouseClicked

    private void lblSairTelaCadastroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSairTelaCadastroMouseEntered
        // Quando o ponteiro do mouse entrar na área do label      
        lblSairTelaCadastro.setFont(new Font("Constantia", Font.BOLD, 24));
        lblSairTelaCadastro.setForeground(Color.RED);     
    }//GEN-LAST:event_lblSairTelaCadastroMouseEntered

    private void lblSairTelaCadastroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSairTelaCadastroMouseExited
        // Quando o ponteiro do mouse entrar na área do label      
        lblSairTelaCadastro.setFont(new Font("Constantia", Font.PLAIN, 24));
        lblSairTelaCadastro.setForeground(Color.WHITE);     
    }//GEN-LAST:event_lblSairTelaCadastroMouseExited

    private void lblSairTelaCadastroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblSairTelaCadastroKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_lblSairTelaCadastroKeyTyped

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
            java.util.logging.Logger.getLogger(FrmCadastrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCadastrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCadastrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCadastrarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCadastrarCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JFormattedTextField jFormattedTextField2;
    private javax.swing.JFormattedTextField jFormattedTextField4;
    private javax.swing.JFormattedTextField jFormattedTextField5;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel lblBairro;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblDataNascimento;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblIDCliente;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblRua;
    private javax.swing.JLabel lblSairTelaCadastro;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
