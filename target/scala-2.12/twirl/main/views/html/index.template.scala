
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[models.Product],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(products: List[models.Product]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.34*/("""

"""),_display_(/*3.2*/main("Products Page")/*3.23*/ {_display_(Seq[Any](format.raw/*3.25*/("""
  
  """),format.raw/*5.3*/("""<p class="lead">Product Catalogue</p>
  """),_display_(/*6.4*/if(flash.containsKey("success"))/*6.36*/{_display_(Seq[Any](format.raw/*6.37*/("""
    """),format.raw/*7.5*/("""<div class ="alert alert-success">
      """),_display_(/*8.8*/flash/*8.13*/.get("sucess")),format.raw/*8.27*/("""
    """),format.raw/*9.5*/("""</div>
  """)))}),format.raw/*10.4*/("""


  """),format.raw/*13.3*/("""<table class="table table-bordered table-hover table-condensed">
  
  <thead>
  
  <!-- The header row-->
  
  <tr>
  
  <th>ID</th>
  
  <th>Name</th>
  
  <th>Description</th>
  
  <th>Category</th>
  
  <th>Stock</th>
  
  <th>Price</th>
  
  </tr>
  
  </thead>
  
  <tbody>
  
  <!-- Product row(s) -->
  """),_display_(/*40.4*/for(p<-products) yield /*40.20*/{_display_(Seq[Any](format.raw/*40.21*/("""
  """),format.raw/*41.3*/("""<tr>
  
  <td>"""),_display_(/*43.8*/p/*43.9*/.getId),format.raw/*43.15*/("""</td>
  <td>"""),_display_(/*44.8*/p/*44.9*/.getName),format.raw/*44.17*/("""</td>
  <td>"""),_display_(/*45.8*/p/*45.9*/.getDescription),format.raw/*45.24*/("""</td>
  <td>"""),_display_(/*46.8*/p/*46.9*/.getCategory),format.raw/*46.21*/("""</td>
  <td>"""),_display_(/*47.8*/p/*47.9*/.getStock),format.raw/*47.18*/("""</td>
  <td>&euro;"""),_display_(/*48.14*/("%.2f".format(p.getPrice))),format.raw/*48.41*/("""</td>
  <td>
    <a href=""""),_display_(/*50.15*/routes/*50.21*/.HomeController.deleteProduct(p.getId)),format.raw/*50.59*/("""" class="btn-xs btn-danger" onclick="return confimDel();">
      <span class="glyphicon glyphicon-trash"></span>
    </a>
  </td>
  </tr>
""")))}),format.raw/*55.2*/(""" 
  """),format.raw/*56.3*/("""</tbody>
  
  </table>
  
  <p>
    <a href=""""),_display_(/*61.15*/routes/*61.21*/.HomeController.addProduct()),format.raw/*61.49*/("""">
      <button class="btn btn-primary">Add a product</button>
    </a>
  </p>
  """)))}),format.raw/*65.4*/("""
"""))
      }
    }
  }

  def render(products:List[models.Product]): play.twirl.api.HtmlFormat.Appendable = apply(products)

  def f:((List[models.Product]) => play.twirl.api.HtmlFormat.Appendable) = (products) => apply(products)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Dec 10 21:05:39 GMT 2017
                  SOURCE: C:/Users/User/Documents/web+mobile/WWDD1Lab8CRUD/app/views/index.scala.html
                  HASH: 76f26e8613c11337d594905b5a50c9f705a5b616
                  MATRIX: 962->1|1089->33|1117->36|1146->57|1185->59|1217->65|1283->106|1323->138|1361->139|1392->144|1459->186|1472->191|1506->205|1537->210|1577->220|1609->225|1946->536|1978->552|2017->553|2047->556|2088->571|2097->572|2124->578|2163->591|2172->592|2201->600|2240->613|2249->614|2285->629|2324->642|2333->643|2366->655|2405->668|2414->669|2444->678|2490->697|2538->724|2592->751|2607->757|2666->795|2835->934|2866->938|2939->984|2954->990|3003->1018|3116->1101
                  LINES: 28->1|33->1|35->3|35->3|35->3|37->5|38->6|38->6|38->6|39->7|40->8|40->8|40->8|41->9|42->10|45->13|72->40|72->40|72->40|73->41|75->43|75->43|75->43|76->44|76->44|76->44|77->45|77->45|77->45|78->46|78->46|78->46|79->47|79->47|79->47|80->48|80->48|82->50|82->50|82->50|87->55|88->56|93->61|93->61|93->61|97->65
                  -- GENERATED --
              */
          