package view

class MainMenu {
    init {
        var choice: Int? = null

        while (choice != 2) {
            println("Welcome to Gourmia!")
            println("1) New Game")
            println("2) Exit")

            try {
                choice = readLine()?.toInt()
            } catch (error: NumberFormatException) {}

            when (choice) {
                1 -> {
                    NewGame()

                    // Make sure it doesn't keep looping the main menu
                    choice = 2
                }
            }
        }
    }
}