public abstract class Pagamento{
    protected double valor;
    protected String status;

    public Pagamento(double valor) {
        if (valor<=0){
            this.valor = valor;
            this.status = "Recusado (Valor inválido)";
            System.out.println("Erro: O valor do pagamento deve ser maior que zero. Valor informado: R$ " + valor);
        } else {
            this.valor = valor;
            this.status = "Pendente";
        }
    }
    public boolean isValido(){
        return this.valor > 0;
    }
    // Métodos abstratos que as classes filhas são obrigadas a implementar (Polimorfismo)
    public abstract void pagar();
    public abstract void exibirDetalhes();
}