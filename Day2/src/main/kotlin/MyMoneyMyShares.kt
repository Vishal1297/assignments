import java.util.*

fun main() {

    var totalWeight = 0
    val weightsList = mutableListOf<Int>()
    val scanner = Scanner(System.`in`)
    while (true) {
        print("Enter apple weight in gram (-1 to stop ) : ")
        val appleWeight = scanner.nextInt()
        if (appleWeight == -1) break
        weightsList.add(appleWeight)
        totalWeight += appleWeight
    }

    distributeApples(weightsList, totalWeight)

    scanner.close()
}


fun distributeApples(weightsList: MutableList<Int>, sum: Int) {
    val ramShare: Int = (0.5 * sum).toInt()
    val shamShare: Int = (0.3 * sum).toInt()
    val rahimShare: Int = (0.2 * sum).toInt()

    weightsList.sort()

    println("\nDistribution Result : ")

    print("Ram : ")
    getEachShare(weightsList, ramShare)
    print("Sham : ")
    getEachShare(weightsList, shamShare)
    print("Rahim : ")
    getEachShare(weightsList, rahimShare)

}

fun getEachShare(weightsList: MutableList<Int>, share: Int) {

    var total = weightsList.size - 1
    var personShare = share

    while (total >= 0) {
        if (personShare >= weightsList[total]) {
            print("${weightsList[total]} ")
            personShare -= weightsList[total]
            weightsList.removeAt(total)
            total = weightsList.size - 1
        } else {
            total--
        }
    }

    if (weightsList.contains(personShare)) {
        print(personShare)
        weightsList.remove(personShare)
    }
    println()
}