package models;

public class Usuario {

    public static int idusuario;
    public static String login;
    public static String senha;
    public static String cpf;
    public static String nome;

    public Usuario() {
    }

    public static String getNome() {
        return nome;
    }

    public static void setNome(String nome) {
        Usuario.nome = nome;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        Usuario.idusuario = idusuario;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        Usuario.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        Usuario.senha = senha;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        Usuario.cpf = cpf;
    }
}
