import java.util.ArrayList;

public class MainPessoa {

    public static void main(String[] args) {
        ArrayList<Pessoa> listaDePessoas = new  ArrayList<>();

        Pessoa newPessoa = new Pessoa();

        newPessoa.setNome("Vinicius");
        newPessoa.setIdade(20);
        newPessoa.setSalario(5000);
        listaDePessoas.add(newPessoa);

        Pessoa newPessoa2 = new Pessoa();

        newPessoa2.setNome("Fabi");
        newPessoa2.setIdade(40);
        newPessoa2.setSalario(5000);
        listaDePessoas.add(newPessoa2);

        Pessoa newPessoa3 = new Pessoa();
        newPessoa3.setNome("Samu");
        newPessoa3.setIdade(50);
        newPessoa3.setSalario(5000);
        listaDePessoas.add(newPessoa3);


        System.out.println(listaDePessoas.size());
        System.out.println(listaDePessoas.getFirst().getNome());
        for (Pessoa pessoa : listaDePessoas) {
            System.out.println(pessoa);

        }

    }
}
