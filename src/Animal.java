import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

class Animal {
    private String nome, raca;
    private LocalDate dataNasc;
    private Tutor tutor;
    private List<Vacina> cartaoVacina;
    private List<Consulta> consultas;

    public Animal(String nome, String raca, LocalDate dataNasc, Tutor tutor, List<Vacina> cartaoVacina,
            List<Consulta> consultas) {
        this.nome = nome;
        this.raca = raca;
        this.dataNasc = dataNasc;
        this.tutor = tutor;
        this.cartaoVacina = (cartaoVacina != null) ? cartaoVacina : new ArrayList<>();
        this.consultas = (consultas != null) ? consultas : new ArrayList<>();
    }

    public Animal(String nome, String raca, LocalDate dataNasc, Tutor tutor) {
        this(nome, raca, dataNasc, tutor, new ArrayList<>(), new ArrayList<>());
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nome='" + nome + '\'' +
                ", raca='" + raca + '\'' +
                ", dataNasc=" + dataNasc +
                ", tutor=" + (tutor != null ? tutor.getNome() : "Sem tutor") +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public LocalDate getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(LocalDate dataNasc) {
        this.dataNasc = dataNasc;
    }

    public Tutor getTutor() {
        return tutor;
    }

    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }

    public List<Vacina> getCartaoVacina() {
        return cartaoVacina;
    }

    public void setCartaoVacina(List<Vacina> cartaoVacina) {
        this.cartaoVacina = cartaoVacina;
    }

    public void marcarConsulta(LocalDate data, String descricao) {
        consultas.add(new Consulta(data, descricao));
    }

    public void incluirVacina(Vacina vacina) {
        this.cartaoVacina.add(vacina);
    }

    public void cancelarConsulta(Consulta consulta) {
        consultas.remove(consulta);
    }

    public void consultarConsulta() {
        if (consultas.isEmpty()) {
            System.out.println("Nenhuma consulta marcada.");
        } else {
            System.out.println("Consultas para " + nome + ":");
            for (Consulta c : consultas) {
                System.out.println("- " + c);
            }
        }
    }

    public void emitirProntuario() {
        System.out.println("===== Prontuário =====");
        System.out.println("Nome: " + nome);
        System.out.println("Raça: " + raca);
        System.out.println("Data de nascimento: " + dataNasc);
        System.out.println("Tutor: " + (tutor != null ? tutor.getNome() : "Sem tutor"));
        System.out.println("Vacinas aplicadas:");
        if (cartaoVacina.isEmpty()) {
            System.out.println("- Nenhuma vacina registrada.");
        } else {
            for (Vacina v : cartaoVacina) {
                System.out.println("- " + v.getNome());
            }
        }
        System.out.println("======================");
    }

    public static void main(String[] args) {

    }
}