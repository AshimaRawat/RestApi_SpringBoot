package CoolBlueAssignment.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import CoolBlueAssignment.Repo.UserRepo;

@RestController
public class ApiController {
    private UserRepo ur;
    @RequestMapping("/Products")
    public String getProducts()
        {
            ur.findAll();
        }
    }



    