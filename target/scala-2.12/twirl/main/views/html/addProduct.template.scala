
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

object addProduct extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[models.Product],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(productForm: Form[models.Product]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*1.37*/("""

"""),format.raw/*4.1*/("""

"""),_display_(/*6.2*/main("Add product")/*6.21*/{_display_(Seq[Any](format.raw/*6.22*/("""
    """),format.raw/*7.5*/("""<p class="lead">Add a new product</p>
    """),_display_(/*8.6*/form(action = routes.HomeController.addProductSubmit(), 'class -> "form-horizontal", 'role -> "form")/*8.107*/{_display_(Seq[Any](format.raw/*8.108*/("""
    """),_display_(/*9.6*/CSRF/*9.10*/.formField),format.raw/*9.20*/("""


    """),_display_(/*12.6*/inputText(productForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*12.81*/("""
    """),_display_(/*13.6*/inputText(productForm("description"), '_label -> "Description", 'class -> "form-control")),format.raw/*13.95*/("""
    """),_display_(/*14.6*/select(
        productForm("category.id"),
        options(Category.options),
        '_label -> "Category", '_default -> "-- Choose a catgory --",
        '_showConstraints -> false, 'class -> "form-control"
    )),format.raw/*19.6*/("""
    """),_display_(/*20.6*/inputText(productForm("stock"), '_label -> "Stock", 'class -> "form-control")),format.raw/*20.83*/("""
    """),_display_(/*21.6*/inputText(productForm("price"), '_label -> "Price", 'class -> "form-control")),format.raw/*21.83*/("""
   
    """),_display_(/*23.6*/inputText(productForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*23.70*/("""
    
    """),format.raw/*25.5*/("""<div class="actions">
        <inpt type="submit" vale="Add/Update Product" class="btn btn-primary">
        <a href=""""),_display_(/*27.19*/routes/*27.25*/.HomeController.index(0)),format.raw/*27.49*/("""">
            <button type="button" class="btn btn-warning">Cancel</button>
        </a>
        </input>
    </div>


    """)))}),format.raw/*34.6*/("""
""")))}))
      }
    }
  }

  def render(productForm:Form[models.Product]): play.twirl.api.HtmlFormat.Appendable = apply(productForm)

  def f:((Form[models.Product]) => play.twirl.api.HtmlFormat.Appendable) = (productForm) => apply(productForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Dec 11 11:11:53 GMT 2017
                  SOURCE: C:/Users/User/Documents/web+mobile/WWDD1Lab10CRUD/app/views/addProduct.scala.html
                  HASH: 318ef82fdeb7e1d1d4905b486aae84ffa39f39ef
                  MATRIX: 967->1|1075->41|1120->36|1150->58|1180->63|1207->82|1245->83|1277->89|1346->133|1456->234|1495->235|1527->242|1539->246|1569->256|1606->267|1702->342|1735->349|1845->438|1878->445|2118->665|2151->672|2249->749|2282->756|2380->833|2418->845|2503->909|2542->921|2690->1042|2705->1048|2750->1072|2912->1204
                  LINES: 28->1|31->3|34->1|36->4|38->6|38->6|38->6|39->7|40->8|40->8|40->8|41->9|41->9|41->9|44->12|44->12|45->13|45->13|46->14|51->19|52->20|52->20|53->21|53->21|55->23|55->23|57->25|59->27|59->27|59->27|66->34
                  -- GENERATED --
              */
          