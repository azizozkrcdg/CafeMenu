import java.util.ArrayList;

public class HotCoffeeTea extends Hot {

    public void coffeePrint(){
        ArrayList<Drinks> hotCoffee = new ArrayList<>();
        hotCoffee.add(new Drinks("Coffee Latte          ", 52));
        hotCoffee.add(new Drinks("Flat White            ", 48));
        hotCoffee.add(new Drinks("Ristretto Bianco      ", 60));
        hotCoffee.add(new Drinks("Toffee Nut Latte      ", 48));
        hotCoffee.add(new Drinks("White Chocolate Mocha ", 57));
        hotCoffee.add(new Drinks("Caramel Macchiato     ", 52));

        for (Drinks drink : hotCoffee){
            System.out.println(drink.getName() + " - " + drink.getPrice() + " TL");
        }

        System.out.print("0 - Geri Git : ");
        int select = input.nextInt();
        System.out.println("--------------------");

        switch (select){
            case 0:
                Hot hot = new Hot();
                hot.hotDrinksPrint();
                break;
            default:
                System.out.println("Lütfen geçerli bir değer girin !");
                coffeePrint();
                break;
        }
    }

    public void teaPrint(){
        ArrayList<Drinks> tea = new ArrayList<>();
        tea.add(new Drinks("Siyah Çay      ", 18));
        tea.add(new Drinks("Yeşil Çay      ", 22));
        tea.add(new Drinks("Ihlamur Çayı   ", 22));
        tea.add(new Drinks("Melisa Çayı    ", 23));
        tea.add(new Drinks("Nane Çayı      ", 20));
        tea.add(new Drinks("Elma Çayı      ", 25));

        for (Drinks drink : tea){
            System.out.println(drink.getName() + " - " + drink.getPrice() + " TL");
        }

        System.out.print("0 - Geri Git : ");
        int select = input.nextInt();
        System.out.println("--------------------");

        switch (select){
            case 0:
                Hot hot = new Hot();
                hot.hotDrinksPrint();
                break;
            default:
                System.out.println("Lütfen geçerli bir değer girin !");
                teaPrint();
                break;
        }
    }

}
