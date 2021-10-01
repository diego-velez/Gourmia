package view

import controller.GameRepository
import model.entities.Player

class NewGame {
    init {
        println("What is your name?")
        val playerName = readLine() ?: "Player"

        Player(playerName).let { player ->
            GameRepository.initialize(player)
        }

        GameCycle()
    }
}