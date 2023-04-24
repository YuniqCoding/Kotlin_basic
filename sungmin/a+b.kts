fun killNthArmy(
    firstArmy: List<String>,
    secondArmy: List<String>,
    killNth: Int // 코틀린의 경우에 ()괄호 안에만 잘 넣어주면 줄바꿈을 해도 잘 동작하기 때문에 코드가 길어질 때 활용하면 좋습니다.
): List<List<String>>? {
    if (firstArmy.size < killNth || secondArmy.size < killNth) return null
    //killNth번째의 값을 제거해줘야하는데 killNth가 리스트들의 사이즈보다 더 크면 의미가 없어지겠죠? 그럴 때는 null을 return해줍니다.
    val firstArmyTemp = mutableListOf<String>()
    val secondArmyTemp = mutableListOf<String>()
    //받아온 파라미터는 수정할 수 없기 때문에 새로 빈 list를 만들어줘야합니다.
    for ((index, army) in firstArmy.withIndex()) {
        if (index != killNth) firstArmyTemp.add(army)
    }
    for ((index, army) in secondArmy.withIndex()) {
        if (index != killNth) secondArmyTemp.add(army)
    }
    //받아온 리스트들을 index와 함께 뽑아주면 index에는 0,1,2,3,4 순으로 들어가고 army에는 A,B,C,D,E 순으로 들어갑니다.
    val result = listOf<List<String>>(firstArmyTemp, secondArmyTemp)
    //list내에 list가 들어가는게 헷갈릴 수도 있겠지만 잘 생각해보면 그냥 두개의 리스트를 받아서 다시 리스트로 만들어주는 코드입니다.
    //listOf는 함수로만 쓰이기 때문에 안에 들어갈수가 없으므로 List로 넣어줘야 합니다.
    return result
}

println(
    killNthArmy(
        firstArmy = listOf<String>("A", "B", "C", "D", "E"),
        secondArmy = listOf<String>("A", "B", "C"),
        killNth = 2
    )
)