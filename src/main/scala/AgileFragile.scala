object AgileFragile {
  val caffeineSource: CaffeineSource[CaffeinatedBeverage] = new FilterCoffeeSource
  val f: Function0[String]                                = ???
  val xs: List[String] = Nil
  val ys = xs.prepended("fo")
}
