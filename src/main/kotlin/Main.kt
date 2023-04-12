// Diferente do java as estruturas de dados em Kotlin sao definidas em mutaveis e imutaveis.
// As imutaveis sao dados que sao criadas em sua implementacao e nao podem
// ser modicadoss, seja adcionando ou removendo valores, podemos interar sobre eles mas nao
// modificalas e os mutaveis sao o oposto, podemos interar e modificalas de acordo com nosso desejo.
fun main() {
    //imutLlist()
    multList()
}

fun imutLlist() {
    // listas imutaveis podem ser de um unico tipo ou de um tipo generico recebendo varios valores
    // a lista abaixo e uma lista imutavel generica onde podemos definir varios tipos nela
    // val imList = listOf(2, 4, "ert", true)
    // a lista abaixo tambem e imutavel so que agora definimos seu tipo como string
    // val imList = listOf<String>("hdhj", "jkshf", "fjsf")
    val imList = listOf<Int>(2, 4, 6, 8)
    // note que abaixo tentamos usar o metodo add mas a lista nao aceita pois e imutavel
    //imList.add()
    imList.forEach {
        i -> Int
        println(i)
    }
    // podemos usar o forEach de outras formas
    // dessa forma sem passar nenhum parametro pois o kotlin ja nos da um parametro it com os valores da lista
    /* imList.forEach {
        println(it + 1)
    } */
    // ou dessa forma usando o for que nada mais e do que fazer a forma anterior
    /*for (i in imList) {
        println(i * 2)
    }*/
}

fun multList() {
    // Listas mutaveis tambem podem ser de um unico ti´po ou de diversos tipos
    // a lista abaixo e uma lista mutavel de diversos tipos
    // val multList = mutableListOf("hdfj", 3, 4, true, false, 90)
    val multList = mutableListOf<Int>(2, 4, 6, 8, 10, 12)
    // podemos adicionar ou remover elementos na nossa lista das formas abaixo
    // usando o add
    multList.add(14)
    // usando o add passando um index na nossa lista mutavel passando o elemento que estava no determinado
    // index para o proximo index
    multList.add(1, 16)
    // depois do add o numero 16 vira depois do 0 e o 4 passara a ser o index 2
    // usando o removeAt podemos remover um determinado elemento apartir do seu index
    multList.removeAt(1)
    // temos algumas outras funcoes que fazem parte da nossa lista mutavel como o remove que remove um elemento
    // presente na lista OBS: se um numero aparecer mais de uma vez na lista o primeiro numero encontrado sera o removido
    //multList.remove(4)
    // Podemos modificar a lista passando o index como elemento e o subistituindo
    // multList[multList.size -1] = 200
    // podemos acessar o tamanho da lista com o .size e como a lista inicia com 0 usamos o - 1 para acessar
    // o ultimo elemento subistituindo o ultimo elemento por 200.
    // OBS: nao podemos adcionar valores dessa forma so modificar valores existentes na lista
    multList.forEach{
        println(it)
    }
}