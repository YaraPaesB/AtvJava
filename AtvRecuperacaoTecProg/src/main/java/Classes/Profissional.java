/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author yarap
 */
public class Profissional extends Pessoa {
    public String crp;

    public Profissional(String crp, String nome, String cpf, String email, String login, String password) {
        super(nome, cpf, email, login, password, "Profissional");
        this.crp = crp;
    }
    
  

    public String getCrp() {
        return crp;
    }

    public void setCrp(String crp) {
        this.crp = crp;
    }
    
    
}
