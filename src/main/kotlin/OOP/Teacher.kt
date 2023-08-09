package OOP

open class Teacher(name:String,email:String,password:String):User1(name, email, password) {
    fun submitResults(){
        println("Yeah i can submit results")
    }
    fun checkAttendance(){
        println("Yeah i can check the class attendance.")
    }
}