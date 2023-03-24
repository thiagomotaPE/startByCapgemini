package exercicio6doPdfPOO;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Invoice item1 = new Invoice(0, " nada consta ", 0.0f, 0);
        System.out.println(item1.getIDitem() + item1.getDescricao() + item1.getPreco() + item1.getTotCompra());

        System.out.println("Digite todas as informações do produto:");

        System.out.println("ID do produto:");
        item1.setIDitem(leia.nextInt());

        System.out.println("descrição do produto:");
        item1.setDescricao(leia.next());

        System.out.println("preço do produto:");
        item1.setPreco(leia.nextFloat());

        System.out.println("total de compras do produto:");
        item1.setTotCompra(leia.nextInt());

        System.out.println("informações do item1:");
        System.out.println("ID: " + item1.getIDitem());
        System.out.println("Descrição: " + item1.getDescricao());
        System.out.println("Preço: " + item1.getPreco());
        System.out.println("Total de itens comprados: " + item1.getTotCompra());
        System.out.println("Valor da fatura: " + item1.getInvoiceAmount());

    }
}
