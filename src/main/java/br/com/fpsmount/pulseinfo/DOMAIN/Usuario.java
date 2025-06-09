package br.com.fpsmount.pulseinfo.DOMAIN;

import java.util.List;

public class Usuario {
    private int id_usuario;
    private String senha_usuario;
    private String email_usuario;
    private List<Categorias> interesses;
    private List<Cidades> cidades_favoritas;

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

    public List<Categorias> getInteresses() {
        return interesses;
    }

    public void setInteresses(List<Categorias> interesses) {
        this.interesses = interesses;
    }

    public List<Cidades> getCidades_favoritas() {
        return cidades_favoritas;
    }

    public void setCidades_favoritas(List<Cidades> cidades_favoritas) {
        this.cidades_favoritas = cidades_favoritas;
    }
}
