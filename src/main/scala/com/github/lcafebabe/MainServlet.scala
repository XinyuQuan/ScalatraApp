package com.github.lcafebabe

import org.scalatra._

class MainServlet extends ScalatraServlet {

  get("/") {
    views.html.hello()
  }

}
