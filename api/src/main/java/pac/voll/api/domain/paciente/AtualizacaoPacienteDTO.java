package pac.voll.api.domain.paciente;

import javax.validation.constraints.NotNull;

import pac.voll.api.domain.endereco.Endereco;

public class AtualizacaoPacienteDTO {

    @NotNull
    private Long id;

    private String nome;

    private String telefone;

    private Endereco endereco;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
