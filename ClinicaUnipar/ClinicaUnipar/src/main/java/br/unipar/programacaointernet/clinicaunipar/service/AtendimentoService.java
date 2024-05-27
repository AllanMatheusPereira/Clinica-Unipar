package br.unipar.programacaointernet.clinicaunipar.service;

import br.unipar.programacaointernet.clinicaunipar.model.Atendimento;
import br.unipar.programacaointernet.clinicaunipar.model.Usuario;
import br.unipar.programacaointernet.clinicaunipar.repository.AtendimentoRepository;
import br.unipar.programacaointernet.clinicaunipar.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AtendimentoService {

    private final AtendimentoRepository atendimentoRepository;
    public AtendimentoService(AtendimentoRepository atendimentoRepository){
        this.atendimentoRepository = atendimentoRepository;
    }

    public List<Atendimento> getAll(){
        return this.atendimentoRepository.findAll();
    }

    public Atendimento save(Atendimento atendimento){
        return this.atendimentoRepository.save(atendimento);
    }
}
