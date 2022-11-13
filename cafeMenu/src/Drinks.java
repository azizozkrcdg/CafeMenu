import java.awt.Menu;
import java.util.Scanner;

public class Drinks {
    private String name;
    private int price;


    public Drinks(String name, int price){
        this.name = name;
        this.price = price;
    }
    public Drinks(){}
    Scanner input = new Scanner(System.in);

    public void drinksPrint() {
        System.out.println("1 - Sıcak İçecekler \n" +
                "2 - Soğuk İçecekler \n" +
                "0 - Geri Git");
        System.out.print("Seçiminiz : ");
        int select = input.nextInt();
        System.out.println("--------------------");

        switch (select) {
            case 1:
                Hot hot = new Hot();
                hot.hotDrinksPrint();
                break;
            case 2:
                Cold cold = new Cold();
                cold.coldDrinksPrint();
                break;
            case 0:
                Menus menus = new Menus();
                menus.menusPrint();
                break;
            default:
                System.out.println("Lütfen geçerli bir değer girin !");
                drinksPrint();
                break;
        }
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getPrice(){
        return price;
    }

    public void setPrice(int price){
        this.price = price;
    }

}
