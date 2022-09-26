//import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Contagem{
    Scanner prompt = new Scanner(System.in);
    int n, nota, cont = 0, i = 0;
    public void Contagem(){
        System.out.println("Quantidade de Alunos: ");
        int n = prompt.nextInt();

        while (i < n){
            i = i + 1;
            System.out.println("Nota do aluno: " + i);
            nota = prompt.nextInt();
            if (nota < 5) {
                cont = cont + 0;
            }else{
                cont = cont + 1;
            }
        }
        System.out.println("São " + n + " alunos.");
        System.out.println("Foram" + cont + " aprovados.");
    }
}