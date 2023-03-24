package exercicio24doPdf;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int escolha;
        int numero;
        
        do{
            System.out.println("escolha uma opção:");
            System.out.println("1- adicionar um numero");
            System.out.println("2- sair");
            escolha = leia.nextInt();
            
            switch(escolha){
                case 1:
                    System.out.println("digite um numero:");
                    numero = leia.nextInt();
                    
                    if(numero > 0){
                        System.out.println("numero positivo!");
                    }else{
                        if(numero == 0){
                            System.out.println("numero neutro!");
                        }else{
                            System.out.println("numero negativo!");
                        }
                    }
                    break;
                default:
                    System.out.println("opção invalida!");
            }
        
        }while (escolha != 2);
        
    }
}
