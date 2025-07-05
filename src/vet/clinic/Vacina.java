package vet.clinic;

import java.time.LocalDate;

public class Vacina {
    private String nome;
    private double valor;
    private int mesesVencer;

    public Vacina(String nome, double valor, int mesesVencer) {
        this.nome = nome;
        this.valor = valor;
        this.mesesVencer = mesesVencer;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getMesesVencer() {
        return mesesVencer;
    }

    public void setMesesVencer(int mesesVencer) {
        this.mesesVencer = mesesVencer;
    }
    
    
    @Override
    public String toString() {
        return this.nome + " (R$ " + this.valor + ")";
    }
}
