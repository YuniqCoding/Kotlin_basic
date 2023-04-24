// 5532 방학 숙제
//fun main() {
//    val L = readLine()!!.toInt()
//    val A = readLine()!!.toInt()
//    val B = readLine()!!.toInt()
//    val C = readLine()!!.toInt()
//    val D = readLine()!!.toInt()
//    var sum = 0
//    var sum1 = 0
//    if (A % C == 0) sum = A / C
//    else sum = A / C + 1
//    if (B % D == 0) sum1 = B / D
//    else sum1 = B / D + 1
//    print("${Math.min(L - sum, L - sum1)}")
//}
//main() // 이건 이해가 잘 안되긴 합니다 ㅠ

// 5543 상근날드

//fun main() {
//    var min = 2000
//    for(i in 0..2) {
//    val a = readLine()!!.toInt()
//        if(min > a) {
//            min = a
//        }
//    }
//        var min2 = 2000
//        for(i in 0..1) {
//            val b = readLine()!!.toInt()
//            if(min2 > b) {
//                min2 = b
//            }
//    }
// println("${min + min2 - 50}")
//}
//main()  // 이것도 이해가.. 안됩니다




// 5554   심부름 가는 길
//fun main() {
//    var sum = 0
//    var x = 0 // 분
//    var y = 0 // 초
//    for(i in 0..3) {
//    val A = readLine()!!.toInt()
//        if(A > 0) sum += A
//    }
//        if(sum >= 60)
//           x = sum / 60
//           y = sum % 60
//    println(x)
//    println(y)
//}
//main()  //기적같이 성공!

//5575 타임 카드
fun main() {
    val str = readLine()!!.split(" ")
    for(i in 0..2) {
        val h = str.get(0).toInt()
        val m = str.get(1).toInt()
        val s = str.get(2).toInt()
        val h2 = str.get(3).toInt()
        val m2 = str.get(4).toInt()
        val s2 = str.get(5).toInt()
        if(s2 - s < 0)

        println("${h2 - h}  ${m2 - m}  ${s2 - s}")
    }

}
main()