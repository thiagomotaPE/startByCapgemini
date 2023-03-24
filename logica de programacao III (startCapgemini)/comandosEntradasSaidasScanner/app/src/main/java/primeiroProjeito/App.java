package primeiroProjeito;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {// inicio do programa
        
        Scanner leitor = new Scanner(System.in);
        
        int idade = leitor.nextInt();
        float dolar = leitor.nextFloat();
        String nomeCompleto = leitor.nextLine();
        String primeiroNome = leitor.next();
        
        System.out.println("escreve esse texto no console e pula pra linha de baixo");
        System.out.print("escreve esse texto no console e continua na mesma linha");
        
    }
}
