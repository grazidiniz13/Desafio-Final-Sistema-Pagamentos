public class Debito extends Pagamento {
    private double saldoDisponivel;

    public Debito(double valor, double saldoDisponivel) {
        super(valor);
        this.saldoDisponivel = saldoDisponivel;
    }
    @Override
    public void pagar(){
        if (!isValido()) return;

        if (this.valor <= this.saldoDisponivel) {
            this.status = "Aprovado";
            System.out.println("[Débito] Consulta de saldo realizada. Saldo suficiente!");
        }
    }
    @Override
    public void exibirDetalhes(){
        System.out.println("--- Detalhes do Pagamento: Débito ---");
        System.out.println("Saldo em Conta: R$" + this.saldoDisponivel);
        System.out.println("Valor da Compra: R$" + this.valor);
        System.out.println("Status:" + this.status + "\n");
    }
}
