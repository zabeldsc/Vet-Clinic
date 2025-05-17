public class Veterinario extends Funcionario{
    private String especialidade;
    private long int numCFMV;

    public Veterinario(String nome, String cpf, String email, long int telefone, String especialidade, long int numCFMV) {
        super(nome, cpf, email, telefone);
        this.especialidade = especialidade;
        this.numCFMV = numCFMV;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public int getNumCFMV() {
        return numCFMV;
    }

    public void setNumCFMV(int numCFMV) {
        this.numCFMV = numCFMV;
    }

    public void excluirVet(Veterinario veterinario) {
        veterinario = null;
    }
}