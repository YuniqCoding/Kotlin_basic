import kotlin.time.TestTimeSource

Quiz
1)흐름 제어법 두가지로는 무엇이 있나요?
 정답 : if문, when문

2)다음 코드의 결과값은 무엇일까요?
val num: Int = 7
val num1: Int= if (num >= 7)0 esle 1 println(num1)
 정답 : 0

3)다음 코드의 결과값은 무엇일까요?
val num: Int = 4
when (num) {
    in 1..2->println("하이")
    in 2..4->println("헬로우")
    in 4..8-->println("안녕")
}
 정답: "헬로우"

4)다음 제어문의 빈칸에 들어갈 것은?
(   )(number1 == 10) println("10입니다")
(   )(number1 == 30) println("30입니다")
(   )(number1 == 50) println("50입니다")
(   ) println("10,20 둘다 아닙니다")

정답 : if, else if, else if , else

5) 다음 배열 array는 어떻게 변했을까요?
var array = arrayOf<Int>(3,11,23,49,9)

array[3] = 51
정답: (3,11,23,51,9)

array.set(1,32)
정답: (3,32,23,51,9)

6)다음 코드의 결과값은 무엇일까요?
val Score1: Int = 50
val Score2: Int = 54
val Score3: Int = 22
var Scores = arrayOf<Int>(Score1, Score2, Score3)

val Scroe4 = if(Scores[0] <50) Scores[1] else Scores[2]
println(Scroe4)
정답: 22 , 54 , 22 //Score4만 프린트했는데 값이 3개나??

7) Collection의 세가지 종류는?
정답 : listOf,mapOf,setOf //종류니까 Of는 안써줘도된답니다!

8) 변경 가능한 Collection을 만들기 위해 앞에 붙여주는 키워드는?
  정답: immutable //변경가능한건 mutable이에요~

9) 다음 코드의 결과값은 무엇일까요?
var numbers = listOf<Int>(6, 4, 2, 5, 5, 1)
println(numbers[2]) 정답 : 2
println(numbers.get(3)) 정답 : //5
println(numbers.indexOf(1)) 정답 :5? //이유는?
println(numbers.last()) 정답: 1
println(numbers.first())  정답: 6


10) 다음 코드의 결과값은 무엇일까요?
val numbers2 = mutableListOf<Int>(1, 1, 1, 2, 3)
numbers2.addAll(3, listOf<Int>(22, 5)) //1,1,1,22,5,2,3

numbers2.add(20) //1,1,1,22,5,2,,20
numbers2.removeAt(1) //1,1,22,5,2,3,20
println(numbers2) //안푼건가요?


