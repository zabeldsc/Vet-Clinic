package vet.clinic;

public class Funcionario extends Pessoa{
    private String turnoTrab;

    public Funcionario(String nome, String cpf, String email, String telefone, String turnoTrab){
        super(nome, cpf, email, telefone);
        this.turnoTrab = turnoTrab;
    }

    public String getTurnoTrab() {
        return turnoTrab;
    }

    public void setTurnoTrab(String turnoTrab) {
        this.turnoTrab = turnoTrab;
    }

    public void excluirFunc(Funcionario funcionario) {
        funcionario = null;
    }
}