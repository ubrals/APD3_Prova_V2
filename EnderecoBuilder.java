package builder;

import principais.Endereco;

public abstract class EnderecoBuilder {
    public abstract void construirEndereco();
    public abstract void adicionarDetalhe(String atributo, String valor) throws Exception;
    public abstract Endereco getObject();
}
