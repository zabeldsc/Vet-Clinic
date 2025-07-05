package vet.clinic;

import java.time.LocalDate;
import java.util.ArrayList;

class Animal {
    private String nome, raca;
    private String dataNasc;
    private Tutor tutor;
    private ArrayList<VacinacaoAnimal> cartaoVacina;
    private ArrayList<Consulta> consultas;

    public Animal(String nome, String raca, String dataNasc, Tutor tutor, ArrayList<VacinacaoAnimal> cartaoVacina,
            ArrayList<Consulta> consultas) {
        this.nome = nome;
        this.raca = raca;
        this.dataNasc = dataNasc;
        this.tutor = tutor;
        this.cartaoVacina = (cartaoVacina != null) ? cartaoVacina : new ArrayList<>();
        this.consultas = (consultas != null) ? consultas : new ArrayList<>();
    }

    public Animal(String nome, String raca, String dataNasc, Tutor tutor) {
        this(nome, raca, dataNasc, tutor, new ArrayList<>(), new ArrayList<>());
    }

    @Override
    public String toString() {
        return nome;
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

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public Tutor getTutor() {
        return tutor;
    }

    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }

    public ArrayList<VacinacaoAnimal> getCartaoVacina() {
        return cartaoVacina;
    }

    public void setCartaoVacina(ArrayList<VacinacaoAnimal> cartaoVacina) {
        this.cartaoVacina = cartaoVacina;
    }
    
    public ArrayList<Consulta> getConsultas()
    {
        return consultas;
    }

    public void marcarConsulta(LocalDate data, String descricao) {
        consultas.add(new Consulta(data, descricao));
    }

    public void incluirVacina(VacinacaoAnimal vacina) {
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
    
    public float emitirCobranca()
    {
        float total = 0;
        LocalDate dataAtual = LocalDate.now();
        for(Consulta c:consultas)
        {
            if(c.getData().isEqual(dataAtual))
            {
                total += c.getVet().getEspecialidade().getValorEspec();
            }
        }
        
        for(VacinacaoAnimal v:cartaoVacina)
        {
            if(v.getDataAplicacao().equals(dataAtual))
            {
                total += v.getVacina().getValor();
            }
        }
        
        return total;
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
            for (VacinacaoAnimal v : cartaoVacina) {
                System.out.println("- " + v.getVacina().getNome());
            }
        }
        System.out.println("======================");
    }
    
    public void adicionarConsulta(Consulta consulta)
    {
        this.consultas.add(consulta);
    }

    public static void main(String[] args) {

    }
}