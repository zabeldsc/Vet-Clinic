/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vet.clinic;

import java.time.LocalDateTime;

public class Agendamento {

    public enum Status {
        AGENDADO,
        CANCELADO
    }

    private Animal animal;
    private Especialidade especialidade;
    private LocalDateTime dataHora;
    private Status status;
    private double valor;

    public Agendamento(Animal animal, LocalDateTime dataHora, Especialidade especialidade) {
        this.animal        = animal;
        this.dataHora      = dataHora;
        this.especialidade = especialidade;
        this.status        = Status.AGENDADO;
        this.valor         = especialidade.getValorEspec();
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Especialidade getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(Especialidade especialidade) {
        this.especialidade = especialidade;
        this.valor = especialidade.getValorEspec();
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public Status getStatus() {
        return status;
    }

    public void cancelar() {
        this.status = Status.CANCELADO;
    }

    public double getValor() {
        return valor;
    }

    /** 
     * toString usado no JComboBox/diálogos de seleção.
     */
    @Override
    public String toString() {
        return dataHora.format(
            java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")
        ) + " – " + animal.getNome();
    }
}
