/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vet.clinic;

import java.time.LocalDate;

public class VacinacaoAnimal {
    private LocalDate dataAplicacao;
    private LocalDate dataValidade;
    private Vacina vacina; // Associação com a classe Vacina
   
    public VacinacaoAnimal(LocalDate dataAplicacao, LocalDate dataValidade, Vacina vacina) {
        this.dataAplicacao = dataAplicacao;
        this.vacina = vacina;
        this.dataValidade = dataAplicacao.plusMonths(vacina.getMesesVencer());
    }
    
    public LocalDate getDataVencimento() {
        return dataValidade;
    }

    public LocalDate getDataAplicacao() {
        return dataAplicacao;
    }

    public void setDataAplicacao(LocalDate dataAplicacao) {
        this.dataAplicacao = dataAplicacao;
    }

    public Vacina getVacina() {
        return vacina;
    }

    public void setVacina(Vacina vacina) {
        this.vacina = vacina;
    }

    @Override
    public String toString() {
        return "VacinacaoAnimal{" +
               "dataAplicacao=" + dataAplicacao +
               ", dataValidade=" + dataValidade +
               ", vacina=" + vacina.getNome() + // Mostra o nome da vacina para facilitar a leitura
               '}';
    }
}