public abstract class Conta implements InterfaceConta{

  private Banco agencia;
  private Integer numero;
  private Double saldo;
  protected TipoDeConta tipo;
  public Cliente cliente;

  private static Integer SEQUENCIAL = 1;

  public Conta(Banco agencia, Cliente cliente) {
    this.agencia = agencia;
    this.cliente = cliente;
    this.numero = SEQUENCIAL++;
    this.saldo = 0.0d;
  }

  @Override
  public boolean sacar(double valor) {
    if(valor > this.saldo){
      System.out.println("Não foi possível sacar : Sem saldo para saque");
      return false;
    }
    this.saldo -= valor;
    return true;
  }

  @Override
  public void depositar(double valor) {
    this.saldo += valor;
  }

  @Override
  public boolean transferir(double valor, Conta contaDestino) {
    if(valor > this.saldo){
      System.out.println("Não foi possível transferir : Sem saldo para transferência");
      return false;
    }
    this.sacar(valor);
    contaDestino.depositar(valor);
    return true;
  }

  public void imprimirDadosConta(){
    System.out.println("Cliente : " + cliente.getNome());
    System.out.println("Agência : " + agencia.getNumero());
    System.out.println("Número da conta: " + this.numero);
    System.out.println("Saldo : " + this.saldo);
  }

  public Banco getAgencia() {
    return agencia;
  }

  public Integer getNumero() {
    return numero;
  }

  public Double getSaldo() {
    return saldo;
  }
}
