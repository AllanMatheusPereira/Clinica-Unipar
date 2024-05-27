package br.unipar.programacaointernet.clinicaunipar.controller;

import br.unipar.programacaointernet.clinicaunipar.model.Paciente;
import br.unipar.programacaointernet.clinicaunipar.service.PacienteService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Tag(name = "Pacientes API", description = "API para gerenciamento de pacientes")
public class PacienteApiController {

    private final PacienteService pacienteService;

    public PacienteApiController(PacienteService pacienteService){
        this.pacienteService = pacienteService;
    }

    @GetMapping(path = "/api/pacientes")
    @Operation(summary = "Obter todos os pacientes",description = "Este metódo é responsável por listar os pacientes.")
    public ResponseEntity<List<Paciente>> getAll(){
        return ResponseEntity.ok(this.pacienteService.getAll());
    }

    @PostMapping(path = "/api/pacientes")
    @Operation(description = "Este metódo é responsável por salvar os pacientes")
    public ResponseEntity<Paciente>save(@RequestBody Paciente paciente){
        return ResponseEntity.ok(this.pacienteService.save(paciente));
    }
}
