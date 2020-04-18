final case class Deliverable(description: String)

class Programmer[-A <: CaffeinatedBeverage] {
  def transform(caffeine: A, feature: String): Deliverable =
    Deliverable(feature)
}
