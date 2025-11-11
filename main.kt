// Function that compares today's and yesterday's screen time
fun spentMoreTimeToday(timeSpentToday: Int, timeSpentYesterday: Int): Boolean {
    return timeSpentToday > timeSpentYesterday
}

fun main() {
    // Test the function with the examples from the question
    println(spentMoreTimeToday(300, 250))  // true
    println(spentMoreTimeToday(300, 300))  // false
    println(spentMoreTimeToday(200, 220))  // false
}