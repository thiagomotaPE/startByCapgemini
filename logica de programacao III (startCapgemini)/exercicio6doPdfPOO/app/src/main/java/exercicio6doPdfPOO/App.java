package exercicio6doPdfPOO;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Invoice item1 = new Invoice(0, " nada consta ", 0.0f, 0);
        System.out.println(item1.getIDitem() + item1.getDescricao() + item1.getPreco() + item1.getTotCompra());

        System.out.println("Digite todas as informa��es do produto:");

        System.out.println("ID do produto:");
        item1.setIDitem(leia.nextInt());

        System.out.println("descri��o do produto:");
        item1.setDescricao(leia.next());

        System.out.println("pre�o do produto:");
        item1.setPreco(leia.nextFloat());

        System.out.println("total de compras do produto:");
        item1.setTotCompra(leia.nextInt());

        System.out.println("informa��es do item1:");
        System.out.println("ID: " + item1.getIDitem());
        System.out.println("Descri��o: " + item1.getDescricao());
        System.out.println("Pre�o: " + item1.getPreco());
        System.out.println("Total de itens comprados: " + item1.getTotCompra());
        System.out.println("Valor da fatura: " + item1.getInvoiceAmount());

    }
}
