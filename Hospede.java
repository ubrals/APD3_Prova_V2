package sistema;

import entidades.Pessoa;
import java.util.List;

public class Hospede {
    private Pessoa pessoa;
    private List<Estadia> estadias;

    public Hospede(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    
    public void adicionarEstadia(Estadia estadia){
        estadias.add(estadia);
    }
    
    public void removerEstadia(Estadia estadia){
        estadias.remove(estadia);
    }

    public List<Estadia> getEstadias() {
        return estadias;
    }

    public void setEstadias(List<Estadia> estadias) {
        this.estadias = estadias;
    }
}
