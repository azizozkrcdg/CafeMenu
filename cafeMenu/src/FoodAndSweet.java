import java.util.ArrayList;

public class FoodAndSweet extends Foods{
    public void foodPrint(){
        ArrayList<Foods> food = new ArrayList<>();
        food.add(new Foods("Tost                        ", 35));
        food.add(new Foods("Gözleme                     ", 35));
        food.add(new Foods("Makarna                     ", 30));
        food.add(new Foods("Tavuklu Makarna             ", 40));
        food.add(new Foods("Salata                      ", 25));
        food.add(new Foods("Patates Kızartması          ", 25));

        for (Foods foods : food ){
            System.out.println(foods.getName() + " - " + foods.getPrice() + " TL");
        }

        System.out.println("0 - Geri Git");
        System.out.print("Seçiminiz : ");
        int select = input.nextInt();
        System.out.println("--------------------");
        switch (select){
            case 0:
                Foods foods = new Foods();
                foods.foodsPrint();
                break;
            default:
                System.out.println("Lütfen geçerli bir değer girin !");
                foodPrint();
                break;
        }
    }

    public void sweetPrint(){
        ArrayList<Foods> food = new ArrayList<>();
        food.add(new Foods("Limonlu Cheesecake    ", 45));
        food.add(new Foods("Brownie Cheesecake    ", 42));
        food.add(new Foods("San Sebastian         ", 42));
        food.add(new Foods("Çikolatalı Pasta      ", 38));
        food.add(new Foods("Meyveli Pasta         ", 40));
        food.add(new Foods("Kahveli Pasta         ", 38));

        for (Foods foods : food ){
            System.out.println(foods.getName() + " - " + foods.getPrice() + " TL");
        }

        System.out.println("0 - Geri Git");
        System.out.print("Seçiminiz : ");
        int select = input.nextInt();
        System.out.println("--------------------");
        switch (select){
            case 0:
                Foods foods = new Foods();
                foods.foodsPrint();
                break;
            default:
                System.out.println("Lütfen geçerli bir değer girin !");
                sweetPrint();
                break;
        }
    }
}
