fun main() {
    val minAmount = 35
    val commission = 0.75
    val transition = 100
    val finalAmount = if (transition < minAmount){
        println("минимальная сумма перевода 35р")
    } else{
        transition + (transition * commission/100)
    }
    println(finalAmount)
}