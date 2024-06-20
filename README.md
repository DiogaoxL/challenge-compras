# 🎉 **Desafio de Compras** 🚀

Este projeto consiste em uma aplicação simples para simular um cartão de crédito, onde o usuário pode realizar compras e verificar o saldo restante.

## ℹ️ Funcionalidades

- Criar um cartão de crédito com limite inicial.
- Adicionar saldo ao cartão.
- Realizar compras e verificar se há saldo suficiente.
- Listar as compras realizadas em ordem de valor.


## Passo a passo de implementação

- Criar uma classe `CartãoDeCredito` onde teria os atributos: `limite`, `saldo`;
- Criar um método construtor na classe `CartãoDeCredito`  passando o limite que consequentemente será o saldo do cartão;
- Criar o método `getSaldo()` para pegar o saldo do cartão;
- Fazer o teste se funcionou adicionar saldo dentro main, criando um Scanner e lendo as informações e adicionar dentro da classe construtora do cartão.
- Criar uma classe `Compra` com os atributos: `descrição` e `valor` que serão mostrados no final;
- Criar o construtor de `Compra` para receber esses atributos;
- Fazer o teste dentro da `Main` para ver se esta guardando as informações de descrição e valor;
- Criar um while para adicionar diversos produtos até que o usuário desejar parar
- Criar a lista de Compra;
- Adicionar as compras dentro da lista;
- Mostrar as compras;
- Criar um método `lancarCompra()` dentro de `CartãoDeCredito` para verificar se o valor do saldo é suficiente para fazer a compra e atualizar o valor
- Dentro da Main chamar o método `lancarCompra()` se for true : adicionar a compra na lista e exibir a mensagem de compra efetuada, se false mostrar mensagem de saldo insuficiente e encerrar o loop
- Agora exibir os valores por ordem, adicionando a interface `Comparable<Compra>` na classe `Compra`
- Dentro da classe `Compra` adicionar o método de comparação `compareTo()` e adicionar a regra de comparação
- Dentro da Main, antes de mostrar os valores adicionar o `Collections` para indicar a ordenação de acordo com o critério escolhido.


  ## 💡 Aprendizados
  
- Aplicação de conceitos de orientação a objetos em um cenário prático.
- Utilização da classe ArrayList para gerenciar listas dinâmicas de objetos.
- Implementação da interface Comparable para ordenar objetos com base em um critério específico.
- Reforço na compreensão e aplicação de interfaces em Java.
