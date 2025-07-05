package vet.clinic;

public class Veterinario extends Funcionario{
    private Especialidade especialidade;
    private String numCFMV;

    public Veterinario(String nome, String cpf, String email, String telefone, Especialidade especialidade, String numCFMV, String turnoTrab) {
        super(nome, cpf, email, telefone, turnoTrab);
        this.especialidade = especialidade;
        this.numCFMV = numCFMV;
    }

    public Especialidade getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(Especialidade especialidade) {
        this.especialidade = especialidade;
    }

    public String getNumCFMV() {
        return numCFMV;
    }

    public void setNumCFMV(String numCFMV) {
        this.numCFMV = numCFMV;
    }

    public void excluirVet(Veterinario veterinario) {
        veterinario = null;
    }
    
    @Override
    public String toString() {
        return getNome() + " (Veterinário)";
    }
}