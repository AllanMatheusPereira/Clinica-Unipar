package br.unipar.programacaointernet.clinicaunipar.controller;

import br.unipar.programacaointernet.clinicaunipar.model.Paciente;
import br.unipar.programacaointernet.clinicaunipar.service.PacienteService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class PacienteWebController {

    private final PacienteService pacienteService;

    public PacienteWebController(PacienteService pacienteService){
        this.pacienteService = pacienteService;
    }

    @GetMapping("/pacientes")
    public String getAllPaciente(Model model){
        List<Paciente> pacientes = pacienteService.getAll();
        model.addAttribute("pacientes", pacientes);
        return "pacientes";
    }

    @PostMapping(path = "/pacientes/save")
    public String savePaciente(Paciente paciente){
        pacienteService.save(paciente);
        return "redirect:/pacientes";
    }
}
