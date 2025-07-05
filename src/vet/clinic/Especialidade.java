/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vet.clinic;

import java.util.ArrayList;
import java.util.List;


public class Especialidade {
    private String tipo;
    private double valorEspec;
    private List<Veterinario> veterinarios;

    
    public Especialidade(String tipo, double valorEspec) {
        this.tipo = tipo;
        this.valorEspec = valorEspec;
        this.veterinarios = new ArrayList<>(); // Inicializa a lista de veterinários vazia
    }

    
    public String getTipo() {
        return tipo;
    }

    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
    public double getValorEspec() {
        return valorEspec;
    }

    
    public void setValorEspec(double valorEspec) {
        this.valorEspec = valorEspec;
    }

    
    public List<Veterinario> getVeterinarios() {
        return veterinarios;
    }

    
    public void setVeterinarios(List<Veterinario> veterinarios) {
        this.veterinarios = veterinarios;
    }

    
    public void adicionarVeterinario(Veterinario veterinario) {
        if (this.veterinarios == null) {
            this.veterinarios = new ArrayList<>();
        }
        this.veterinarios.add(veterinario);
    }

    
    public boolean removerVeterinario(Veterinario veterinario) {
        if (this.veterinarios != null) {
            return this.veterinarios.remove(veterinario);
        }
        return false;
    }

    @Override
    public String toString() {
        return this.tipo;
    }
}
