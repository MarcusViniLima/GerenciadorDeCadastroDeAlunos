/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author marcu
 */
public class Turma {
    
    ArrayList<String> ListaTurma;
    private String codigoTurma;
    private int quantAluno;


//Construtor da Turma
    public Turma(String codigoTurma) {
        this.ListaTurma = new ArrayList<String>();
        this.codigoTurma = codigoTurma;
        this.quantAluno = 0;
    }

// Getters e Setters dos Atributos Turma
    public String getCodigoTurma() {
        return this.codigoTurma;
    }
    public void setCodigoTurma(String codigoTurma) {
        this.codigoTurma=codigoTurma;
    }
    public int getquantAluno() {
        return this.quantAluno;
    }
    public void setquantAluno(int quantAluno) {
        this.quantAluno=quantAluno;
    }

    public void setListaTurma(String aluno) {
        this.ListaTurma.add(aluno);
    }

    //Metodos de turma----------------------------------------------------------------------------------------------------
    public int quantAluno(){
        return quantAluno++;
    }
    public int quantAlunoRemovido(){
        return quantAluno--;
    }
    public void alunosDaTurma(){
        Collections.sort(ListaTurma);
        for(int i = 0; i < ListaTurma.size(); i++){
            System.out.println("Aluno: "+this.ListaTurma.get(i)+" | ");
        }
    }

    @Override
    public String toString() {
        return "Turma= "+getCodigoTurma()+"| Alunos= " + quantAluno +"|";
    }
    
}
