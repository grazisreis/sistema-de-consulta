package src;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

abstract class Usuario {

    //atributos
    String cpf;
    String nome_completo;
    LocalDate data_nascimento;
    long idade = ChronoUnit.YEARS.between(data_nascimento, LocalDate.now());
    String celular;
    String email;
    String nome_mae;

    //metodos
    public Usuario (String cpf, String nome_completo, LocalDate data_nascimento, long idade, String celular, String email, String nome_mae){
        this.cpf = cpf;
        this.nome_completo = nome_completo;
        this.data_nascimento = data_nascimento;
        this.idade = idade;
        this.celular = celular;
        this.email = email;
        this.nome_mae = nome_mae;
    }

    //getters e setters

    public String getCpf() {
        return cpf;
    }



    public void setCpf(String cpf) {
        this.cpf = cpf;
    }



    public String getNome_completo() {
        return nome_completo;
    }



    public void setNome_completo(String nome_completo) {
        this.nome_completo = nome_completo;
    }



    public LocalDate getData_nascimento() {
        return data_nascimento;
    }



    public void setData_nascimento(LocalDate data_nascimento) {
        this.data_nascimento = data_nascimento;
    }



    public long getIdade() {
        return idade;
    }



    public void setIdade(long idade) {
        this.idade = idade;
    }



    public String getCelular() {
        return celular;
    }



    public void setCelular(String celular) {
        this.celular = celular;
    }



    public String getEmail() {
        return email;
    }



    public void setEmail(String email) {
        this.email = email;
    }



    public String getNome_mae() {
        return nome_mae;
    }



    public void setNome_mae(String nome_mae) {
        this.nome_mae = nome_mae;
    }



    public void realizar_cadastro(String email){

    }

    public void realizar_login(String email){

    }

}
