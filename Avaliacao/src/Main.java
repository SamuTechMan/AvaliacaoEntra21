import java.util.Scanner;

// JAVACINE DESENVOLVIDO POR ROGER, YEAN, MARCOS E SAMUEL.
// ANALISADO POR LEÓN , O ANALISTA AJUDOU NA ESCOLHA DE INGRESSO DE MEIA ENTRADA ADICIONANDO ALGUNS IF E ELSE IF.

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Filme film = new Filme();

        float preco = 0;
        int quantidade = 0;
        char opcao;
        int qtdIngresso, escolha, qtdIngressoMeia, precoTotal;

        String[] filmes = {"Homem-Aranha", "Thor", "Vingadores-Guerra Infinita", "Homem-Formiga e a Vespa Quantumania"};
        int[] faixaetaria = {12, 12, 13, 14};
        System.out.println("\nBem vindo ao JavaCine!!");
        System.out.println("\nEscolha um filme:");
        for (int j = 0; j < filmes.length; j++) {
            System.out.println((j + 1) + " - " + filmes[j] + " Faixa etária " + faixaetaria[j]);
        }
        System.out.print("= ");
        escolha = in.nextInt();
        System.out.println("");

        while (escolha != 1 && escolha != 2 && escolha != 3 && escolha != 4) {
            System.out.println("Opção Inválida");
            System.out.println("Escolha um filme que está em nosso cartaz: \n");
            for (int j = 0; j < filmes.length; j++) {
                System.out.println((j + 1) + " - " + filmes[j] + " Faixa etária " + faixaetaria[j]);
            }
            System.out.print("= ");
            escolha = in.nextInt();
            System.out.println("");
        }
        switch (escolha) {
            case 1:
                System.out.println("Filme - " + filmes[escolha - 1] + "\nDuração - " + film.getDuracaoFilm1() + "\nGênero - " + film.getGeneroFilm1() + "\nFaixa etária - " + faixaetaria[escolha - 1]);
                System.out.println("Horário - " + film.getHorarioFilm1());
                System.out.println("\n1 - inteiro R$ 20,00\n2- meia R$ 10,00");
                System.out.print("Selecione o tipo de ingresso: ");
                quantidade = in.nextInt();
                System.out.print("Informe quantos ingressos: ");
                qtdIngresso = in.nextInt();
                if (quantidade == 1) {
                    System.out.println("Tem algum ingresso com valor de meia entrada? S | N");
                    opcao = in.next().charAt(0);
                    if (opcao == 's' || opcao == 'S') {
                        System.out.println("Digite quantos ingressos são meia:");
                        qtdIngressoMeia = in.nextInt();
                        qtdIngresso = qtdIngresso - qtdIngressoMeia;
                        precoTotal = qtdIngresso * 20;
                        preco = qtdIngresso * 10 + precoTotal;
                        System.out.println("\nPreço total à pagar = R$" + (preco));
                        if (qtdIngresso < quantidade) {
                            preco = preco + (quantidade - qtdIngresso) * 20;
                            System.out.println("\nPreço total à pagar = R$" + (preco));
                        }
                    } else if (opcao == 'n' || opcao == 'N') {
                        preco = 20 * qtdIngresso;
                        System.out.println("\nPreço total à pagar = R$" + (preco));
                    }
                } else {
                    preco = qtdIngresso * 10;
                    System.out.println("\nPreço total à pagar = R$" + (preco));
                }
                break;
            case 2:
                System.out.println("Filme - " + filmes[escolha - 1] + "\nDuração - " + film.getDuracaoFilm2() + "\nGênero - " + film.getGeneroFilm2() + "\nFaixa etária - " + faixaetaria[escolha - 1]);
                System.out.println("Horário - " + film.getHorarioFilm2());
                System.out.println("\n1 - inteiro R$ 20,00\n2- meia R$ 10,00");
                System.out.print("Selecione o tipo de ingresso: ");
                quantidade = in.nextInt();
                System.out.print("Informe quantos ingressos: ");
                qtdIngresso = in.nextInt();
                if (quantidade == 1) {
                    System.out.println("Tem algum ingresso com valor de meia entrada? S | N");
                    opcao = in.next().charAt(0);
                    if (opcao == 's' || opcao == 'S') {
                        System.out.println("Digite quantos ingressos são meia entrada:");
                        qtdIngressoMeia = in.nextInt();
                        qtdIngresso = qtdIngresso - qtdIngressoMeia;
                        precoTotal = qtdIngresso * 20;
                        preco = qtdIngresso * 10 + precoTotal;
                        System.out.println("\nPreço total à pagar = R$" + (preco));
                        if (qtdIngresso < quantidade) {
                            preco = preco + (quantidade - qtdIngresso) * 20;
                            System.out.println("\nPreço total à pagar = R$" + (preco));
                        }
                    } else if (opcao == 'n' || opcao == 'N') {
                        preco = 20 * qtdIngresso;
                        System.out.println("\nPreço total à pagar = R$" + (preco));
                    }
                } else {
                    preco = qtdIngresso * 10;
                    System.out.println("\nPreço total à pagar = R$" + (preco));
                }
                break;
            case 3:
                System.out.println("Filme - " + filmes[escolha - 1] + "\nDuração - " + film.getDuracaoFilm3() + "\nGênero - " + film.getGeneroFilm3() + "\nFaixa etária - " + faixaetaria[escolha - 1]);
                System.out.println("Horário - " + film.getHorarioFilm3());
                System.out.println("\n1 - inteiro R$ 20,00\n2 - meia R$ 10,00 ");
                System.out.print("Selecione o tipo de ingresso: ");
                quantidade = in.nextInt();
                System.out.print("Informe quantos ingressos: ");
                qtdIngresso = in.nextInt();
                if (quantidade == 1) {
                    System.out.println("Tem algum ingresso com valor de meia entrada? S | N");
                    opcao = in.next().charAt(0);
                    if (opcao == 's' || opcao == 'S') {
                        System.out.println("Digite quantos ingressos são meia:");
                        qtdIngressoMeia = in.nextInt();
                        qtdIngresso = qtdIngresso - qtdIngressoMeia;
                        precoTotal = qtdIngresso * 20;
                        preco = qtdIngresso * 10 + precoTotal;
                        System.out.println("\nPreço total à pagar = R$" + (preco));
                        if (qtdIngresso < quantidade) {
                            preco = preco + (quantidade - qtdIngresso) * 20;
                            System.out.println("\nPreço total à pagar = R$" + (preco));
                        }
                    } else if (opcao == 'n' || opcao == 'N') {
                        preco = 20 * qtdIngresso;
                        System.out.println("\nPreço total à pagar = R$" + (preco));
                    }
                } else {
                    preco = qtdIngresso * 10;
                    System.out.println("\nPreço total à pagar = R$" + (preco));
                }
                break;
            case 4:
                System.out.println("Filme - " + filmes[escolha - 1] + "\nDuração - " + film.getDuracaoFilm4() + "\nGênero - " + film.getGeneroFilm4() + "\nFaixa etária - " + faixaetaria[escolha - 1]);
                System.out.println("Horário - " + film.getHorarioFilm4());
                System.out.println("\n1 - inteiro R$ 20,00\n2- meia R$ 10,00 ");
                System.out.print("Selecione o tipo de ingresso: ");
                quantidade = in.nextInt();
                System.out.print("Informe quantos ingressos: ");
                qtdIngresso = in.nextInt();
                if (quantidade == 1) {
                    System.out.println("Tem algum ingresso com valor de meia entrada? S | N");
                    opcao = in.next().charAt(0);
                    if (opcao == 's' || opcao == 'S') {
                        System.out.println("Digite quantos ingressos são meia:");
                        qtdIngressoMeia = in.nextInt();
                        qtdIngresso = qtdIngresso - qtdIngressoMeia;
                        precoTotal = qtdIngresso * 20;
                        preco = qtdIngresso * 10 + precoTotal;
                        System.out.println("\nPreço total à pagar = R$" + (preco));
                        if (qtdIngresso < quantidade) {
                            preco = preco + (quantidade - qtdIngresso) * 20;
                            System.out.println("\nPreço total à pagar = R$" + (preco));
                        }
                    } else if (opcao == 'n' || opcao == 'N') {
                        preco = 20 * qtdIngresso;
                        System.out.println("\nPreço total à pagar = R$" + (preco));
                    }
                } else {
                    preco = qtdIngresso * 10;
                    System.out.println("\nPreço total à pagar = R$" + (preco));
                }
                break;
        }
    }
}