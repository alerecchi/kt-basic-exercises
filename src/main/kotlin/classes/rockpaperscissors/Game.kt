package classes.rockpaperscissors

class Game(val player1: Player, val player2: Player) {

    var gameState: State = State.PreparationPhase

    fun playTurn() {
        val move1 = player1.selectedMove
        val move2 = player2.selectedMove
        gameState = when {
            move1 == Move.ROCK && move2 == Move.SCISSORS -> State.PlayerWon(player1)
            move1 == Move.ROCK && move2 == Move.PAPER -> State.PlayerWon(player2)
            move1 == Move.SCISSORS && move2 == Move.ROCK -> State.PlayerWon(player2)
            move1 == Move.SCISSORS && move2 == Move.PAPER -> State.PlayerWon(player1)
            move1 == Move.PAPER && move2 == Move.ROCK -> State.PlayerWon(player1)
            move1 == Move.PAPER && move2 == Move.SCISSORS -> State.PlayerWon(player2)
            else -> State.Tie(move1)
        }
    }

    fun printState() {
        gameState.let {
            when (it) {
                is State.Tie ->
                    println("Both player chose ${it.tieMove}")
                is State.PlayerWon ->
                    println("Congrats ${it.winningPlayer.name} you won chosing ${it.winningPlayer.selectedMove}")
                State.PreparationPhase ->
                    println("Preparing the game...")
            }
        }

    }
}

sealed class State {
    object PreparationPhase : State()
    data class Tie(val tieMove: Move) : State()
    data class PlayerWon(val winningPlayer: Player) : State()
}

enum class Move {
    ROCK, PAPER, SCISSORS;

    companion object {
        fun randomMove(): Move {
            return values().random()
        }
    }
}

