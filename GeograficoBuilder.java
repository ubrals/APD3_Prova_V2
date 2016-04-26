package enderecos;

import builder.EnderecoBuilder;
import principais.Endereco;

public class GeograficoBuilder extends EnderecoBuilder {
    
    private Endereco endereco;

    public GeograficoBuilder() {
    }
    
    @Override
    public void construirEndereco() {
        endereco = new Geografico();
    }

    @Override
    public void adicionarDetalhe(String atributo, String valor) throws Exception {
        switch(atributo){
            case "logradouro"  : ((Geografico)endereco).setLogradouro(valor);
            case "nro"         : ((Geografico)endereco).setNro(valor);
            case "complemento" : ((Geografico)endereco).setComplemento(valor);
            case "bairro"      : ((Geografico)endereco).setBairro(valor);
            case "cep"         : ((Geografico)endereco).setCep(valor);
            case "cidade"      : ((Geografico)endereco).setCidade(valor);
            case "estado"      : ((Geografico)endereco).setEstado(valor);
            case "pais"        : ((Geografico)endereco).setPais(valor);
            default: throw new Exception("Atributo: " + atributo + " nao existe");
        }
    }

    @Override
    public Endereco getObject() {
        return (Geografico) endereco;
    }
    
}
