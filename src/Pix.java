public class Pix extends Pagamento {
    private String chavePix;

    public Pix(double valor, String chavePix) {
        super(valor);
        this.chavePix = chavePix;
    }
    @Override
    public void pagar(){
        if (!isValido()) return;

        this.status = "Aprovado";
        System.out.println("[Pix] Gerando QR Code para pagamento instantâneo...");
    }
    @Override
    public void exibirDetalhes(){
        System.out.println("--- Detalhes do Pagamento: Pix ---");
        System.out.println("Chave Pix: " + this.chavePix);
        System.out.println("Valor: R$" + this.valor);
        System.out.println("Status:" + this.status + "\n");
    }
}
