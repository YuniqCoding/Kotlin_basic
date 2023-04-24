fun main() {
    val sang = readLine()!!.toInt()
    val joong = readLine()!!.toInt()
    val ha = readLine()!!.toInt()
    val cola = readLine()!!.toInt()
    val cider = readLine()!!.toInt()
    val setPrice = Math.min(Math.min(sang,joong),ha) + Math.min(cola,cider)-50;

    println(setPrice)
}
main()