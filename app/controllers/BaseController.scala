package com.harachin.controllers

import play.api.libs.json.{JsObject, Json}
import play.api.mvc.BaseController as PlayBaseController

trait BaseController extends PlayBaseController {

  /** Format the response in JSON format like:
    * ```json
    * {
    *   "data": {},
    *   "errors" : []
    * }
    * ```
    *
    * @param data
    * @param errors
    * @return
    */
  def formatAsJson(
    data: JsObject,
    errors: List[String] = List()
  ): JsObject = {
    Json.obj("data" -> data, "errors" -> errors)
  }
}
