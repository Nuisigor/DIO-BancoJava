public class Main {
  public static void main(String[] args) {
    Banco b1 = new Banco("Banco 1");
    Banco b2 = new Banco("Banco 2");
    System.out.println(b1);

    ContaCorrente conta1 = (ContaCorrente) b1.addConta("João", 151515, TipoDeConta.CONTA_CORRENTE);
    System.out.println(conta1);
    ContaPoupança conta2 = (ContaPoupança) b1.addConta("Pedro", 161616, TipoDeConta.CONTA_POUPANÇA);

    conta1.depositar(160.30);
    conta2.depositar(2500);
    conta2.transferir(1600, conta1);
    conta2.sacar(1500);

    conta1.extrato();
    conta2.extrato();

    b1.listarClientes();
  }
}
