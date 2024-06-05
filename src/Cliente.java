import javax.management.monitor.MonitorSettingException;
import java.util.Date;

public class Cliente {
   static int contIdCli = 0;
   protected int idCliente;
   protected String nome;
   protected int cpf;
   protected Date dataNascimento;
   protected String endereco;
   protected String telefone;
   protected Agencia agencia;
   protected boolean ativo;

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente() {
        contIdCli += 1;
        this.idCliente = contIdCli;
    }

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

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public Cliente(String nome, int cpf, Date dataNascimento, String endereco, String telefone, Agencia agencia) {
        setIdCliente();
        setNome(nome);
        setCpf(cpf);
        setDataNascimento(dataNascimento);
        setEndereco(endereco);
        setTelefone(telefone);
        setAgencia(agencia);
        agencia.clientes++;
        setAtivo(true);

    }
    public Cliente(Agencia agencia, String endereco){
        setIdCliente();
        setAgencia(agencia);
        setEndereco(endereco);
        agencia.clientes++;
        setAtivo(true);
    }
}
