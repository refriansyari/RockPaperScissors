import utils.Conditions


class RPSGame {                         //Rock, Paper, Scissors Game

    fun run() {
        printHeader()
        getInputFromPlayer()
    }

    private fun printHeader() {
        println("==========================")
        println("GAME SUIT TERMINAL VERSION")
        println("==========================")
    }

    private fun getInputFromPlayer() {
        print("Masukkan pemain 1: ")
        val player1Input = getValueFromUser()                                           //Player 1 Input
        print("Masukkan pemain 2: ")
        val player2Input = getValueFromUser()                                           //Player 2 Input
        Conditions.winningOrLosingCondition(player1Input, player2Input)                 //Processing Users Input
        printScore()
        run()
    }

    private fun getValueFromUser(): String {
        val input = readLine()?.lowercase() ?: ""
        if (input == "gunting" || input == "kertas" || input == "batu") {               //Input Validation
            return input
        } else {
            println("Input are invalid. Please re-input!")
            println()
            run()                                                                       //Re-run program if the inputs are invalid
            return ""
        }
    }

    private fun printScore() {                                                           //Printing current score - calling variables from object
        println("==========================")
        println("Total Menang - Player 1 : ${Conditions.p1wins} ")
        println("Total Menang - Player 2 : ${Conditions.p2wins} ")
        println("Total Seri : ${Conditions.draws} ")
        println("==========================")
        println()
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            RPSGame().run()

        }
    }
}