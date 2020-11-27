package karton.data

import karton.delegate.IPropMap
import karton.delegate.PropMap

class PlayerStats(private val props: PropMap<Any?> = PropMap()) : IPlayerStats, IPropMap by props {

    var name: String by props("Player 1")
    override var level: Int by props(1)
    override var health: Int by props(100)
    override var maxHealth = 100
    override var strength = 1.0

    //val defence: Int by props()



    val healthPercent: Double
        get() = health.toDouble() / maxHealth


}


