package com.harachin.controllers

import javax.inject.{Inject, Singleton}
import play.api.libs.json.Json
import play.api.mvc.{AnyContent, ControllerComponents, Request}

@Singleton
class HomeController @Inject() (val controllerComponents: ControllerComponents) extends BaseController {

  def root() = Action { implicit request: Request[AnyContent] =>
    Ok(formatAsJson(Json.obj("message" -> "Welcome to Learning Play Framework with Scala application.")))
  }
}
