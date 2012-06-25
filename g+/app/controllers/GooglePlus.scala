package controllers

import play.api.mvc._

/**
 * @version 1.0
 * @author Fausto Bencosme
 */
object GooglePlus extends Controller {
  
  def isInline(arg: String) = {
    "inline".equals(arg)
  }
  
}