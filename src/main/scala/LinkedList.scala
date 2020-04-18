// sealed trait LinkedList[+A] {
//   // def prepend(a: A): LinkedList[A] = LinkedList.Element(a, this)
// }
// object LinkedList {
//   final case class Element[+A](head: A, tail: LinkedList[A])
//       extends LinkedList[A]
//   final case class Empty[+A]() extends LinkedList[A]
//   def empty[A]: LinkedList[A] = Empty()
// }

sealed trait LinkedList[A] {
  def ::(a: A): LinkedList[A] = LinkedList.::(a, this)
}
object LinkedList {
  final case class ::[A](head: A, tail: LinkedList[A])
      extends LinkedList[A]
  final case class Nil[A]() extends LinkedList[A]
}
