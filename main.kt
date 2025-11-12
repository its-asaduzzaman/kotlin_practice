fun main() {
   /*  println("City: Ankara")
    println("Low temperature: 27, High temperature: 31")
    println("Chance of rain: 82%")
    println()

    println("City: Tokyo")
    println("Low temperature: 32, High temperature: 36")
    println("Chance of rain: 10%")
    println()
    
    println("City: Cape Town")
    println("Low temperature: 59, High temperature: 64")
    println("Chance of rain: 2%")
    println()
    
    println("City: Guatemala City")
    println("Low temperature: 50, High temperature: 55")
    println("Chance of rain: 7%")
    println()
    */

    fun printCityName(city: String) {
        println("City: $city")
    }

    fun printTemperature(low: Int, high: Int) {
        println("Low temperature: $low, High temperature: $high")
    }

    fun printChanceOfRain(chance: Int) {
        println("Chance of rain: $chance%")
    }

    printCityName("Ankara")
    printTemperature(27, 31)
    printChanceOfRain(82)
    println()   

    printCityName("Tokyo")
    printTemperature(32, 36)
    printChanceOfRain(10)
    println()

    printCityName("Cape Town")
    printTemperature(59, 64)
    printChanceOfRain(2)  
    println()
    
    printCityName("Guatemala City")
    printTemperature(50, 55)
    printChanceOfRain(7)        
}