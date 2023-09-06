import java.util.Scanner;

// JAVACINE DESENVOLVIDO POR ROGER, YEAN, MARCOS E SAMUEL. ANALSADO POR LEÓN.

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner in = new Scanner(System.in);
        Filme film = new Filme();

        String[] filmes = {"Homem-Aranha", "Thor", "Vingadores-Guerra Infinita", "Homem-Formiga e a Vespa Quantumania"};
        int[] faixaetaria = {12, 12, 13, 14};
        System.out.println("Bem vindo ao JavaCine!!");
        System.out.println("Escolha um filme");
        for (int j = 0; j < filmes.length; j++) {
            Thread.sleep(300);
            System.out.println((j + 1) + " - " + filmes[j] + " Faixa etária " + faixaetaria[j]);
        }
        int escolha = in.nextInt();


        System.out.println("");

        float preco = 0;
        int quantidade = 0;
        char opcao;
        int qtdMeia;

        switch (escolha) {
            case 1:
                System.out.println("Filme - "+filmes[escolha - 1] +"\nDuração - "+ film.getDuracaoFilm1()+"\n"+film.getGeneroFilm1()+"\nFaixa etária - " + faixaetaria[escolha - 1]);
                System.out.println("Horário - "+film.getHorarioFilm1());
                    System.out.println("1 - inteiro R$ 20,00\n2- meia R$ 10,00");
                            System.out.println("Digite a quantidade: ");
                            quantidade = in.nextInt();
                            System.out.println("Tem algum ingresso com valor de meia entrada? S | N");
                            opcao = in.next().charAt(0);
                            if (opcao == 's' || opcao == 'S') {
                                System.out.println("Digite quantos ingressos são meia:");
                                qtdMeia = in.nextInt();
                                preco = qtdMeia * 10;
                                if (qtdMeia < quantidade) {
                                    preco = preco + (quantidade - qtdMeia) * 20;
                                    System.out.println("Preço total = R$" + (preco));
                                }
                            } else if (opcao == 'n' || opcao == 'N') {
                                preco = 20 * quantidade;
                                System.out.println("Preço total = R$" + (preco));
                            } break;
            case 2:
                System.out.println(filmes[escolha - 1] + " \nDuração - 1:54min\nGênero - Acão/Aventura\n Faixa etária - " + faixaetaria[escolha - 1]);
                System.out.println("1 - inteiro R$ 20,00\n2- meia R$ 10,00");
                System.out.println("Digite a quantidade: ");
                quantidade = in.nextInt();
                System.out.println("Tem algum ingresso com valor de meia entrada? S | N");
                opcao = in.next().charAt(0);
                if (opcao == 's' || opcao == 'S') {
                    System.out.println("Digite quantos ingressos são meia:");
                    qtdMeia = in.nextInt();
                    preco = qtdMeia * 10;
                    if (qtdMeia < quantidade) {
                        preco = preco + (quantidade - qtdMeia) * 20;
                        System.out.println("Preço total = R$" + (preco));
                    }
                } else if (opcao == 'n' || opcao == 'N') {
                    preco = 20 * quantidade;
                    System.out.println("Preço total = R$" + (preco));
                } break;
            case 3:
                System.out.println(filmes[escolha - 1] + " \nDuração - 2:29min\nGênero - Acão/Aventura\n Faixa etária - " + faixaetaria[escolha - 1]);
                System.out.println("1 - inteiro R$ 20,00\n2- meia R$ 10,00 ");
                System.out.println("Digite a quantidade: ");
                quantidade = in.nextInt();
                System.out.println("Tem algum ingresso com valor de meia entrada? S | N");
                opcao = in.next().charAt(0);
                if (opcao == 's' || opcao == 'S') {
                    System.out.println("Digite quantos ingressos são meia:");
                    qtdMeia = in.nextInt();
                    preco = qtdMeia * 10;
                    if (qtdMeia < quantidade) {
                        preco = preco + (quantidade - qtdMeia) * 20;
                        System.out.println("Preço total = R$" + (preco));
                    }
                } else if (opcao == 'n' || opcao == 'N') {
                    preco = 20 * quantidade;
                    System.out.println("Preço total = R$" + (preco));
                } break;
            case 4:
                System.out.println(filmes[escolha - 1] + " \nDuração - 2:5min\nGênero - Acão/Aventura\n Faixa etária - " + faixaetaria[escolha - 1]);
                System.out.println("1 - inteiro R$ 20,00\n2- meia R$ 10,00 ");
                System.out.println("Digite a quantidade: ");
                quantidade = in.nextInt();
                System.out.println("Tem algum ingresso com valor de meia entrada? S | N");
                opcao = in.next().charAt(0);
                if (opcao == 's' || opcao == 'S') {
                    System.out.println("Digite quantos ingressos são meia:");
                    qtdMeia = in.nextInt();
                    preco = qtdMeia * 10;
                    if (qtdMeia < quantidade) {
                        preco = preco + (quantidade - qtdMeia) * 20;
                        System.out.println("Preço total = R$" + (preco));
                    }
                } else if (opcao == 'n' || opcao == 'N') {
                    preco = 20 * quantidade;
                    System.out.println("Preço total = R$" + (preco));
                } break;
            default:
                System.out.println("Opção inválida");
        }
    }
}
