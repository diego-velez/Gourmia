package model.entities

import model.Entity
import model.EntityType

class Zombie: Entity(EntityType.Zombie.toString(), EntityType.Zombie, 10)