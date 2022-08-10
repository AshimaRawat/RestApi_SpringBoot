package CoolBlueAssignment.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import CoolBlueAssignment.Models.User;
import CoolBlueAssignment.Repo.UserRepo;

@RestController
public class ApiController {
    private UserRepo ur;
    @RequestMapping("/Products")
    public List<User> getProducts()
        {
            return ur.findAll();
           
        }
        @RequestMapping("{/product_id}")
        public 





        @Autowired
    private ProductService productService;
   
    @RequestMapping("/Products")
    public List<Products> getProductDetails()
    {
        return productService.getProducts();
    }

    @RequestMapping("/{product_id}")
    public Products getProducts(@PathVariable String product_id)
    {
        return ProductService.getProducts(product_id);

    }
    }




    