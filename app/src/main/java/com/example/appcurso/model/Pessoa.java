package com.example.appcurso.model;

public class Pessoa {

    private String primeiro_nome;

    private String sobrenome;

    private String nome_curso;

    private String Tel_Contato;

    public String getPrimeiro_nome() {
        return primeiro_nome;
    }

    public void setPrimeiro_nome(String primeiro_nome) {
        this.primeiro_nome = primeiro_nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getNome_curso() {
        return nome_curso;
    }

    public void setNome_curso(String nome_curso) {
        this.nome_curso = nome_curso;
    }

    public String getTel_Contato() {
        return Tel_Contato;
    }

    public void setTel_Contato(String tel_Contato) {
        Tel_Contato = tel_Contato;
    }

    public Pessoa() {
    }
}
