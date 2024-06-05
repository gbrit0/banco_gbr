import javax.swing.*;

public class Agencia {
    static int contId = 0;
    protected int idAgencia;
    protected String endereco;
    protected int clientes;

    public int getIdAgencia() {
        return idAgencia;
    }

    public void setIdAgencia() {
        contId++;
        this.idAgencia = contId;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getClientes() {
        return clientes;
    }


    public Agencia(int idAgencia, String endereco) {
        setIdAgencia();
        setEndereco(endereco);

    }
    public int registrarCliente(Cliente cliente){
        return JOptionPane.showConfirmDialog(null,"Deseja registrar o cliente "+
                                                                    cliente.getNome() + "?");
    }

    public boolean removerCliente(Cliente cliente){
        int op = JOptionPane.showConfirmDialog(null, "Deseja remover o cliente" +
                                                                    cliente.getNome() + "?");
        if (op == 1){
            cliente.setAtivo(false);
            return true;
        }
        return false;

    }
}
