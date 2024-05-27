package br.unipar.programacaointernet.clinicaunipar.repository;

import br.unipar.programacaointernet.clinicaunipar.model.Atendimento;
import br.unipar.programacaointernet.clinicaunipar.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AtendimentoRepository extends JpaRepository<Atendimento, Integer> {


}
