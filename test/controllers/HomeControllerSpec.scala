package com.harachin.controllers

import org.scalatestplus.play._
import org.scalatestplus.play.guice._
import play.api.test._
import play.api.test.Helpers._
import play.api.libs.json.Json
import com.harachin.controllers.HomeController
import play.test.WithApplication
import play.inject.guice.GuiceApplicationBuilder

class HomeControllerSpec extends PlaySpec with GuiceOneAppPerTest with Injecting {

  "a root" when {
    "called nomally" should {
      "be return JSON with data and errors" in {
        val controller = new HomeController(stubControllerComponents())
        val result = controller.root().apply(FakeRequest(GET, "/"))

        status(result) mustBe OK
        contentType(result) mustBe Some("application/json")
        contentAsJson(result) mustBe Json.obj(
          "data" -> Json.obj("message" -> "Welcome to Learning Play Framework with Scala application."), 
          "errors" -> Json.arr()
        )
      }
    }
  }
}
