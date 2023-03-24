package POO.heranca;
import java.util.Date;

public class vendedor extends funcionario{
    
    private int itensVendidos;
    private float comissao;
    
    
    public vendedor(){
        super();
    }
    
    public float calcularSalario(){
        return super.getSalario() + (this.itensVendidos * this.comissao);
    }

    
    
    
    public int getItensVendidos() {
        return itensVendidos;
    }

    public void setItensVendidos(int itensVendidos) {
        this.itensVendidos = itensVendidos;
    }

    public float getComissao() {
        return comissao;
    }

    public void setComissao(float comissao) {
        this.comissao = comissao;
    }

    
    
}
