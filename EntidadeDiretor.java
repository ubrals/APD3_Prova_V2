package builder;

import entidades.Organizacao;
import entidades.OrganizacaoBuilder;
import entidades.PessoaBuilder;

public class EntidadeDiretor {

    EntidadeBuilder entidade;

    public EntidadeDiretor() {
    }

    public void Diretor(EntidadeBuilder entidade, String nome) throws Exception {

        if (entidade instanceof OrganizacaoBuilder) {
            this.entidade = entidade;
            ((OrganizacaoBuilder) this.entidade).construirEntidade(nome);
        }else

        if (entidade instanceof PessoaBuilder) {
            this.entidade = entidade;
            ((PessoaBuilder) this.entidade).construirEntidade(nome);
        } else {
            throw new Exception("Tipo de entidade invalido");
        }

    }

    public void construir(String atributo, String valor) throws Exception {

        if (entidade instanceof OrganizacaoBuilder) {

            try {
                ((OrganizacaoBuilder) entidade).adicionarDetalhe(atributo, valor);
            } catch (Exception e) { 
                e.printStackTrace();
            }

        }

        if (entidade instanceof PessoaBuilder) {
            try {
                ((PessoaBuilder) entidade).adicionarDetalhe(atributo, valor);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
    
    public void construir (Organizacao organizacao) {
        ((PessoaBuilder) entidade).adicionarOrganizacao(organizacao);
    }
}