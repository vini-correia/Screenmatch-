package ProjetosAlura;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner pick = new Scanner(System.in);
        Aluno aluno1 = new Aluno();

        System.out.println("Coloque o nome do aluno: ");
        String nomeDigitado = pick.nextLine();

        System.out.println("Coloque três notas do " + nomeDigitado + ".");
        double nota1Digitada = pick.nextDouble();
        double nota2Digitada = pick.nextDouble();
        double nota3Digitada = pick.nextDouble();

        aluno1.setNome(nomeDigitado);
        aluno1.setNota1(nota1Digitada);
        aluno1.setNota2(nota2Digitada);
        aluno1.setNota3(nota3Digitada);

        pick.close();

        System.out.println("Dados do aluno: ");
        System.out.println("nome: " + aluno1.getNome());
        System.out.println("media de notas do " + aluno1.getNome() + ":" + aluno1.calcularMediaDasAvaliacoes());

    }
}
