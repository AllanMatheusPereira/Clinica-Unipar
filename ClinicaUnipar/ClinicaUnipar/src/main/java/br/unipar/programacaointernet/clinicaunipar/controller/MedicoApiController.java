package br.unipar.programacaointernet.clinicaunipar.controller;

import br.unipar.programacaointernet.clinicaunipar.model.Medico;
import br.unipar.programacaointernet.clinicaunipar.model.Usuario;
import br.unipar.programacaointernet.clinicaunipar.service.MedicoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Tag(name = "Médicos API", description = "API para gerenciamento de médicos")
public class MedicoApiController {

    private final MedicoService medicoService;

    public MedicoApiController(MedicoService medicoService){
        this.medicoService = medicoService;
    }

    @GetMapping(path = "/api/medicos")
    @Operation(summary = "Obter todos os médicos", description = "Este metódo é responsável por listar os medicos")
    public ResponseEntity<List<Medico>> getAll(){
        return ResponseEntity.ok(this.medicoService.getAll());
    }

    @PostMapping(path = "/api/medicos")
    @Operation(summary = "Salvar cadastro do médico", description = "Este metódo é responsável por salvar os medicos")
    public ResponseEntity<Medico>save(@RequestBody Medico medico){
        return ResponseEntity.ok(this.medicoService.save(medico));
    }
}
