import kotlin.math.sqrt

fun main(args: Array<String>) {
//    inbuit functions
    var greeting = "Hello there"
    println(greeting.uppercase())
    println(greeting.lowercase())
    println(greeting.reversed())
    println(greeting.replace(oldValue = "there", newValue = "King"))
    var number = 10.0
    println(Math.pow(number,2.0))
    println(sqrt(number))

     moto_moto()
    addtion_moto_moto(34.0,5.0f)
    avg(20.0,5,1.0f)
    sum(6,7.8)
    println( sum(6,7.8))


//    UserDefined functions
}
fun moto_moto() {
    println("Hello there")

}

fun addtion_moto_moto(x: Double,y: Float){
//    var x = 19
//    var y = 10
    var z = x + y
    println("Your answer is $z")
}

fun avg(x:Double,y:Int,z:Float){
    var average = (x+y+z) / 3.0
    println("Your answer is $average")
}
fun sum(c: Int,v : Double):Double{
    var x = c + v
    return x

}

fun userName (FirstName:String,Lastname:String):String{
    var fullname = "$FirstName $Lastname"
    return fullname
}
