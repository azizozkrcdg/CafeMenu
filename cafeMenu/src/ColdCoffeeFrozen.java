import java.util.ArrayList;
import java.util.Iterator;

public class ColdCoffeeFrozen extends Cold{
    public void coldCoffeePrint(){
        ArrayList<Drinks> coldCoffee = new ArrayList<>();
        coldCoffee.add(new Drinks("Ice Coffee Latte          ", 45));
        coldCoffee.add(new Drinks("Ice Toffee Nut Latte      ", 47));
        coldCoffee.add(new Drinks("Ice White Chocolate Mocha ", 52));
        coldCoffee.add(new Drinks("Ice Caramel Macchiato     ", 52));
        coldCoffee.add(new Drinks("Ice Cappuccino            ", 47));
        coldCoffee.add(new Drinks("Java Chip                 ", 55));

        for (Drinks drink : coldCoffee){
            System.out.println(drink.getName() + " - " + drink.getPrice() + " TL");
        }

        System.out.print("0 - Geri Git : ");
        int select = input.nextInt();
        System.out.println("--------------------");

        switch (select){
            case 0:
                Cold cold = new Cold();
                cold.coldDrinksPrint();
                break;
            default:
                System.out.println("Lütfen geçerli bir değer girin !");
                coldCoffeePrint();
                break;
        }
    }



    public void frozenPrint(){
        ArrayList<Drinks> frozen = new ArrayList<>();
        frozen.add(new Drinks("Atom Frozen       ", 55));
        frozen.add(new Drinks("Portokallı Frozen ", 45));
        frozen.add(new Drinks("Karpuzlu Frozen   ", 45));
        frozen.add(new Drinks("Çilekli Frozen    ", 47));
        frozen.add(new Drinks("Elmalı Frozen     ", 45));
        frozen.add(new Drinks("Special           ", 55));

        for (Drinks drink : frozen){
            System.out.println(drink.getName() + " - " + drink.getPrice() + " TL");
        }


        System.out.print("0 - Geri Git : ");
        int select = input.nextInt();
        System.out.println("--------------------");

        switch (select){
            case 0:
                Cold cold = new Cold();
                cold.coldDrinksPrint();
                break;
            default:
                System.out.println("Lütfen geçerli bir değer girin !");
                frozenPrint();
                break;
        }
    }

}
