import java.util.Scanner
val scanner = Scanner(System.`in`)

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