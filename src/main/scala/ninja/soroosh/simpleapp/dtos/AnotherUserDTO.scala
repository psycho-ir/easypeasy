package ninja.soroosh.simpleapp.dtos

import ninja.soroosh.simpleapp.models.{Profile, User}
import play.api.libs.json.Json

case class AnotherUserDTO(name: String, profile: Profile)

object AnotherUserDTO {
  implicit val profileFormat = Json.format[Profile]
  implicit val anotherUserFormat = Json.format[AnotherUserDTO]
  def from(user: User, profile: Profile) = AnotherUserDTO(user.name, profile)
}
