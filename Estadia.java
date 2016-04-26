package sistema;

import java.util.List;

public class Estadia {
    private String entrada;
    private String saida;
    private List<Hospede> hospedes;
    private List<Diaria> diarias;
    private Quarto quarto;
    private Reserva reserva;

    public Estadia(String entrada, String saida, List<Hospede> hospedes, Quarto quarto) {
        this.entrada = entrada;
        this.saida = saida;
        this.hospedes = hospedes;
        this.quarto = quarto;
    }
    
    public void adicionarHospede(Hospede hospede){
        hospedes.add(hospede);
    }
    
    public void removerHospede(Hospede hospede){
        hospedes.remove(hospede);
    }
    
    public void adicionarDiaria(Diaria diaria){
        diarias.add(diaria);
    }
    
    public void removerDiaria(Diaria diaria){
        diarias.remove(diaria);
    }

    public String getEntrada() {
        return entrada;
    }

    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }

    public String getSaida() {
        return saida;
    }

    public void setSaida(String saida) {
        this.saida = saida;
    }

    public List<Diaria> getDiarias() {
        return diarias;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }
    
}
