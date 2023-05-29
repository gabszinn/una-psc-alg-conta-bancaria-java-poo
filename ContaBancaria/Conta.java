class Conta {
    private String nome;
    private int numeroConta;
    private double saldoInicial;

    public void depositar(double valor) {
        saldoInicial += valor;
        System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
    }

    public void sacar(double valor) {
        if (valor > 5000) {
            System.out.println("Valor do saque acima do permitido.");
        } else if (valor > saldoInicial) {
            System.out.println("Saldo insuficiente para realizar a operação.");
        } else {
            saldoInicial -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        }
    }

    public double getSaldo() {
        return saldoInicial;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setSaldoInicial(double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }
}