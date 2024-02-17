package pac.voll.api.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pac.voll.api.domain.paciente.AtualizacaoPacienteDTO;
import pac.voll.api.domain.paciente.CadastroPacienteDTO;
import pac.voll.api.domain.paciente.ListagemPacienteDTO;
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

    @GetMapping
    public Page<ListagemPacienteDTO> listar(@PageableDefault(size = 10, sort = {"nome"}) Pageable paginacao) {
        return pacienteRepository.findAll(paginacao).map(ListagemPacienteDTO::new);
    }

    @PutMapping
    @Transactional
    public void atualizar(@RequestBody @Valid AtualizacaoPacienteDTO atualizacaoPacienteDTO) {
        Paciente paciente = pacienteRepository.getReferenceById(atualizacaoPacienteDTO.getId());
        paciente.atualizarInformacoes(atualizacaoPacienteDTO);
    }
}