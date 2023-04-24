fun eatUntilNothugry(totalCount: Int, currentCount: Int) {
    var currentCountCopy: Int = currentCount
    do {
        println("밥을 먹었다")
        currentCountCopy++
    } while (currentCountCopy < totalCount)
    println("배가 부르다")
}

//eatUntilNothugry(10, 11)