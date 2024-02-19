public abstract class Pessoa {

    private static String nome;

    private String sobrenome;

    public String getNome() {
        return nome;
    }

    public static void setNome(String nome) {
        Pessoa.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                '}';
    }
}