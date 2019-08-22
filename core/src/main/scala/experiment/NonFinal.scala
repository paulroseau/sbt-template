package experiment

object NonFinal {
  val a: Int = 0
  def f(i: Int): Int = i + 1
}

class MyClassNonFinal {

  val a2: Int = NonFinal.a
  def f2(i: Int): Int = NonFinal.f(i)
}
