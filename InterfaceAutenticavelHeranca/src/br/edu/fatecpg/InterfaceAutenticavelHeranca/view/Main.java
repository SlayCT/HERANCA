package br.edu.fatecpg.InterfaceAutenticavelHeranca.view;
import br.edu.fatecpg.InterfaceAutenticavelHeranca.model.SistemaSeguranca;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        SistemaSeguranca sistema = new SistemaSeguranca();

        String usuario;
        String senha;

        // Login
        while (!sistema.isAutenticado()) {

            System.out.println("===== SISTEMA DE LOGIN =====");

            System.out.print("Digite o usuario: ");
            usuario = scanner.nextLine();

            System.out.print("Digite a senha: ");
            senha = scanner.nextLine();

            if (sistema.login(usuario, senha)) {
                System.out.println("Bem-vindo ao sistema!");
            } else {
                System.out.println("Usuario ou senha incorretos!");
                System.out.println("Tente novamente.\n");
            }
        }

        // Menu depois do login
        int opcao;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Verificar autenticacao");
            System.out.println("2 - Fazer logout");
            System.out.print("Escolha: ");

            opcao = scanner.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println("Usuario autenticado!");
                    break;

                case 2:
                    sistema.logout();
                    break;

                default:
                    System.out.println("Opcao invalida!");
            }

        } while (opcao != 2);

        scanner.close();
    }
}