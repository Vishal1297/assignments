import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    print("Enter Number Of Soldiers : ")
    val totalSoldiers = scanner.nextInt()
    val chessBoard = Array(totalSoldiers){ Array<Int>(totalSoldiers){0} }
    for (num in 1..totalSoldiers){
        print("Enter coordinates for soldier $num : ")
        val soldiersPosX = scanner.nextInt()
        val soldiersPosY = scanner.nextInt()
        chessBoard[soldiersPosX-1][soldiersPosY-1] = 1
    }
    print("Enter the coordinates for your “special” castle : ")
    val castlePositionX = scanner.nextInt()
    val castlePositionY = scanner.nextInt()

    chessBoard[castlePositionX][castlePositionY] = -1

    getAllUniquePaths(chessBoard, totalSoldiers, castlePositionX, castlePositionY)

}

fun getAllUniquePaths(chessBoard: Array<Array<Int>>, totalSoldiers: Int, castlePositionX: Int, castlePositionY: Int) {
    for (i in 0 until totalSoldiers){
        for (j in 0 until totalSoldiers)
            print("${chessBoard[i][j]} \t")
        println()
    }
}
