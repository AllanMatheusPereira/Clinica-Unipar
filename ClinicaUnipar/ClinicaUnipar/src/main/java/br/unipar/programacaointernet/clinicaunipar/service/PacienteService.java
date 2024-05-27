package br.unipar.programacaointernet.clinicaunipar.service;

import br.unipar.programacaointernet.clinicaunipar.model.Paciente;
import br.unipar.programacaointernet.clinicaunipar.model.Usuario;
import br.unipar.programacaointernet.clinicaunipar.repository.PacienteRepository;
import br.unipar.programacaointernet.clinicaunipar.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacienteService {

    private final PacienteRepository pacienteRepository;
    public PacienteService(PacienteRepository pacienteRepository){
        this.pacienteRepository = pacienteRepository;
    }

    public List<Paciente> getAll(){
        return this.pacienteRepository.findAll();
    }

    public Paciente save(Paciente paciente){
        return this.pacienteRepository.save(paciente);
    }
}
