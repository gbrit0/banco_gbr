import java.time.LocalDateTime;

public class Transacao {
    static int contTran = 0;
    private int idTransacao;
    private char tipoTransacao; // T - transferência, E - estorno
    private double valor;
    private LocalDateTime dataHora;
    private Conta contaOrigem;
    private Conta contaDestino;

    // Construtor
    public Transacao(char tipoTransacao, double valor, Conta contaOrigem, Conta contaDestino) {
        setIdTransacao();
        setTipoTransacao(tipoTransacao);
        setDataHora();
        setValor(valor);
        setContaOrigem(contaOrigem);
        setContaDestino(contaDestino);
    }

    // Getters e setters
    public int getIdTransacao() {
        return idTransacao;
    }

    public void setIdTransacao() {
        contTran++;
        this.idTransacao = contTran;
    }

    public char getTipoTransacao() {
        return tipoTransacao;
    }

    public void setTipoTransacao(char tipoTransacao) {
        this.tipoTransacao = tipoTransacao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora() {
        this.dataHora = LocalDateTime.now(); // Registra a data e hora atuais
    }

    public Conta getContaOrigem() {
        return contaOrigem;
    }

    public void setContaOrigem(Conta contaOrigem) {
        this.contaOrigem = contaOrigem;
    }

    public Conta getContaDestino() {
        return contaDestino;
    }

    public void setContaDestino(Conta contaDestino) {
        this.contaDestino = contaDestino;
    }

    // Método para executar a transação
    public boolean executar(Conta contaOrigem, Conta contaDestino, float valor) {
        // Lógica para executar a transação
        setTipoTransacao('T');
        contaOrigem.sacar(valor);
        contaDestino.depositar(valor);
        return true; // Retorna verdadeiro se a transação for bem-sucedida
    }

    // Método para estornar a transação
    public boolean estornar(Conta contaOrigem, Conta contaDestino, float valor) {
        // Lógica para estornar a transação
        setTipoTransacao('E');
        contaDestino.sacar(valor);
        contaOrigem.depositar(valor);
        return true; // Retorna verdadeiro se o estorno for bem-sucedido
    }

    @Override
    public String toString() {
        return "Transacao{" +
                "idTransacao=" + idTransacao +
                ", tipoTransacao='" + tipoTransacao + '\'' +
                ", valor=" + valor +
                ", dataHora=" + dataHora +
                ", contaOrigem=" + contaOrigem +
                ", contaDestino=" + contaDestino +
                '}';
    }
}
