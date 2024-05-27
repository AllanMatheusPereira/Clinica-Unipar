package br.unipar.programacaointernet.clinicaunipar.controller;

import br.unipar.programacaointernet.clinicaunipar.model.Atendimento;
import br.unipar.programacaointernet.clinicaunipar.model.Usuario;
import br.unipar.programacaointernet.clinicaunipar.service.AtendimentoService;
import br.unipar.programacaointernet.clinicaunipar.service.UsuarioService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class AtendimentoWebController {

    private final AtendimentoService atendimentoService;

    public AtendimentoWebController(AtendimentoService atendimentoService){
        this.atendimentoService = atendimentoService;
    }

    @GetMapping("/atendimentos")
    public String getAllAtendimento(Model model){
        List<Atendimento> atendimentos = atendimentoService.getAll();
        model.addAttribute("atendimentos", atendimentos);
        return "atendimentos";
    }

    @PostMapping(path = "/atendimentos/save")
    public String saveAtendimento(Atendimento atendimento){
        atendimentoService.save(atendimento);
        return "redirect:/atendimentos";
    }
}
