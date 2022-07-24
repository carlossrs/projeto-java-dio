public class Main {
  public static void main(String[] args) {

    Cliente carlos = new Cliente();
    carlos.setNome("Carlos");

    Conta corrente = new ContaCorrente(carlos);
    Conta poupanca = new ContaPoupanca(carlos);

    corrente.depositar(1000);
    corrente.transferir(500, poupanca);

    corrente.imprimirExtrato();
    poupanca.imprimirExtrato();

    Cliente pedro = new Cliente();
    pedro.setNome("Pedro");

    Conta correntePedro = new ContaCorrente(pedro);
    Conta poupancaPedro = new ContaPoupanca(pedro);

    correntePedro.depositar(500);
    poupancaPedro.depositar(1000);

    correntePedro.imprimirExtrato();
    poupancaPedro.imprimirExtrato();

  }
}
