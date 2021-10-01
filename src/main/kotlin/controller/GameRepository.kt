package controller

import model.entities.Player

class GameRepository private constructor(val player: Player) {

    companion object {
        private var INSTANCE: GameRepository? = null

        fun initialize(player: Player) {
            if (INSTANCE == null) {
                INSTANCE = GameRepository(player)
            }
        }

        fun get(): GameRepository {
            return INSTANCE
                ?: throw IllegalStateException("GameRepository must be initialized")
        }
    }
}