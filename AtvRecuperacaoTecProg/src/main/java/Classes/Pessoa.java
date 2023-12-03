/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author yarap
 */
public class Pessoa {
    public String nome;
    public String cpf;
    public String email;    
    public String login;
    public String password;
    public String tipoPessoa;


    public Pessoa(String nome, String cpf, String email, String login, String password, String tipoPessoa) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.login = login;
        this.password = password;
        this.tipoPessoa = tipoPessoa;
    }
    
    

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
    
    
    
}
