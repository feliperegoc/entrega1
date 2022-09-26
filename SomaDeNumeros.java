import java.util.Scanner;

public class SomaDeNumeros{
    Scanner prompt = new Scanner(System.in);
    int n, num, soma = 0, i = 0;

        public void SomaDeNumeros(){
            System.out.println("Quantidade de números a serem somados: ");
            int n = prompt.nextInt();
                while(i < n){
                    i = i + 1;
                    System.out.println("Entre com o " + i + "* numero");

                    num = prompt.nextInt();
                    soma = soma + num;
                }
            System.out.println("O resultado da soma é: ");
        }
}