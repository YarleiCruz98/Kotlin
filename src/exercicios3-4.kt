//Objetivo: solicitar ao usuário que informe uma nota entre 1 e 5, e conforme a nota
//apresentar o qualificador.
//Arquivo: solicitaNotaIf.kt
//Função: avaliaResultadoIf();
//Instruções:
//Declarar variável nota
//Receber do usuário o valor da nota entre 1 e 5
//Se nota igual a 1 apresentar “Péssimo”
//Senão se nota igual a 2 apresentar “Ruim”
//Senão se nota igual a 3 apresentar “Satisfatório”
//Senão se nota igual a 4 apresentar “Bom”
//Senão se nota igual a 5 apresentar “Ótimo”
//Senão apresentar “Nota inválida”

 fun main(){
     avaliaResultadoIf()
 }
fun avaliaResultadoIf(){
    print("Digite uma nota entre 1 e 5: ")
    val nota = scanner.nextInt()
    val resultado = when (nota) {
        1 -> "Péssimo"
        2 -> "Ruim"
        3 -> "Satisfatório"
        4 -> "Bom"
        5 -> "Ótimo"
        else -> "Nota inválida"
    }
    println(resultado)
}