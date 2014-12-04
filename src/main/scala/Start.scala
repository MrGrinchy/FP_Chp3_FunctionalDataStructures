/**
 * Created by User on 03/12/2014.
 */
object Start {
  def main(args: Array[String]) {
    val ex1:List[Double]=Nil
    val ex2:List[Int]=Cons(1,Nil)
    val ex3:Cons[String] =Cons("a",Cons("b",Nil))

    val sumCons=Cons(1,Cons(2,Cons(3,Cons(4,Nil))))
    val productCons=Cons(1.1,(Cons(2.2,Cons(3.3,Cons(4.3,Nil)))))

    println(List.sum(sumCons))
    println(List.product(productCons))

    //Pattern Matching
    println(List(1,2,3) match {
      case _=> 42
    }
    )
    println(List(14,2,3) match {
      case Cons(14,Cons(2,Nil))=> "FOUND"
      case _=>"Nothing"
    }
      )

    println(List(1,2,3) match {
      case Cons(_,t)=> t
    }
    )

    println(List(1,2,3) match {
      case Nil=> 42
      case _=>"SOMETHIGN"
    }
    )
    val x=List(1,2,3,4,5) match{
      case Cons(x,Cons(y,_))=> (x+y)*10
      case Cons(x,Cons(2,Cons(4,_)))=>x
      case Nil => 42
      case Cons(x,Cons(y,Cons(3,Cons(4,_))))=>x+y
      case Cons(h,t)=>h+List.sum(t)
      case _ =>101
    }
    println(x)
  println("TAIL")
    println(List.tail(List(1,2,3)))
    println(List.tail(List(1,2)))
    println(List.tail(List(1)))
    println(List.tail(Nil))
println("Set HEAD")
    println(List.setHead(100,List(1,2,3)))
    println(List.setHead(200,List(1,2)))
    println(List.setHead(300,List(1)))
    println(List.setHead(400,Nil))
    println(List.setHead(400,Nil))
    println("Drop")
    println(List.drop(List(1,2,3,4,5,6,7,8),4))
    println(List.drop(List(1,2),1))
    println(List.drop(List(1),100))
    println(List.drop(Nil,200))

    def eval(i:Int)={
      i<4
    }
    println("DropWhile")
    println("TEST"+List.dropWhile(List(1,2,3,4,5,6,7,8),eval))

  }


}
