package guevara.demo.roboresume;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {


      //  @Autowired //initializes productRepository and connects it
        //        ProductRepository productRepository;

        @RequestMapping("/")
        public String index(Model model)
        {
            String sendToIndex = "WELCOME page (from controler)";
            model.addAttribute("message", sendToIndex);
            return "index";
        }

        @GetMapping("/addnew")
        public String addNew(Model model)
        {
            model.addAttribute("nuevo", new Robo());
            return "brandnew";
        }

   /* @PostMapping("/addproduct")
    public String addProduct(@ModelAttribute Product product){
        return "addproductconfirm";
    }*
        @RequestMapping("/showdetails")
        public String showDetails(@Valid @ModelAttribute("newentry") Robo robo , BindingResult bindingResult){
            //System.out.println(bindingResult.toString());
            if(bindingResult.hasErrors()) {
                return "brandnew";
            }
            //productRepository.save(product);
            return "showdetails";
        }

        }

*/




}
