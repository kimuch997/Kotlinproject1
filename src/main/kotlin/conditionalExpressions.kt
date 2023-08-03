fun main(args: Array<String>) {
    var marks = 44
    var grade = if (marks <= 40){
        "E"
    } else if (marks <=50){
        "D"
    }else if (marks <= 60){
        "C"
    }else if (marks <= 70){
        "B"
    }else{
        "A"
    }
    println(grade)

    var bettingNumber = 0
    var bettingResult = when(bettingNumber) {
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