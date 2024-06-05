import java.util.Date;

public class ClientePj extends Cliente{
    protected String razSocial;
    protected int cnpj;


    public String getRazSocial() {
        return razSocial;
    }

    public void setRazSocial(String razSocial) {
        this.razSocial = razSocial;
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public ClientePj(String razSocial, int cnpj, Agencia agencia, String endereco) {
        super(agencia, endereco);
        setRazSocial(razSocial);
        setCnpj(cnpj);
    }
}
