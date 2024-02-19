public class Programa {

    public static void main(String[] args){

        PessoaFisica pessoa = new PessoaFisica();
        Pessoa.setNome("Marcos");
        pessoa.setSobrenome("Alves");
        pessoa.setCpf(123456789101L);
        pessoa.setDataDeNascimento("11/03/1996");
        System.out.println(pessoa);

    }
}