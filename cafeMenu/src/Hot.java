public class Hot extends Drinks{

    public void hotDrinksPrint(){
        System.out.println("1 - Kahveler \n" +
                "2 - Çaylar \n" +
                "0 - Geri Git");

        System.out.print("Seçiminiz : ");
        int select = input.nextInt();
        System.out.println("--------------------");


        switch (select){
            case 1:
                HotCoffeeTea coffee = new HotCoffeeTea();
                coffee.coffeePrint();
                break;
            case 2:
                HotCoffeeTea tea = new HotCoffeeTea();
                tea.teaPrint();
                break;
            case 0:
                Drinks drinks = new Drinks();
                drinks.drinksPrint();
                break;
            default:
                System.out.println("Lütfen geçerli bir değer girin !");
                hotDrinksPrint();
                break;
        }
    }
}
