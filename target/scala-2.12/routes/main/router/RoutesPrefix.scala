
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/User/Documents/web+mobile/WWDD1Lab10CRUD/conf/routes
// @DATE:Mon Dec 11 11:11:52 GMT 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
