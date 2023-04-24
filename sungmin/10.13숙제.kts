import java.util.*

////2439 별찍기 - 2
//fun main() {
//    val a = readLine()!!.toInt()
//
//    for(i in 1..a) {
//        for(j in a-i downTo 1) {
//            print(" ")
//    }
//        for(z in 1..i) {
//            print("*")
//        }
//        println()
//    }
//}
//main()

////2440 별찍기 -3
//fun main() {
//    val a = readLine()!!.toInt()
//    for(i in 1..a) {
//       for(j in 0..a-i ) {
//           print('*')
//       }
//        println()
//    }
//}
//main()

//2480 주사위 세개
fun main() {
    val str = readLine()!!.split(" ")
    val a = str.get(0).toInt()
    val b = str.get(1).toInt()
    val c = str.get(2).toInt()

    if(a == b && b == c) {
        println("${10000 + a * 1000}")
    }
    else if(a == b && b != c) {
        println("${1000 + a * 100}")
    }
    else if(a != b  && b == c ) {
        println("${1000 + c * 100}")
    }
    else if(a == c && b != a) {
        println("${1000 + c * 100}")
    }
    else if(a != b && b != c) {
        var Max = Math.max(a,Math.max(b,c))
        println(Max * 100)
    }
    }
main()
