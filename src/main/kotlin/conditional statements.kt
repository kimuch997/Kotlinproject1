fun main(args: Array<String>) {
    val age = 18
    if (age < 18){
        println(false)
    }else{
        println(true)
    }
    if (age >= 18){
        println("false")
    } else {
        println("true")
    }
    var x = 10
    var y = 20
    if ( x < y || y > 50 ){
        println("false")
    }else{
        println("true")
    }
    var bettingNumber = 0
    if (bettingNumber == 1){
        println("You won a car")
    }else if (bettingNumber == 2){
        println("You won a horse")
    } else if (bettingNumber == 3){
        println("You won 3M")
    }else if (bettingNumber == 4) {
        println("You won a place at kibes table")
    }else {
        println("Enter a number from 1-4 to bet.")
    }
//    when statements
    var number = 0
    when (number) {
        0 -> {
            println("You have selected a zero")
        }

        1 -> {
            println("You have selected a one")
        }

        2 -> {
            println("You have selected a two")
        }

        else -> {
            println("You haven't selected a valid number")


        }
    }

}
