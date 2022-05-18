public class ContaCorrente extends Conta {

  public ContaCorrente(Banco agencia, Cliente cliente) {
    super(agencia, cliente);
    this.tipo = TipoDeConta.CONTA_CORRENTE;
  }

  public void extrato(){
    System.out.println("=== Extrato Conta Corrente ===" );
    super.imprimirDadosConta();
  }
}
