# 📄 Sistema de Controle de Estoque em Java

🎓 Projeto desenvolvido como trabalho acadêmico para prática de Programação Orientada a Objetos (POO)

---

## 🧾 Descrição

Este é um sistema simples e funcional de **controle de estoque** desenvolvido em Java. Ele permite o gerenciamento de diferentes tipos de produtos, como:

- 👕 Roupas de tamanho único  
- 🧥 Roupas com tamanhos **P**, **M** e **G**  
- 🎒 Acessórios  

O sistema permite realizar vendas e aplica **reposição automática de estoque** quando a quantidade de um item atinge o nível mínimo.

---

## 📁 Estrutura do Projeto

- `Item.java`  
  Interface que define o contrato para todos os itens do estoque.

- `Peca.java`  
  Classe abstrata base para produtos com atributos comuns (descrição, quantidade, limites de estoque).

- `RoupaTamanhoUnico.java`  
  Subclasse de `Peca`, representa roupas com tamanho único.

- `RoupaPMG.java`  
  Implementa diretamente a interface `Item`, representando roupas com tamanhos **P**, **M** e **G**, com controle separado para cada tamanho.

- `Acessorio.java`  
  Subclasse de `Peca`, representa acessórios com lógica específica de validação na venda.

- `Main.java`  
  Classe principal com um **menu interativo** para realizar vendas, verificar estoque e encerrar o programa.

---

## ⚙️ Funcionalidades

### 📦 Estoque Inicial
- O sistema inicia com 5 itens pré-definidos no vetor de estoque.

### 🛍️ Venda de Produtos
- **Roupas tamanho único**: vende 1 unidade por vez.  
- **Roupas P/M/G**: o usuário escolhe o tamanho.  
- **Acessórios**: o usuário informa a quantidade desejada.

### 🔁 Reposição Automática
- Quando o estoque de um item atinge o mínimo definido, ele é automaticamente reabastecido com a quantidade padrão.

### 📊 Exibição Final de Estoque
- Ao encerrar o programa, todos os itens são listados com suas quantidades atualizadas.

---

## 💡 Conceitos de POO Utilizados

- 🧩 Encapsulamento  
- 🧬 Herança (`Peca` → `RoupaTamanhoUnico`, `Acessorio`)  
- 🧪 Polimorfismo (`Item[] estoque`)  
- 🔌 Interface (`Item`)  
- 🛡️ Tratamento de Exceções (`try-catch`)  
- 🎛️ Entrada de dados via `Scanner`  

---

## 📝 Observações Finais

Este sistema foi desenvolvido com fins **educacionais** e **didáticos**, focando na prática de estruturação de classes, uso de interfaces, herança e lógica básica de controle de estoque em um ambiente de console.

---
