package entidades;

public class Conta {


    private double saldo;
    private final int numeroConta;
    private final double TAXA_SAQUE = 5.00;
    private Titular titular;

    // Utilização de sobrecarga para construtor com e sem deposito inicial
    public Conta(int numeroConta, Titular titular, double depositoInicial) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = depositoInicial;

    }

    public Conta(int numeroConta, Titular titular) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = 0.0;

    }

    public Titular getTitular() {
        return this.titular;
    }

    public void setTitular(String nome) {
        this.titular.setNome(nome);
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        this.saldo -= (valor + TAXA_SAQUE);
        if (this.saldo < 0) {
            System.out.println("Aviso: conta entrou no cheque especial!");
        }
    }

    public String toString() {
        return String.format("""
                        Numero Conta: %d
                        Nome: %s
                        Saldo: %.2f
                        """
                , this.numeroConta, this.titular.getNome(), this.saldo);
    }


}
