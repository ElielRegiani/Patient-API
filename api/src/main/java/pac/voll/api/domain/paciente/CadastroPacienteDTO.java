package pac.voll.api.domain.paciente;

import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import pac.voll.api.domain.endereco.DadosEndereco;

public class CadastroPacienteDTO {

    @NotBlank(message = "{nome.obrigatorio}")
    private String nome;

    @NotBlank(message = "{email.obrigatorio}")
    @Email(message = "{email.invalido}")
    private String email;

    @NotBlank(message = "{telefone.obrigatorio}")
    private String telefone;

    @NotBlank(message = "{crm.obrigatorio}")
    @Pattern(regexp = "\\d{11}", message = "{crm.invalido}")
    private String cpf;

    @NotNull(message = "{endereco.obrigatorio}")
    @Valid
    private DadosEndereco endereco;

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

    public DadosEndereco getEndereco() {
        return endereco;
    }

    public void setEndereco(DadosEndereco endereco) {
        this.endereco = endereco;
    }
}
