//List
var numbers = listOf<Int>(6, 4, 2, 5, 5, 1)
println(numbers[2])
println(numbers.get(3))
println(numbers.indexOf(1))
println(numbers.last())
println(numbers.first())

val numbers2 = mutableListOf<Int>(1, 1, 1, 2, 3)
numbers2.addAll(3, listOf<Int>(22, 5))
numbers2.add(20)
numbers2.removeAt(1)
println(numbers2)


//Set
val numbers3 = setOf<Int>(1, 1, 1, 3, 3, 4)
println(numbers3.contains(5))
println(numbers3.containsAll(setOf<Int>(1, 3)))

val numbers4 = mutableSetOf<Int>(1, 1, 1, 3, 3, 4)
numbers4.remove(10)
println(numbers4)

//Map
val numbers5 = mapOf<Int, String>(1 to "one", 2 to "two")
println(numbers5.keys)
println(numbers5.values)
println(numbers5.size)
println(numbers5.get(1))
println(numbers5[2])
println(numbers5.getOrDefault(1, "dafault"))
println(numbers5.getOrDefault(3, "dafault"))
println(numbers5.get(3))


val numbers6 = mapOf<Int, String>(Pair(1, "one"), Pair(2, "two"))


Iterable {  }