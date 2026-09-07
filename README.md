# 💳 Trilha Backend – Desafio Final | Sistema de Pagamentos Bancário

Repositório dedicado à entrega do **Desafio Final da Trilha Backend**. O objetivo principal deste projeto é aplicar os conceitos avançados de **Programação Orientada a Objetos (POO)** em Java, utilizando herança, classes abstratas, polimorfismo e validações de regras de negócio.

---

## 🎯 O que foi desenvolvido
- **Classe Abstrata Base (`Pagamento`)**:
  - Centraliza o atributo de valor e o status da transação.
  - Implementa a validação obrigatória no construtor que recusa automaticamente valores menores ou iguais a zero.
  - Define métodos abstratos (`pagar()` e `exibirDetalhes()`) para obrigar as subclasses a implementarem suas próprias regras.
- **Classe `Pix`**:
  - Especialização para pagamentos instantâneos via chave Pix, gerando feedback imediato de aprovação quando válido.
- **Classe `Debito`**:
  - Simula a verificação prévia de saldo em conta antes de autorizar ou recusar a transação por saldo insuficiente.
- **Classe `Credito`**:
  - Valida se o valor da compra está dentro do limite disponível do cartão, suportando também simulação de parcelamento.
- **Classe `Main`**:
  - Centraliza a execução de cenários práticos cobrindo Pix, Débito, Crédito e uma tentativa de transação com valor inválido (negativo).

---

## 🚀 Como executar o projeto
1. Clone este repositório na sua máquina:
   ```bash
   git clone 
