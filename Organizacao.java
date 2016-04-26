package entidades;

import java.util.List;
import principais.Entidade;

public class Organizacao extends Entidade {
    private String cnpj;
    private List<Pessoa> representantes;
    
    protected Organizacao(String nome) {
        super(nome);
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public List<Pessoa> getRepresentantes() {
        return representantes;
    }

    public void setRepresentantes(List<Pessoa> representantes) {
        this.representantes = representantes;
    }
    
    public void adicionarRepresentante(Pessoa pessoa){
        representantes.add(pessoa);
    }
    
    public void removerRepresentante(Pessoa pessoa){
        representantes.remove(pessoa);
    }
}
