package br.unipar.programacaointernet.clinicaunipar.repository;

import br.unipar.programacaointernet.clinicaunipar.model.Medico;
import br.unipar.programacaointernet.clinicaunipar.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicoRepository extends JpaRepository<Medico, Integer> {


}
