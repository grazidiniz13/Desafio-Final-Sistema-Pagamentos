public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE PAGAMENTOS BANCÁRIO ===\n");

        // 1. Testando Pix
        Pagamento pagamentoPix = new Pix(150.0, "email@banco.com");
        pagamentoPix.pagar();
        pagamentoPix.exibirDetalhes();

        // 2. Testando Débito (Com saldo suficiente)
        Pagamento pagamentoDebito = new Debito(300.0, 500.0);
        pagamentoDebito.pagar();
        pagamentoDebito.exibirDetalhes();

        // 3. Testando Crédito (Ultrapassando o limite)
        Pagamento pagamentoCredito = new Credito(1500.0, 1000.0, 3);
        pagamentoCredito.pagar();
        pagamentoCredito.exibirDetalhes();

        // 4. Testando Validação de Valor Zero/Negativo
        System.out.println("--- CENÁRIO DE VALIDAÇÃO: Valor Negativo ---");
        Pagamento pagamentoInvalido = new Pix(-50.0, "teste@banco.com");
        pagamentoInvalido.pagar();
        pagamentoInvalido.exibirDetalhes();
    }
}
