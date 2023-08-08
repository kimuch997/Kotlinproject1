package OOP

class Phone{
    var name:String
    var os :String
    var charger: String

    constructor(name: String, os: String, charger: String) {
        this.name = name
        this.os = os
        this.charger = charger
    }
    fun call(phone_number:String){
        println("I can call using the phone number $phone_number")
    }
    fun hungup(){
        println("Yeah izzah bro")
    }
}