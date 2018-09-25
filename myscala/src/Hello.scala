import java.io.{ByteArrayOutputStream, File, FileInputStream}

import scala.collection.mutable
import scala.io.Source.fromFile

object Hello {
  def main(args: Array[String]): Unit = {
//    println("hello word")
    Array.apply(1,2,3)//自动调 apply方法
    val d0 =new  Dog("tom",12)
    val d1=Dog("tom",12) //自动调 apply方法
    val d2=Dog.apply("tom",12)//apply方法定义在object中，为了快速构造对象.
    val d3=new Jing8(" a",12,"b")
////    val x:Int=null//wrong
//    val it= fromFile("D:/mysample/1.txt").getLines()
//    for(x<-it){
//      println(x)
//    }

    val m=mutable.HashMap[String,Int]("tom0"->100,"tom1"->200)
    m("tom0")=300
    m
//            val f = new File("D:/mysample/1.txt")
//            val fis = new FileInputStream(f)
//            val baos = new ByteArrayOutputStream()
//            val buf = new Array[Byte](f.length().toInt)
//            fis.read(buf)
//            fis.close()
//            fis.close()
//            baos.close()
//            println(new String(buf))

//    def op(f:(Int,Int)=>Int,a:Int,b:Int)=f(a,b)
////    def add(a:Int,b:Int)=a+b
////    var c=op(add _,1,2) //下划线表示调用函数
////    println(c)
//    var c=op((a:Int,b:Int)=>a+b,1,2)//匿名函数
//    println(c)

    //y = ax + b
    def fline(f1:(Int,Int)=>Int,a:Int,b:Int,f2:(Int,Int)=>Int,c:Int,d:Int)={
      var x=f1(a,b)
      var y=f2(a,b)
      def fff(xxx:Int)={x*xxx+y}
      fff _
    }
    var c=fline((a:Int,b:Int)=>a+b,1,2,(a:Int,b:Int)=>a-b,1,2)(5)
    println(c)

    var list=mutable.LinkedList(-1,-2,3)
    while (list!=Nil){
      if(list.elem<0) list.elem=0
      println(list.elem)
      list=list.next
    }







  }


}
