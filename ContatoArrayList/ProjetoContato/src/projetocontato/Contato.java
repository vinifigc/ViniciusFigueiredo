
package projetocontato;

public class Contato {
    
    private String nome;
    private int idade;
    private String sexo;
    private String email;

    public Contato() {
    }

    public Contato(String nome, int idade, String sexo, String email) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contato{" + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + ", email=" + email + '}';
    }
    
}
