//Index No: 19001193
object FunctionNData extends App{

    val r1 = new Rational(3,4)
    println(r1.neg)

}

class Rational(x:Int, y:Int){
    require(y>0, "y must be greater than 0")

    def numer = x/gcd(x,y)
    def denom = y/gcd(x,y)
    def this(x:Int)=this(x,1)

    private def gcd(a:Int,b:Int): Int = if(b==0) a else gcd(b,a%b)
    def +(r:Rational) = new Rational(this.numer *r.denom +r.numer * this.denom, denom * r.denom)

    def neg= new Rational(-this.numer, this.denom)
    def -(r:Rational) = this+r.neg

    override def toString = numer+ "/"+denom
}
