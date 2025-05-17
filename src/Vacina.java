import java.math.BigDecimal;
import java.time.LocalDate;

public class Vacina {
    private String nome;
    private LocalDate data, dataValidade;
    private BigDecimal valor;

    public Vacina(String nome, LocalDate data, LocalDate dataValidade, BigDecimal valor) {
        this.nome = nome;
        this.data = data;
        this.dataValidade = dataValidade;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Vacina{" +
                "nome='" + nome + '\'' +
                ", data=" + data +
                ", dataValidade=" + dataValidade +
                ", valor=" + valor +
                '}';
    }

}
