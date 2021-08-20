//Index No: 19001193
class Account ( x: Int , y : Double){

    val account_Number : Int = x
    var balance : Double = y

    def withdraw( value : Double ) = this.balance = this.balance - value

    def deposit ( value : Double ) = this.balance = this.balance + value

//transfer function
    def transfer( value : Double , that : Account ): Unit = {
        this.balance =  this.balance - value
        that.balance = that.balance + value
    }

    override def toString() : String = {
        
        return "\n Account Number: " + this.account_Number + "\n Balance: " + this.balance    
    }

}


    var accobj = new Account(123,1500);
    println(accobj);
