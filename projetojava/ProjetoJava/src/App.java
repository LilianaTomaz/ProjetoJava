import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner in = new Scanner(System.in)) {
            int a;
            int b;
            int operacao; 

            System.out.println(" 1- Soma\n 2- Subtração\n 3- Divisão\n 4- Multiplicação");
            System.out.println("Olá, escolha qual operação você gostaria de realizar: ");
            operacao = in.nextInt();

            System.out.println("Agora digite um número inteiro: ");
            a = in.nextInt();
            System.out.println("Digite outro número inteiro: ");
            b = in.nextInt();

            
            if (operacao == 1) {

                int soma = (a+b);
                System.out.println("A soma dos dois números é: " +soma);
            }
            if (operacao == 2) {
                int subtracao = (a-b);
                System.out.println("A subtração dos dois números é: " +subtracao);
            }
            if (operacao == 3) {
                int divisao = (a/b);
                System.out.println("A divisão dos dois números é: "+divisao);
            }
            if (operacao == 4) {
                int multiplicacao = (a*b);
                System.out.println("A multiplicação dos dois números é: "+multiplicacao);
            }
        }

    }
}
