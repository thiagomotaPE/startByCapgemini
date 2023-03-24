package POO.heranca;
import java.util.Date;
public class App {

    public static void main(String[] args) {
        
        vendedor v = new vendedor();
        motorista m = new motorista();
        
        v.setNome("mota");
        v.setSalario(1.250f);
        v.setCpf("2353674");
        v.setNascimento(new Date());
        v.setComissao(10f);
        v.setItensVendidos(10);
        
        v.calcularSalario();
        
       
        
      
    }
}
