import java.util.ArrayList;
import java.util.List;
public class Banco {
  private String nome;
  private Integer numero;

  private List<Conta> contas = new ArrayList<>();
  private static Integer SEQUENCIAL = 1;

  public Banco(String nome) {
    this.nome = nome;
    this.numero = SEQUENCIAL++;
  }

  public Conta addConta(String nome, Integer cpf, TipoDeConta tipodeConta){
    Cliente novoCliente = new Cliente(nome, cpf);
    Conta contaCliente;
    if(tipodeConta == TipoDeConta.CONTA_CORRENTE)
      contaCliente = new ContaCorrente(this, novoCliente);
    else
      contaCliente = new ContaPoupança(this, novoCliente);

    contas.add(contaCliente);
    return contaCliente;
  }

  public List<Conta> getContas() {
    return contas;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Integer getNumero() {
    return numero;
  }

  public void setNumero(Integer numero) {
    this.numero = numero;
  }

  public void listarClientes(){
    System.out.println("=== Lista de clientes Banco" + this.numero + " ===");
    for(Conta conta: contas){
      System.out.println(conta.getNumero() + ":" + conta.cliente.getNome());
    }
  }
}