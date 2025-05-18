public class Veterinario extends Funcionario{
    private String especialidade;
    private String numCFMV;

    public Veterinario(String nome, String cpf, String email, String telefone, String especialidade, String numCFMV, String turnoTrab) {
        super(nome, cpf, email, telefone, turnoTrab);
        this.especialidade = especialidade;
        this.numCFMV = numCFMV;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
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
}