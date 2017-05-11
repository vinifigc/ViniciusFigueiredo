
package carroarray;
public class Carro {
    
    private String cor;
    private double valor;

    public Carro() {
    }

    public Carro(String cor, double valor) {
        this.cor = cor;
        this.valor = valor;
    }
    

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Carro{" + "cor=" + cor + ", valor=" + valor + '}';
    }
    
}
