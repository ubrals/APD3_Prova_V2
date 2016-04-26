package entidades;

import principais.Entidade;

public class Pessoa extends Entidade {
    private String niver;
    private String sexo;
    private String cpf;
    private String rg;
    private String passaporte;
    private Organizacao organizacao;
    
    protected Pessoa(String nome) {
        super(nome);
    }

    public String getNiver() {
        return niver;
    }

    public void setNiver(String niver) {
        this.niver = niver;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getPassaporte() {
        return passaporte;
    }

    public void setPassaporte(String passaporte) {
        this.passaporte = passaporte;
    }

    public Organizacao getOrganizacao() {
        return organizacao;
    }

    public void setOrganizacao(Organizacao organizacao) {
        this.organizacao = organizacao;
    }
}
