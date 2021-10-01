package model.entities

import model.Entity
import model.EntityType

class Player(name: String): Entity(name, EntityType.Player)