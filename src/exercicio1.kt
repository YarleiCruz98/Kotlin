//Implementar um programa que o usuário informe via linha de comando um valor do
//produto e um percentual de desconto. Com base nisso apresente o valor final do
//produto. Criar uma função para esse cálculo.

import java.util.Scanner

fun main(){
    val valorFinal = calculaDesconto(preco(),desconto())
    print("Preço com desconto: $valorFinal")
}

fun preco(): Double{
    print("Digite o preço do Produto: ")
    val precoProduto = scanner.nextDouble()
    println("preço do produto: $precoProduto")
    return precoProduto
}

fun desconto():Double{
    val scanner = Scanner(System.`in`)
    print("Deseja quantos porcento de desconto ? ")
    val descont = scanner.nextDouble()
    println("Desconto solicitado: $descont % ")
    return descont
}

fun calculaDesconto(preco:Double, desconto:Double):Double{
    val valorDoDesconto = preco - (preco * (desconto / 100) )
    return valorDoDesconto
}