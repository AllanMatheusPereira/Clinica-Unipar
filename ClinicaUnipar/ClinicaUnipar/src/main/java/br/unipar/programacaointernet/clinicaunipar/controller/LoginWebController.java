package br.unipar.programacaointernet.clinicaunipar.controller;

import br.unipar.programacaointernet.clinicaunipar.model.Usuario;
import br.unipar.programacaointernet.clinicaunipar.service.UsuarioService;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class LoginWebController {

    private final UsuarioService usuarioService;

    public LoginWebController(UsuarioService usuarioService) {this.usuarioService = usuarioService;
    }

    @GetMapping("/login")
    public String loginForm(){
        return "login";
    }
    @GetMapping("/hello-world")
    public String helloWorld(@RequestParam(value = "name", defaultValue = "world")String name){
        return "Hello" + name + "!";
    }

    @GetMapping("/bemVindo")
    public String bemVindo(){
        return "bemvindo";
    }

    @PostMapping("/login")
    public String login(@RequestParam("username") String username, @RequestParam ("password") String password,
                        HttpSession session, Model model) {

        Usuario usuario = usuarioService.validarUsuario(username, password);
        if(usuario != null) {
            //se nosso usuario tiver válido
            session.setAttribute("usuarioLogado", username);
            return "redirect:/bemvindo";
        } else {
            model.addAttribute("erro",
                    "Usuário ou senha inválidos");
            return "login";
        }
    }
}
