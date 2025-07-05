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
        this.especialidades = new ArrayList<>();
        this.vacinas = new ArrayList<>();
        this.funcionarios = new ArrayList<>();
        this.veterinarios = new ArrayList<>();
        this.agendamentos = new ArrayList<>();
    }
    
    public ArrayList<Tutor> getTutores(){
        return tutores;
    }
    
    public ArrayList<Animal> getAnimais(){
        return animais;
    }
    
    public ArrayList<Especialidade> getEspecialidades(){
        return especialidades;
    }
    
    public ArrayList<Vacina> getVacinas(){
        return vacinas;
    }
    
    public ArrayList<Funcionario> getFuncionarios(){
        return funcionarios;
    }
    
    public ArrayList<Veterinario> getVeterinarios(){
        return veterinarios;
    }
    
    public ArrayList<Agendamento> getAgendamentos(){
        return agendamentos;
    }
    
    
}
