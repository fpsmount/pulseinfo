package br.com.fpsmount.pulseinfo.DOMAIN;

import jakarta.persistence.*;

@Entity(name = "cidades")
@Table(name = "cidades")
public class Cidades {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
