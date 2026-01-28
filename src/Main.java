import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //leitura de dados.
        Scanner leitura = new Scanner(System.in);
        // informa para o usuário digitar a senha.
        System.out.println("Digite sua senha: ");

        //laço while pq vc não sabe quantas vezes vai repetir.
        while (true) {
            //ler a senha digitada pelo usuário e armazenar esse valor para validação.
            int senha = leitura.nextInt();
            // Verificar se a senha esta correta.
            if (senha == 2002){
                System.out.println("Acesso permitido");
                // define quando parar.
                break;
            } else {
                System.out.println("Senha inválida");
            }
        }

    }
}