sealed abstract class User extends Product with Serializable
object User {
  final case class Authenticated(id: Long, name: String) extends User
  final case class Anonymous(sessionId: String) extends User

  def authenticated(id: Long, name: String): User =
    Authenticated(id, name)
  def anonymous(sessionId: String): User = Anonymous(sessionId)
}
