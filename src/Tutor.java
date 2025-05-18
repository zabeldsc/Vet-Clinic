import java.util.ArrayList;

public class Tutor extends Pessoa{
    
    protected String endereco;
    protected ArrayList<Animal> animais;

    public Tutor(String nome, String cpf, String email, String telefone, String endereco)
    {
        super(nome, cpf, email, telefone);
        this.endereco = endereco;
        this.animais = new ArrayList<>();
        
    }
    
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public ArrayList<Animal> getAnimais() {
        return animais;
    }

    public void setAnimais(ArrayList<Animal> animais) {
        this.animais = animais;
    }

    public void excluirTutor(Tutor tutor)
    {
        tutor = null;
    }

    public void excluirAnimal(Animal animal)
    {
        animal = null;
    }

}