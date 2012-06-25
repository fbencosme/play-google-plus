package controllers

import play.api._
import play.api.mvc._

object GooglePlus extends Controller {
  
//  def index = Action {
//    Ok(views.html.index("Your new application is ready."))
//  }
  
  def isInline(arg: String) = {
    "inline".equals(arg)
  }
  
}