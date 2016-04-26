package sistema;

import entidades.Organizacao;
import entidades.Pessoa;
import principais.Entidade;

public class Cliente {

    Entidade entidade;

    public Cliente(Entidade entidade) throws Exception {
        if (entidade instanceof Organizacao) {
            this.entidade = (Organizacao)entidade;
        }else

        if (entidade instanceof Pessoa) {
            this.entidade =(Pessoa)entidade;

        } else {
            throw new Exception("Erro: entidade não definida");
        }
    }

    public Entidade getEntidade() {
        return entidade;
    }

    public void setEntidade(Entidade entidade) {
        this.entidade = entidade;
    }
   
       
}