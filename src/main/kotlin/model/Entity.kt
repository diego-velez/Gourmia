package model

open class Entity(val name: String, val entityType: EntityType, var health: Int) {
    val isAlive: Boolean
        get() = health > 0

    val isDead: Boolean
        get() = !isAlive
}
