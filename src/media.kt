import java.util.*

fun main(){
    nota()
}

fun nota(){
//pedir uma nota
    val scan = Scanner(System.`in`).useLocale(Locale.US)
    while(true){
        println("Insira uma nota:")
        val nota = scan.nextDouble()
        if(nota in 0.0..10.0){
            when{
                nota in 0.0..4.0 -> println("Você está REPROVADO")
                nota in 4.01..6.0 -> println("Você está de RECUPERAÇÃO")
                else -> println("Nota $nota Você está de APROVADO")
            }
            break
        }else{
            println("Nota $nota inválida, tente novamente")
        }
    }
}