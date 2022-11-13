import java.util.Scanner;

public class Menus {
    Scanner input = new Scanner(System.in);

    public void menusPrint() {
        System.out.println(
                "1 - Yiyecekler \n" +
                "2 - İçecekler \n" +
                "0 - Çıkış ");

        System.out.print("Seçiminiz : ");
        int select = input.nextInt();
        System.out.println("--------------------");

        switch (select) {
            case 1:
                Foods foods = new Foods();
                foods.foodsPrint();
                break;
            case 2:
                Drinks drinks = new Drinks();
                drinks.drinksPrint();
                break;
            case 0:
                System.out.println("Bye bye :)");
                System.exit(0);
                break;
            default:
                System.out.println("Lütfen geçerli bir değer girin !");
                menusPrint();
                break;
        }
    }
}
