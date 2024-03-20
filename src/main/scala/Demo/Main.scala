package Demo

object Main {

  def transf[T](lst:List[T]):List[T] = lst match {
    case Nil => Nil  //List()
    case x::Nil => x::Nil
    case x::xs => xs.head :: x :: transf(xs.tail)
  }

  def product(lst:List[Int]):Int = lst match {
    case Nil => 1
    case x::xs => if(x==0) 0 else x * product(xs)
  }

  def sumEl(lst:List[(Int,Int)]) : Int = {
    sumElAux(lst, it=0, acc=0)
  }

  def sumElAux(lst:List[(Int,Int)], it:Int, acc:Int ): Any = lst match {
    case Nil => acc
    case x::xs => if(it == 2 || it == 4) sumElAux(xs, it+1, acc + x._1 + x._2 ) else sumElAux(xs, it+1, acc)
  }

  def average(lst:List[Double]):Double = {
    val res = average(lst)
    res._2 / res._1
  }

  def averageAux(lst:List[Double]):(Double,Double) = lst match {
    case List() => (0, 0)
    case x::xs => {
      val res = averageAux(xs)
      ( res._1 + 1, res._2 + x)
    }
  }

  def main(args: Array[String]): Unit = {

    val x:Entry = ("sa", "saf", "asfaf")

    println(transf(List(1,2,3,4,54)))
    println(transf(List('1','2','3','4','5')))
    println(product(List(1,2,3)))
    println(sumEl((1,2),(1,2),(2,2),(1,2),(3,2),(1,2)))
    println("Hello Word")
  }



}
