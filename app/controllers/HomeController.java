package controllers;

import play.mvc.*;
import play.api.Environment;
import play.data.*;
import play.db.ebean.Transactional;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import models.*;
import views.html.*;


/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

private FormFactory formFactory;

@Inject
public HomeController(FormFactory f){
    this.formFactory = f;
}


    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index(Long cat) {
        List<Product> productList = null;
       
        List<Category> categoryList = Category.findAll();
        if (cat == 0){
            productList = Product.findAll();
        }
        else{
            productList = Category.find.ref(cat).getProducts();        
            }
    
        return ok(index.render(productList, categoryList));
    }


    public Result addProduct(){
        Form<Product> productForm = formFactory.form(Product.class);
        return ok(addProduct.render(productForm));
    }

    public Result addProductSubmit(){
        Form<Product> newProductForm = formFactory.form(Product.class).bindFormRequest();
        
        if(newProductForm.hasErrors()){
            return badRequest(addProduct.render(newProductForm));
        }
        else{
            Product newProduct = newProductForm.get();
            newProduct.save();        
            flash("success","Product " + newProduct.getName() + " was added");
            return redirect(controllers.routes.HomeController.index(0));
            }

        Product newProduct = newProductForm.get();

        if(newProduct.getId()== null){
            newProduct.save();
        }
        else if (newProduct.getId() != null){
            newProduct.update();
        }    

    }

    public Result deleteProduct(Long id){
        Product.find.ref(id).delete();
        flash("success", "Product has been deleted");
        return redirect(routes.HomeController.index(0));
    }

    @Transactional
    public Result updateProduct(Long id){
        Product p;
        Form<Product> productForm;
        try{
            p = Product.find.byId(id);
            productForm = formFactory.form(Product.class).fill(p);
        }
        catch(Exception ex){
            return badRequest("error");
        }
        return ok(addProduct.render(productForm));
    }
}
