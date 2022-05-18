public interface InterfaceConta {

  boolean sacar(double valor);

  void depositar(double valor);

  boolean transferir(double valor, Conta contaDestino);

}
