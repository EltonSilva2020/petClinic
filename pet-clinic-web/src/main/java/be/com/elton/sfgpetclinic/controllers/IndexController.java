package be.com.elton.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("/Owners")
public class IndexController {

    @RequestMapping("/oups")
    public String findOups() {

        return "notimplemented";
    }
}
