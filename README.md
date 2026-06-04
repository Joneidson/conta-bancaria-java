# 🏦 Conta Bancária — Java POO

Exercício de Programação Orientada a Objetos em Java.  
Foco principal: **Encapsulamento**.

---

## 📋 Descrição

Sistema simples de cadastro de conta bancária com as seguintes regras de negócio:

- Número da conta é **imutável** após criação
- Nome do titular pode ser alterado
- Saldo **só é alterado via métodos** (`depositar` e `sacar`)
- Depósito inicial é **opcional** — saldo começa em zero se não informado
- Cada saque cobra uma **taxa de R$ 5,00**
- Conta pode ficar com **saldo negativo**

---

## 🗂️ Estrutura do Projeto

```
conta-bancaria-java/
├── src/
│   ├── Main.java       → entrada da aplicação
│   ├── Conta.java      → dados e regras da conta
│   └── Titular.java    → dados do titular
└── README.md
```

---

## 🧠 Conceitos Praticados

| Conceito | Aplicação no projeto |
|---|---|
| Encapsulamento | `private double saldo` protegido por métodos |
| Construtores | Com e sem depósito inicial (sobrecarga) |
| Getter / Setter | Acesso controlado aos atributos |
| `final` | `numeroConta` imutável |
| `toString()` | Exibição formatada da conta |
| Sobrecarga | Dois construtores para `Conta` |

---

## ▶️ Como Executar

### Pré-requisitos

- Java JDK 17+
- IDE (IntelliJ, Eclipse ou VS Code) ou terminal

### Via terminal

```bash
# Compilar
javac src/*.java -d out/

# Executar
java -cp out/ Main
```

---

## 💬 Exemplo de Execução

```
Enter account number: 8532
Enter account holder: Alex Green
Is there an initial deposit (y/n)? y
Enter initial deposit value: 500.00

Account data:
Account 8532, Holder: Alex Green, Balance: $ 500.00

Enter a deposit value: 200.00
Updated account data:
Account 8532, Holder: Alex Green, Balance: $ 700.00

Enter a withdraw value: 300.00
Updated account data:
Account 8532, Holder: Alex Green, Balance: $ 395.00
```

---

## 📐 Modelagem das Classes

```
Main
 └── cria Conta
          │
          ├── Titular
          │    └── nome (get / set)
          │
          ├── numeroConta  →  private final  (só get)
          ├── saldo        →  private        (só get)
          │
          ├── depositar(valor)  →  saldo += valor
          └── sacar(valor)      →  saldo -= (valor + 5.00)
```

---

## 👨‍💻 Autor

Feito por **Joneidson Victor** como parte da trilha de estudos Java — POO.