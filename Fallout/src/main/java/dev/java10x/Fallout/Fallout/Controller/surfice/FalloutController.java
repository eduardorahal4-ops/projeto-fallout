package dev.java10x.Fallout.Fallout.Controller.surfice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping
public class FalloutController {
    @GetMapping("/boasvindas")
    public String boasvindas() {
        return "Essa é a minha primeira mensagem nessa rota";
    }
}
