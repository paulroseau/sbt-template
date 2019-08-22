package experiment

object Final {
  final val a: Int = 0
  final def f(i: Int): Int = i + 1
}

class MyClassFinal {

  val a2: Int = Final.a
  def f2(i: Int): Int = Final.f(i)
}

final object Final2 {
  val a: Int = 0
  def f(i: Int): Int = i + 1
}

