package builder;

import enderecos.EmailBuilder;
import enderecos.GeograficoBuilder;
import enderecos.TelefonicoBuilder;

public class EnderecoDiretor {
    
    EnderecoBuilder endereco;

    public EnderecoDiretor() {
    }
    
    public void Diretor(EnderecoBuilder endereco) throws Exception {
        if(endereco instanceof GeograficoBuilder){
            this.endereco = new GeograficoBuilder();
            ((GeograficoBuilder)this.endereco).construirEndereco();
        }
        if(endereco instanceof TelefonicoBuilder){
            this.endereco = new TelefonicoBuilder();
            ((TelefonicoBuilder)this.endereco).construirEndereco();
        }
        if(endereco instanceof EmailBuilder){
            this.endereco = new EmailBuilder();
            ((EmailBuilder)this.endereco).construirEndereco();
        }
        else throw new Exception("Tipo de endereco invalido");
    }
    
    public void construir(String atributo, String valor){
        if(endereco instanceof GeograficoBuilder)
            try{
                ((GeograficoBuilder)endereco).adicionarDetalhe(atributo, valor);
            }
            catch(Exception ex){ ex.printStackTrace();}
        
        if(endereco instanceof TelefonicoBuilder)
            try{
                ((TelefonicoBuilder)endereco).adicionarDetalhe(atributo, valor);
            }
            catch(Exception ex){ ex.printStackTrace();}
        
        if(endereco instanceof EmailBuilder)
            try{
                ((EmailBuilder)endereco).adicionarDetalhe(atributo, valor);
            }
            catch(Exception ex){ ex.printStackTrace();}
    }
}
