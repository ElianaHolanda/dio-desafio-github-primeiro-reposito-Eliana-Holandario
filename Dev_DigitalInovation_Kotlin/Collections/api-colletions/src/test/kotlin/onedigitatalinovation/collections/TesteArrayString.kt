package onedigitatalinovation.collections

fun main() {
    val nomes = Array(size = 3) {""}
    nomes[0] = "Maria"
    nomes[1] = "Victor"
    nomes[2] = "Arthur"

    for (nome in nomes){
        println(nome)
    }

    println("-----------")
    nomes.sort()
    nomes.forEach { println(it) }

    println("-----------")
    val nomes2 = arrayOf("Maria", "Pedro", "José")
    nomes2.sort()
    nomes2.forEach { println(it) }
}