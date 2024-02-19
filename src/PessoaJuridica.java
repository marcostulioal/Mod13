public class PessoaJuridica extends Pessoa{

    private String cnpj;

    private String dataDeFundacao;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getDataDeFundacao() {
        return dataDeFundacao;
    }

    public void setDataDeFundacao(String dataDeFundacao) {
        this.dataDeFundacao = dataDeFundacao;
    }

    @Override
    public String toString() {
        return "PessoaJuridica{" +
                "cnpj='" + cnpj + '\'' +
                ", dataDeFundacao='" + dataDeFundacao + '\'' +
                '}';
    }
}
