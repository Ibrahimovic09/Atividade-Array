
import java.util.Scanner;

public class ArrayCadastro {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Array bidimensional para armazenar os dados
        String[][] filmes = new String[10][3];

        int quantidade = 0;
        int opcao;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Cadastrar filme");
            System.out.println("2 - Listar filmes");
            System.out.println("3 - Encerrar");
            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:
                    if (quantidade < 10) {

                        System.out.print("Nome do filme: ");
                        filmes[quantidade][0] = sc.nextLine();

                        System.out.print("Gênero: ");
                        filmes[quantidade][1] = sc.nextLine();

                        System.out.print("Ano de lançamento: ");
                        filmes[quantidade][2] = sc.nextLine();

                        quantidade++;

                        System.out.println("Filme cadastrado com sucesso!");

                    } else {
                        System.out.println("Limite de 10 filmes atingido!");
                    }
                    break;

                case 2:
                    if (quantidade == 0) {
                        System.out.println("Nenhum filme cadastrado.");
                    } else {

                        System.out.println("\n===== FILMES CADASTRADOS =====");

                        for (int i = 0; i < quantidade; i++) {
                            System.out.println("\nFilme " + (i + 1));
                            System.out.println("Nome: " + filmes[i][0]);
                            System.out.println("Gênero: " + filmes[i][1]);
                            System.out.println("Ano: " + filmes[i][2]);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Encerrando aplicação...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 3);

        sc.close();
    }
}
