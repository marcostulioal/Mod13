public class PessoaFisica extends Pessoa  {

    private Long cpf;

    private String dataDeNascimento;

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }
    @Override
    public String toString() {
        return "PessoaFisica{" +
                "nome='" + getNome() + '\'' +
                ", sobrenome='" + getSobrenome() + '\'' +
                ", cpf=" + cpf +
                ", dataDeNascimento='" + dataDeNascimento + '\'' +
                '}';
    }
}
