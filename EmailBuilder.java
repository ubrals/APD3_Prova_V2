package enderecos;

import builder.EnderecoBuilder;
import principais.Endereco;

public class EmailBuilder extends EnderecoBuilder {
    
    private Endereco endereco;

    public EmailBuilder() {
    }
    
    @Override
    public void construirEndereco() {
        endereco = new Email();
    }

    @Override
    public void adicionarDetalhe(String atributo, String valor) throws Exception {
        switch(atributo){
            case "email"   : ((Email)endereco).setEmail(valor);
            default: throw new Exception("Atributo: " + atributo + " nao existe");
        }
    }

    @Override
    public Endereco getObject() {
        return (Email) endereco;
    }
    
}
