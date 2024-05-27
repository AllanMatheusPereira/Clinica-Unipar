package br.unipar.programacaointernet.clinicaunipar.controller;

import br.unipar.programacaointernet.clinicaunipar.model.Medico;
import br.unipar.programacaointernet.clinicaunipar.model.Usuario;
import br.unipar.programacaointernet.clinicaunipar.service.MedicoService;
import br.unipar.programacaointernet.clinicaunipar.service.UsuarioService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class MedicoWebController {

    private final MedicoService medicoService;

    public MedicoWebController(MedicoService medicoService){
        this.medicoService = medicoService;
    }

    @GetMapping("/medicos")
    public String getAllMedico(Model model){
        List<Medico> medicos = medicoService.getAll();
        model.addAttribute("medicos", medicos);
        return "medicos";
    }

    @PostMapping(path = "/medicos/save")
    public String saveMedico(Medico medico){
        medicoService.save(medico);
        return "redirect:/medicos";
    }
}
