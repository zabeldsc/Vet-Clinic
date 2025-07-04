package vet.clinic;

import java.util.ArrayList;

public class Consulta {

    private String problema, diagnostico;
    private ArrayList<String> medicamentos;
    private String data;
    private Veterinario vet;

    public Consulta(String problema, String diagnostico, String data, Veterinario vet) {
        this.problema = problema;
        this.diagnostico = diagnostico;
        this.data = data;
        this.vet = vet;
        this.medicamentos = new ArrayList<>();
    }

    public Consulta(String data, String descricao)
    {
        this(descricao, " ", data, null);
    }

    public String getProblema() {
        return problema;
    }

    public void setProblema(String problema) {
        this.problema = problema;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public ArrayList<String> getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(ArrayList<String> medicamentos) {
        this.medicamentos = medicamentos;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Veterinario getVet() {
        return vet;
    }

    public void setVet(Veterinario vet) {
        this.vet = vet;
    }

    public float calcConsulta()
    {
        return 0.f;
    }
}
