public class Conta {

   static int contadorId = 0;
   protected int idConta;
   protected char tipoConta; // F - física; J - jurídica
   protected float saldo;
   protected Cliente cliente;
   protected Gerente gerente;
   protected boolean status;

   public Conta(char tipoConta, Cliente cliente, Gerente gerente) {
      if (gerente.aprovarAberturaConta(tipoConta, cliente)) {
         setIdConta();
         setStatus(true);
         setSaldo(0.0F);
         setTipoConta(cliente);
         setCliente(cliente);
         setGerente(gerente);
      }
   }

   public Conta(char tipoConta, ClientePj cliente, Gerente gerente) {
      if (gerente.aprovarAberturaConta(tipoConta, cliente)) {
         setIdConta();
         setStatus(true);
         setSaldo(0.0F);
         setTipoConta(cliente);
         setCliente(cliente);
         setGerente(gerente);
      }
   }

   public int getIdConta() {
      return idConta;
   }

   public void setIdConta() {
      contadorId++;
      this.idConta = contadorId;
   }

   public char getTipoConta() {
      return tipoConta;
   }

   public void setTipoConta(Cliente cliente) {
      this.tipoConta = 'F';
   }

   public void setTipoConta(ClientePj cliente) {
      this.tipoConta = 'J';
   }

   public float getSaldo() {
      return saldo;
   }

   public void setSaldo(float saldo) {
      this.saldo = saldo;
   }

   public Cliente getCliente() {
      return cliente;
   }

   public void setCliente(Cliente cliente) {
      this.cliente = cliente;
   }

   public Gerente getGerente() {
      return gerente;
   }

   public void setGerente(Gerente gerente) {
      this.gerente = gerente;
   }

   public boolean isStatus() {
      return status;
   }

   public void setStatus(boolean status) {
      this.status = status;
   }

   public void depositar(float valor) {
      this.saldo += valor;
   }

   public void sacar(float valor) {
      this.saldo -= valor;
   }

   public void transferir(float valor, Conta destino) {
      Transacao t = new Transacao('T', valor, this, destino);
      t.executar(this,destino,valor);
   }

   public void estornar(float valor, Conta destino) {
      Transacao t = new Transacao('E', valor, this, destino);
      t.estornar(this, destino, valor);
   }
}
