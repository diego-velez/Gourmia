package model

class MainMenu {
    init {
        var choice: Int? = null

        while (choice != 3) {
            println("Welcome to Gourmia!")
            println("1) New Game")
            println("2) Continue")
            println("3) Exit")

            choice = readLine()?.toInt()

            when (choice) {
                1 -> TODO()
                2 -> TODO()
            }
        }
    }
}