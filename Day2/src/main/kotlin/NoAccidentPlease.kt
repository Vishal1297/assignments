import java.util.*

fun main() {

    val scanner = Scanner(System.`in`)

    print("Enter Number Of Flights: ")

    val flightsCount = scanner.nextInt()

    val coordinates = arrayOf( arrayOf(3), arrayOf(1) )

    var flightsPath = arrayOf( flightsCount )


    for (num in 0 until flightsCount){
        print("Flight ${num+1} ")
        for (value in 0..2){

            val time = scanner.nextInt()
            val place = scanner.nextInt()

        }
    }

    scanner.close()

}

