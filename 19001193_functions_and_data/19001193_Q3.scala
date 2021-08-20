//Index No: 19001193
class Account ( y: Int , z : Double){

    val accountNumber : Int = y
    var balance : Double = z

    def withdraw( amount : Double ) = this.balance = this.balance - amount

    def deposit ( amount : Double ) = this.balance = this.balance + amount

    def transfer( amount : Double , that : Account ): Unit = {
        this.balance =  this.balance - amount
        that.balance = that.balance + amount
    }

    override def toString() : String = {
        
        return "\n Account Number : " + this.accountNumber + "\n Balance : " + this.balance    
    }

}


    var accobj = new Account(123,1500);
    println(accobj);
