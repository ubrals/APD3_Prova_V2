package entidades;

import builder.EntidadeBuilder;
import principais.Entidade;

public class OrganizacaoBuilder extends EntidadeBuilder {
    
    private Entidade entidade;

    @Override
    public void construirEntidade(String nome) {
        entidade = new Organizacao(nome);
    }
    
    @Override
    public void adicionarDetalhe(String atributo, String valor) throws Exception {
        switch(atributo){
            case "cnpj"        : ((Organizacao)entidade).setCnpj(valor);break;
            case "nome"        : ((Organizacao)entidade).setNome(valor);break;
            default: throw new Exception("Atributo: " + atributo + " nao existe");
        }
    }
    
    public void adicionarRepresentante(Pessoa pessoa){
        ((Organizacao)entidade).adicionarRepresentante(pessoa);
    }

    public void removerRepresentante(Pessoa pessoa){
        ((Organizacao)entidade).removerRepresentante(pessoa);
    }

    @Override
    public Organizacao getObject() {
        return (Organizacao) entidade;
    }
    
}
