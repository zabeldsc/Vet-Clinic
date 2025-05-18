import java.time.LocalDate;
import java.util.ArrayList;

public class Consulta {

    private String problema, diagnostico;
    private ArrayList<String> medicamentos;
    private LocalDate data;
    private Veterinario vet;

    public Consulta(String problema, String diagnostico, LocalDate data, Veterinario vet) {
        this.problema = problema;
        this.diagnostico = diagnostico;
        this.data = data;
        this.vet = vet;
        this.medicamentos = new ArrayList<>();
    }

    public Consulta(LocalDate data, String descricao)
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

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
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
