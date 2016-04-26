package teste;

import builder.EntidadeDiretor;
import entidades.Organizacao;
import entidades.OrganizacaoBuilder;
import entidades.Pessoa;
import entidades.PessoaBuilder;
import javax.swing.JOptionPane;
import sistema.Cliente;
import sistema.Hospede;

public class teste {

    public static void main(String[] args) throws Exception {

        criaClienteOrganizacao();
        criarClientePessoa();
        criarHospede(chamaPessoa());

    }

    public static Organizacao chamaOrganizacao() throws Exception {
        OrganizacaoBuilder orgBuild = new OrganizacaoBuilder();
        EntidadeDiretor entidir = new EntidadeDiretor();
        entidir.Diretor(orgBuild, "Mack");
        entidir.construir("cnpj", "1000");
        return orgBuild.getObject();
    }

    public static Pessoa chamaPessoa() throws Exception {
        PessoaBuilder pessoaBuild = new PessoaBuilder();
        EntidadeDiretor entidir = new EntidadeDiretor();
        entidir.Diretor(pessoaBuild, "Mack");
        entidir.construir("cpf", "1000");
        return pessoaBuild.getObject();
    }

    public static Cliente criaClienteOrganizacao() throws Exception {
        JOptionPane.showMessageDialog(null, "Cliente Organização Criado");
        return new Cliente(chamaOrganizacao());
    }

    public static Cliente criarClientePessoa() throws Exception {
        JOptionPane.showMessageDialog(null, "Cliente Pessoa Criado");
        return new Cliente(chamaPessoa());
    }

    public static Hospede criarHospede(Pessoa pessoa) {
        JOptionPane.showMessageDialog(null, "Hospede Criado");
        return new Hospede(pessoa);
    }

}
