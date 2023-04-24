import kotlin.Int as Int1

//Quiz
//1) 구간이 1인 Progression을 뭐라고 할까요? // 정답:range
//2) 반복이 가능하고 범위가 있는것을 무엇이라고 하나요? // 정답 : Iterable
//3) 다음 코드의 결과값은 무엇일까요? //1..7 step 3
// 정답 : 1..7

//4) 다음 코드의 빈칸은 무엇일까요?
for((index,number) in numbers.withIndex ()) { //왜 오류일까요?
    println("" + index + "l" + number)
}
//numbers가 정의되지 않았기 때문에 실행될 수 있는 코드는 아닙니다:)

//Test
//1. 주어진 문자를 N번 반복해서 출력하는 함수를 만들어 보자

//for(a in 0..3) {
//    println("N번")
//}
//요건 함수가 아닌걸요 ㅠ.ㅠ

//2. 1부터 주어진 숫자까지의 합을 구하는 함수를 만들어 보자
//1~10까지의 합
//val Number = listOf<Int>(1+3+5+7)
//for(a in Number) {
//
//    println("합 : " + Number  )
//
//
//}       //문제가 이게 맞을까요..
//요것도 함수 만들기!!

//3. 1부터 100까지의 수중에서 7의 배수의 합을 구하는 함수를 만드시오


//fun PlusNumber(a : Int = 7 ) : Int {
//
//    var Number = (a * 1)
//    println("7의 배수의 합 : " + Number  )
//
//
//    return PlusNumber()
//}
//1부터 100까지의 범위가 없습니다. 파라미터도 굳이 안 넣어주셔도됩니다.

//4. 8 . 병사 그룹 2개와 n번째 값을 넣어주면, 각각의 병사 그룹에서 n번째 병사를 제거하고, 두개의 병사
//        그룹을 합쳐주는 함수를 만드시오
//fun abc( ["A", "B", "C", ,"D", "E"] ,  ["A", "B", "C"], 2)
//-> [["A", "B", "D", "E"], ["A", "B"]]
//
//(함수 실행이 어려운 조건을 만나면 null을 리턴해야한다)
//fun abc( ["A", "B", "C", ,"D", "E"] ,  ["A", "B", "C"], 100)
//-> null













