package br.com.fiap.showFiap.show;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShowController {

    private final ShowService showService;

    public ShowController(ShowService showService) {
        this.showService = showService;
    }

    @GetMapping
    public String index(Model model){
        var shows = showService.findAll();
        model.addAttribute("shows", shows);
        return "index";
    }

}
