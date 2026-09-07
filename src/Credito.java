public class Credito extends Pagamento {
    private double limiteDisponivel;
    private int parcelas;

    public Credito(double valor, double limiteDisponivel, int parcelas) {
        super(valor);
        this.limiteDisponivel = limiteDisponivel;
        this.parcelas = parcelas;
    }
    @Override
    public void pagar(){
        if (!isValido()) return;

        if (this.valor <= this.limiteDisponivel){
            this.status = "Aprovado";
            System.out.println("[Crédito] Análise de crédito aprovada em " + this.parcelas + "x!");
        } else {
            this.status = "Recusado (Limite excedido)";
        }
    }
    @Override
    public void exibirDetalhes(){
        System.out.println("--- Detalhes do Pagamento: Crédito ----");
        System.out.println("Limite Disponível: R$ " + this.limiteDisponivel);
        System.out.println("Parcelas: " + this.parcelas + "x");
        System.out.println("Valor: R$ " + this.valor);
        System.out.println("Status: " + this.status + "\n");
    }
}
