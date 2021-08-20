//Index No: 19001193

object Bank{
    def main(args:Array[String]):Unit = {

        val accobj1 = new Account("24", 1, 2500)
        val accobj2 = new Account("51", 2, -1650)
        val accobj3 = new Account("78", 3, 25000)
        val accobj4 = new Account("89", 4, 8400)
        val accobj5 = new Account("54", 5, -27000)
        val accobj6 = new Account("18", 6, 5300)

        var bank:List[Account] = List(accobj1, accobj2, accobj3, accobj4, accobj5, accobj6)

        println("*** [Overdraft Account List] ***")
        overdraft(bank).foreach(i => println(i))
        println()

        println("\nSum of All Accounts: Rs. " + Total_balance(bank))
        println()

        println("Sum of All Accounts after adding interest: Rs " + Total_balance(Total_interest(bank)))
        println()
    }

    val overdraft = (b:List[Account]) => b.filter(x => x.balance < 0)

    val Total_balance = (b:List[Account]) => b.reduce((x, y) => new Account("", 0, x.balance + y.balance)).balance

    val Total_interest = (b:List[Account]) => b.map(x => if(x.balance >=0) new Account(x.nic, x.acc_no, x.balance + x.balance * 0.005) else new Account(x.nic, x.acc_no, x.balance + x.balance * 0.01))
}


class Account(id:String, n:Int, b:Double){
  val nic:String = id
  val acc_no:Int = n
  var balance:Double = b

  def withdraw(a:Double) = this.balance = this.balance - a

  def deposit(a:Double) = this.balance = this.balance + a

  def transfer(a:Account, b:Double):Unit = {
    this.withdraw(b)
    a.deposit(b)
  }

  override def toString = "[" + this.nic + ":" + this.acc_no + ":" + this.balance + "]"
}

