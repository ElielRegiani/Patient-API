package pac.voll.api.domain.endereco;

import javax.persistence.Embeddable;

@Embeddable
public class Endereco {

    private String logradouro;

    private String numero;

    private String complemento;

    private String bairro;

    private String cidade;

    private String uf;

    private String cep;

    public Endereco() {
    }

    public Endereco(DadosEndereco endereco) {
        this.logradouro = endereco.getLogradouro();
        this.numero = endereco.getNumero();
        this.complemento = endereco.getComplemento();
        this.bairro = endereco.getBairro();
        this.cidade = endereco.getCidade();
        this.uf = endereco.getUf();
        this.cep = endereco.getCep();
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void atualizarInformacoes(Endereco endereco) {
        if (endereco.getLogradouro() != null) {
            this.logradouro = endereco.getLogradouro();
        }
        if (endereco.getUf() != null) {
            this.uf = endereco.getUf();
        }
        if (endereco.getCidade() != null) {
            this.cidade = endereco.getCidade();
        }
        if (endereco.getCep() != null) {
            this.cep = endereco.getCep();
        }
        if (endereco.getNumero() != null) {
            this.numero = endereco.getNumero();
        }
        if (endereco.getBairro() != null) {
            this.bairro = endereco.getBairro();
        }
        if (endereco.getComplemento() != null) {
            this.complemento = endereco.getComplemento();
        }
    }
}
