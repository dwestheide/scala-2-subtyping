import java.nio.file.DirectoryStream.Filter
abstract class CaffeinatedBeverage {
  def caffeineContent: Int
}
final case class FilterCoffee(override val caffeineContent: Int, region: String)
    extends CaffeinatedBeverage
final case class BlackTea(override val caffeineContent: Int)
    extends CaffeinatedBeverage
final case class CuteMate(override val caffeineContent: Int)
    extends CaffeinatedBeverage

object CaffeinatedBeverage {
  // def choose(x: CaffeinatedBeverage, y: CaffeinatedBeverage): CaffeinatedBeverage =
  //   if (x.caffeineContent >= y.caffeineContent) x
  //   else y

  // def choose[A](x: A, y: A): A =
  //   if (x.caffeineContent >= y.caffeineContent) x
  //   else y

  def choose[A <: CaffeinatedBeverage](x: A, y: A): A =
    if (x.caffeineContent >= y.caffeineContent) x
    else y

  def hasMoreCaffeineContent(
      x: CaffeinatedBeverage,
      y: CaffeinatedBeverage
  ): Boolean = x.caffeineContent > y.caffeineContent

  val f: (FilterCoffee, FilterCoffee) => Boolean = hasMoreCaffeineContent

  val filterCoffees: List[FilterCoffee] = List(
    FilterCoffee(69, "Ethiopia"),
    FilterCoffee(75, "Indonesia")
  )

  val sortedCoffees = filterCoffees.sortWith(hasMoreCaffeineContent)

}
