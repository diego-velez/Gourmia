fun main() {
    var response: Int? = null

    while (response != 4) {
        println("What do you want to do?")
        println("1) Add account")
        println("2) Remove account")
        println("3) View all accounts")
        println("4) Exit")
        response = readLine()!!.toInt()

        when (response) {
            1 -> TODO()
            2 -> TODO()
            3 -> TODO()
        }
    }
}