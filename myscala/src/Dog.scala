class Dog(var name:String,var age :Int) {

}
object Dog{
  def apply(n:String,age:Int)=new Dog(n,age)
}
class Jing8(var n:String,var a:Int,var color:String) extends Dog(n,a){

}
