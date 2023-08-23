fun main(args: Array<String>) {

    print("Please enter a number 1-10 that you would like to know the German word for: ")
    var nums = readLine()!!.toInt()
    var numString = "x"

    when (nums) {
        1 -> numString = "Eins"
        2 -> numString = "Zwei"
        3 -> numString = "Drei"
        4 -> numString = "Vier"
        5 -> numString = "Funf"
        6 -> numString = "Sechs"
        7 -> numString = "Sieben"
        8 -> numString = "Acht"
        9 -> numString = "Neun"
        10 -> numString = "Zehn"
        !in 1..10 -> numString = "Out of range"
        else -> numString = "Unknown value"
    }
    println("The German word for ${nums} is ${numString}.")

}