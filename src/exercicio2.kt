//Novamente via linha de comando, o usuário deverá informar valores dentro de um
//loop e deverá ser apresentado o total no final. Esse loop deve usar while até que o
//usuário informe um valor zero para sair do loop.

import java.util.Scanner


fun main() {
    somaValores()
}
fun somaValores(): Double{
    var valorTotal= 0.0
    while(true){
        print("Digite os valores: ")
        val valores = scanner.nextDouble()
        if(valores == 0.0){
            print("encerrando, valor final agregado: $valorTotal")
            break
        } else {
            valorTotal += valores
            print("valor total: $valorTotal, deseja continuar acrescentando valor ? caso sim digite os valores, caso náo digite 0")
        }
    }
    return valorTotal
}