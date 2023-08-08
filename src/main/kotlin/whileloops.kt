fun main(args: Array<String>) {
    //While loop
    var counterOne = 0
    while (counterOne <= 5){
        println(counterOne)
        counterOne++
    }
    //Do while loop
    var counterTwo = 10
    do {
        println(counterTwo)
        counterTwo++
    }while (counterTwo <= 15)

    // For loop
    for (i in 20..25 ){
        println(i)
    }
    for (j in 35 downTo 30){
        println(j)
    }
    val names = arrayListOf("steve","anto","mr puny","lambistic ")
    for (jina in names){
        println(jina)
    }

    // For each loop
    names.forEach{
        println(it)
    }
    //Repeat
    repeat(2){
        println("Hello there.")
    }

}
//implement a program that prints a pattern of a star using nested loops
//implement a program that iterates through a list of programs and skips printing even numbers but breaks the loops when a negative number
//use break and continue
//
//fun main(args: Array<String>) {
//    val nums = listOf(1,2,3,4,5,-6,7,8,9)
//    for (num in nums){
//        if(num <0 ){
//            break
//        }
//        if (num % 2 ==0){
//            continue
//
//
//        }
//        println(num)
//    }
//}
//fun main(args: Array<String>) {
//    var row = 5
//    var i = 1
//    while (i <= row) {
//        var space = 1
//        while (space < row) {
//            print(" ")
//            space++
//        }
//        var i = 1
//        while (i <= 1) {
//            print("*")
//            i++
//        }
//         i++
//        println()
//
//    }
//}
