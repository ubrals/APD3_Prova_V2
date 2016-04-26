package enderecos;

import builder.EnderecoBuilder;
import principais.Endereco;

public class TelefonicoBuilder extends EnderecoBuilder {
    
    private Endereco endereco;

    public TelefonicoBuilder() {
    }
    
    @Override
    public void construirEndereco() {
        endereco = new Telefonico();
    }

    @Override
    public void adicionarDetalhe(String atributo, String valor) throws Exception {
        switch(atributo){
            case "ddd"       : ((Telefonico)endereco).setDdd(valor);
            case "nro"       : ((Telefonico)endereco).setNro(valor);
            case "operadora" : ((Telefonico)endereco).setOperadora(valor);
            case "tipo"      : ((Telefonico)endereco).setTipo(valor);
            default: throw new Exception("Atributo: " + atributo + " nao existe");
        }
    }

    @Override
    public Endereco getObject() {
        return (Telefonico) endereco;
    }
    
}
