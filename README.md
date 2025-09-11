# Cabral Corporation Bank  

## 📌 Descrição  
Este projeto é uma simulação simples de um sistema bancário em **Java**.  
Ele permite que um cliente realize operações básicas em sua conta bancária, como:  

- **Depositar dinheiro**  
- **Sacar dinheiro**  
- **Exibir saldo atual**  
- **Visualizar histórico de transações**  
- **Gerenciar múltiplas contas bancárias**  

O programa utiliza conceitos básicos de **Programação Orientada a Objetos (POO)** em Java.  

---

## 🏗️ Estrutura do Código  

### Classes Principais:
- **`CabralCorporationBanco`** → Ponto de entrada da aplicação
- **`Banco`** → Gerencia múltiplas contas bancárias
- **`ContaBancaria`** → Gerencia saldo e operações de uma conta
- **`Cliente`** → Armazena dados pessoais (nome e idade)
- **`Transacao`** → Registra operações bancárias com data/hora

### Relacionamentos:
- **Banco** → Agrega múltiplas **ContaBancaria**
- **ContaBancaria** → Associa com um **Cliente** e múltiplas **Transacao**
- **Transacao** → Registra automaticamente depósitos e saques

---

## 🚀 Funcionalidades

### Menu Interativo:
1. **Depositar** - Realiza depósito com registro automático
2. **Sacar** - Realiza saque com validação de saldo
3. **Exibir Saldo** - Mostra saldo atual formatado
4. **Histórico de Transações** - Lista todas as operações realizadas
5. **Listar Contas do Banco** - Exibe todas as contas cadastradas
6. **Sair** - Encerra o programa

### Recursos Técnicos:
- ✅ **Encapsulamento** - Atributos privados com getters/setters
- ✅ **Agregação** - Banco contém múltiplas contas
- ✅ **Associação** - ContaBancaria relacionada com Cliente e Transacao
- ✅ **Registro Automático** - Todas as operações são registradas com timestamp
- ✅ **Formatação** - Valores monetários com 2 casas decimais
- ✅ **Validação** - Verificação de valores e saldo suficiente

---

## 🥷 Equipe

- **Everton Victor - 01811477**
- **Matheus Cabral - 01647896**
- **Valter Luiz - 01837580**
- **Anderson Henrique - 01796833**
- **Ruann- 01804515**

## 📈 Diagrama

Está na pasta **img**
