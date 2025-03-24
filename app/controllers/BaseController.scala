package com.harachin.controllers

import play.api.mvc.BaseController as PlayBaseController
import play.api.mvc.ControllerComponents
import play.api.mvc.Result
import play.api.libs.json._

trait BaseController extends PlayBaseController {
  /**
    * Format the response in JSON format like:
    * ```json
    * {
    *   "data": {},
    *   "errors" : []
    * }
    * ```
    * 
    * @param data JsObject
    * @param errors List[String]
    * @return JsObject
    */
  def formatAsJson(data: JsObject, errors: List[String] = List()): JsObject = {
    Json.obj("data" -> data, "errors" -> errors)
  }
}
