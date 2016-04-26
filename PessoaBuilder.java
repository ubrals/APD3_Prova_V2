package entidades;

import builder.EntidadeBuilder;
import principais.Entidade;

public class PessoaBuilder extends EntidadeBuilder {
    
    private Entidade entidade;

    @Override
    public void construirEntidade(String nome) {
        entidade = new Pessoa(nome);
    }
    
    @Override
    public void adicionarDetalhe(String atributo, String valor) throws Exception {
        switch(atributo){
            case "niver"      : ((Pessoa)entidade).setNiver(valor);break;
            case "sexo"       : ((Pessoa)entidade).setSexo(valor);break;
            case "cpf"        : ((Pessoa)entidade).setCpf(valor);break;
            case "rg"         : ((Pessoa)entidade).setRg(valor);break;
            case "passaporte" : ((Pessoa)entidade).setPassaporte(valor);break;
  //          case "sexo"        : ((Pessoa)entidade).setSexo(valor);
            default: throw new Exception("Atributo: " + atributo + " nao existe");
//    private Organizacao organizacao;
        }
    }
    
    public void adicionarOrganizacao(Organizacao organizacao){
        ((Pessoa)entidade).setOrganizacao(organizacao);
    }

    @Override
    public Pessoa getObject() {
        return (Pessoa) entidade;
    }
    
}
