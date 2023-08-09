package OOP

open class User1 (open var name :String,open var email :String,open var password : String){


    private var gender:String = ""
    fun setGender(gender:String){
        this.gender = gender
    }
    fun getGender():String{
        return this.gender
    }
    private var idNumber:String =""
    fun setidNumber(idNumber: String){
        this.idNumber = idNumber
    }
    fun getidNumber():String{
        return this.idNumber
    }
    fun register(){
        println("Yeah, i can register")
    }
    fun login(){
        println("Yeah, i can login")
    }
    fun  logout(){
        println("Logout nigga.")
    }
}