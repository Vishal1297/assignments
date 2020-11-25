import java.util.*
import kotlin.collections.HashMap

fun main() {

    val scanner = Scanner(System.`in`)
    println("Input: ")
    print("Enter Length Of Array: ")

    val length: Int = scanner.nextInt()

    if (length <= 0) println("Enter Valid Array Length")

    val arr = IntArray(length)

    print("Enter Array Of Length $length: ")

    for (index in 0 until length) arr[index] = scanner.nextInt()

    print("Target: ")

    val targetValue = scanner.nextInt()

    println("Output: ")
    getTargetSumParis(arr, length, targetValue)

    scanner.close()
}

fun getTargetSumParis(arr: IntArray, length: Int, targetValue: Int) {
    val tempMap = HashMap<Int, Int>()

    for (index in 0 until length) {

        val diff = if (arr[index] < 0) targetValue + arr[index]
        else targetValue - arr[index]

        if (tempMap.containsKey(diff)) println("${arr[index]} , $diff")
        else tempMap[arr[index]] = diff
    }
}