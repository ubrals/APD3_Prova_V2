package sistema;

public class Quarto {

    String nro;
    Reserva reserva = null;

    public Quarto() {
    }

    public Quarto(String numero) {
        this.nro = numero;
    }

    public String getNumero() {
        return nro;
    }

    public void setNumero(String numero) {
        this.nro = numero;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

}
