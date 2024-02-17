package pac.voll.api.domain.paciente;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import pac.voll.api.domain.endereco.Endereco;

@Entity(name = "Paciente")
@Table(name = "pacientes")
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String email;

    private String telefone;

    private String cpf;

    @Embedded
    private Endereco endereco;

    public Paciente() {
    }

    public Paciente(CadastroPacienteDTO pacienteDTO) {
        this.nome = pacienteDTO.getNome();
        this.email = pacienteDTO.getEmail();
        this.telefone = pacienteDTO.getTelefone();
        this.cpf = pacienteDTO.getCpf();
        this.endereco = new Endereco(pacienteDTO.getEndereco());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void atualizarInformacoes(AtualizacaoPacienteDTO atualizacaoPacienteDTO) {
        if (atualizacaoPacienteDTO.getNome() != null) {
            this.nome = atualizacaoPacienteDTO.getNome();
        }
        if (atualizacaoPacienteDTO.getTelefone() != null) {
            this.telefone = atualizacaoPacienteDTO.getTelefone();
        }
        if (atualizacaoPacienteDTO.getEndereco() != null) {
            this.endereco.atualizarInformacoes(atualizacaoPacienteDTO.getEndereco());
        }
    }
}