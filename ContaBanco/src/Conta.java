public class Conta {
    private int numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    public Conta(int numero, String agencia, String nomeCliente, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    // Método que retorna a mensagem final formatada
    public String getMensagemBoasVindas() {
        return String.format(
                "Olá %s, obrigado por criar uma conta em nosso banco. " +
                        "Sua agência é %s, conta %d e seu saldo de R$ %.2f já está disponível para saque.",
                nomeCliente, agencia, numero, saldo
        );
    }

    // Opcional: sobrescrevendo toString para facilitar debug/logs
    @Override
    public String toString() {
        return String.format("Conta[numero=%d, agencia=%s, cliente=%s, saldo=%.2f]",
                numero, agencia, nomeCliente, saldo);
    }

    // Getters (caso queira expandir o sistema depois)
    public int getNumero() {
        return numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }
}