package OOP

fun main(args: Array<String>) {
    var firstcar = Car("Prado","Toyota","ksw 234tz")
    var seconds_car = Car("Mercedes","S550","kbw465tv")
    println(firstcar.model)

    var first_fruit =  Fruit("Mango","Yellow",30.00)
    var second_fruit = Fruit("Banana","Yellow",80.00)

    var first_phone = Phone("Iphone","android","type c")
    var second_phone = Phone("Samsung","s23","Type c")
    second_phone.call("090034583457")
    first_phone.hungup()

    var first_user = User("Anthony",2022,20400088256)

    var userOne = User1("Kinuthia","","")
    userOne.register()

    var teacherOne= Teacher("Erick","123@gmail.com","ythughgh")
    teacherOne.register()

    println(userOne.name)

    userOne.setidNumber("41993218")
    println(userOne.getidNumber())
}

