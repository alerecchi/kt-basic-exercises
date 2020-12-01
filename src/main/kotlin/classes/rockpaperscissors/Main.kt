package classes.rockpaperscissors

fun main() {
    println("Welcome to a game of Rock Paper Scissors")
    println("What is your name? ")
    val name = readLine() ?: ""
    println("What is your move? ")
    val move: Move = Move.valueOf(readLine()!!.toUpperCase())

    val player1 = Player(name, move)
    val player2 = Player.aiPlayer()
    val game = Game(player1, player2)

    game.printState()
    game.playTurn()
    game.printState()
}