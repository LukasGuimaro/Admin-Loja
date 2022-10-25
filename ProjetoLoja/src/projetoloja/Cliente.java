package projetoloja;

import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class Cliente {
    private float id;
    private String nome;
    private String email;
    private ArrayList<Pedido> pedidos;

    public Cliente(float id, String nome, String email, String senha) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    public float getId() {
        return id;
    }

    public void setId(float id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}