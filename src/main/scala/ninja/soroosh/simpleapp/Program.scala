package ninja.soroosh.simpleapp

import ninja.soroosh.simpleapp.dtos.{AnotherUserDTO, SimpleUserDTO}
import ninja.soroosh.simpleapp.models.{Profile, User}
import play.api.libs.json.Json


object Program extends App {

  val user = User("ali", "bakhtari", "123456")
  val profile = Profile(30)
  println(Json.toJson(SimpleUserDTO.fromUser(user)))
  println(Json.toJson(AnotherUserDTO.from(user,profile)))

}
