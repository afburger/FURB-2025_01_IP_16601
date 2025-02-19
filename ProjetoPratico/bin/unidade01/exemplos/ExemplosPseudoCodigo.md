## 1. Calcular a área de um retangulo. 
Modele a solução de um problema para calcular a área de uma sala retangular.  
Considere que as medidas estão expressas em metros. 

```js
ler(comprimento, largura)
arae = comprimento * largura
escrever ("Area: ", area)
```

## 2. Conta bancária.

Implemente um algoritmo em pseudocódigo que represente uma Conta Bancária e que possua os atributos número da conta e saldo. Crie funções para depositar e sacar dinheiro da conta, garantindo que não seja possível sacar um valor maior que o saldo disponível.  

```js
inicio ContaBancaria
	variaveias: numeroConta, saldo
	ler(numeroConta, saldo)
	funcao Depositar
		ler (valor)
		saldo = saldo + valor
	fim funcao
	funcao Sacar()
		ler (valor)
		se saldo == valor então
			saldo = saldo - valor
		senão
			escrever ("Saldo insuficiente")
		fim se
	fim funcao
fim ContaBancaria
```