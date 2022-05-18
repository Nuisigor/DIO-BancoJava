public class ContaPoupança extends Conta{

  public ContaPoupança(Banco agencia, Cliente cliente) {
    super(agencia, cliente);
    this.tipo = TipoDeConta.CONTA_POUPANÇA;
  }

  public void extrato(){
    System.out.println("=== Extrato Conta Corrente ===" );
    super.imprimirDadosConta();
  }
}
