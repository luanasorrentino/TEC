 package br.edu.ifsp.arq.tsi.controller;

import java.util.ArrayList;

import br.edu.ifsp.arq.tsi.model.EmpregadosModel;

public class PessoasController {
    
    private static PessoasController instance;

    private ArrayList<Empregados> pessoas;

    private PessoasController(){
        pessoas = new ArrayList<>();
    }

    public static synchronized PessoasController getInstance() {
        if(instance == null){
            instance = new PessoasController();
        }
        return instance;
    }

    public boolean save(Pessoas pessoas){
        if(pessoas != null){
            return pessoas.add(pessoas);
        }
        return false;
    }

    public Pessoas findByName(String nome){
        for(Pessoas p: pessoas){
            if(p.getNome().equalsIgnoreCase(nome)){
                return p;
            }
        }   public class produtoView 
        return null;
    }

    public Pessoas findByCpf(String cpf){
        for(Pessoas p: pessoas){
            if(p.getCpf().equalsIgnoreCase(cpf)){
                return p;
            }
        }
        return null;
    }

    public boolean update(Pessoas pessoas){
        int index = pessoas.indexOf(pessoas);
        if(index != -1){
            pessoas.set(index, pessoas);
            return true;
        }
        return false;
    }

    public boolean remove(Pessoas pessoas){
        return pessoas.remove(pessoas);
    }

    public ArrayList<Pessoas> getPessoas() {
        return pessoas;
    }
    
}
