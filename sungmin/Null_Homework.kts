
//1.학생이 시험에서 맞은 문제의 갯수를 넣어주면 시험 점수(정수)를 반환하는 함수를 만드시오
//(시험 문제는 총 20문제이고 만점은 100점) , 1문제당 5점

//맞은 문제 변수 : number 시험점수 변수 : Score
fun TestScore(number : Int , Score : Int): Int // 맞은 문제 넣으면 시험점수가 반환되는 함수
    var NumberScore = (number * 5)
    return NumberScore
 )

TestScore(
    number = 5,
    Score = 25
)
TestScore(5,25)
var NumberScore : Int = TestScore(number = 5 , Score = 25)
println(NumberScore)










//2.정수형 변수 A를 선언하고 , 변수 B를 선언한다 이때 변수 B는 A의 두배가 되어야 한다.

var a : Int = 5 //정수 a 선언
var b : Int = (a * 2 ) // 정수 b선언 단, a의 두배가 되게끔 a * 2로 선언







