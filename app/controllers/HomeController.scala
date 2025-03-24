package com.harachin.controllers

import javax.inject._
import play.api.mvc._
import play.api.libs.json.Json
import com.harachin.controllers.BaseController

@Singleton
class HomeController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {

  def root() = Action { implicit request: Request[AnyContent] =>
    Ok(formatAsJson(Json.obj("message" -> "Welcome to Learning Play Framework with Scala application.")))
  }
}
