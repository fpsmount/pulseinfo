package br.com.fpsmount.pulseinfo.DOMAIN;

public class Cidades {
    private int id_cidade;
    private String nome;
    private String codigoAPI;

    public int getId_cidade() {
        return id_cidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigoAPI() {
        return codigoAPI;
    }

    public void setCodigoAPI(String codigoAPI) {
        this.codigoAPI = codigoAPI;
    }
}
