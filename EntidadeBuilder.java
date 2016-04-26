package builder;

import principais.Entidade;

public abstract class EntidadeBuilder {
    public abstract void construirEntidade(String nome);
    public abstract void adicionarDetalhe(String atributo, String valor) throws Exception;
    public abstract Entidade getObject();
}
