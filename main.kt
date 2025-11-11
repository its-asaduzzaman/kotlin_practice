fun main() {
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8

    fun add(a: Int, b: Int): Int {
        return a + b
    }

    fun sub(a: Int, b: Int): Int {
        return a - b
    }
    
    val result = add(firstNumber, secondNumber)
    val anotherResult = add(firstNumber, thirdNumber)


    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber + $thirdNumber = $anotherResult")

    val result2 = sub(firstNumber, secondNumber)
    val anotherResult2 = sub(firstNumber, thirdNumber)
     println("$firstNumber - $secondNumber = $result2")
    println("$firstNumber - $thirdNumber = $anotherResult2")
}

// Define add() function below this line