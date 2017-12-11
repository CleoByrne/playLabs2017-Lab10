
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html lang="en">

<head>

<meta charset="utf-8">

<title>Online Shop - """),_display_(/*11.23*/title),format.raw/*11.28*/("""</title>

<!-- Bootstrap Core CSS -->

<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.css" rel="stylesheet" />

<!-- Custom CSS --> <link href=""""),_display_(/*17.34*/routes/*17.40*/.Assets.versioned("stylesheets/main.css")),format.raw/*17.81*/("""" rel="stylesheet" />

</head>

<body>

<nav class="navbar navbar-inverse">

<div class="container-fluid">

<div class="navbar-header">

<a class="navbar-brand" href="#">Online Shop</a>

</div>

<ul class="nav navbar-nav">

<li class="active"><a href="#">About</a></li>

<li><a href="#">Services</a></li>

<li><a href="#">Contact</a></li>

</ul>

</div>

</nav>

<container>

<div class="row">

<div class="col-md-12">

"""),_display_(/*53.2*/content),format.raw/*53.9*/("""

"""),format.raw/*55.1*/("""</div>

</div>

</container>

<container>

<div class="row">

<div class="col-md-12">

Copyright <strong>Online Shop</strong>

</div>

</div>

</container>
<script src=""""),_display_(/*74.15*/routes/*74.21*/.Assets.versioned("javascripts/main.js")),format.raw/*74.61*/(""""></script>
</body>

</html>"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Dec 10 21:05:39 GMT 2017
                  SOURCE: C:/Users/User/Documents/web+mobile/WWDD1Lab8CRUD/app/views/main.scala.html
                  HASH: 4f0a3f166c843da63f2c357c1bb05c7bfca8673e
                  MATRIX: 952->1|1077->31|1105->33|1221->122|1247->127|1446->299|1461->305|1523->346|1970->767|1997->774|2026->776|2223->946|2238->952|2299->992
                  LINES: 28->1|33->1|35->3|43->11|43->11|49->17|49->17|49->17|85->53|85->53|87->55|106->74|106->74|106->74
                  -- GENERATED --
              */
          