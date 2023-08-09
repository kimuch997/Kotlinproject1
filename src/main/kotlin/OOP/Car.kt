package OOP

//abstratc key word you cant get an object out of that class
class Car {
    var name:String
    var model:String
    var reg_no:String
    //    SPECIAL FUNCTION CALLED EACH TIME WE CREATE AN OBJECT FROM A CLASS = CONSTRUCTOR
    constructor( name:String,model:String,reg_no:String){
        this.name = name
        this.model = model
        this.reg_no = reg_no
    }
}