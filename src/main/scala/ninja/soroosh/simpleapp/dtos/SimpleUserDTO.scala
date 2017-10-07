package ninja.soroosh.simpleapp.dtos

import ninja.soroosh.simpleapp.models.User
import play.api.libs.json.Json

case class SimpleUserDTO(name: String, password: String)

object SimpleUserDTO {
  implicit val simpleUserFormat = Json.format[SimpleUserDTO]

  def fromUser(user: User) = SimpleUserDTO(user.name, user.lastName)
}
