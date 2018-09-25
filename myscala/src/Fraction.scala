class Fraction(var top:Int,var bot:Int) {
  def *(f:Fraction) = {
    Fraction(top * f.top , bot * f.bot)
  }
}
object Fraction{
  def apply(a:Int,b:Int)=new Fraction(a,b)

  def unapply(arg: Fraction): Option[(Int, Int)] = {
    if(arg.top==0) None else Some(arg.top,arg.bot)
  }
}
object demo1{
  def main(args: Array[String]): Unit = {
    val f1 = Fraction(1,2)
    val f2 = Fraction(1,3)
    val f3 = f1 * f2
    //将f3的分子分母抽取出来，赋值给a1,b1
    val Fraction(a1,b1) = f3
    a1
    b1
  }

}
