package br.com.fpsmount.pulseinfo.DOMAIN;

import jakarta.persistence.*;

import java.util.List;

@Entity(name = "usuario")
@Table(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_usuario;
    private String senha_usuario;
    private String email_usuario;
    private List<Cidades> cidades_favoritas;

    public Usuario(String senha_usuario, String email_usuario, Cidades cidades){
        this.senha_usuario = senha_usuario;
        this.email_usuario = email_usuario;
        this.cidades_favoritas.add(cidades);
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public String getSenha_usuario() {
        return senha_usuario;
    }

    public void setSenha_usuario(String senha_usuario) {
        this.senha_usuario = senha_usuario;
    }

    public String getEmail_usuario() {
        return email_usuario;
    }

    public void setEmail_usuario(String email_usuario) {
        this.email_usuario = email_usuario;
    }

    public List<Cidades> getCidades_favoritas() {
        return cidades_favoritas;
    }

    public void setCidades_favoritas(List<Cidades> cidades_favoritas) {
        this.cidades_favoritas = cidades_favoritas;
    }
}
