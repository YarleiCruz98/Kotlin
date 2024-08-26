//Objetivo: calcular a média de uma sequência de números positiva informadas pelo
//usuário.
//Arquivo: calculaMediaWhile.kt
//Função: calcularMediaWhile()
//Instruções:
//Declarar variáveis
//Inicializar variáveis
//Enquanto numero maior que zero faça
//Receber numero do usuário
//Somar ao total
//Incrementar 1 ao contador
//Ao sair do loop calcular a média
//Apresentar o contador
//Apresentar o valor total
//Apresentar a média
fun main(){
    calcularMediaWhile()
}

fun calcularMediaWhile(){

    var contador = 0
    var acumuladoNota = 0
    while(true){
        print("Digite numeros inteiros para calcularmos a média, caso deseja encerrar digite 0: ")
        val nota = scanner.nextInt()
        if(nota > 0){
            contador++
            acumuladoNota += nota
        }else if(nota < 0){
            println("nota invalida, tente novamente")
        }else{
            println("Quantidade de notas: $contador")
            println("Total acumulado das notas: $acumuladoNota")
            println("Media total das notas: ${acumuladoNota.toDouble()/contador}")
            break
        }

    }
}