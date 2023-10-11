package br.edu.ifsp.arq.tsi.model;

public class EmpregadosModel {
    
    private String name;
    private String genero;
    private String cpf;
    private String nascimento;
    private double salario;

    public EmpregadosModel(String name, String genero, String cpf, String nascimento, double salario) {
        this.name = name;
        this.genero = genero;
        this.cpf = cpf;
        this.nascimento = nascimento;
        this.salario = salario;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getNascimento() {
        return nascimento;
    }
    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    @Override
    public String toString() {
        return "EmpregadosModel [name=" + name + ", genero=" + genero + ", cpf=" + cpf + ", nascimento=" + nascimento
                + ", salario=" + salario + "]";
    }
}