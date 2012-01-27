package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {

  def index = Action {
    list()
  }

  def list = Action { request =>
    //live stream list 
    Ok("list")
  }

  def initPrez = Action { request =>
    //announced Prez
    Ok("initPrez")
  }

  def broadCast = Action { request =>
    //To the clients 
    Ok("broadCast")
  }

  def listen = Action { request =>
    //Client content fetching 
    Ok("listen")
  }

  def startPrez = Action { request =>
    //Push state to the client 
    Ok("startPrez")
  }

  def stopPrez = Action { request =>
    //Push state to the client and archive 
    Ok("stopPrez")
  }

  def view = Action{ request => 
    Ok("ok...")    
  }
}
