package sistema;

public class Diaria {
    private String data;
    private double valor;
    private double quitada;

    public Diaria(String data, double valor, double quitada) {
        this.data = data;
        this.valor = valor;
        this.quitada = quitada;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getQuitada() {
        return quitada;
    }

    public void setQuitada(double quitada) {
        this.quitada = quitada;
    }
}
