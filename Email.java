package enderecos;

import principais.Endereco;

public class Email extends Endereco{
    private String email;

    protected Email() {
        super();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
