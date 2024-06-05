import javax.swing.*;

public class Gerente {
    static int contIdGer = 0;
    protected int idGerente;
    protected String nome;
    protected int cpf;
    protected Agencia agencia;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public int getIdGerente() {
        return idGerente;
    }

    public void setIdGerente() {
        contIdGer += 1;
        this.idGerente = contIdGer;
    }

    public Gerente(String nome, int cpf, Agencia agencia) {
        setNome(nome);
        setCpf(cpf);
        setAgencia(agencia);
    }

    public boolean aprovarAberturaConta(char tipoConta, Cliente cliente) {
        String tipo = "";
        if (tipoConta == 'F'){
            tipo = "Pessoa Física";
        } else if (tipoConta == 'J'){
            tipo = "Pessoa Jurídica";
        }

        int resp = JOptionPane.showConfirmDialog(null, "Deseja aprovar a abertura de conta " +
                tipo + " para o cliente " +
                cliente.getNome() + "?\n");

        return resp == 1;

    }
}
