import java.util.*

fun main() {

    val scanner = Scanner(System.`in`)
    println("Input: ")

    print("Length Of Array: ")

    val length = scanner.nextInt()

    if (length <= 0) println("Enter Valid Array Length")

    var arr = IntArray(length)

    print("Enter Array Of Length $length: ")

    for (index in 0 until length) {
        arr[index] = scanner.nextInt()
    }

    var nth = 2

    println("Output: ")
    println(getSmallest(arr, length, nth - 1))

    scanner.close()

}

fun getSmallest(arr: IntArray, len: Int, nth: Int): Int {
    var min = arr[0]
    for (index in 0 until len) if (arr[index] <= min) min = arr[index]
    for (index in 0 until len) if (arr[index] == min) arr[index] = Int.MAX_VALUE
    if (nth == 0) return min
    return getSmallest(arr, len, nth - 1)
}

// For Nth Smallest, We can use sorting.