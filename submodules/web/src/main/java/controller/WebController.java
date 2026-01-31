package controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping("/")
    public String index() {
        return "redirect:/public";
    }

    @GetMapping("/public")
    public String indexPublic() {
        return "public";
    }

    @GetMapping("private")
    public String indexPrivate() {
        return "private";
    }

    @GetMapping("/secret")
    @Secured("ROLE_ADMIN")
    public String indexSecret() {
        return "secret";
    }



}
