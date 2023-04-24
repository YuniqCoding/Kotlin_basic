//2083 럭비 클럽
fun main() {
    while (true) {
        val str = readLine()!!
        val z = str.split(" ")
        val name = z.get(0)
        val age = readLine()!!.toInt()
        val weight = readLine()!!.toInt()
        if(name == "#" && age == 0 && weight == 0 ) {
            break
        }
        if(age > 17 || weight >= 80  ) {
            println("${name} Senior")
        }
             else {
                 println("${name} Senior")
        }
    }
}
main()

//계산기3
//class Calculater3 constructor() {
//    fun calcu(a: Char, b: Int) {
//        val str = readLine()!!
//        val list1 = listOf<Char>()
//        val list2 = mutableListOf<Int>()
//
//
//    }
//}
//val calculater3 = Calculater3()
//calculater3.calcualte(listOf<Char>('+', '-'), listOf<Int>(10, 20))
//println(calculater3.result)