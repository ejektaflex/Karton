package karton

import karton.data.PlayerStats

fun main() {

    val p = PlayerStats()

    //p.props.inMap["level"] = 50

    p.level = 9001
    p.name = "Player 2"
    println(p.level)
    println(p.name)

    p.resetProps()


    println(p.level)
    println(p.name)


}