package exercicio15doPDF;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
      
        System.out.println("por favor digite um numero:");
        int num = leitor.nextInt();
        
        if(num > 100 && num < 200){
            System.out.println("o numero informado esta entre 100 e 200!");
        }else{
            if(num <= 100){
            System.out.println("o numero informado esta abaixo ou é igual a 100!");
            }else{
                System.out.println("o numero informado esta acima ou é igual a 200!");
            }
        }
        
        
        
    }
}
