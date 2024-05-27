package br.unipar.programacaointernet.clinicaunipar.controller;

import br.unipar.programacaointernet.clinicaunipar.model.Atendimento;
import br.unipar.programacaointernet.clinicaunipar.service.AtendimentoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Tag(name = "Atendimentos API", description = "API para gerenciamento de atendimentos")
public class AtendimentoApiController {

    private final AtendimentoService atendimentoService;

    public AtendimentoApiController(AtendimentoService atendimentoService){
        this.atendimentoService = atendimentoService;
    }

    @GetMapping(path = "/api/atendimentos")
    @Operation(summary = "Obter todos os atendimentos", description = "Este metódo é responsável por retornar uma lista dos atendimentos")
    public ResponseEntity<List<Atendimento>> getAll(){
        return ResponseEntity.ok(this.atendimentoService.getAll());
    }

    @PostMapping(path = "/api/atendimentos")
    @Operation(summary = "Salvar atendimento", description = "Salvar os atendimentos")
    public ResponseEntity<Atendimento> save(@RequestBody Atendimento atendimento){
        return ResponseEntity.ok(this.atendimentoService.save(atendimento));
    }
}
