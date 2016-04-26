package sistema;

public class Reserva {

    Quarto quarto;
    Cliente cliente;
    Estadia estadia;

    public Reserva() {
    }

    public Reserva(Quarto quarto, Cliente cliente, Estadia estadia) {
        this.quarto = quarto;
        this.cliente = cliente;
        this.estadia = estadia;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Estadia getEstadia() {
        return estadia;
    }

    public void setEstadia(Estadia estadia) {
        this.estadia = estadia;
    }

}
