package br.unipar.programacaointernet.clinicaunipar.service;

import br.unipar.programacaointernet.clinicaunipar.model.Medico;
import br.unipar.programacaointernet.clinicaunipar.model.Usuario;
import br.unipar.programacaointernet.clinicaunipar.repository.MedicoRepository;
import br.unipar.programacaointernet.clinicaunipar.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicoService {

    private final MedicoRepository medicoRepository;
    public MedicoService(MedicoRepository medicoRepository){
        this.medicoRepository = medicoRepository;
    }

    public List<Medico> getAll(){
        return this.medicoRepository.findAll();
    }

    public Medico save(Medico medico){
        return this.medicoRepository.save(medico);
    }
}
