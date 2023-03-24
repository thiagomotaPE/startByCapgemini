package POO;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        
        pessoa objetoPessoa = new pessoa(70.1f, 1.66f);
        
        System.out.println("digite seu peso:");
        objetoPessoa.setPeso(leia.nextFloat());
        System.out.println("agora digite sua altura:");
        objetoPessoa.setAltura(leia.nextFloat());
        
        System.out.println("seu IMC:" + objetoPessoa.calcularIMC());
        
        
    }
}
