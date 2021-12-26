package utils


object Conditions {                                                     //Rock, Paper, Scissors Game conditionals/rules
    var p1wins = 0
    var p2wins = 0
    var draws = 0

    fun winningOrLosingCondition(player1: String, player2: String) {    //Conditionals
        when {
            player1 == "batu" && player2 == "gunting" -> {
                println("Batu mengalahkan gunting - Player 1 menang!")
                p1wins++

            }
            player1 == "kertas" && player2 == "batu" -> {
                println("Kertas mengalahkan batu - Player 1 menang!")
                p1wins++

            }
            player1 == "gunting" && player2 == "kertas" -> {
                println("Gunting mengalahkan kertas - Player 1 menang!")
                p1wins++

            }
            player1 == "gunting" && player2 == "batu" -> {
                println("Batu mengalahkan gunting - Player 2 menang!")
                p2wins++

            }
            player1 == "batu" && player2 == "kertas" -> {
                println("Kertas mengalahkan batu - Player 2 menang!")
                p2wins++

            }
            player1 == "kertas" && player2 == "gunting" -> {
                println("Gunting mengalahkan kertas - Player 2 menang!")
                p2wins++

            }
            else -> {
                println("Pertandingan seri!")
                draws++
            }
        }
    }


}