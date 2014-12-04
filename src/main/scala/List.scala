/**
 * Created by User on 03/12/2014.
 */

sealed trait List[+A]
case object Nil extends List[Nothing]
case class Cons[+A](head: A, tail:List[A]) extends List[A]


object List {

  def tail[A](ints: List[A])= {
    ints match {
    case Nil => Nil
    case Cons(h, t) => t
    }
  }

  def setHead(head:Int,ints:List[Int])={
    ints match {
    case Nil => Cons(head,Nil)
    case Cons(h, t) => Cons(head, t)
    }
  }

  def sum(ints: List[Int]):Int= ints match {
    case Nil => 0
    case Cons(x,xs)=>x+sum(xs)
  }

  def product(ds: List[Double]):Double=ds match {
    case Nil => 0.1
    case Cons(0.0,_)=>0.0
    case Cons(x,xs)=>x*product(xs)
  }

  def drop[A](l: List[A], n:Int):List[A]= n match {
    case 0 => l
    case _ => drop(tail(l), n - 1)
  }


  def dropWhile[A](l:List[A], f:A=>Boolean):List[A]= {
    l match {

      case Cons(h,t) if f(h) => dropWhile(t,f)
      case _ =>l
    }


  }

  def apply[A](as: A*): List[A]={
    if (as.isEmpty) Nil
    else Cons(as.head, apply(as.tail: _*))
  }
}
