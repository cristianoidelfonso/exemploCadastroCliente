package views;

import controle.ConexaoCadastroUsuario;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;
import models.Usuario;

public class FrmCadastrarUsuario extends javax.swing.JFrame {

    public FrmCadastrarUsuario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblNomeUsuario = new javax.swing.JLabel();
        lblNomeUsuario1 = new javax.swing.JLabel();
        lblNomeUsuario2 = new javax.swing.JLabel();
        lblNomeUsuario3 = new javax.swing.JLabel();
        txtCpfUsuario = new javax.swing.JFormattedTextField();
        txtNomeUsuario = new javax.swing.JTextField();
        txtLoginUsuario = new javax.swing.JTextField();
        txtSenhaUsuario = new javax.swing.JTextField();
        lblSairTelaCadastroUsuario = new javax.swing.JLabel();
        btnCadastrarUsuario = new javax.swing.JButton();
        btnLimparCampos = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1000, 600));
        setMinimumSize(new java.awt.Dimension(1000, 600));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1000, 600));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        lblTitulo.setFont(new java.awt.Font("Constantia", 0, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(51, 51, 255));
        lblTitulo.setText("Cadastro de usuários");

        lblNomeUsuario.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblNomeUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblNomeUsuario.setText("Nome:");

        lblNomeUsuario1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblNomeUsuario1.setForeground(new java.awt.Color(255, 255, 255));
        lblNomeUsuario1.setText("CPF:");

        lblNomeUsuario2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblNomeUsuario2.setForeground(new java.awt.Color(255, 255, 255));
        lblNomeUsuario2.setText("Login:");

        lblNomeUsuario3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lblNomeUsuario3.setForeground(new java.awt.Color(255, 255, 255));
        lblNomeUsuario3.setText("Senha:");

        txtCpfUsuario.setBackground(new java.awt.Color(153, 153, 153));
        txtCpfUsuario.setBorder(null);
        txtCpfUsuario.setForeground(new java.awt.Color(255, 255, 255));
        try {
            txtCpfUsuario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCpfUsuario.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        txtNomeUsuario.setBackground(new java.awt.Color(153, 153, 153));
        txtNomeUsuario.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtNomeUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtNomeUsuario.setBorder(null);

        txtLoginUsuario.setBackground(new java.awt.Color(153, 153, 153));
        txtLoginUsuario.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtLoginUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtLoginUsuario.setBorder(null);

        txtSenhaUsuario.setBackground(new java.awt.Color(153, 153, 153));
        txtSenhaUsuario.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtSenhaUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtSenhaUsuario.setBorder(null);

        lblSairTelaCadastroUsuario.setBackground(new java.awt.Color(51, 51, 51));
        lblSairTelaCadastroUsuario.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lblSairTelaCadastroUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblSairTelaCadastroUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSairTelaCadastroUsuario.setText("X");
        lblSairTelaCadastroUsuario.setToolTipText("Fechar a aplicação");
        lblSairTelaCadastroUsuario.setFocusable(false);
        lblSairTelaCadastroUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSairTelaCadastroUsuarioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblSairTelaCadastroUsuarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblSairTelaCadastroUsuarioMouseExited(evt);
            }
        });

        btnCadastrarUsuario.setBackground(new java.awt.Color(153, 153, 153));
        btnCadastrarUsuario.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnCadastrarUsuario.setForeground(new java.awt.Color(51, 51, 51));
        btnCadastrarUsuario.setText("Cadastrar");
        btnCadastrarUsuario.setBorder(null);
        btnCadastrarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadastrarUsuario.setFocusable(false);
        btnCadastrarUsuario.setMaximumSize(new java.awt.Dimension(121, 33));
        btnCadastrarUsuario.setMinimumSize(new java.awt.Dimension(121, 33));
        btnCadastrarUsuario.setPreferredSize(new java.awt.Dimension(121, 33));
        btnCadastrarUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCadastrarUsuarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCadastrarUsuarioMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCadastrarUsuarioMousePressed(evt);
            }
        });
        btnCadastrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarUsuarioActionPerformed(evt);
            }
        });

        btnLimparCampos.setBackground(new java.awt.Color(153, 153, 153));
        btnLimparCampos.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnLimparCampos.setForeground(new java.awt.Color(51, 51, 51));
        btnLimparCampos.setText("Limpar");
        btnLimparCampos.setBorder(null);
        btnLimparCampos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimparCampos.setFocusable(false);
        btnLimparCampos.setMaximumSize(new java.awt.Dimension(121, 33));
        btnLimparCampos.setMinimumSize(new java.awt.Dimension(121, 33));
        btnLimparCampos.setPreferredSize(new java.awt.Dimension(121, 33));
        btnLimparCampos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLimparCamposMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLimparCamposMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnLimparCamposMousePressed(evt);
            }
        });
        btnLimparCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparCamposActionPerformed(evt);
            }
        });

        btnAlterar.setBackground(new java.awt.Color(153, 153, 153));
        btnAlterar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnAlterar.setForeground(new java.awt.Color(51, 51, 51));
        btnAlterar.setText("Alterar");
        btnAlterar.setBorder(null);
        btnAlterar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAlterar.setFocusable(false);
        btnAlterar.setMaximumSize(new java.awt.Dimension(121, 33));
        btnAlterar.setMinimumSize(new java.awt.Dimension(121, 33));
        btnAlterar.setPreferredSize(new java.awt.Dimension(121, 33));
        btnAlterar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAlterarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAlterarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAlterarMousePressed(evt);
            }
        });
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnPesquisar.setBackground(new java.awt.Color(153, 153, 153));
        btnPesquisar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnPesquisar.setForeground(new java.awt.Color(51, 51, 51));
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.setBorder(null);
        btnPesquisar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPesquisar.setFocusable(false);
        btnPesquisar.setMaximumSize(new java.awt.Dimension(121, 33));
        btnPesquisar.setMinimumSize(new java.awt.Dimension(121, 33));
        btnPesquisar.setPreferredSize(new java.awt.Dimension(121, 33));
        btnPesquisar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPesquisarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPesquisarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnPesquisarMousePressed(evt);
            }
        });
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblSairTelaCadastroUsuario))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNomeUsuario)
                                    .addComponent(lblNomeUsuario2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblNomeUsuario1, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCpfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtLoginUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblNomeUsuario3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSenhaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnCadastrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnLimparCampos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 400, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitulo)
                    .addComponent(lblSairTelaCadastroUsuario))
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeUsuario)
                    .addComponent(txtNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeUsuario1)
                    .addComponent(txtCpfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeUsuario2)
                    .addComponent(txtLoginUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeUsuario3)
                    .addComponent(txtSenhaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 255, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimparCampos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

//==============================================================================    
    /**
     * Label para fechar esta tela da aplicação
     *
     * @param evt
     */
    private void lblSairTelaCadastroUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSairTelaCadastroUsuarioMouseClicked
        // Quando clicar no label lblSairTelaCadastroUsuario
        frmTelaPrincipal telaPrincipal = new frmTelaPrincipal();
        telaPrincipal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblSairTelaCadastroUsuarioMouseClicked
    //--------------------------------------------------------------------------
    private void lblSairTelaCadastroUsuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSairTelaCadastroUsuarioMouseEntered
        // Quando o ponteiro do mouse entrar na área do label
        lblSairTelaCadastroUsuario.setFont(new Font("Century Gothic", Font.BOLD, 24));
        lblSairTelaCadastroUsuario.setForeground(Color.RED);
    }//GEN-LAST:event_lblSairTelaCadastroUsuarioMouseEntered
    //--------------------------------------------------------------------------
    private void lblSairTelaCadastroUsuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSairTelaCadastroUsuarioMouseExited
        // Quando o ponteiro do mouse entrar na área do label
        lblSairTelaCadastroUsuario.setFont(new Font("Century Gothic", Font.PLAIN, 24));
        lblSairTelaCadastroUsuario.setForeground(Color.WHITE);
    }//GEN-LAST:event_lblSairTelaCadastroUsuarioMouseExited
    //--------------------------------------------------------------------------
//==============================================================================
    /**
     * Botão cadastra novo usuário
     *
     * @param evt
     */
    private void btnCadastrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarUsuarioActionPerformed
        // Quando o botão btnCadastrarUsuario for clicado
        verificarUsuario();
        ConexaoCadastroUsuario.cadastrarNovoUsuario();
        limparCampos();
    }//GEN-LAST:event_btnCadastrarUsuarioActionPerformed
    //--------------------------------------------------------------------------
    private void btnCadastrarUsuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastrarUsuarioMouseEntered
        // Quando o ponteiro do mouse entrar na area do botão
        btnCadastrarUsuario.setBackground(Color.BLUE);
        btnCadastrarUsuario.setForeground(Color.WHITE);
        btnCadastrarUsuario.setFont(new Font("Century Gothic", Font.BOLD, 18));
    }//GEN-LAST:event_btnCadastrarUsuarioMouseEntered
    //--------------------------------------------------------------------------
    private void btnCadastrarUsuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastrarUsuarioMouseExited
        // Quando o ponteiro do mouse sair da area do botão
        btnCadastrarUsuario.setBackground(new Color(153, 153, 153));
        btnCadastrarUsuario.setForeground(new Color(51, 51, 51));
        btnCadastrarUsuario.setFont(new Font("Century Gothic", Font.PLAIN, 18));
    }//GEN-LAST:event_btnCadastrarUsuarioMouseExited
    //--------------------------------------------------------------------------
    private void btnCadastrarUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastrarUsuarioMousePressed
        // Quando o botão estiver pressionado
        btnCadastrarUsuarioMouseEntered(evt);
    }//GEN-LAST:event_btnCadastrarUsuarioMousePressed
    //--------------------------------------------------------------------------
//==============================================================================
    /**
     * Botão para limpar os campos de texto do formulário
     *
     * @param evt
     */
    private void btnLimparCamposMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimparCamposMouseEntered
        // Quando o ponteiro do mouse entrar na area do botão
        btnLimparCampos.setBackground(Color.BLUE);
        btnLimparCampos.setForeground(Color.WHITE);
        btnLimparCampos.setFont(new Font("Century Gothic", Font.BOLD, 18));
    }//GEN-LAST:event_btnLimparCamposMouseEntered
    //--------------------------------------------------------------------------
    private void btnLimparCamposMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimparCamposMouseExited
        // Quando o ponteiro do mouse sair da area do botão
        btnLimparCampos.setBackground(new Color(153, 153, 153));
        btnLimparCampos.setForeground(new Color(51, 51, 51));
        btnLimparCampos.setFont(new Font("Century Gothic", Font.PLAIN, 18));
    }//GEN-LAST:event_btnLimparCamposMouseExited
    //--------------------------------------------------------------------------
    private void btnLimparCamposMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimparCamposMousePressed
        // Quando o botão estiver pressionado
        btnLimparCamposMouseEntered(evt);
    }//GEN-LAST:event_btnLimparCamposMousePressed
    //--------------------------------------------------------------------------
    private void btnLimparCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparCamposActionPerformed
        // Quando o botão for clicado
        limparCampos();
    }//GEN-LAST:event_btnLimparCamposActionPerformed

    private void btnAlterarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlterarMouseEntered
        // Quando o ponteiro do mouse entrar na area do botão
        btnAlterar.setBackground(Color.BLUE);
        btnAlterar.setForeground(Color.WHITE);
        btnAlterar.setFont(new Font("Century Gothic", Font.BOLD, 18));
    }//GEN-LAST:event_btnAlterarMouseEntered

    private void btnAlterarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlterarMouseExited
        // Quando o ponteiro do mouse sair da area do botão
        btnAlterar.setBackground(new Color(153, 153, 153));
        btnAlterar.setForeground(new Color(51, 51, 51));
        btnAlterar.setFont(new Font("Century Gothic", Font.PLAIN, 18));
    }//GEN-LAST:event_btnAlterarMouseExited

    private void btnAlterarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlterarMousePressed
        // Quando o botao estiver pressionado
        btnAlterarMouseEntered(evt);
    }//GEN-LAST:event_btnAlterarMousePressed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        // Quando o botão for clicado
        verificarUsuario();
        ConexaoCadastroUsuario.atualizarUsuario();
        limparCampos();
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnPesquisarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPesquisarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPesquisarMouseEntered

    private void btnPesquisarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPesquisarMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPesquisarMouseExited

    private void btnPesquisarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPesquisarMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPesquisarMousePressed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        // Quando clicar no botão pesquisar
        pesquisar();
    }//GEN-LAST:event_btnPesquisarActionPerformed
    //--------------------------------------------------------------------------
//==============================================================================
    /**
     * Método que verifica se existe campo vazio no formulario de cadastro
     */
    private void verificarUsuario() {
        // Quando clicar no botao, chama o metodo da classe ConexaoCadastroUsuario para cadastrar um novo usuario do sistema
        if (!txtNomeUsuario.getText().equals("")
                && !txtCpfUsuario.getText().equals("")
                && !txtLoginUsuario.getText().equals("")
                && !txtSenhaUsuario.getText().equals("")) {
            Usuario.nome = txtNomeUsuario.getText();
            Usuario.cpf = txtCpfUsuario.getText();
            Usuario.login = txtLoginUsuario.getText();
            Usuario.senha = txtSenhaUsuario.getText();
        } else {
            JOptionPane.showMessageDialog(null, "Campo vazio não é permitido");
        }
    }
    //--------------------------------------------------------------------------

    /**
     * Método que executa a limpeza dos campos de texto
     */
    private void limparCampos() {
        txtNomeUsuario.setText("");
        txtCpfUsuario.setText("");
        txtLoginUsuario.setText("");
        txtSenhaUsuario.setText("");
        txtNomeUsuario.requestFocus();
    }
    //--------------------------------------------------------------------------
    
    /**
     * Método para pesquisar um usuário
     */
    private void pesquisar(){
        Usuario.login = txtLoginUsuario.getText();
        ConexaoCadastroUsuario.pesquisarUsuario();
        txtNomeUsuario.setText(Usuario.nome);
        txtCpfUsuario.setText(Usuario.cpf);
        txtLoginUsuario.setText(Usuario.login);
        txtSenhaUsuario.setText(Usuario.senha);
    }
//==============================================================================    

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
            java.util.logging.Logger.getLogger(FrmCadastrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCadastrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCadastrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCadastrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCadastrarUsuario().setVisible(true);
            }
        });
    }

//==============================================================================
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCadastrarUsuario;
    private javax.swing.JButton btnLimparCampos;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblNomeUsuario;
    private javax.swing.JLabel lblNomeUsuario1;
    private javax.swing.JLabel lblNomeUsuario2;
    private javax.swing.JLabel lblNomeUsuario3;
    private javax.swing.JLabel lblSairTelaCadastroUsuario;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JFormattedTextField txtCpfUsuario;
    private javax.swing.JTextField txtLoginUsuario;
    private javax.swing.JTextField txtNomeUsuario;
    private javax.swing.JTextField txtSenhaUsuario;
    // End of variables declaration//GEN-END:variables
//==============================================================================
}
