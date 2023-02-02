package com.atividade.models;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

public class PessoaDto {
    private String nome;
    private String cpf;
    private String rg;
    private String dataNascimento;
    @Enumerated(EnumType.STRING)
    private EstadoCivil estadoCivil;
    private String telefone;
    private String email;

    public PessoaDto(){

    }
    public PessoaDto(PessoaModel pessoaModel){
        this.nome= pessoaModel.getNome();
        this.cpf= pessoaModel.getCpf();
        this.rg=pessoaModel.getRg();
        this.dataNascimento= pessoaModel.getDataNascimento();
        this.estadoCivil=pessoaModel.getEstadoCivil();
        this.telefone=pessoaModel.getTelefone();
        this.email=pessoaModel.getEmail();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
