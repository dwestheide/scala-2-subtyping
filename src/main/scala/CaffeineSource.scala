// abstract class CaffeineSource[A <: CaffeinatedBeverage] {
//   def pull(): A
//   def refill(a: A): Unit = ()
// }

class CuteMateSource extends CaffeineSource[CuteMate] {
  override def pull(): CuteMate = CuteMate(85)
}

class FilterCoffeeSource extends CaffeineSource[FilterCoffee] {
  override def pull(): FilterCoffee = FilterCoffee(69, "Ethopia")
}

abstract class CaffeineSource[+A <: CaffeinatedBeverage] {
  def pull(): A
  // def refill(a: A): Unit = ()
}
