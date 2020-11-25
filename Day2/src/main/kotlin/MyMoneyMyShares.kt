import java.util.*

val scanner = Scanner(System.`in`)

fun main() {
    takeInput()
    scanner.close()
}

fun takeInput(){
    var sum = 0
    var index = 0
    var weightsList = mutableListOf<Int>()
    while (true){
        print("Enter apple weight in gram (-1 to stop ) : ")
        var appleWeight = scanner.nextInt()
        if (appleWeight == -1) break
        weightsList.add(index, appleWeight)
        index++
        sum += appleWeight
    }

    distributeApples(weightsList, sum, index+1)
}

fun distributeApples(weightsList:List<Int>, sum:Int, totalApples:Int){
    println(sum)
    var ramShare:Int = (0.5*sum).toInt()
    var shamShare:Int = (0.3*sum).toInt()
    var rahimShare:Int = (0.2*sum).toInt()



}
