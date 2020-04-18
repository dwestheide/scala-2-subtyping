object Startupr {
  def deliver(
      feature: String,
      programmer: Programmer[CuteMate],
      caffeineSource: CaffeineSource[CuteMate]
  ): Deliverable = programmer.transform(caffeineSource.pull(), feature)

  val cto                                      = new Programmer[CaffeinatedBeverage]
  val caffeineSource: CaffeineSource[CuteMate] = new CuteMateSource

  def main(args: Array[String]): Unit =
    deliver("emojis", cto, caffeineSource)
}
