package exercicio6doPdfPOO;

public class Invoice {

    private int IDitem;
    private String descricao;
    private float preco;
    private int totCompra;

    public Invoice(int IDitem, String descricao, float preco, int totCompra) {
        this.IDitem = IDitem;
        this.descricao = descricao;
        this.preco = preco;
        this.totCompra = totCompra;
    }

    public double getInvoiceAmount() {
        double valorFatura = totCompra * preco;
        return valorFatura;
    }

    public int getIDitem() {
        return IDitem;
    }

    public void setIDitem(int IDitem) {
        if (IDitem < 0) {
            this.IDitem = 0;
        } else {
            this.IDitem = IDitem;
        }
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        if (preco < 0) {
            this.preco = 0;
        } else {
            this.preco = preco;
        }
    }

    public int getTotCompra() {
        return totCompra;
    }

    public void setTotCompra(int totCompra) {
        if (totCompra < 0) {
            this.totCompra = 0;
        } else {
            this.totCompra = totCompra;
        }
    }

}
