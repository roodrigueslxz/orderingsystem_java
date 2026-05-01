import java.util.Scanner;

public class ordering {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=========================================== WELCOME TO INCENDIUS CAFE ===========================================");
        System.out.println(" ");
        System.out.println("Feitiços quentes, cafés mais ainda.");
        System.out.println("");
        System.out.println("Olá! Seja bem-vindo(a) ao Incendius Cafe, o lugar que aquece seu coração com os mais deliciosos cafés e sobremesas.");
        System.out.print("Vamos, nos diga, o que você deseja tomar hoje?");
        System.out.println("");
        System.out.println("1) Expresso Patronum");
        System.out.println("2) Lattus Lumus");
        System.out.println("3) Mocharm");
        System.out.println("4) Capuccinox");
        System.out.println("5) Myscchiatus");
        System.out.println("6) Americano Aparate");
        System.out.println("7) Cold Brux");
        System.out.println("8) Frappus Maxima");
        System.out.println("");
        System.out.print("> ");
        int drink = sc.nextInt();
        System.out.println("");

        double pricedrink = 0;

        switch (drink) {
            case 1:
                pricedrink = 7.50;
                break;
            case 2:
                pricedrink = 9.50;
                break;
            case 3:
                pricedrink = 8.0;
                break;
            case 4:
                pricedrink = 9.0;
                break;
            case 5:
                pricedrink = 10.0;
                break;
            case 6:
                pricedrink = 7.50;
                break;
            case 7:
                pricedrink = 11.0;
                break;
            case 8:
                pricedrink = 12.0;
                break;
        }

        System.out.println("Agora vamos escolher um doce feito pelas mãos mais mágicas da região!");
        System.out.println("");
        System.out.println("1) Cheesecake de Frutas da Lua");
        System.out.println("2) Brigadeiraccio");
        System.out.println("3) Torta Caramellus");
        System.out.println("4) Bicookie");
        System.out.println("5) Bolo de Mandrágora (versão silenciosa)");
        System.out.println("6) Sorbet Congellius");
        System.out.println("7) Muffin de Mirtilo Místico");
        System.out.println("8) Torta de Maçã Malfoy's");
        System.out.println("");
        System.out.print("> ");
        int dessert = sc.nextInt();

        double pricedessert = 0;

                switch (dessert) {
            case 1:
                pricedessert = 10.50;
                break;
            case 2:
                pricedessert = 4.0;
                break;
            case 3:
                pricedessert = 8.0;
                break;
            case 4:
                pricedessert = 5.50;
                break;
            case 5:
                pricedessert = 10.0;
                break;
            case 6:
                pricedessert = 7.50;
                break;
            case 7:
                pricedessert = 6.0;
                break;
            case 8:
                pricedessert = 9.0;
                break;
        }

        System.out.println("");
        System.out.println("Seu café saiu por R$" + pricedrink + " e sua sobremesa saiu por R$" + pricedessert);
        System.out.println("No total, seu pedido ficou por R$" + (pricedrink + pricedessert));
        System.out.println("");
        System.out.println("Insira sua senha para efetuar o pagamento. Prometo que não estou vendo nada! hahaha");
        System.out.print("> ");
        int password = sc.nextInt();
        System.out.println("");
        System.out.println("Perfeito! Muito obrigada por escolher o nosso Cafe, você sempre será bem vindo(a). <3");
        System.out.println("");

        sc.close();
   
    }
}