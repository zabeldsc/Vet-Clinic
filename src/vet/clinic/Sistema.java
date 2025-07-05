/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vet.clinic;

import java.util.ArrayList;

/**
 *
 * @author Caiyo
 */
public class Sistema {
    
    private ArrayList<Tutor> tutores;
    private ArrayList<Animal> animais;
    private ArrayList<Especialidade> especialidades;
    private ArrayList<Vacina> vacinas;
    private ArrayList<Funcionario> funcionarios;
    private ArrayList<Veterinario> veterinarios;
    private ArrayList<Agendamento> agendamentos;
    
    public Sistema(){
        this.tutores = new ArrayList<>();
        this.animais = new ArrayList<>();
        this.agendamentos = new ArrayList<>();
    }
    
    public ArrayList<Tutor> getTutores(){
        return tutores;
    }
    
    public ArrayList<Animal> getAnimais(){
        return animais;
    }
    
    public ArrayList<Agendamento> getAgendamentos()
    {
        return agendamentos;
    }
    
}
