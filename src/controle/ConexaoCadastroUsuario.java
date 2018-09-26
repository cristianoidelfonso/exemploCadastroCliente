package controle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import models.Usuario;

public class ConexaoCadastroUsuario {

//------------------------------------------------------------------------------
    /**
     * Método para cadastrar um novo usuário no banco de dados
     */
    public static void cadastrarNovoUsuario() {
        try {
            Connection conn = Conexao.getConexao();
            String sql = "INSERT INTO usuario (nome, cpf, login, senha) VALUES (?,?,?,?) ";
            PreparedStatement pst = conn.prepareStatement(sql);
            
            pst.setString(1, Usuario.nome);
            pst.setString(2, Usuario.cpf);
            pst.setString(3, Usuario.login);
            pst.setString(4, Usuario.senha);
            
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Usuario cadastrado com sucesso!", "SUCESSO", JOptionPane.INFORMATION_MESSAGE);
            
            Conexao.fecharConexao(conn, pst);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex, "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
//------------------------------------------------------------------------------
    /**
     * Método para alterar dados de um usuário cadastrado no banco de dados
     */
    public static void atualizarUsuario(){
        try {
            Connection conn = Conexao.getConexao();
            String sql = "UPDATE usuario SET nome = ?, cpf = ?, login = ? , senha = ? WHERE idusuario = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, Usuario.nome);
            pst.setString(2, Usuario.cpf);
            pst.setString(3, Usuario.login);
            pst.setString(4, Usuario.senha);
            pst.setInt(5, Usuario.idusuario);
            
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Cadastro alterado com sucesso!", "SUCESSO", JOptionPane.INFORMATION_MESSAGE);
            
            Conexao.fecharConexao(conn, pst);          
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex, "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }    
//------------------------------------------------------------------------------

    /**
     * Método para pesquisar usuários cadastrados
     */
    public static void pesquisarUsuario(){
        try {
            Connection conn = Conexao.getConexao();
            String sql = "SELECT * FROM usuario WHERE login = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, Usuario.login);
            ResultSet rs = pst.executeQuery();
            
            rs.next();
            Usuario.idusuario = (rs.getInt("idusuario"));
            Usuario.nome = (rs.getString("nome"));
            Usuario.cpf = (rs.getString("cpf"));
            //Usuario.login = (rs.getString("login"));
            Usuario.senha = (rs.getString("senha"));
            
            Conexao.fecharConexao(conn, pst, rs);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex, "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
}
