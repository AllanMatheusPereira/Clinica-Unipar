package br.unipar.programacaointernet.clinicaunipar.service;

import br.unipar.programacaointernet.clinicaunipar.model.Usuario;
import br.unipar.programacaointernet.clinicaunipar.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;
    public UsuarioService(UsuarioRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository;
    }

    public List<Usuario>getAll(){
        return this.usuarioRepository.findAll();
    }

    public Usuario save(Usuario usuario){
        return this.usuarioRepository.save(usuario);
    }

    public Usuario validarUsuario(String login, String senha) {
        return this.usuarioRepository.findByLoginAndSenha(login, senha);
    }
}
