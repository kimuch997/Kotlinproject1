package OOP

class Hod (name:String,email:String,password:String):Teacher(name,email,password){
    fun SuspendTeacher(){
        println("I can suspend teacher")
    }
    fun scheduleMeeting(){
        println("I can schedule a meeting")
    }
}