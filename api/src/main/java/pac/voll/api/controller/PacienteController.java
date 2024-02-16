package pac.voll.api.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pac.voll.api.domain.paciente.CadastroPacienteDTO;
import pac.voll.api.domain.paciente.Paciente;
import pac.voll.api.domain.paciente.PacienteRepository;

@RestController
@RequestMapping("pacientes")
public class PacienteController {

    @Autowired
    private PacienteRepository pacienteRepository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid CadastroPacienteDTO cadastroPacienteDTO) {
        Paciente paciente = new Paciente(cadastroPacienteDTO);
        pacienteRepository.save(paciente);
    }
}