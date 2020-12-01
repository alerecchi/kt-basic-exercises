package classes.rockpaperscissors

data class Player(val name: String, val selectedMove: Move) {

    companion object {
        fun aiPlayer(): Player {
            val randomMove = Move.randomMove()
            return Player("AI Player", randomMove)
        }
    }
}

