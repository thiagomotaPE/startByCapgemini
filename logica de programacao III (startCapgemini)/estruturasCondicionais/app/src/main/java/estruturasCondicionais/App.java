package estruturasCondicionais;

public class App {


    public static void main(String[] args) {
        
        //estrutura SE:
        /*
        int nota = 9;
        if(nota >= 7){
            if(nota == 10){
                System.out.println("nota maxima");
            }else{
                System.out.println("aprovado");
            }
        }else{
            System.out.println("reprovado");
        }
        */
        
        
        
        //estrutura ESCOLHA:
        int opcao = 3;
        
        switch(opcao){
            case 1:
                System.out.println("opção 1 escolhida");
                break;
            case 2:
                System.out.println("opção 2 escolhida");
                break;
            default:
                System.out.println("opção invalida escolhida");
                break;
        }
        
        
        
    }
}
